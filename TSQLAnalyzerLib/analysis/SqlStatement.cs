using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using TSQLAnalyzerLib.analysis;
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

namespace TSQLAnalyzerLib.analysis {

    public enum DataType {
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
    public interface ITokenText {
        String TokenText { get; init; }
        int Start { get; init; }
        int End { get; init; }
    }
    public interface ISargable : ITokenText {
        Boolean IsSargable();

    }

    public interface INonSargableTokens {
        IEnumerable<ISargable> NonSargableTokens { get; }
    }

    public interface IAliasable : ITokenText {
        String Alias { get; set; }
        bool UsedAs { get; set; }
    }

    public class BaseToken : ITokenText {
        public String TokenText { get; init; }

        public static BaseToken OnlineToken { get; }

        static BaseToken(){
            OnlineToken  = new BaseToken("[ONLINE]", -1, -1);
        }

        public int Start { get; init; }
        public int End { get; init; }

        public BaseToken(string tokenText, int start, int end) {
            TokenText = tokenText;
            Start = start;
            End = end;
        }
    }


    public class SqlDataType : ITokenText, IEquatable<SqlDataType?> {
        /*Declaration TokenText */
        public string TokenText { get; init; }
        public int Start { get; init; }
        public int End { get; init; }


        public DataType BaseType { get; init; }
        public int? Precision { get; init; }
        public int? Scale { get; init; }

        public SqlDataType(BaseToken token, string dataType, int? precision = null, int? scale = null) {
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
            BaseType = Enum.TryParse(dataType, out DataType dt) ? dt : DataType.USER_DEFINED;
            Precision = precision;
            Scale = scale;
        }

        public bool Equals(SqlDataType? other) {
            return other is not null &&
                   BaseType == other.BaseType &&
                   Precision == other.Precision &&
                   Scale == other.Scale;
        }

        public override int GetHashCode() {
            return HashCode.Combine(BaseType, Precision, Scale);
        }

        public static bool operator ==(SqlDataType? left, SqlDataType? right) {
            return EqualityComparer<SqlDataType>.Default.Equals(left, right);
        }

        public static bool operator !=(SqlDataType? left, SqlDataType? right) {
            return !(left == right);
        }

        public static SqlDataType FromDatabase(string dataType, int? precision = null, int? scale = null) {
            return new SqlDataType(BaseToken.OnlineToken, dataType, precision, scale);
        }
    }
    public class SqlVariable : ITokenText {

        public string TokenText { get; init; }
        public int Start { get; init; }
        public int End { get; init; }

        public string Name { get; init; }
        public SqlDataType DeclaredDataType { get; init; }

        public SqlVariable(BaseToken token, string name, SqlDataType declaredDataType) {
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
            Name = name;
            DeclaredDataType = declaredDataType;
        }
    }

    public class Catalog {

        public List<DeclaredSqlTable> Tables { get; init; }
        public Catalog() {
            Tables = new();
        }

        public DeclaredSqlTable? Seek(string db,string schema,string tableName) {
            db = db.Replace("[", "").Replace("]", "");
            schema = schema.Replace("[", "").Replace("]", "");
            tableName = tableName.Replace("[", "").Replace("]", "");
            return Tables.FirstOrDefault(
                (table) =>  table.Database == db &&
                            table.Schema == schema &&
                            table.TableName== tableName);
        }

        public DeclaredSqlTable? Seek(SqlTable table) {
            var db = table.Database.Replace("[", "").Replace("]", "");
            var schema = table.Schema.Replace("[", "").Replace("]", "");
            var tableName = table.TableName.Replace("[", "").Replace("]", "");
            return Tables.FirstOrDefault(
                (table) => table.Database == db &&
                            table.Schema == schema &&
                            table.TableName == tableName);
        }
        public DeclaredSqlTable? SeekIgnoreCase(string db, string schema, string tableName) {
            db = db.ToLower();
            schema = schema.ToLower();
            tableName = tableName.ToLower();
            return Tables.FirstOrDefault((table) => table.Database.ToLower() == db &&
            table.Schema.ToLower() == schema &&
            table.TableName.ToLower() == tableName
);
        }

