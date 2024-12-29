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
    public class Statement : ISargable, ITokenText, INonSargableTokens {

        public string FileName { get; init; } = "";
        public string DbContext { get; init; } = "";

        private Stack<ColumnBuilder> PendingColumns { get; init; } = new();
        public BaseToken Token { get; init; }
        public string TokenText { get; init; }
        public int Start { get; init; }
        public int End { get; init; }
        public bool UsesDistinct { get; set; }
        public List<Predicate> Predicates { get; } = new List<Predicate>();
        public List<Subquery> Subqueries { get; } = new List<Subquery>();
        public Table? DmlTarget { get; set; }

        public List<DerivedTable> CTEs { get; } = new();

        public List<Table> Tables { get; } = new List<Table>();
        public List<Column> Columns { get; } = new List<Column>();

        private IAliasable? CurrentAliasable { get; set; }

        private Subquery? PreviousSubquery { get; set; }
        private Subquery? CurrentSubquery { get; set; }
        private Stack<Subquery> PendingSubqueries { get; }

        private readonly List<ISargable> _nonSargableTokens = new();

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
            Token = token;
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
            UsesDistinct = false;
            PendingSubqueries = new();
            FileName = fileName;

        }
        public Statement(BaseToken token, string db, bool usesDistinct, string fileName)
        {
            Token = token;
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
            DbContext = db;
            UsesDistinct = usesDistinct;
            FileName = fileName;
            PendingSubqueries = new();
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



        public void AddSimpleColumn(BaseToken token, string tableName, string columnName,StatementPosition position) {
            var col = new SimpleColumn(token, tableName, columnName, position);

            AddColumnToBuckets(col);
        }
        public void AddDerivedColumn(DerivedColumn derived) {
            AddColumnToBuckets(derived);
        }

        public void AddConstantColumn(ConstantColumn c) {
            AddColumnToBuckets(c);
        }
        private void AddColumnToBuckets(Column col) {
            var cur = CurrentSubquery ?? this;
            if(cur.PendingColumns.Count == 0) {
                cur.Columns.Add(col);
                cur.UnresolvedColumns.Add(col);

            }
            else {
                var pend = cur.PendingColumns.Peek();
                pend.Columns.Add(col);
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

        public void Resolve(Catalog catalog) {
            Dictionary<Column, List<ResolvedColumn>> potentials = new();
            List<Table> remainingTables = new();
            List<Column> remainingColumns = new();
            foreach (Table table in UnresolvedTables) {
                ResolvedTable? dst = catalog.Seek(table.Id);
                if (dst is null) {
                    remainingTables.Add(table);
                    continue;
                }
                table.ResolvedTable = dst;
            }
            UnresolvedTables.Clear();
            UnresolvedTables.AddRange(remainingTables);

            Statement statement = CurrentSubquery ?? this;
            List<SimpleColumn> columns = statement.UnresolvedColumns.OfType<SimpleColumn>().ToList();
            ResolveColumns(statement, columns);
            foreach(Subquery s in statement.Subqueries) {
                List<SimpleColumn> cols = s.UnresolvedColumns.OfType<SimpleColumn>().ToList();
                ResolveColumns(s, cols);
            }
        }

        private void ResolveColumns(Statement statement,List<SimpleColumn> unresolved) {
            foreach (SimpleColumn col in unresolved) {
                foreach (Table table in statement.Tables.Where((table) => table.Columns is not null)) {
                    if (col.Table is not null) { break; }
                    TryMapColumnToTable(col, table);
                }
                foreach (DerivedTable table in CTEs) {
                    if (col.Table is not null) { break; }
                    TryMapColumnToTable(col, table);
                }
            }
            if(statement is Subquery s) { ResolveColumns(s.parent, unresolved); }
            statement.UnresolvedColumns.RemoveAll(col => col is SimpleColumn sc && sc.Table is not null);
        }

        private static void TryMapColumnToTable(SimpleColumn col, Table table) {
            IEnumerable<SimpleColumn> sc = table.Columns.OfType<SimpleColumn>();
            SimpleColumn? tableCol = sc.FirstOrDefault((tableCol) => tableCol is SimpleColumn sc && sc.ColumnName == col.ColumnName);
            if (tableCol is null) { return ; }
            if (String.IsNullOrWhiteSpace(col.OwnerID)) { return; }
            if (col.OwnerID == table.Alias) {
                col.Assign(tableCol);
                return;
            }
            if (col.OwnerID == table.TableName && table.Alias == "") {
                col.Assign(tableCol);
                return;
            }
        }

        public void AddCTE(DerivedTable dt) {
            CTEs.Add(dt);
        }
        public void AddTable(BaseToken token, Identifier id, Catalog catalog, ResolvedTable? dst) => AddTable(new Table(token, id,dst), catalog);

        public void AddDerivedTable(BaseToken token, Identifier id)
        {
            var tbl = new DerivedTable(token, PreviousSubquery, id);
            AddDerivedTable(tbl);

        }

        public void AddDerivedTable(DerivedTable tbl) {
            var statement = CurrentSubquery ?? this;
            statement.Tables.Add(tbl);

        }

        public void AddTable(Table tbl, Catalog catalog)
        {
            ResolvedTable? dst = tbl.ResolvedTable is not null ? 
                tbl.ResolvedTable : catalog.Seek(tbl.Id);
            if(dst is null && tbl.ResolvedTable is null) {
                DerivedTable? cte = CTEs.FirstOrDefault((table) => table.Id.Matches2PartName(tbl.Id));
                if(cte is not null) {
                    
                    AddDerivedTable(cte.CloneWithChanges(tbl.Token,tbl.Id));
                    return;
                }
            }
            if(dst != null && tbl.ResolvedTable is null) { 
                tbl.ResolvedTable = dst; 
            }
            AppendTable(CurrentSubquery ?? this, dst, tbl);
        }

        private static void AppendTable(Statement? sqlStatement, ResolvedTable? dst, Table tbl)
        {

            if (sqlStatement is null) { return; }
            sqlStatement.Tables.Add(tbl);
            if (dst == null) {sqlStatement.UnresolvedTables.Add(tbl);}
        }

        public void EnterSelectElement(BaseToken token, StatementPosition position) {
            var cur = CurrentSubquery ?? this;
            cur.PendingColumns.Push(new ColumnBuilder(token, position));
        }

        public void ExitSelectElement() {
            var cur = CurrentSubquery ?? this;
            var pending = cur.PendingColumns.Pop().Resolve();
            if (pending != null) { cur.AddColumnToBuckets(pending); }
        }




        public void EnterSubquery(BaseToken token)
        {
            Statement item = CurrentSubquery ?? this;
            var cur = new Subquery(item ?? this, token, FileName);
            cur.CTEs.AddRange(CTEs);
            var target = item ?? this;
            target.Subqueries.Add(cur);
            PendingSubqueries.Push(cur);
            PreviousSubquery = CurrentSubquery;
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



        public override string ToString()
        {
            var tables = "Table List";
            var columns = "SimpleColumn List";
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
