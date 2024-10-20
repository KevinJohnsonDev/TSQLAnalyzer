using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using TSQLAnalyzerLib.analysis;
using TSQLAnalyzerLib.listeners;
using System.ComponentModel.DataAnnotations;
using System.Xml.Linq;
using static TSqlParser;
using NN = System.Diagnostics.CodeAnalysis.NotNullAttribute;
using System.Data;
using static System.Formats.Asn1.AsnWriter;
using System.Security.AccessControl;

namespace TSQLAnalyzerLib.listeners
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

        public string FileName { get; set; } = "";

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

        public override void ExitSelect_statement_standalone([Antlr4.Runtime.Misc.NotNull] Select_statement_standaloneContext context) {
            CurrentStatement.Resolve(DbCatalog);
        }
        public override void EnterInsert_statement([Antlr4.Runtime.Misc.NotNull] Insert_statementContext context) {
            CurrentStatement = new SqlStatement(AsBaseToken(context),FileName);
            Ddl_objectContext ddlObj = context.ddl_object();
            Full_table_nameContext tableName = ddlObj.full_table_name();
            ExtractAndAddTableItem(AsBaseToken(context), tableName,null, null);
        }



        public override void EnterBatch([Antlr4.Runtime.Misc.NotNull] BatchContext context)
        {
            Environments.Add(new analysis.Environment());
            CurrentEnvironment = Environments[Environments.Count-1];
        }




        public override void EnterSql_clauses([NN] Sql_clausesContext context)
        {
            CurrentStatement = new SqlStatement(AsBaseToken(context), FileName);

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
            CurrentStatement.Resolve(DbCatalog);
            _subqueryDepth -= 1;
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
                var rightText = right is null ? (op == "IS" ? "NULL" : "") : right.GetText();
                var leftOp = new SqlOperand(AsBaseToken(left), left is Function_call_expressionContext, FunctionOverConstant(left),_inWhere,_caseExpressionDepth > 0, _subqueryDepth);
                var rightOp = new SqlOperand(AsBaseToken(right,rightText), right is Function_call_expressionContext, FunctionOverConstant(right), _inWhere, _caseExpressionDepth > 0, _subqueryDepth);
                CurrentStatement.AppendPredicate(new SqlPredicate(AsBaseToken(c), leftOp, rightOp, op, _inWhere, FileName));
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

                CurrentStatement.AppendPredicate(new SqlPredicate(AsBaseToken(ec), leftOp, rightOp, op, _inWhere, FileName));


            }
            else if (child is PredicateContext pc) {
                if(pc.ChildCount == 3) {
                    var leftOp = new SqlOperand(AsBaseToken(pc.children[0] as ParserRuleContext), pc.children[0] is Function_call_expressionContext, FunctionOverConstant(pc.children[0] as ExpressionContext), _inWhere, pc.children[0] is Case_expression_stubContext, _subqueryDepth);
                    var op = pc.children[1].GetText();
                    var rightOp = new SqlOperand(AsBaseToken(pc.children[2] as ParserRuleContext), pc.children[2] is Function_call_expressionContext, FunctionOverConstant(pc.children[2] as ExpressionContext), _inWhere, pc.children[2] is Case_expression_stubContext, _subqueryDepth);
                    CurrentStatement.AppendPredicate(new SqlPredicate(AsBaseToken(pc), leftOp, rightOp, op, _inWhere,FileName));

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
                            CurrentStatement.AppendPredicate(new SqlPredicate(AsBaseToken(pc), leftOp, rightOp, op, _inWhere, FileName));

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



        public override void ExitTable_source_item([Antlr4.Runtime.Misc.NotNull] Table_source_itemContext context) {
            ExtractAndAddTableItem(AsBaseToken(context),context.full_table_name(),context.derived_table(),context.as_table_alias());

        }

        private void ExtractAndAddTableItem(BaseToken context,Full_table_nameContext? ftn,Derived_tableContext? derived,As_table_aliasContext? ata) {
            var table = "";
            var schema = "dbo";
            var database = "";
            string alias = ata?.GetText() ?? "";
            var usedAS = alias.Length > 2 && alias.Substring(0, 2) == "AS";
            if (usedAS) { alias = alias.Substring(2); }

            if (ftn is not null) {
                table = ftn.GetFullText();

                var parts = table.Split(".");
                var plen = parts.Length;
                var tableName = parts[plen - 1];
                if (parts.Length > 1) { schema = parts[plen - 2]; }
                if (parts.Length > 2) { database = parts[plen - 3]; }
                else { database = DB; }
                DeclaredSqlTable? dt = DbCatalog.Seek(database, schema, tableName);
                if (dt is not null) {
                    CurrentStatement.AddTable(context, dt, alias, usedAS, DbCatalog);
                }
                else {
                    CurrentStatement.AddTable(context, database, schema, tableName, alias, usedAS ,DbCatalog);
                }
            }
            else if(derived is not null) {
                CurrentStatement.AddDerivedTable(context, alias, usedAS);
            }





        }

        public override void EnterDeclare_statement([Antlr4.Runtime.Misc.NotNull] Declare_statementContext context)
        {   /*DataTypes Don't have about spaces so we can use GetText*/
            var dataType = context.data_type();
            if(dataType != null) {
                var name = context.LOCAL_ID().GetText();
                var dtc = Extracted_Data_Type(dataType);
                CurrentEnvironment.AppendVariable(AsBaseToken(context), name, dtc);
                return;
            }
            var loc = context.declare_local();
            if(loc != null) {
                foreach(var declaration in loc) {
                    var name = declaration.LOCAL_ID().GetText();
                    var dtc = Extracted_Data_Type(declaration.data_type());
                    CurrentEnvironment.AppendVariable(AsBaseToken(context), name, dtc);
                }
                return;
            }
            throw new Exception("Declaration not handled");
        }   


        public override void EnterCreate_table([NN] Create_tableContext ctx) {
           var nameToken = ctx.GetChild<Table_nameContext>(0);
           var db = nameToken.database?.GetText() ?? DB;
           var schema = nameToken.schema?.GetText() ?? "dbo";
           var tableName = nameToken.table.GetText();
           var columns = new List<DeclaredSqlColumn>();
           string? pkName = null;
            DeclaredSqlColumn? pkCol = null;
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
                        var col = ExtractedColumnDefinition(column);
                        if (col is null) { continue; }
                            columns.Add(col);
                            var (isPrimaryKey,constraintName) = ExtractPrimaryKeyColumnConstraint(column);
                            if (isPrimaryKey) {
                                pkName = constraintName;
                                pkCol = col;
                            }
                    }
                }         
            }
            var table = new DeclaredSqlTable(AsBaseToken(ctx), db, schema, tableName, columns);
            if (pkCol is not null) { table.SetPrimaryKey(pkCol, pkName); }
            DbCatalog.Add(table);

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

            if (isAlter && isAdd && isColumn) {
                var con = ctx.column_def_table_constraints().column_def_table_constraint(0);
                var tableConstraint = con.table_constraint();
                if (tableConstraint == null) {
                    var column = ExtractedColumnDefinition(ctx.column_def_table_constraints().column_def_table_constraint(0));
                    target.Add(column);
                }
                else {
                    var id = tableConstraint.id_(0);
                    var constraintName = id?.GetText() ?? "[AutoGenerated]";
                    var isUnique = tableConstraint.UNIQUE() != null;
                    if (isUnique) {
                        SqlIndex index = new(constraintName, "", isUnique, false, false);
                        var columns = tableConstraint.column_name_list_with_order().id_();
                        AddColumnsToIndex(target, index, columns);
                        target.Add(index);
                    }
                }
            }
            else if (isAlter && isDrop && isColumn) {
                var column = ctx.id_(0).ID().GetText();
                target.Drop(column);
            }
            else if (isAlter) {
                var column = ExtractedColumnDefinition(ctx.column_def_table_constraints().column_def_table_constraint(0));
                target.Alter(column);
            }

        }


        public override void EnterCreate_index([Antlr4.Runtime.Misc.NotNull] Create_indexContext context) {
            Table_nameContext? tableNameContext = context.table_name() ?? throw new InvalidDataException("Erorr:Create Index ON Non Table");
            string database = (tableNameContext.database?.GetText() ?? DB).Replace("[", "").Replace("]", "");
            string schema = (tableNameContext.schema.GetText() ?? "dbo").Replace("[", "").Replace("]", "");
            string tableName = tableNameContext.table.GetText().Replace("[", "").Replace("]", "");

            var table = DbCatalog.SeekIgnoreCase(database, schema, tableName);
            if (table == null) {
                Console.WriteLine($"database: {database} schema:{schema} table:{tableName} not found in catalog");
                return;
            }

            /*
             * Notice we're getting the 0th iteration of ID for this 
                 : CREATE UNIQUE? clustered? INDEX id_ ON table_name '(' column_name_list_with_order ')' (
                    INCLUDE '(' column_name_list ')'
                )? (WHERE where = search_condition)? (create_index_options)? (ON id_)? ';'?            
             */
            string indexName = context.id_(0).GetText().Replace("[", "").Replace("]", "");
            bool isUnique = context.UNIQUE() != null;
            bool isClustered = context.clustered()?.GetText().ToUpper() == "CLUSTERED";
            string where = context.search_condition()?.GetText() ?? "";
            SqlIndex index = new(indexName, where, isUnique, isClustered, false);
            var columns = context.column_name_list_with_order().id_();
            AddColumnsToIndex(table, index, columns);
            var includeColumns = context.column_name_list()?.id_() ?? Array.Empty<Id_Context>();
            AddColumnsToIndex(table, index, includeColumns, true);
            table.Indexes.Add(index);
        }

        private static void AddColumnsToIndex(DeclaredSqlTable? table, SqlIndex index, Id_Context[] columns, bool isIncluded = false) {
            if (table == null) return;
            foreach (var column in columns) {
                var columnName = column.GetText().Replace("[", "").Replace("]", "");
                if (columnName == null) { continue; }
                DeclaredSqlColumn? col = table.Columns.Where((col) => col.ColumnName.ToLower() == columnName.ToLower()).First();
                index.Columns.Add(col);
                if (isIncluded) { index.IncludedColumns.Add(col); }
            }
        }


        private (bool,string) ExtractPrimaryKeyColumnConstraint(Column_def_table_constraintContext column) {
            var colToken = column.children[0] as Column_definitionContext;
            var constraintToken = column.children[0] as Table_constraintContext;
            if (colToken is null && constraintToken is not null) { return (false,""); }
#pragma warning disable  CS8602 // Dereference of a possibly null reference, if it's null the parsers broke
            var columnDefinitionElement = FindInstancesOfParentType<Column_definition_elementContext>(colToken.children);
#pragma warning restore CS8602 // Dereference of a possibly null reference.
            foreach (var def in columnDefinitionElement) {
                foreach(Column_constraintContext child in def.children.Cast<Column_constraintContext>()) {
                    if (HasPrimaryKeyDeclaration(child)) {
                        return (true, "");
                    }
                }

            }
            return (false, "");
        }
        private DeclaredSqlColumn ExtractedColumnDefinition(Column_def_table_constraintContext column) {
            var colToken = column.children[0] as Column_definitionContext;
            var constraintToken = column.children[0] as Table_constraintContext;
            if (colToken is null && constraintToken is not null) { return null; }
#pragma warning disable CS8602 // Dereference of a possibly null reference, if it's null the parsers broke
            var possibleNullabilityDeclarationTokens = FindInstancesOfParentType<Column_definition_elementContext>(colToken.children);
            var nullability = ColumnIsNullable(possibleNullabilityDeclarationTokens);
            var name = colToken.id_().ID().GetText();

#pragma warning restore CS8602 // Dereference of a possibly null reference.
            SqlDataType dt;
            if (colToken.AS() != null) {
                var exp = colToken.expression();
                var attempt = ComputedColumnExpressionType(exp);
                dt = attempt ?? new SqlDataType(AsBaseToken(exp), "UserDefined") ;
            }
            else {
                dt = Extracted_Data_Type(colToken.data_type());
            }
            return new DeclaredSqlColumn(AsBaseToken(colToken), name, dt, nullability);
        }

        private SqlDataType Extracted_Data_Type(Data_typeContext dtc) {
            var parms = dtc.DECIMAL();
            var baseType = dtc.children[0].GetText();
            int? precision = null;
            int? scale = null;
            if (parms.Length > 0) precision = Int32.Parse(parms[0].GetText());
            if (parms.Length > 1) scale = Int32.Parse(parms[1].GetText());
            return new SqlDataType(AsBaseToken(dtc), baseType, precision, scale);
        }

        private bool ColumnIsNullable(Column_definition_elementContext[] cde) {
            foreach (var possibleToken in cde) {
                if (IsNotNullDeclaration(possibleToken)) { return false; }
                foreach (var child in possibleToken.children) {
                    if (HasPrimaryKeyDeclaration(child as Column_constraintContext)) {
                        return false;
                    }
                }
            }
            return true;
        }
        private bool IsNotNullDeclaration(ParserRuleContext prc) {
            return prc.Start.Text.ToUpper() == "NOT" && prc.Stop.Text.ToUpper() == "NULL";
        }
        private bool HasPrimaryKeyDeclaration(Column_constraintContext? constraint) {
            if (constraint == null) { return false; }
            var terminals = constraint.children.Where((token) => token is TerminalNodeImpl).ToList();
            for (var i = 0; i < terminals.Count - 1; i++) {
                if (terminals[i].GetText().ToUpper() == "PRIMARY") {
                    if (terminals[i + 1].GetText().ToUpper() == "KEY") {
                        return true;
                    }
                }
            }
            return false;
        }

        public SqlDataType? ComputedColumnExpressionType(ExpressionContext ec) {
            if (ec == null) { return null; }
            if(ec.children.Count == 1 && ec.children[0] is BUILT_IN_FUNCContext fun) {
                if (fun.children[0] is CASTContext cc) {
                    /*OuterMost Cast Determinees Type CAST(CAST(x AS CHAR) AS INT) and so it will be last type extracted */
                    Data_typeContext[] dtc = FindInstancesOfParentType<Data_typeContext>(cc.children);
                    return Extracted_Data_Type(dtc[^1]);
                }
                if (fun.children[0] is ISNULLContext inc) {
                    Data_typeContext[] dtc = FindInstancesOfParentType<Data_typeContext>(inc.children);
                    return Extracted_Data_Type(dtc[^1]);
                }
            }
            return null;
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