        public void Add(DeclaredSqlTable table) { 
            Tables.Add(table); 
        }

    }
    public class Environment
    {
        public List<SqlVariable> Variables { get; init; }
        public Environment()
        {
            Variables = new();
        }

        public void AppendVariable(BaseToken token, string name, SqlDataType sdt)
        {
            Variables.Add(new SqlVariable(token,name, sdt)); 
        }
    }


    public class SqlOperand : ISargable,ITokenText {
        public string TokenText { get; init; }
        public int Start { get; init; }
        public int End { get; init; }
        public bool UsedFunction { get; init; } 
        public bool IsConstant { get; init; }
        
        public bool InCaseStatement { get; init; }
        public bool InWhere { get; init; }
        public bool InSubquery => SubQueryDepth > 0;


        public int SubQueryDepth { get; init; }

        public SqlOperand(BaseToken token, bool usedFunction, bool isConstant, bool inWhere,bool inCaseStatement,int subqueryDepth) {
            IsConstant = isConstant;
            UsedFunction = usedFunction;
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
            InCaseStatement = inCaseStatement;
            InWhere = inWhere;
            SubQueryDepth = subqueryDepth;
        }
        public bool IsSargable()
        {
            if(!InWhere && !InSubquery) { return true; }
            if (InCaseStatement) { return false; }
            if (IsConstant) { return true; }
            if (UsedFunction) { return false; }
            return true;
        }

        public override string ToString()
        {
            return $"{TokenText}:{Start}-{End}\n\tInWhere:{InWhere}\n\tInCaseStatement:{InCaseStatement}\n\tUsedFunction:{UsedFunction}";
        }
    }
    public class SqlPredicate : ISargable, ITokenText
    {
        public string TokenText { get; init; }
        public int Start { get; init; }
        public int End { get; init; }
        public ISargable Left { get; set; }

        public bool InWhere { get; init; }

        public string Op { get; set; }

        public ISargable Right { get; set; }

        public string FileName { get; init; } = "";

        public SqlPredicate(BaseToken token, ISargable left, ISargable right, String op, bool inWhere,string fileName  ) {
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
            Left = left;
            Right = right;
            Left = left;
            Op = op;
            InWhere = inWhere;
            FileName = fileName; 
        }
        public bool IsSargable()
        {
            return Left.IsSargable() && Right.IsSargable();
        }

        public override string ToString()
        {
            var prefix = String.IsNullOrWhiteSpace(FileName) ? "" : $"FileName:{FileName}\n";
            return $"{prefix}{FileName}{TokenText}:{Start}-{End}\n\tLeft:{Left}\n\tOp:{Op}\n\tRight:{Right}";
        }
    }

    public record SqlIndex {
        public IList<DeclaredSqlColumn> Columns { get; init; }
        public IList<DeclaredSqlColumn> IncludedColumns { get; init; }

        public string Name { get; init; }
        public string? WhereClause { get; init; }

        public bool IsUnique { get; init; }
        public bool IsClustered { get; init; }
        public bool IsPrimaryKey { get; init; }

        public SqlIndex(string name,IList<DeclaredSqlColumn> columns, string? whereClause, IList<DeclaredSqlColumn> includedColumns,   bool isUnique, bool isClustered, bool isPrimaryKey) {
            Name = name;
            Columns = columns;
            WhereClause = whereClause;
            IncludedColumns = includedColumns;
            IsUnique = isUnique;
            IsClustered = isClustered;
            IsPrimaryKey = isPrimaryKey;
        }

        public SqlIndex(string name, string? whereClause,  bool isUnique, bool isClustered, bool isPrimaryKey) {
            Name = name;
            Columns = new List<DeclaredSqlColumn>();
            WhereClause = whereClause;
            IncludedColumns = new List<DeclaredSqlColumn>();
            IsUnique = isUnique;
            IsClustered = isClustered;
            IsPrimaryKey = isPrimaryKey;
        }

    }

