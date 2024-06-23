using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using TSQLParserLib.analysis;
using TSQLParserLib.listeners;
using System.ComponentModel.DataAnnotations;
using System.Xml.Linq;
using static TSqlParser;
using NN = System.Diagnostics.CodeAnalysis.NotNullAttribute;
namespace TSQLParserLib.listeners
{
    public class SqlListener : TSqlParserBaseListener
    {
        public List<analysis.Environment> Environments { get; init; } = new List<analysis.Environment>();
        public Catalog DbCatalog { get; init; } = new();
        public String DB { get; set; } = "";
        public bool _inWhere = false;
        private int _caseExpressionDepth = 0;
        private int _subqueryDepth = 0;
        public List<SqlStatement> Statements { get; } = new List<SqlStatement>();
        protected readonly Parser _parser;
        private SqlStatement CurrentStatement { get; set; }


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




        public override void EnterSql_clauses([NN] Sql_clausesContext context)
        {
            CurrentStatement = new SqlStatement(AsBaseToken(context));

        }
        public override void ExitSql_clauses([NN] Sql_clausesContext context)
        {
            Statements.Add(CurrentStatement);

        }
        public override void EnterUse_statement([NN] TSqlParser.Use_statementContext context)
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
            if (context.expression_elem() is not null) {
                var asAlias = context.expression_elem().as_column_alias();
                var alias = context.expression_elem().column_alias();
                if (asAlias != null) {
                    CurrentStatement.AppendAlias(asAlias.column_alias().GetFullText());
                }
                else if(alias != null) {
                    CurrentStatement.AppendAlias(alias.GetFullText());

                }
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
            if (child is Binary_operator_expressionContext c)
            {
                var left = c.left;
                var right = c.right;
                var op = c.op.Text;
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
            else if (child is PredicateContext pc) {
                if(pc.ChildCount == 3) {
                    var leftOp = new SqlOperand(AsBaseToken(pc.children[0] as ParserRuleContext), pc.children[0] is Function_call_expressionContext, FunctionOverConstant(pc.children[0] as ExpressionContext), _inWhere, pc.children[0] is Case_expression_stubContext, _subqueryDepth);
                    var op = pc.children[1].GetText();
                    var rightOp = new SqlOperand(AsBaseToken(pc.children[2] as ParserRuleContext), pc.children[2] is Function_call_expressionContext, FunctionOverConstant(pc.children[2] as ExpressionContext), _inWhere, pc.children[2] is Case_expression_stubContext, _subqueryDepth);
                    CurrentStatement.AppendPredicate(new SqlPredicate(AsBaseToken(pc), leftOp, rightOp, op, _inWhere));

                }
                else if(pc.ChildCount == 5) {
                    if (pc.children[0] is Column_ref_expressionContext) {
                        var leftOp = new SqlOperand(AsBaseToken(pc.children[0] as ParserRuleContext), false, FunctionOverConstant(pc.children[0] as ExpressionContext), _inWhere, pc.children[0] is Case_expression_stubContext, _subqueryDepth);
                        var op = "";
                        var sub = pc.subquery();
                        if (sub != null) {
                            if (pc.IN() != null) { op += "IN"; }
                            if (pc.ANY() != null) { op += "ANY"; }
                            if (pc.ALL() != null) { op += "ALL"; }
                            if (pc.NOT() != null) { op = "NOT " + op; }
                            var allFunctionsOverConstant = true; //Yes Not Exhaustive Check yet
                            var subqueryFunctions = FindInstancesOfParentType<Function_call_expressionContext>(sub.children);
                            var hasSubqueryFunctions = subqueryFunctions.Length > 0;
                            if (subqueryFunctions.Length > 0) {
                                foreach (var fun in subqueryFunctions) {
                                    allFunctionsOverConstant = FunctionOverConstant(fun);
                                    if (!allFunctionsOverConstant) { break; }
                                }
                            }
                            var rightOp = new SqlOperand(
                                         AsBaseToken(sub),
                                         hasSubqueryFunctions,
                                         allFunctionsOverConstant,
                                         _inWhere,
                                         _caseExpressionDepth > 0,
                                         _subqueryDepth
                                     )
                                ;
                            CurrentStatement.AppendPredicate(new SqlPredicate(AsBaseToken(pc), leftOp, rightOp, op, _inWhere));

                        }
                    }
                }
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

        private  bool FunctionOverConstant(ExpressionContext exp)
        {
            
            if (exp is null) { return false; }

            if (exp.children.Count == 0) { return false; };
            if (exp.children[0] is SCALAR_FUNCTIONContext sc)
            {
                if (sc.children.Count < 2) { return false; }

                if (sc.children[2] is Expression_listContext elc)
                {
                    return elc.children[0] is Primitive_expressionContext;
                }
            }
            else if (exp.children[0] is BUILT_IN_FUNCContext bi) {
                if (bi.children.Count == 1) {
                    if (bi.children[0] is RTRIMContext rtc) {
                        return FindInstancesOfParentType<Primitive_expression_stubContext>(rtc.children).Length > 0;
                    }
                }
                if (bi.children.Count < 2) { return false; }

                if (bi.children[2] is Expression_listContext elc) {
                    return elc.children[0] is Primitive_expressionContext;
                }
            }
            else if (exp is Primitive_expression_stubContext)
            {
                return true;
            }
            return false;
        }



        public override void ExitTable_source_item([Antlr4.Runtime.Misc.NotNull] Table_source_itemContext context)
        {
            var table = "";
            var schema = "dbo";
            var database = "";
            if (context.full_table_name() is not null) { table = context.full_table_name().GetFullText(); }
            var parts = table.Split(".");
            var plen = parts.Length;
            var tableName = parts[plen - 1]; 
            if(parts.Length > 1) { schema = parts[plen - 2]; }
            if (parts.Length > 2) {  database = parts[plen - 3]; }
            CurrentStatement.AddTable(AsBaseToken(context),database, schema, tableName);
            if (context.as_table_alias() is not null) { 
                var alias = context.as_table_alias().GetText();
                var usedAS = alias.Substring(0, 2) == "AS";
                if (usedAS) { alias = alias.Substring(2); }
                CurrentStatement.AppendAlias(alias,usedAS);
            }

        }

        public override void EnterDeclare_statement([Antlr4.Runtime.Misc.NotNull] Declare_statementContext context)
        {   /*DataTypes Don't have about spaces so we can use GetText*/
            var dataType = Extracted_Data_Type(context.data_type());
            var name = context.LOCAL_ID().GetText();
            CurrentEnvironment.AppendVariable(AsBaseToken(context), name, dataType);
        }   

        
        private SqlDataType Extracted_Data_Type(Data_typeContext dtc) {
            var parms = dtc.DECIMAL();
            var baseType = dtc.children[0].GetText();
            int? precision = null;
            int? scale = null;
            if (parms.Length > 0) precision = Int32.Parse(parms[0].GetText());
            if (parms.Length > 1) scale = Int32.Parse(parms[1].GetText());
            return new SqlDataType(AsBaseToken(dtc),baseType,precision,scale);
        }

        public override void EnterSelect_list([NN] Select_listContext ctx)
        {
        }

        public override void EnterAlter_table([NN] Alter_tableContext ctx) {
            var nameToken = ctx.GetChild<Table_nameContext>(0);
            var db = nameToken.database?.GetText() ?? DB;
            var schema = nameToken.schema?.GetText() ?? "dbo";
            var tableName = nameToken.table.GetText();
            var target = DbCatalog.Seek(db, schema, tableName);
            if (target == null) return; /*should probably emit a warning*/
            var isAlter = ctx.ALTER() != null;
            var isAdd = ctx.ADD() != null;
            var isDrop = ctx.DROP() != null;
            var isColumn = ctx.COLUMN != null;
            if (isAlter && isAdd) {
                var column = ExtractedColumnDefinition(ctx.column_def_table_constraints().column_def_table_constraint(0));
                target.Add(column);
            }
            else if (isAlter && isDrop && isColumn) {
                var column = ctx.id_(0).ID().GetText();
                target.Drop(column);
                Console.Write(column.ToString());
            }
            else if(isAlter) {
                var column = ExtractedColumnDefinition(ctx.column_def_table_constraints().column_def_table_constraint(0));
                target.Alter(column);     
            }
        }

        public override void EnterCreate_table([NN] Create_tableContext ctx) {
           var nameToken = ctx.GetChild<Table_nameContext>(0);
           var db = nameToken.database?.GetText() ?? DB;
           var schema = nameToken.schema?.GetText() ?? "dbo";
           var tableName = nameToken.table.GetText();
           var columns = new List<DeclaredSqlColumn>();

            /*
             * CREATE --> Token 0 Ignore
             * TABLE --> Token 1 Ignore
             * [Name] --> Token 2 Already Processed above
             * ( --> Token 3
             * Columns
             * ) --> Last Token
             */
            for (int i = 4; i < ctx.children.Count - 1; i++) { 
                if (ctx.children[i] is not Column_def_table_constraintsContext columnConstraint) { 
                    continue; 
                }
                foreach(var token in columnConstraint.children) {
                    if (token is Column_def_table_constraintContext column) {
                        columns.Add(ExtractedColumnDefinition(column));
                    }
                }         
            }
            DbCatalog.Add(new DeclaredSqlTable(AsBaseToken(ctx), db, schema, tableName, columns));
        }
        private DeclaredSqlColumn ExtractedColumnDefinition(Column_def_table_constraintContext column) {
            var colToken = column.children[0] as Column_definitionContext;

#pragma warning disable CS8602 // Dereference of a possibly null reference, if it's null the parsers broke
            var nameID = colToken.id_();
            var IDID = nameID.ID();
            var name = IDID.GetText();
#pragma warning restore CS8602 // Dereference of a possibly null reference.
            var dt = Extracted_Data_Type(colToken.data_type());
            return new DeclaredSqlColumn(AsBaseToken(colToken), name, dt);
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

