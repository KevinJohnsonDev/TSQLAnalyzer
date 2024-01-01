using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using AntlrCSharp.analysis;
using System.Xml.Linq;
using static tsqlParser;
using NN = System.Diagnostics.CodeAnalysis.NotNullAttribute;
namespace AntlrCSharp.listeners
{
    public class SqlListener: tsqlBaseListener
    {
        public String DB { get; set; } = "";
        public bool _inWhere = false;
        public bool _inCaseExpression = false;
        public List<SqlStatement> Statements { get; } = new List<SqlStatement>();
        private readonly Parser _parser;
        private SqlStatement CurrentStatement { get; set; }

        public SqlListener([NN] Parser parser)
        {
            _parser = parser;
        }
        
        public override void EnterEveryRule([NN] ParserRuleContext context)
        {
            Console.WriteLine($"enter {_parser.RuleNames[context.RuleIndex]} - {context.GetText()}");
            base.EnterEveryRule(context);


        }

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

        public override void ExitEveryRule([NN] ParserRuleContext context)
        {
            Console.WriteLine($"exit {_parser.RuleNames[context.RuleIndex]} - {context.GetText()}");
            base.ExitEveryRule(context);

        }
    
        public override void EnterTsql_file([NN] Tsql_fileContext context)
        {
           // base.EnterTsql_file(context);

        }


        public override void EnterSql_clause([NN] Sql_clauseContext context)
        {
            CurrentStatement = new SqlStatement(context.GetText());

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
            var parts = tokenText.Replace("[","").Replace("]","").Split(".");
            if(parts.Length >= 2) {
                CurrentStatement.AddColumn(parts[parts.Length-2], parts[parts.Length - 1], context.GetText());
            }
            base.ExitFull_column_name(context);
        }

        public override void ExitSelect_list_elem([NN] Select_list_elemContext context)
        {
            if (context.column_alias() is not null) { CurrentStatement.AppendAlias(context.column_alias().GetText()); }
        } 

        public override void EnterCase_expression([NN]  Case_expressionContext context)
        {
            _inCaseExpression = true;
        }

        public override void ExitCase_expression([NN] Case_expressionContext context)
        {
            _inCaseExpression = false;
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
                var leftOp = new SqlOperand(left.GetText(), left is Function_call_expressionContext, FunctionOverConstant(left),_inWhere,_inCaseExpression);
                var rightOp = new SqlOperand(rightText, right is Function_call_expressionContext, FunctionOverConstant(right), _inWhere, _inCaseExpression);
                CurrentStatement.AppendPredicate(new SqlPredicate(c.GetText(), leftOp, rightOp, op, _inWhere));
            }
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
            CurrentStatement.AddTable(database, schema, tableName, context.GetText());
            if (context.table_alias() is not null) { 
                var alias = context.table_alias().GetText();
                var usedAS = alias.Substring(0, 2) == "AS";
                if (usedAS) { alias = alias.Substring(2); }
                CurrentStatement.AppendAlias(alias,usedAS);
            }

        }


        public override void EnterSelect_list([NN] Select_listContext ctx)
        {
        }

    }
}