    public class DeclaredSqlTable : ITokenText {
        public string TokenText { get; init; }
        public int Start { get; init; }
        public int End { get; init; }
        public string TableName { get; init; }
        public string Database { get; init; }
        public string Schema { get; init; }

        private SqlIndex? _clusteredIndex;
        public SqlIndex? ClusteredIndex { get { return _clusteredIndex; } }

        public IList<SqlIndex> Indexes { get; init; }

        public IList<DeclaredSqlColumn> Columns { get; init; }

        public DeclaredSqlTable(BaseToken token, string database, string schema, string tableName, IList<DeclaredSqlColumn> columns) {
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
            Database = database;
            Schema = schema;
            TableName = tableName;
            Columns = columns;
            Indexes = new List<SqlIndex>();
            foreach (var col in Columns) { col.Table = this; }
        }
        public DeclaredSqlTable(BaseToken token, string database, string schema, string tableName) {
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
            Database = database;
            Schema = schema;
            TableName = tableName;
            Columns = new List<DeclaredSqlColumn>();
            Indexes = new List<SqlIndex>();
            foreach(var col in Columns) { col.Table = this; }
        }

        public void Add(SqlIndex index) => Indexes.Add(index);
        public void Add(DeclaredSqlColumn col){
            Columns.Add(col);
            col.Table = this;
        }
        public void Alter(DeclaredSqlColumn col) {

            for(int i = 0; i < Columns.Count; i += 1) {
                if(col.ColumnName == Columns[i].ColumnName) { 
                    Columns[i] = col;
                    col.Table = this;
                }
            }
        }

        public void SetPrimaryKey(DeclaredSqlColumn col, string? constraintName = "[AutoGenerated]") {
            if (string.IsNullOrWhiteSpace(constraintName)) constraintName = "[AutoGenerated]";

            var idx = new SqlIndex(constraintName, "", true, true, true);
            idx.Columns.Add(col);
            _clusteredIndex = idx;
            this.Indexes.Add(idx);
        }

        public void Drop(string col) {
            int i;
            for ( i = 0; i < Columns.Count; i += 1) {
                if (col == Columns[i].ColumnName) { break; }
            }
            if (i > 0) { Columns.Remove(Columns[i]); }
        }

        public static DeclaredSqlTable FromDatabase(string database, string schema, string tableName) {
            return new DeclaredSqlTable(BaseToken.OnlineToken, database,schema,tableName);
        }

        public bool IsFromOnline() {
            return  TokenText == BaseToken.OnlineToken.TokenText &&
                    Start == BaseToken.OnlineToken.Start &&
                    End == BaseToken.OnlineToken.End;
        }
        public override string ToString() => $"{TokenText}:{Start}-{End}\n\tDatabase:{Database}\n\tSchema:{Schema}\n\tTableName:{TableName}\n\t";



    }

    public class DeclaredSqlColumn : ITokenText {
        public string TokenText { get; init; }
        public int Start { get; init; }
        public int End { get; init; }
        public string ColumnName { get; init; }

        public bool IsNullable { get; init; }

        public DeclaredSqlTable Table { get; set; }

        public SqlDataType SqlType { get; init; }
        public DeclaredSqlColumn( BaseToken token,string columnName,SqlDataType sqlType,bool isNullable) {
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
            ColumnName = columnName;
            SqlType = sqlType;
            IsNullable = isNullable;
        }

        public static DeclaredSqlColumn FromDatabase(string columnName, SqlDataType sqlType,bool isNullable) {
            return new DeclaredSqlColumn(BaseToken.OnlineToken, columnName, sqlType,isNullable);
        }
    }

    public class DerivedSQLTable : SqlTable {

