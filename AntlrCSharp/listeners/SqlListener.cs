using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using AntlrCSharp.analysis;
using AntlrCSharp.listeners;
using System.Xml.Linq;
using static tsqlParser;
using NN = System.Diagnostics.CodeAnalysis.NotNullAttribute;
namespace AntlrCSharp.listeners
{
    public class SqlListener : tsqlBaseListener
    {
        public String DB { get; set; } = "";
        public bool _inWhere = false;
        private int _caseExpressionDepth = 0;
        private int _subqueryDepth = 0;
        public List<SqlStatement> Statements { get; } = new List<SqlStatement>();
        protected readonly Parser _parser;
        private SqlStatement CurrentStatement { get; set; }

        public List<analysis.Environment> Environments { get; init; } = new List<analysis.Environment>();
        private analysis.Environment CurrentEnvironment { get; set; } = new analysis.Environment();

        public SqlListener([NN] Parser parser)
        {
            _parser = parser;

        }

        private static BaseToken AsBaseToken(ParserRuleContext context) => new(context.GetFullText(), context.Start.StartIndex, context.Stop.StopIndex);
        private static BaseToken AsBaseToken(ParserRuleContext context, string implicitTokenText) => new(implicitTokenText, context?.Start?.StartIndex ?? -1, context?.Stop?.StopIndex ?? -1);




        public override void EnterTable_sources([Antlr4.Runtime.Misc.NotNull] Table_sourcesContext context)
        {
            _inWhere = true;
        }

        public override void EnterDml_clause([Antlr4.Runtime.Misc.NotNull] Dml_clauseContext context)
        {
            _inWhere = true;
        }

        public override void ExitDml_clause([Antlr4.Runtime.Misc.NotNull] Dml_clauseContext context)
        {
            _inWhere = false;
        }



        public override void EnterBatch([Antlr4.Runtime.Misc.NotNull] BatchContext context)
        {
            Environments.Add(new analysis.Environment());
            CurrentEnvironment = Environments[Environments.Count-1];
        }




        public override void EnterSql_clause([NN] Sql_clauseContext context)
        {
            CurrentStatement = new SqlStatement(AsBaseToken(context));

        }
        public override void ExitSql_clause([NN] Sql_clauseContext context)
        {
            Statements.Add(CurrentStatement);

        }
        public override void EnterUse_statement([NN] tsqlParser.Use_statementContext context)
        {
            DB = context.Stop.Text;
        }

        public override void ExitFull_column_name([Antlr4.Runtime.Misc.NotNull] Full_column_nameContext context)
        {
            var tokenText = context.GetText();
            var parts = tokenText.Replace("[", "").Replace("]", "").Split(".");
            if (parts.Length >= 2) {
                CurrentStatement.AddColumn(AsBaseToken(context), parts[parts.Length - 2], parts[parts.Length - 1]);
            }
            base.ExitFull_column_name(context);
        }

        public override void ExitSelect_list_elem([NN] Select_list_elemContext context)
        {
            if (context.column_alias() is not null) { 
                CurrentStatement.AppendAlias(context.column_alias().GetFullText());
            }
        }

        public override void EnterCase_expression([NN] Case_expressionContext context) => _caseExpressionDepth += 1;
        public override void ExitCase_expression([NN] Case_expressionContext context) => _caseExpressionDepth -= 1;
        public override void EnterSubquery([Antlr4.Runtime.Misc.NotNull] SubqueryContext context) {
            _subqueryDepth += 1;
            CurrentStatement.EnterSubquery(AsBaseToken(context));
         }
        public override void ExitSubquery([Antlr4.Runtime.Misc.NotNull] SubqueryContext context)
        {
            _subqueryDepth -= 1;
            CurrentStatement.ExitSubquery();
        }

        public override void ExitQuery_specification([NN] Query_specificationContext context)
        {
            if (context.DISTINCT() != null) { CurrentStatement.UsesDistinct = true; }
        }

