using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using TSQLAnalyzerLib.listeners;
using TSQLAnalyzerLib.statementComponent;
using System.Data;
using static TSqlParser;
using NN = System.Diagnostics.CodeAnalysis.NotNullAttribute;
using Index = TSQLAnalyzerLib.statementComponent.Index;

namespace TSQLAnalyzerLib.visitors
{
    /// <summary>
    /// Visitor for table definition statements (CREATE TABLE, ALTER TABLE, DROP TABLE, CREATE INDEX).
    /// Handles schema-level DDL operations and separates concerns from DML parsing.
    /// </summary>
    public class TableDefinitionVisitor : TSqlParserBaseVisitor<object?>
    {
        private readonly Catalog _dbCatalog;
        private readonly Parser _parser;
        private readonly Statement _currentStatement;
        private string _currentDatabase;

        public TableDefinitionVisitor([NN] Catalog dbCatalog, [NN] Parser parser, [NN] Statement currentStatement, string currentDatabase = "")
        {
            _dbCatalog = dbCatalog;
            _parser = parser;
            _currentStatement = currentStatement;
            _currentDatabase = currentDatabase;
        }

        public string CurrentDatabase
        {
            get => _currentDatabase;
            set => _currentDatabase = value;
        }

        /// <summary>
        /// Handle CREATE TABLE statements
        /// </summary>
        public override object? VisitCreate_table([NN] Create_tableContext ctx)
        {
            var nameToken = ctx.GetChild<Table_nameContext>(0);
            var db = nameToken.database?.GetText() ?? _currentDatabase;
            var schema = nameToken.schema?.GetText() ?? "dbo";
            var tableName = nameToken.table.GetText();

            if (tableName.StartsWith("#")) { db = "tempdb"; }

            var columns = new List<ResolvedColumn>();
            string? pkName = null;
            ResolvedColumn? pkCol = null;
            var table = new ResolvedTable(AsBaseToken(ctx), db, schema, tableName, columns);

            /*
             * CREATE --> Token 0 Ignore
             * TABLE --> Token 1 Ignore
             * [Name] --> Token 2 Already Processed above
             * ( --> Token 3
             * Columns
             * ) --> Last Token
             */
            for (int i = 4; i < ctx.children.Count - 1; i++)
            {
                if (ctx.children[i] is not Column_def_table_constraintsContext columnConstraint)
                {
                    continue;
                }

                foreach (var token in columnConstraint.children)
                {
                    if (token is Column_def_table_constraintContext column)
                    {
                        var col = ExtractedColumnDefinition(column, table);
                        if (col is null) { continue; }

                        columns.Add(col);
                        var (isPrimaryKey, constraintName) = ExtractPrimaryKeyColumnConstraint(column);
                        if (isPrimaryKey)
                        {
                            pkName = constraintName;
                            pkCol = col;
                        }
                    }
                }
            }

            if (pkCol is not null) { table.SetPrimaryKey(pkCol, pkName); }
            _dbCatalog.Add(table);

            return table;
        }

        /// <summary>
        /// Handle DROP TABLE statements
        /// </summary>
        public override object? VisitDrop_table([NN] Drop_tableContext context)
        {
            var nameToken = context.GetChild<Table_nameContext>(0);
            var db = nameToken.database?.GetText() ?? _currentDatabase;
            var schema = nameToken.schema?.GetText() ?? "dbo";
            var tableName = nameToken.table.GetText();
            var table = _dbCatalog.Seek(db, schema, tableName);

            if (table is not null)
            {
                _dbCatalog.Drop(table, _currentStatement);
            }

            return null;
        }

        /// <summary>
        /// Handle ALTER TABLE statements
        /// </summary>
        public override object? VisitAlter_table([NN] Alter_tableContext ctx)
        {
            var nameToken = ctx.GetChild<Table_nameContext>(0);
            var db = nameToken.database?.GetText() ?? _currentDatabase;
            var schema = nameToken.schema?.GetText() ?? "dbo";
            var tableName = nameToken.table.GetText();
            var target = _dbCatalog.Seek(db, schema, tableName);

            if (target == null) return null; /*should probably emit a warning*/

            var isAlter = ctx.ALTER() != null;
            var isAdd = ctx.ADD() != null;
            var isDrop = ctx.DROP() != null;
            var isColumn = ctx.COLUMN != null;

            if (isAlter && isAdd && isColumn)
            {
                var con = ctx.column_def_table_constraints().column_def_table_constraint(0);
                var tableConstraint = con.table_constraint();
                if (tableConstraint == null)
                {
                    var column = ExtractedColumnDefinition(ctx.column_def_table_constraints().column_def_table_constraint(0), target);
                    target.Add(column);
                }
                else
                {
                    var id = tableConstraint.id_(0);
                    var constraintName = id?.GetText() ?? "[AutoGenerated]";
                    var isUnique = tableConstraint.UNIQUE() != null;
                    if (isUnique)
                    {
                        Index index = new(constraintName, "", isUnique, false, false);
                        var columns = tableConstraint.column_name_list_with_order().id_();
                        AddColumnsToIndex(target, index, columns);
                        target.Add(index);
                    }
                }
            }
            else if (isAlter && isDrop && isColumn)
            {
                var column = ctx.id_(0).ID().GetText();
                target.Drop(column);
            }
            else if (isAlter)
            {
                var column = ExtractedColumnDefinition(ctx.column_def_table_constraints().column_def_table_constraint(0), target);
                target.Alter(column);
            }

            return null;
        }

