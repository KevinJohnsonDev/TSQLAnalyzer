using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using TSQLAnalyzerLib.listeners;
using TSQLAnalyzerLib.visitors;
using System.ComponentModel.DataAnnotations;
using System.Xml.Linq;
using static TSqlParser;
using NN = System.Diagnostics.CodeAnalysis.NotNullAttribute;
using System.Data;
using static System.Formats.Asn1.AsnWriter;
using System.Security.AccessControl;
using TSQLAnalyzerLib.statementComponent;
using Antlr4.Runtime.Misc;
using System.Diagnostics;

namespace TSQLAnalyzerLib.listeners
{
    public class SqlListener : TSqlParserBaseListener
    {
        private enum TableType {
            Normal = 0,
            Derived = 1
        }
        private record TableParts{
            public readonly TableType TableType;

            public readonly BaseToken Context;
            public readonly ResolvedTable? ResolvedTable;
            public readonly Identifier Id;
            public TableParts(TableType TableType, BaseToken Context, Identifier id, ResolvedTable? ResolvedTable) {
                this.Id = id;
                this.TableType = TableType;
                this.Context = Context;
                this.ResolvedTable = ResolvedTable;
                if(TableType == TableType.Normal) {
                    if(id.Database is null) { throw new ArgumentException("Database cannot be null for normal table", nameof(id)); }
                    if(id.Schema is null) { throw new ArgumentNullException(nameof(id), "Schema cannot be null for normal table"); }
                    if(id.Name is null) { throw new ArgumentNullException(nameof(id), "Name cannot be null for normal table"); }
                }
                else if (TableType == TableType.Derived) {
                    if (id.Alias is null) { throw new ArgumentNullException(nameof(id), "Alias cannot be null for Derived table"); }

                }
            }
        }

        private StatementPosition _position = new();
        public List<statementComponent.Environment> Environments { get; init; } = new List<statementComponent.Environment>();
        public Catalog DbCatalog { get; init; } = new();
        public String DB { get; set; } = "";
        public bool _inWhere = false;
        private int _caseExpressionDepth = 0;
        public List<Statement> Statements { get; } = new List<Statement>();
        protected readonly Parser _parser;
        private Statement CurrentStatement { get; set; }

        private List<DerivedTable> _ctes = new();

        private statementComponent.Environment CurrentEnvironment { get; set; } = new statementComponent.Environment();

        private TableDefinitionVisitor? _tableDefVisitor;

        public SqlListener([NN] Parser parser)
        {
            _parser = parser;
        }

        public string FileName { get; set; } = "";

        private static BaseToken AsBaseToken(ParserRuleContext context) => new(context.GetFullText(), context.Start.StartIndex, context.Stop.StopIndex);
        private static BaseToken AsBaseToken(ParserRuleContext context, string implicitTokenText) => new(implicitTokenText, context?.Start?.StartIndex ?? -1, context?.Stop?.StopIndex ?? -1);



        public override void EnterTable_sources([NotNull] Table_sourcesContext context)
        {
            _position.WhereDepth += 1; 
            _inWhere = true;
        }



        public override void ExitDml_clause([NotNull] Dml_clauseContext context)
        {
            _inWhere = false;
            _position.Reset();
        }

        public override void EnterSelect_statement([NotNull] Select_statementContext context) {
            _position.SelectDepth += 1;
        }

        public override void ExitSelect_statement([NotNull] Select_statementContext context) {
            _position.SelectDepth -= 1;
            _position.WhereDepth -= 1;
        }

        public override void ExitSelect_statement_standalone([NotNull] Select_statement_standaloneContext context) {
            CurrentStatement.Resolve(DbCatalog);
        }
        public override void ExitInsert_statement([NotNull] Insert_statementContext context) {
            CurrentStatement.Resolve(DbCatalog);
        }



        public override void EnterInsert_statement([NotNull] Insert_statementContext context) {
            CurrentStatement = new Statement(AsBaseToken(context),FileName);
            Ddl_objectContext ddlObj = context.ddl_object();
            Full_table_nameContext tableName = ddlObj.full_table_name();
            TableParts? tp = ExtractAndAddTableItem(AsBaseToken(context), tableName,null, null);
            Debug.Assert(tp is not null);
            CurrentStatement.DmlTarget = new Table(tp.Context, tp.Id, tp.ResolvedTable);
            
        }