        public override void ExitSearch_cond_pred([NN] Search_cond_predContext context)
        {
            var child = context.GetChild(0);
            if (child is null)
            {
                Console.WriteLine("Error in ExitSearch_cond_pred, no child");
                return;
            }
            if (child is Binary_operator_expression2Context c)
            {
                var left = c.left;
                var right = c.right;
                var op = c.op.GetText();
                var rightText = right is null ? (op == "IS" ? "NULL" : "") : right.GetText();
                var leftOp = new SqlOperand(AsBaseToken(left), left is Function_call_expressionContext, FunctionOverConstant(left),_inWhere,_caseExpressionDepth > 0, _subqueryDepth);
                var rightOp = new SqlOperand(AsBaseToken(right,rightText), right is Function_call_expressionContext, FunctionOverConstant(right), _inWhere, _caseExpressionDepth > 0, _subqueryDepth);
                CurrentStatement.AppendPredicate(new SqlPredicate(AsBaseToken(c), leftOp, rightOp, op, _inWhere));
            }
            else if(child is Binary_in_expressionContext ec)
            {
                var left = ec.left;
                var op = ec.op.Text;
                var leftOp = new SqlOperand(AsBaseToken(left), left is Function_call_expressionContext, FunctionOverConstant(left), _inWhere, _caseExpressionDepth > 0, _subqueryDepth);
                var sub = ec.subquery();
                var allFunctionsOverConstant = true; //Yes Not Exhaustive Check yet
                var subqueryFunctions = FindInstancesOfParentType<Function_call_expressionContext>(sub.children);
                var hasSubqueryFunctions = subqueryFunctions.Length > 0;
                if (subqueryFunctions.Length > 0)
                {
                    foreach(var fun in subqueryFunctions)
                    {
                        allFunctionsOverConstant = FunctionOverConstant(fun);
                        if (!allFunctionsOverConstant) { break; }
                    }
                }

                /* 
                 * This is the right side of the IN Operator 
                 * However by the time this rule is exited, the subquery has already been popped off as
                 * So to compensate we add 1 to the depth
                 */

                var rightOp = new SqlOperand(
                    AsBaseToken(sub),
                    hasSubqueryFunctions,
                    allFunctionsOverConstant,
                    _inWhere,
                    _caseExpressionDepth > 0,
                    _subqueryDepth 
                );

                CurrentStatement.AppendPredicate(new SqlPredicate(AsBaseToken(ec), leftOp, rightOp, op, _inWhere));


            }
        }

        private TParentType[] FindInstancesOfParentType<TParentType>(IList<IParseTree> children)
            where TParentType : class
        {
            List<TParentType> result = new List<TParentType>();
            foreach (var item in children)
            {
                if(item is null) { continue; }
                else if (item is TParentType tp) { result.Add(tp); }
                else{ result.AddRange(FindInstancesOfParentType<TParentType>(item)); }
            }
            return result.ToArray();
        }
        private TParentType[] FindInstancesOfParentType<TParentType>(IParseTree children)
            where TParentType : class
        {
            List<TParentType> result = new List<TParentType>();
            var len = children.ChildCount;
            for(int i = 0; i < len; i += 1)
            {
                var child = children.GetChild(i);
                if(child is TerminalNodeImpl) { continue; }
                else if (child is TParentType tp) { result.Add(tp); }
                else { result.AddRange(FindInstancesOfParentType<TParentType>(child)); }
            }
            return result.ToArray();
        }

        private static bool FunctionOverConstant(ExpressionContext exp)
        {
            if (exp is null) { return false; }
            if (exp.children.Count == 0) { return false; };
            if (exp.children[0] is Standard_callContext sc)
            {
                if (sc.children.Count < 2) { return false; }

                if (sc.children[2] is Expression_listContext elc)
                {
                    return elc.children[0] is Primitive_expressionContext;
                }
            }
            else if (exp is Primitive_expressionContext)
            {
                return true;
            }
            return false;
        }

        public override void ExitTable_source_item_name([Antlr4.Runtime.Misc.NotNull] Table_source_item_nameContext context)
        {
            var table = "";
            var schema = "dbo";
            var database = "";
            if (context.table_name() is not null) { table = context.table_name().GetText(); }
            var parts = table.Split(".");
            var plen = parts.Length;
            var tableName = parts[plen - 1]; 
            if(parts.Length > 1) { schema = parts[plen - 2]; }
            if (parts.Length > 2) {  database = parts[plen - 3]; }
            CurrentStatement.AddTable(AsBaseToken(context),database, schema, tableName);
            if (context.table_alias() is not null) { 
                var alias = context.table_alias().GetText();
                var usedAS = alias.Substring(0, 2) == "AS";
                if (usedAS) { alias = alias.Substring(2); }
                CurrentStatement.AppendAlias(alias,usedAS);
            }

        }

        public override void EnterDeclare_local([Antlr4.Runtime.Misc.NotNull] Declare_localContext context)
        {   /*DataTypes Don't have about spaces so we can use GetText*/
            var dataType = context.data_type();
            var name = context.LOCAL_ID().GetText();
            var parms = dataType.DECIMAL();
            var baseType = dataType.children[0].GetText();
            int? precision = null;
            int? scale = null;
            if (parms.Length > 0) precision = Int32.Parse(parms[0].GetText());
            if (parms.Length > 1) scale = Int32.Parse(parms[1].GetText());

            CurrentEnvironment.AppendVariable(AsBaseToken(context), name, baseType, precision, scale);
        }   

        

        public override void EnterSelect_list([NN] Select_listContext ctx)
        {
        }

    }
    public class TokenLoggingSqlListener : SqlListener
    {
        public TokenLoggingSqlListener([NN] Parser parser):base(parser){}
        public override void EnterEveryRule([NN] ParserRuleContext context)
        {
            Console.WriteLine($"enter {_parser.RuleNames[context.RuleIndex]} - {context.GetFullText()}");
            base.EnterEveryRule(context);
        }
        public override void ExitEveryRule([NN] ParserRuleContext context)
        {
            Console.WriteLine($"exit {_parser.RuleNames[context.RuleIndex]} - {context.GetFullText()}");
            base.ExitEveryRule(context);

        }
    }
}