        public DerivedSQLTable(BaseToken token, Subquery sub,string database,string schema,string tableName,string alias,bool usedAS):base(token, database, schema,  tableName, alias, usedAS) {
            Alias = tableName;
            UsedAs = usedAS;
        }
    }
    public class SqlTable : ITokenText, IAliasable, IEquatable<SqlTable?> {
        public string Alias { get; set; } = "";
        public string TokenText { get; init; }
        public int Start { get; init; }
        public string FQN { get; init; }
        public int End { get; init; }
        public bool UsedAs { get; set; }
        public string Database { get; init; }
        public string Schema { get; init; }
        public string TableName { get; init; }

        public DeclaredSqlTable? ResolvedTable { get; init; }

        public SqlTable(BaseToken token, DeclaredSqlTable dst, string alias, bool usedAs) {
            Database = dst.Database;
            Schema = dst.Schema;
            TableName = dst.TableName;
            Start = token.Start;
            End = token.End;
            TokenText = token.TokenText;
            var prefix = String.IsNullOrWhiteSpace(Database) ? "" : $"{Database}.";
            FQN = $"{prefix}{Schema}.{TableName}";
            ResolvedTable = dst;
            Alias = alias;
            UsedAs = usedAs;
        }

        public SqlTable(BaseToken token, string database,string schema, string tableName,string alias,bool usedAs) {
            Database = database;
            Schema = schema;
            TableName = tableName;
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
            var prefix = String.IsNullOrWhiteSpace(Database) ? "" : $"{Database}.";
            FQN = $"{prefix}{Schema}.{TableName}";
            Alias = alias;
            UsedAs = usedAs;
        }

        public SqlTable(BaseToken token, string schema, string tableName, string alias, bool usedAs)
        {
            Database = "";
            Schema = schema;
            TableName = tableName;
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
            FQN = $"{Schema}.{TableName}";
            Alias = alias;
            UsedAs = usedAs;
        }

        public override string ToString() => $"{TokenText}:{Start}-{End}\n\tDatabase:{Database}\n\tSchema:{Schema}\n\tTableName:{TableName}\n\tAlias:{Alias}\n\tUsedAs:{UsedAs}";

        public override bool Equals(object? obj)
        {
            return Equals(obj as SqlTable);
        }

        public bool Equals(SqlTable? other)
        {
            return other is not null &&
                   TokenText == other.TokenText &&
                   Database == other.Database &&
                   Schema == other.Schema &&
                   TableName == other.TableName;
        }

        public override int GetHashCode()
        {
            return HashCode.Combine(TokenText, Database, Schema, TableName);
        }

        public static bool operator ==(SqlTable? left, SqlTable? right)
        {
            return EqualityComparer<SqlTable>.Default.Equals(left, right);
        }

        public static bool operator !=(SqlTable? left, SqlTable? right)
        {
            return !(left == right);
        }
    }
    public class SqlColumn: ITokenText, IAliasable
    {
        public string TokenText { get; init; }
        public int Start { get; init; }
        public int End { get; init; }
        public string ColumnName { get; init; }
        public bool UsedAs { get; set; }

        public string Alias { get; set; }

        /* This references the fully resolved table post parse */
        public DeclaredSqlTable? Table { get; set; }

        /* This represents either the table OR the named table expression that this column references during parseTime */
        public string OwnerID { get; set; }

        public SqlDataType? SqlType { get; set; }

        public SqlColumn(BaseToken token,string ownerID, string columnName, SqlDataType sqlType = null) {
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
            ColumnName = columnName;
            OwnerID = ownerID;
            SqlType = sqlType;
        }
        


        public override string ToString() => $"{TokenText}:{Start}-{End}\n\tColumnName:{ColumnName}\n\tUsedAs:{UsedAs}\n\tOwnerID:{OwnerID}\n\tTable:{Table?.ToString()}";
        

    }
    public class SqlStatement: ISargable, ITokenText, INonSargableTokens
    {

        public string FileName { get; init; } = "";
        public String DbContext { get; init; } = "";
        public String TokenText { get; init; }
        public int Start { get; init; }
        public int End { get; init; }
        public Boolean UsesDistinct { get; set; }
        public  List<SqlPredicate> Predicates { get; } = new List<SqlPredicate>();
        public List<Subquery> Subqueries { get; } = new List<Subquery>();
        public SqlTable? UpdateTarget { get; }

