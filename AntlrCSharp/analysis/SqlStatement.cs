using System;
using System.Collections.Generic;
using System.Data.Common;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static Antlr4.Runtime.Atn.SemanticContext;
using static System.Net.Mime.MediaTypeNames;

namespace AntlrCSharp.analysis
{


    public interface ITokenText
    {
        String TokenText { get; init; }
    }
    public interface ISargable : ITokenText
    {
        Boolean IsSargable();

    }

    public interface INonSargableTokens
    {
        IEnumerable<ISargable> NonSargableTokens { get; }
    }

    public interface IAliasable : ITokenText
    {
        String Alias { get; set; }
        bool UsedAs { get; set; }
    }
    

    public class SqlOperand : ISargable,ITokenText {
        public string TokenText { get; init; }
        public bool UsedFunction { get; init; } 
        public bool IsConstant { get; init; }
        
        public bool InCaseStatement { get; init; }
        public bool InWhere { get; init; }
        public bool InSubquery => SubQueryDepth > 0;


        public int SubQueryDepth { get; init; }

        public SqlOperand(string tokenText, bool usedFunction, bool isConstant, bool inWhere,bool inCaseStatement,int subqueryDepth) {
            IsConstant = isConstant;
            UsedFunction = usedFunction;
            TokenText = tokenText;
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
            return $"{TokenText} \n\tInWhere:{InWhere}\n\tInCaseStatement:{InCaseStatement}\n\tUsedFunction:{UsedFunction} \n\t\tUsedFunction:{UsedFunction}";
        }
    }
    public class SqlPredicate : ISargable, ITokenText
    {
        public string TokenText { get; init; }
        public ISargable Left { get; set; }

        public bool InWhere { get; init; }

        public string Op { get; set; }

        public ISargable Right { get; set; }

        public SqlPredicate(String tokenText, ISargable left, ISargable right, String op, bool inWhere  ) {
            TokenText = tokenText; 
            Left = left;
            Right = right;
            Left = left;
            Op = op;
            InWhere = inWhere;
        }
        public bool IsSargable()
        {
            return Left.IsSargable() && Right.IsSargable();
        }

        public override string ToString()
        {
            return $"{TokenText} \n\t\tLeft:{Left} \n\t\tOp:{Op} \n\t\tRight:{Right}";
        }
    }
    public class SqlTable : ITokenText, IAliasable, IEquatable<SqlTable?>
    {
        public string Alias { get; set; } = "";
        public string TokenText { get; init; }

        public bool UsedAs { get; set; }
        public string Database { get; init; }
        public string Schema { get; init; }
        public string TableName { get; init; }

        public SqlTable(string database,string schema, string tableName, string tokenText) {
            Database = database;
            Schema = schema;
            TableName = tableName;
            TokenText = tokenText; 
        }

        public SqlTable( string schema, string tableName, string tokenText)
        {
            Database = "";
            Schema = schema;
            TableName = tableName;
            TokenText = tokenText;
        }

        public override string ToString() => $" {TokenText}\n\tDatabase:{Database}\n\tSchema:{Schema}\n\tTableName:{TableName}\n\tAlias:{Alias}\n\tUsedAs:{UsedAs}";

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
        public string ColumnName { get; init; }
        public bool UsedAs { get; set; }

        public string Alias { get; set; }

        /* This references the fully resolved table post parse */
        public SqlTable? Table { get; set; }

        /* This represents either the table OR the named table expression that this column references during parseTime */
        public string OwnerID { get; init; }

        public SqlColumn(string ownerID, string columnName,string tokenText) { 
            TokenText = tokenText;
            ColumnName = columnName;
            OwnerID = ownerID;
        }

        public override string ToString() => $"{TokenText} - ColumnName:{ColumnName} - UsedAs:{UsedAs} - OwnerID:{OwnerID} - Table:{Table?.ToString()}";
        

    }
    public class SqlStatement: ISargable, ITokenText, INonSargableTokens
    {
        public String DbContext { get; init; } = "";
        public String TokenText { get; init; }
        public Boolean UsesDistinct { get; set; }
        public  List<SqlPredicate> Predicates { get; } = new List<SqlPredicate>();
        public List<SqlStatement> Subqueries { get; } = new List<SqlStatement>();

        public List<SqlTable> Tables { get; } = new List<SqlTable>();
        public List<SqlColumn> Columns { get; } = new List<SqlColumn>();

        private IAliasable CurrentTarget { get; set; }

        private readonly List<ISargable> _nonSargableTokens = new();
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

        public SqlStatement(String tokenText)
        {
            TokenText = tokenText;
            UsesDistinct = false;
        }
        public SqlStatement(String db, String tokenText, bool usesDistinct)
        {
            DbContext = db;
            TokenText = tokenText;
            UsesDistinct = usesDistinct;
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



        public void AddColumn(string tableName,string columnName,string tokenText )
        {
            var col = new SqlColumn(tableName, columnName, tokenText);
            Columns.Add(col);
            CurrentTarget = col;
        }
        public void AppendAlias(string alias, bool usedAs = false)
        {
            CurrentTarget.Alias = alias;
            CurrentTarget.UsedAs = usedAs;
        }

        public void AppendPredicate(SqlPredicate pred) { Predicates.Add(pred); }

        public void AddTable(string db, string schema, string tableName, string tokenText) => AddTable(new SqlTable(db, schema, tableName, tokenText));
        public void AddTable(string schema,string tableName,string tokenText) => AddTable(new SqlTable(schema, tableName, tokenText));
        public void AddTable( string tableName, string tokenText) => AddTable(new SqlTable("dbo", tableName, tokenText));

        private void AddTable(SqlTable tbl)
        {
            CurrentTarget = tbl;
            Tables.Add(tbl);
        }

        public override string ToString()
        {
            var tables = "Table List\n";
            var columns= "Column List\n";
            var preds = "Predicate List\n";
            foreach(var table in Tables) { tables += "\t" + table.ToString() + "\n"; }
            foreach(var column in Columns) { columns += $"\t{column}\n"; }
            foreach(var pred in Predicates) { preds += $"\t{pred}\n"; }
            return $"{TokenText}\n{DbContext}\n{preds}\n{tables}\n{columns}";
        }
    }
}