        public override void EnterCommon_table_expression([NotNull] Common_table_expressionContext context) {
            var id = new Identifier(context.expression_name.GetText(), true);
            var table = new DerivedTable(AsBaseToken(context), CurrentStatement, id);
            _ctes.Add(table);
            CurrentStatement.AddCTE(table);
        }

        /*
        
        common_table_expression
            : expression_name = id_ ('(' columns = column_name_list ')')? AS '(' cte_query = select_statement ')'
    ; 
         */
        public override void ExitCommon_table_expression([NotNull] Common_table_expressionContext context) {
            CurrentStatement.Resolve(DbCatalog);
            /*Resolving the Current Statement Doesn't Update the Already Existing Derived Table So WE have to reinitialize it */
            _ctes[^1] = new DerivedTable(_ctes[^1].Token, CurrentStatement, _ctes[^1].Id);
            
            var currentCTE = _ctes[^1];
            CurrentStatement = new Statement(CurrentStatement.Token, FileName);
            foreach(DerivedTable cte in _ctes) {
                if (!CurrentStatement.Tables.Contains(cte)) { CurrentStatement.AddCTE(cte); }
            }
        }

        public override void EnterBatch([NotNull] BatchContext context)
        {
            Environments.Add(new statementComponent.Environment());
            CurrentEnvironment = Environments[^1];
        }




        public override void EnterSql_clauses([NN] Sql_clausesContext context)
        {
            CurrentStatement = new Statement(AsBaseToken(context), FileName);

        }
        public override void ExitSql_clauses([NN] Sql_clausesContext context)
        {
            Statements.Add(CurrentStatement);

        }
        public override void EnterUse_statement([NN] Use_statementContext context)
        {
            DB = context.Stop.Text;
        }

        public override void ExitFull_column_name([NotNull] Full_column_nameContext context)
        {
            var tokenText = context.GetText();
            var parts = tokenText.Replace("[", "").Replace("]", "").Split(".");
            if (parts.Length >= 2) {
                CurrentStatement.AddSimpleColumn(AsBaseToken(context), parts[parts.Length - 2], parts[parts.Length - 1],(StatementPosition)_position.Clone());
            }
            base.ExitFull_column_name(context);
        }

        public override void EnterSelect_list_elem([NotNull] Select_list_elemContext context) 
        {
            CurrentStatement.EnterSelectElement(AsBaseToken(context), (StatementPosition)_position.Clone());
        }
        public override void ExitSelect_list_elem([NN] Select_list_elemContext context)
        {
            var ee = context.expression_elem();
            if (ee is null) { return; }
            var asAlias = ee.as_column_alias();
            var alias = ee.column_alias();
            string? aliasName =  asAlias?.column_alias().GetFullText() ?? alias?.GetFullText();
            if(ee.expression() is not null) {
                ExpressionContext exp = ee.expression();
                if (exp.children[0] is Bracket_expressionContext bec) {
                    /*bracket_expression: '(' expression ')'| '(' subquery ')'; */
                    if (bec.children[1] is SubqueryContext sc) {
                        var column = new DerivedColumn(
                            AsBaseToken(context),
                            (StatementPosition)_position.Clone(),
                            CurrentStatement.Subqueries[^1]
                            );
                        CurrentStatement.AddDerivedColumn(column);
                    }
                }
            }
            CurrentStatement.ExitSelectElement();
            if (aliasName != null) { CurrentStatement.AppendAlias(aliasName); }
        }

        public override void EnterPrimitive_expression([NotNull] Primitive_expressionContext context) {
            CurrentStatement.AddConstantColumn(new ConstantColumn(AsBaseToken(context), (StatementPosition)_position.Clone()));
        }