        /// <summary>
        /// Handle CREATE INDEX statements
        /// </summary>
        public override object? VisitCreate_index([NN] Create_indexContext context)
        {
            Table_nameContext? tableNameContext = context.table_name() ?? throw new InvalidDataException("Error: Create Index ON Non Table");
            string database = (tableNameContext.database?.GetText() ?? _currentDatabase).Replace("[", "").Replace("]", "");
            string schema = (tableNameContext.schema.GetText() ?? "dbo").Replace("[", "").Replace("]", "");
            string tableName = tableNameContext.table.GetText().Replace("[", "").Replace("]", "");

            var table = _dbCatalog.SeekIgnoreCase(database, schema, tableName);
            if (table == null)
            {
                Console.WriteLine($"database: {database} schema:{schema} table:{tableName} not found in catalog");
                return null;
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
            Index index = new(indexName, where, isUnique, isClustered, false);

            var columns = context.column_name_list_with_order().id_();
            AddColumnsToIndex(table, index, columns);

            var includeColumns = context.column_name_list()?.id_() ?? Array.Empty<Id_Context>();
            AddColumnsToIndex(table, index, includeColumns, true);

            table.Indexes.Add(index);

            return index;
        }

        /// <summary>
        /// Extract column definition from a column context
        /// </summary>
        private ResolvedColumn? ExtractedColumnDefinition(Column_def_table_constraintContext column, ResolvedTable tbl)
        {
            var colToken = column.children[0] as Column_definitionContext;
            var constraintToken = column.children[0] as Table_constraintContext;

            if (colToken is null && constraintToken is not null) { return null; }

#pragma warning disable CS8602 // Dereference of a possibly null reference, if it's null the parsers broke
            var possibleNullabilityDeclarationTokens = FindInstancesOfParentType<Column_definition_elementContext>(colToken.children);
            var nullability = ColumnIsNullable(possibleNullabilityDeclarationTokens);
            var name = colToken.id_().ID().GetText();

#pragma warning restore CS8602 // Dereference of a possibly null reference.

            DataType dt;
            if (colToken.AS() != null)
            {
                var exp = colToken.expression();
                var attempt = ComputedColumnExpressionType(exp);
                dt = attempt ?? new DataType(AsBaseToken(exp), "UserDefined");
            }
            else
            {
                dt = Extracted_Data_Type(colToken.data_type());
            }

            return new ResolvedColumn(AsBaseToken(colToken), name, dt, nullability, tbl);
        }

        /// <summary>
        /// Extract data type information from a data type context
        /// </summary>
        private DataType Extracted_Data_Type(Data_typeContext dtc)
        {
            var parms = dtc.DECIMAL();
            var baseType = dtc.children[0].GetText();
            int? precision = null;
            int? scale = null;

            if (parms.Length > 0) precision = Int32.Parse(parms[0].GetText());
            if (parms.Length > 1) scale = Int32.Parse(parms[1].GetText());

            return new DataType(AsBaseToken(dtc), baseType, precision, scale);
        }

        /// <summary>
        /// Determine if a column is nullable based on constraints
        /// </summary>
        private bool ColumnIsNullable(Column_definition_elementContext[] cde)
        {
            foreach (var possibleToken in cde)
            {
                if (IsNotNullDeclaration(possibleToken)) { return false; }
                foreach (var child in possibleToken.children)
                {
                    if (HasPrimaryKeyDeclaration(child as Column_constraintContext))
                    {
                        return false;
                    }
                }
            }
            return true;
        }

        /// <summary>
        /// Check if a context represents a NOT NULL constraint
        /// </summary>
        private bool IsNotNullDeclaration(ParserRuleContext prc)
        {
            return prc.Start.Text.ToUpper() == "NOT" && prc.Stop.Text.ToUpper() == "NULL";
        }

        /// <summary>
        /// Check if a constraint contains a PRIMARY KEY declaration
        /// </summary>
        private bool HasPrimaryKeyDeclaration(Column_constraintContext? constraint)
        {
            if (constraint == null) { return false; }
            var terminals = constraint.children.Where((token) => token is TerminalNodeImpl).ToList();
            for (var i = 0; i < terminals.Count - 1; i++)
            {
                if (terminals[i].GetText().ToUpper() == "PRIMARY")
                {
                    if (terminals[i + 1].GetText().ToUpper() == "KEY")
                    {
                        return true;
                    }
                }
            }
            return false;
        }

        /// <summary>
        /// Extract primary key information from a column constraint
        /// </summary>
        private (bool, string) ExtractPrimaryKeyColumnConstraint(Column_def_table_constraintContext column)
        {
            var colToken = column.children[0] as Column_definitionContext;
            var constraintToken = column.children[0] as Table_constraintContext;

            if (colToken is null && constraintToken is not null) { return (false, ""); }

#pragma warning disable  CS8602 // Dereference of a possibly null reference, if it's null the parsers broke
            var columnDefinitionElement = FindInstancesOfParentType<Column_definition_elementContext>(colToken.children);
#pragma warning restore CS8602 // Dereference of a possibly null reference.

            foreach (var def in columnDefinitionElement)
            {
                foreach (Column_constraintContext child in def.children.Cast<Column_constraintContext>())
                {
                    if (HasPrimaryKeyDeclaration(child))
                    {
                        return (true, "");
                    }
                }
            }
            return (false, "");
        }

        /// <summary>
        /// Determine the data type of a computed column expression
        /// </summary>
        private DataType? ComputedColumnExpressionType(ExpressionContext ec)
        {
            if (ec == null) { return null; }
            if (ec.children.Count == 1 && ec.children[0] is BUILT_IN_FUNCContext fun)
            {
                if (fun.children[0] is CASTContext cc)
                {
                    /*OuterMost Cast Determines Type CAST(CAST(x AS CHAR) AS INT) and so it will be last type extracted */
                    Data_typeContext[] dtc = FindInstancesOfParentType<Data_typeContext>(cc.children);
                    return Extracted_Data_Type(dtc[^1]);
                }
                if (fun.children[0] is ISNULLContext inc)
                {
                    Data_typeContext[] dtc = FindInstancesOfParentType<Data_typeContext>(inc.children);
                    return Extracted_Data_Type(dtc[^1]);
                }
            }
            return null;
        }

        /// <summary>
        /// Add columns to an index (either as key or included columns)
        /// </summary>
        private static void AddColumnsToIndex(ResolvedTable? table, Index index, Id_Context[] columns, bool isIncluded = false)
        {
            if (table == null) return;
            foreach (var column in columns)
            {
                var columnName = column.GetText().Replace("[", "").Replace("]", "");
                if (columnName == null) { continue; }
                ResolvedColumn? col = table.Columns.Where((col) => col.ColumnName.ToLower() == columnName.ToLower()).FirstOrDefault();
                if (col != null)
                {
                    index.Columns.Add(col);
                    if (isIncluded) { index.IncludedColumns.Add(col); }
                }
            }
        }

        /// <summary>
        /// Recursively find all instances of a specific type in a parse tree
        /// </summary>
        private TParentType[] FindInstancesOfParentType<TParentType>(IList<IParseTree> children)
            where TParentType : class
        {
            List<TParentType> result = new List<TParentType>();
            foreach (var item in children)
            {
                if (item is null) { continue; }
                else if (item is TParentType tp) { result.Add(tp); }
                else { result.AddRange(FindInstancesOfParentType<TParentType>(item)); }
            }
            return result.ToArray();
        }

        /// <summary>
        /// Recursively find all instances of a specific type in a parse tree
        /// </summary>
        private TParentType[] FindInstancesOfParentType<TParentType>(IParseTree children)
            where TParentType : class
        {
            List<TParentType> result = new List<TParentType>();
            var len = children.ChildCount;
            for (int i = 0; i < len; i += 1)
            {
                var child = children.GetChild(i);
                if (child is TerminalNodeImpl) { continue; }
                else if (child is TParentType tp) { result.Add(tp); }
                else { result.AddRange(FindInstancesOfParentType<TParentType>(child)); }
            }
            return result.ToArray();
        }

        /// <summary>
        /// Convert a parser rule context to a BaseToken
        /// </summary>
        private static BaseToken AsBaseToken(ParserRuleContext context) => 
            new(context.GetFullText(), context.Start.StartIndex, context.Stop.StopIndex);

        /// <summary>
        /// Convert a parser rule context to a BaseToken with implicit text
        /// </summary>
        private static BaseToken AsBaseToken(ParserRuleContext context, string implicitTokenText) => 
            new(implicitTokenText, context?.Start?.StartIndex ?? -1, context?.Stop?.StopIndex ?? -1);
    }
}
