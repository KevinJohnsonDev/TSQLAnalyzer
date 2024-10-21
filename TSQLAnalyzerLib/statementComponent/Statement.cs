using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Data.Common;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static Antlr4.Runtime.Atn.SemanticContext;
using static System.Net.Mime.MediaTypeNames;
using System.Security.Cryptography;

namespace TSQLAnalyzerLib.statementComponent {

    public enum SqlDataTypes
    {
        USER_DEFINED = -1,
        BIT = 0,
        TINYINT = 1,
        SMALLINT = 2,
#pragma warning disable CA1069 // Enums values should not be duplicated

        INT = 3,
        INTEGER = 3,
#pragma warning restore CA1069 // Enums values should not be duplicated
        BIGINT = 4,
        NUMERIC = 5,
        SMALLMONEY = 6,
        MONEY = 7,
        FLOAT = 8,
        REAL = 9,
        DATE = 10,
        DATETIMEOFFSET = 11,
        DATETIME = 12,
        DATETIME2 = 13,
        SMALLDATETIME = 14,
        TIME = 15,
        CHAR = 16,
        VARCHAR = 17,
        TEXT = 18,
        NCHAR = 19,
        NVARCHAR = 20,
        NTEXT = 21,
        BINARY = 22,
        VARBINARY = 23,
        IMAGE = 24,
        CURSOR = 25,
        ROWVERSION = 26,
#pragma warning disable CA1069 // Enums values should not be duplicated
        TIMESTAMP = 26,
#pragma warning restore CA1069 // Enums values should not be duplicated
        HIERARCHYID = 27,
        UNIQUEIDENTIFIER = 28,
        SQL_VARIANT = 29,
        XML = 30,
        GEOMETRY = 31,
        UNRESOLVED = 99
    }
    public class Statement : ISargable, ITokenText, INonSargableTokens
    {

        public string FileName { get; init; } = "";
        public string DbContext { get; init; } = "";
        public string TokenText { get; init; }
        public int Start { get; init; }
        public int End { get; init; }
        public bool UsesDistinct { get; set; }
        public List<Predicate> Predicates { get; } = new List<Predicate>();
        public List<Subquery> Subqueries { get; } = new List<Subquery>();
        public Table? UpdateTarget { get; }

        private string? _unresolvedUpdateTarget;

        public List<Table> Tables { get; } = new List<Table>();
        public List<Column> Columns { get; } = new List<Column>();

        private IAliasable? CurrentAliasable { get; set; }

        private Subquery PreviousSubquery { get; set; }
        private Subquery CurrentSubquery { get; set; }
        private Stack<Subquery> PendingSubqueries { get; }

        private readonly List<ISargable> _nonSargableTokens = new();

        private readonly Dictionary<Table, ResolvedTable> resolvedSqlTables = new();
        public Dictionary<Table, ResolvedTable> ResolvedTables { get { return resolvedSqlTables; } }

        private readonly Dictionary<Column, ResolvedColumn> _resolvedSqlColumns = new();

        public Dictionary<Column, ResolvedColumn> ResolvedColumns { get { return _resolvedSqlColumns; } }

        public List<Table> UnresolvedTables { get; } = new List<Table>();
        public List<Column> UnresolvedColumns { get; } = new List<Column>();

        public IEnumerable<ISargable> NonSargableTokens
        {
            get
            {
                if (_nonSargableTokens.Count > 0) { return _nonSargableTokens; }
                foreach (var predicate in Predicates)
                {
                    if (!predicate.IsSargable()) { _nonSargableTokens.Add(predicate); }
                }

                foreach (var subquery in Subqueries)
                {
                    if (!subquery.IsSargable()) { _nonSargableTokens.Add(subquery); }
                }
                return _nonSargableTokens;

            }

        }

        public Statement(BaseToken token, string fileName)
        {
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
            UsesDistinct = false;
            PendingSubqueries = new();
            FileName = fileName;

        }
        public Statement(BaseToken token, string db, bool usesDistinct, string fileName)
        {
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
            DbContext = db;
            UsesDistinct = usesDistinct;
            FileName = fileName;
        }

        public bool IsSargable()
        {
            foreach (var predicate in Predicates)
            {
                if (!predicate.IsSargable()) { return false; }
            }

            foreach (var subquery in Subqueries)
            {
                if (!subquery.IsSargable()) { return false; }
            }
            return true;
        }



        public void AddColumn(BaseToken token, string tableName, string columnName,StatementPosition position)
        {
            var col = new Column(token, tableName, columnName,position);

            if (CurrentSubquery is not null)
            {
                CurrentSubquery.Columns.Add(col);
                CurrentSubquery.UnresolvedColumns.Add(col);
            }
            else
            {
                UnresolvedColumns.Add(col);
                Columns.Add(col);
            }

            CurrentAliasable = col;
        }

        public void AppendAlias(string alias, bool usedAs = false)
        {
            if (CurrentAliasable == null) { return; }/*Case where Constant has alias so we don't need to mark constants as columns*/
            CurrentAliasable.Alias = alias;
            CurrentAliasable.UsedAs = usedAs;
            CurrentAliasable = null;
        }

        public void AppendPredicate(Predicate pred)
        {
            Predicates.Add(pred);
        }