        public override void EnterCase_expression([NN] Case_expressionContext context) => _caseExpressionDepth += 1;
        public override void ExitCase_expression([NN] Case_expressionContext context) => _caseExpressionDepth -= 1;
        public override void EnterSubquery([NotNull] SubqueryContext context) {
            _position.SubqueryDepth += 1;
            CurrentStatement.EnterSubquery(AsBaseToken(context));
         }
        public override void ExitSubquery([NotNull] SubqueryContext context)
        {
            CurrentStatement.Resolve(DbCatalog);
            _position.SubqueryDepth -= 1;
            CurrentStatement.ExitSubquery(DbCatalog);
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
                var leftBaseToken = AsBaseToken(left);
                BaseToken rightToken;
                string rightText;
                if(right is null) {
                    rightText = op == "IS" ? "NULL" : "";
                    rightToken = new BaseToken(rightText,leftBaseToken.End+2, leftBaseToken.End + rightText.Length);
                }
                else {
                    rightText = right.GetText();
                    rightToken = AsBaseToken(right, rightText);
                }
                var leftOp = new Operand(leftBaseToken, left is Function_call_expressionContext, FunctionOverConstant(left),_inWhere,_caseExpressionDepth > 0, _position.SubqueryDepth);
                var rightOp = new Operand(rightToken, right is Function_call_expressionContext, FunctionOverConstant(right), _inWhere, _caseExpressionDepth > 0, _position.SubqueryDepth);
                CurrentStatement.AppendPredicate(new Predicate(AsBaseToken(c), leftOp, rightOp, op, _inWhere, FileName));
            }
            else if(child is Binary_in_expressionContext ec)
            {
                var left = ec.left;
                var op = ec.op.Text;
                var leftOp = new Operand(AsBaseToken(left), left is Function_call_expressionContext, FunctionOverConstant(left), _inWhere, _caseExpressionDepth > 0, _position.SubqueryDepth);
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

                var rightOp = new Operand(
                    AsBaseToken(sub),
                    hasSubqueryFunctions,
                    allFunctionsOverConstant,
                    _inWhere,
                    _caseExpressionDepth > 0,
                    _position.SubqueryDepth
                );

                CurrentStatement.AppendPredicate(new Predicate(AsBaseToken(ec), leftOp, rightOp, op, _inWhere, FileName));


            }
            else if (child is PredicateContext pc) {
                if(pc.ChildCount == 3) {
                    var leftOp = new Operand(AsBaseToken(pc.children[0] as ParserRuleContext), pc.children[0] is Function_call_expressionContext, FunctionOverConstant(pc.children[0] as ExpressionContext), _inWhere, pc.children[0] is Case_expression_stubContext, _position.SubqueryDepth);
                    var op = pc.children[1].GetText();
                    var rightOp = new Operand(AsBaseToken(pc.children[2] as ParserRuleContext), pc.children[2] is Function_call_expressionContext, FunctionOverConstant(pc.children[2] as ExpressionContext), _inWhere, pc.children[2] is Case_expression_stubContext, _position.SubqueryDepth);
                    CurrentStatement.AppendPredicate(new Predicate(AsBaseToken(pc), leftOp, rightOp, op, _inWhere,FileName));

                }
                else if(pc.ChildCount == 5) {
                    if (pc.children[0] is Column_ref_expressionContext) {
                        var leftOp = new Operand(AsBaseToken(pc.children[0] as ParserRuleContext), false, FunctionOverConstant(pc.children[0] as ExpressionContext), _inWhere, pc.children[0] is Case_expression_stubContext, _position.SubqueryDepth);
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
                            var rightOp = new Operand(
                                         AsBaseToken(sub),
                                         hasSubqueryFunctions,
                                         allFunctionsOverConstant,
                                         _inWhere,
                                         _caseExpressionDepth > 0,
                                         _position.SubqueryDepth
                                     )
                                ;
                            CurrentStatement.AppendPredicate(new Predicate(AsBaseToken(pc), leftOp, rightOp, op, _inWhere, FileName));

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

        private  bool FunctionOverConstant(ExpressionContext? exp)
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
                if (sc.children[2] is Expression_list_Context pesc) {
                    if (pesc.children[0] is Primitive_expression_stubContext) {
                        return true;
                    }
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



        public override void ExitTable_source_item([NotNull] Table_source_itemContext context) {
            TableParts? tp = ExtractAndAddTableItem(AsBaseToken(context),context.full_table_name(),context.derived_table(),context.as_table_alias());
            Debug.Assert (tp != null);
            switch(tp.TableType){
                case TableType.Normal:
#pragma warning disable CS8604 // Possible null reference argument.
                    CurrentStatement.AddTable(tp.Context, tp.Id, DbCatalog,tp.ResolvedTable);
#pragma warning restore CS8604 // Possible null reference argument.
                    break;
                case TableType.Derived:
                    CurrentStatement.AddDerivedTable(tp.Context, tp.Id);
                    break;

            }
            
        }

        private TableParts? ExtractAndAddTableItem(BaseToken context,Full_table_nameContext? ftn,Derived_tableContext? derived,As_table_aliasContext? ata) {
            string schema = "dbo";
            string alias = ata?.GetText() ?? "";
            bool usedAS = alias.Length > 2 && alias[..2] == "AS";
            if (usedAS) { alias = alias[2..]; }

            if (ftn is not null) {
                var table = ftn.GetFullText();

                var parts = table.Split(".");
                var plen = parts.Length;
                var tableName = parts[plen - 1];
                if (parts.Length > 1) { schema = parts[plen - 2]; }
                var database = "";
                if (parts.Length > 2) { database = parts[plen - 3]; }
                else { database = DB; }
                Identifier id = new(alias, usedAS, tableName, schema, database);
                ResolvedTable? dt = DbCatalog.Seek(database, schema, tableName);

                return new TableParts(TableType.Normal,context, id,dt);
            }
            if(derived is not null) {
                Identifier id = new(alias, usedAS);
                return new TableParts(TableType.Derived, context, id,null);
            }
            return null;
        }

        public override void EnterDeclare_statement([NotNull] Declare_statementContext context)
        {   /*DataTypes Don't have about spaces so we can use GetText*/
            var dataType = context.data_type();
            if(dataType != null) {
                var name = context.LOCAL_ID().GetText();
                var dtc = ExtractDataType(dataType);
                CurrentEnvironment.AppendVariable(AsBaseToken(context), name, dtc);
                return;
            }
            var loc = context.declare_local();
            if(loc != null) {
                foreach(var declaration in loc) {
                    var name = declaration.LOCAL_ID().GetText();
                    var dtc = ExtractDataType(declaration.data_type());
                    CurrentEnvironment.AppendVariable(AsBaseToken(context), name, dtc);
                }
                return;
            }
            throw new Exception("Declaration not handled");
        }

        private static statementComponent.DataType ExtractDataType(Data_typeContext dtc)
        {
            var parms = dtc.DECIMAL();
            var baseType = dtc.children[0].GetText();
            int? precision = null;
            int? scale = null;
            if (parms.Length > 0) precision = Int32.Parse(parms[0].GetText());
            if (parms.Length > 1) scale = Int32.Parse(parms[1].GetText());
            return new statementComponent.DataType(AsBaseToken(dtc), baseType, precision, scale);
        }


        public override void EnterCreate_table([NN] Create_tableContext ctx)
        {
            _tableDefVisitor ??= new TableDefinitionVisitor(DbCatalog, _parser, CurrentStatement, DB);
            _tableDefVisitor.CurrentDatabase = DB;
            _tableDefVisitor.VisitCreate_table(ctx);
        }

        public override void EnterDrop_table([NotNull] Drop_tableContext context)
        {
            _tableDefVisitor ??= new TableDefinitionVisitor(DbCatalog, _parser, CurrentStatement, DB);
            _tableDefVisitor.CurrentDatabase = DB;
            _tableDefVisitor.VisitDrop_table(context);
        }

        public override void EnterAlter_table([NN] Alter_tableContext ctx)
        {
            _tableDefVisitor ??= new TableDefinitionVisitor(DbCatalog, _parser, CurrentStatement, DB);
            _tableDefVisitor.CurrentDatabase = DB;
            _tableDefVisitor.VisitAlter_table(ctx);
        }


        public override void EnterCreate_index([NotNull] Create_indexContext context)
        {
            _tableDefVisitor ??= new TableDefinitionVisitor(DbCatalog, _parser, CurrentStatement, DB);
            _tableDefVisitor.CurrentDatabase = DB;
            _tableDefVisitor.VisitCreate_index(context);
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