        private string? _unresolvedUpdateTarget;

        public List<SqlTable> Tables { get; } = new List<SqlTable>();
        public List<SqlColumn> Columns { get; } = new List<SqlColumn>();

        private IAliasable? CurrentAliasable { get; set; }

        private Subquery PreviousSubquery { get; set; }
        private Subquery CurrentSubquery { get; set; }
        private Stack<Subquery> PendingSubqueries { get;}

        private readonly List<ISargable> _nonSargableTokens = new();

        private readonly Dictionary<SqlTable, DeclaredSqlTable> resolvedSqlTables = new();
        public Dictionary<SqlTable,DeclaredSqlTable> ResolvedTables { get { return resolvedSqlTables; } }
       
        private readonly Dictionary<SqlColumn,DeclaredSqlColumn> _resolvedSqlColumns = new();

        public Dictionary<SqlColumn,DeclaredSqlColumn> ResolvedColumns{ get { return _resolvedSqlColumns; } }

        public List<SqlTable> UnresolvedTables { get; } = new List<SqlTable>();
        public List<SqlColumn> UnresolvedColumns { get; } = new List<SqlColumn>();

        public IEnumerable<ISargable> NonSargableTokens 
        {
            get
            {
                if ( _nonSargableTokens.Count > 0) { return _nonSargableTokens; }
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

        public SqlStatement(BaseToken token,string fileName )
        {
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
            UsesDistinct = false;
            PendingSubqueries = new();
            FileName = fileName;

        }
        public SqlStatement(BaseToken token,String db, bool usesDistinct,string fileName)
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
            foreach(var predicate in Predicates)
            {
                if (!predicate.IsSargable()) { return false; }
            }
        
            foreach(var subquery in Subqueries)
            {
                if (!subquery.IsSargable()) { return false; }
            }
            return true;
        }



        public void AddColumn(BaseToken token,string tableName,string columnName )
        {
            var col = new SqlColumn(token,tableName, columnName);

            if(CurrentSubquery is not null) {
                CurrentSubquery.Columns.Add(col);
                CurrentSubquery.UnresolvedColumns.Add(col);
            }
            else {
                UnresolvedColumns.Add(col);
                Columns.Add(col);
            }

            CurrentAliasable = col;
        }

        public void AppendAlias(string alias, bool usedAs = false)
        {
            if(CurrentAliasable == null) { return; }/*Case where Constant has alias so we don't need to mark constants as columns*/
            CurrentAliasable.Alias = alias;
            CurrentAliasable.UsedAs = usedAs;
            CurrentAliasable = null;
        }

        public void AppendPredicate(SqlPredicate pred) {
            Predicates.Add(pred); 
        }

        public void Resolve(Catalog catalog) {
            Dictionary<SqlColumn,List<DeclaredSqlColumn>> potentials = new();
            List<SqlTable> remainingTables = new();
            List<SqlColumn> remainingColumns = new();
            foreach (SqlTable table in UnresolvedTables) {
                DeclaredSqlTable? dst = catalog.Seek(table);
                if (dst is null) {
                    remainingTables.Add(table);
                    continue;
                }
                ResolvedTables.Add(table, dst);
            }
            UnresolvedTables.Clear();
            UnresolvedTables.AddRange(remainingTables);

            foreach (SqlColumn col in UnresolvedColumns) {
                foreach(var kvp in ResolvedTables) {
                    var dst = kvp.Value;
                    var table = kvp.Key;
                    DeclaredSqlColumn? tableCol = dst.Columns.FirstOrDefault((tableCol) => tableCol.ColumnName == col.ColumnName);
                    if (tableCol is null) { continue; }
                    if (col.OwnerID == table.Alias) {
                        ResolvedColumns.Add(col, tableCol);
                        col.Table = tableCol.Table;
                        continue;
                    }
                    if (col.OwnerID == table.TableName && table.Alias == "") {
                        ResolvedColumns.Add(col, tableCol);
                        continue;
                    }
                }
              

           }
            UnresolvedColumns.RemoveAll(col => ResolvedColumns.Keys.Contains(col));
        }
        public void AddTable(BaseToken token, string db, string schema, string tableName, string alias, bool usedAs, Catalog catalog) => AddTable(new SqlTable(token, db, schema, tableName,  alias,  usedAs),catalog);
        public void AddTable( BaseToken token, string schema, string tableName , string alias, bool usedAs,Catalog catalog) => AddTable(new SqlTable(token, schema, tableName, alias, usedAs), catalog);
        public void AddTable(BaseToken token, string tableName, string alias, bool usedAs,Catalog catalog) => AddTable(new SqlTable(token, "dbo", tableName, alias, usedAs), catalog);

        public void AddTable(BaseToken token, DeclaredSqlTable dst,  string alias, bool usedAs ,Catalog catalog) => AddTable(new SqlTable(token, dst, alias, usedAs),catalog);

        public void AddDerivedTable(BaseToken token,string alias,bool usedAs) {
            var tbl = new DerivedSQLTable(token, PreviousSubquery, "", "", alias,alias,usedAs);
            if(PreviousSubquery?.parent != this) { PreviousSubquery?.parent.Tables.Add(tbl); }
            Tables.Add(tbl);
            
        }


        public void AddTable(SqlTable tbl, Catalog catalog) {
            DeclaredSqlTable? dst = catalog.Seek(tbl);
            AppendTable(this, dst, tbl);
            AppendTable(CurrentSubquery, dst, tbl);
        }

        private static void AppendTable(SqlStatement? sqlStatement, DeclaredSqlTable? dst,SqlTable tbl) {
      
            if(sqlStatement is null) { return; }
            sqlStatement.Tables.Add(tbl);
            if (dst != null) { sqlStatement.ResolvedTables.Add(tbl, dst); }
            else { sqlStatement.UnresolvedTables.Add(tbl); }
        }



        public void EnterSubquery(BaseToken token)
        {
            var cur = new Subquery(CurrentSubquery ?? this,token,FileName);
            var target = CurrentSubquery ?? this;
            target.Subqueries.Add(cur);
            PendingSubqueries.Push(cur);     
            CurrentSubquery = cur;
        }

        public void ExitSubquery(Catalog catalog)
        {

            CurrentSubquery?.Resolve(catalog);
            PreviousSubquery = CurrentSubquery;
            if (PendingSubqueries.Count > 0) { PendingSubqueries.Pop();}
            if (PendingSubqueries.Count > 0) {CurrentSubquery = PendingSubqueries.Pop();}
            else { CurrentSubquery = null; };
        }

        

        public void EnterDDL_Object() {

        }


        public override string ToString()
        {
            var tables = "Table List";
            var columns= "Column List";
            var preds = "Predicate List";
            var subs = "Subquery List";
            foreach(var table in Tables) { tables += "\n\t\t" + table.ToString().ToString().Replace("\t", "\t\t\t"); }
            foreach(var column in Columns) { columns += $"\n\t\t{column.ToString().Replace("\t", "\t\t\t")}"; }
            foreach(var pred in Predicates) { preds += $"\n\t\t{pred.ToString().Replace("\t","\t\t\t")}"; }
            foreach(var sub in Subqueries) { subs += $"\n\t\t{sub}"; }
            var fileHeader = String.IsNullOrWhiteSpace(FileName) ? "" : $"___FileName:{FileName}___\n";
            return $"{fileHeader}{TokenText}:{Start}-{End}\n\tContext:{DbContext}\n\t{preds}\n\t{tables}\n\t{columns}\n\t{subs}";
        }
    }

    public class Subquery : SqlStatement
    {
        public SqlStatement parent;


        public Subquery(SqlStatement parentScope,BaseToken token,string fileName):base( token, fileName) {
            parent = parentScope;
        }

        public Subquery(BaseToken token, String db, bool usesDistinct, string fileName)
            :base(token,db,usesDistinct, fileName) {}
    }
}