        public void Resolve(Catalog catalog)
        {
            Dictionary<Column, List<ResolvedColumn>> potentials = new();
            List<Table> remainingTables = new();
            List<Column> remainingColumns = new();
            foreach (Table table in UnresolvedTables)
            {
                ResolvedTable? dst = catalog.Seek(table);
                if (dst is null)
                {
                    remainingTables.Add(table);
                    continue;
                }
                ResolvedTables.Add(table, dst);
            }
            UnresolvedTables.Clear();
            UnresolvedTables.AddRange(remainingTables);

            foreach (Column col in UnresolvedColumns)
            {
                foreach (var kvp in ResolvedTables)
                {
                    var dst = kvp.Value;
                    var table = kvp.Key;
                    ResolvedColumn? tableCol = dst.Columns.FirstOrDefault((tableCol) => tableCol.ColumnName == col.ColumnName);
                    if (tableCol is null) { continue; }
                    if (col.OwnerID == table.Alias)
                    {
                        ResolvedColumns.Add(col, tableCol);
                        col.Table = tableCol.Table;
                        continue;
                    }
                    if (col.OwnerID == table.TableName && table.Alias == "")
                    {
                        ResolvedColumns.Add(col, tableCol);
                        continue;
                    }
                }


            }
            UnresolvedColumns.RemoveAll(col => ResolvedColumns.Keys.Contains(col));
        }
        public void AddTable(BaseToken token, string db, string schema, string tableName, string alias, bool usedAs, Catalog catalog) => AddTable(new Table(token, db, schema, tableName, alias, usedAs), catalog);
        public void AddTable(BaseToken token, string schema, string tableName, string alias, bool usedAs, Catalog catalog) => AddTable(new Table(token, schema, tableName, alias, usedAs), catalog);
        public void AddTable(BaseToken token, string tableName, string alias, bool usedAs, Catalog catalog) => AddTable(new Table(token, "dbo", tableName, alias, usedAs), catalog);

        public void AddTable(BaseToken token, ResolvedTable dst, string alias, bool usedAs, Catalog catalog) => AddTable(new Table(token, dst, alias, usedAs), catalog);

        public void AddDerivedTable(BaseToken token, string alias, bool usedAs)
        {
            var tbl = new DerivedTable(token, PreviousSubquery, "", "", alias, alias, usedAs);
            if (PreviousSubquery?.parent != this) { PreviousSubquery?.parent.Tables.Add(tbl); }
            Tables.Add(tbl);

        }


        public void AddTable(Table tbl, Catalog catalog)
        {
            ResolvedTable? dst = tbl.ResolvedTable is not null ? 
                tbl.ResolvedTable : catalog.Seek(tbl);
            AppendTable(this, dst, tbl);
            AppendTable(CurrentSubquery, dst, tbl);
        }

        private static void AppendTable(Statement? sqlStatement, ResolvedTable? dst, Table tbl)
        {

            if (sqlStatement is null) { return; }
            sqlStatement.Tables.Add(tbl);
            if (dst != null) {
                sqlStatement.ResolvedTables.Add(tbl, dst);
            }
            else { sqlStatement.UnresolvedTables.Add(tbl); }
        }



        public void EnterSubquery(BaseToken token)
        {
            var cur = new Subquery(CurrentSubquery ?? this, token, FileName);
            var target = CurrentSubquery ?? this;
            target.Subqueries.Add(cur);
            PendingSubqueries.Push(cur);
            CurrentSubquery = cur;
        }

        public void ExitSubquery(Catalog catalog)
        {

            CurrentSubquery?.Resolve(catalog);
            PreviousSubquery = CurrentSubquery;
            if (PendingSubqueries.Count > 0) { PendingSubqueries.Pop(); }
            if (PendingSubqueries.Count > 0) { CurrentSubquery = PendingSubqueries.Pop(); }
            else { CurrentSubquery = null; };
        }



        public void EnterDDL_Object()
        {

        }


        public override string ToString()
        {
            var tables = "Table List";
            var columns = "Column List";
            var preds = "Predicate List";
            var subs = "Subquery List";
            foreach (var table in Tables) { tables += "\n\t\t" + table.ToString().ToString().Replace("\t", "\t\t\t"); }
            foreach (var column in Columns) { columns += $"\n\t\t{column.ToString().Replace("\t", "\t\t\t")}"; }
            foreach (var pred in Predicates) { preds += $"\n\t\t{pred.ToString().Replace("\t", "\t\t\t")}"; }
            foreach (var sub in Subqueries) { subs += $"\n\t\t{sub}"; }
            var fileHeader = string.IsNullOrWhiteSpace(FileName) ? "" : $"___FileName:{FileName}___\n";
            return $"{fileHeader}{TokenText}:{Start}-{End}\n\tContext:{DbContext}\n\t{preds}\n\t{tables}\n\t{columns}\n\t{subs}";
        }
    }

    public class Subquery : Statement
    {
        public Statement parent;


        public Subquery(Statement parentScope, BaseToken token, string fileName) : base(token, fileName)
        {
            parent = parentScope;
        }

        public Subquery(BaseToken token, string db, bool usesDistinct, string fileName)
            : base(token, db, usesDistinct, fileName) { }
    }
}
