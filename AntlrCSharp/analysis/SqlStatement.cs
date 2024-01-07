using Antlr4.Runtime;
using System;
using System.Collections;
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
        int Start { get; init; }
        int End { get; init; }
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

    public class BaseToken: ITokenText
    {
        public String TokenText { get; init; }
        public int Start { get; init; }
        public int End { get; init; }

        public BaseToken(string tokenText, int start, int end)
        {
            TokenText = tokenText;
            Start = start;
            End = end;
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

        public SqlPredicate(BaseToken token, ISargable left, ISargable right, String op, bool inWhere  ) {
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
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
            return $"{TokenText}:{Start}-{End}\n\tLeft:{Left}\n\tOp:{Op}\n\tRight:{Right}";
        }
    }
    public class SqlTable : ITokenText, IAliasable, IEquatable<SqlTable?>
    {
        public string Alias { get; set; } = "";
        public string TokenText { get; init; }
        public int Start { get; init; }
        public int End { get; init; }
        public bool UsedAs { get; set; }
        public string Database { get; init; }
        public string Schema { get; init; }
        public string TableName { get; init; }

        public SqlTable(BaseToken token, string database,string schema, string tableName) {
            Database = database;
            Schema = schema;
            TableName = tableName;
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
        }

        public SqlTable(BaseToken token, string schema, string tableName)
        {
            Database = "";
            Schema = schema;
            TableName = tableName;
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
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
        public SqlTable? Table { get; set; }

        /* This represents either the table OR the named table expression that this column references during parseTime */
        public string OwnerID { get; init; }

        public SqlColumn(BaseToken token,string ownerID, string columnName) {
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
            ColumnName = columnName;
            OwnerID = ownerID;
        }

        public override string ToString() => $"{TokenText}:{Start}-{End}\n\tColumnName:{ColumnName}\n\tUsedAs:{UsedAs}\n\tOwnerID:{OwnerID}\n\tTable:{Table?.ToString()}";
        

    }
    public class SqlStatement: ISargable, ITokenText, INonSargableTokens
    {
        public String DbContext { get; init; } = "";
        public String TokenText { get; init; }
        public int Start { get; init; }
        public int End { get; init; }
        public Boolean UsesDistinct { get; set; }
        public  List<SqlPredicate> Predicates { get; } = new List<SqlPredicate>();
        public List<Subquery> Subqueries { get; } = new List<Subquery>();

        public List<SqlTable> Tables { get; } = new List<SqlTable>();
        public List<SqlColumn> Columns { get; } = new List<SqlColumn>();

        private IAliasable? CurrentAliasable { get; set; }
        private Subquery CurrentSubquery { get; set; }
        private Stack<Subquery> PendingSubqueries { get;}

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

        public SqlStatement(BaseToken token )
        {
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
            UsesDistinct = false;
            PendingSubqueries = new();
        }
        public SqlStatement(BaseToken token,String db, bool usesDistinct)
        {
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
            DbContext = db;
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



        public void AddColumn(BaseToken token,string tableName,string columnName )
        {
            var col = new SqlColumn(token,tableName, columnName);
            Columns.Add(col);
            CurrentAliasable = col;
        }
        public void AppendAlias(string alias, bool usedAs = false)
        {
            if(CurrentAliasable == null) { return; }/*Case where Constant has alias so we don't need to mark constants as columns*/
            CurrentAliasable.Alias = alias;
            CurrentAliasable.UsedAs = usedAs;
            CurrentAliasable = null;
        }

        public void AppendPredicate(SqlPredicate pred) { Predicates.Add(pred); }

        public void AddTable(BaseToken token, string db, string schema, string tableName) => AddTable(new SqlTable(token,db, schema, tableName));
        public void AddTable(BaseToken token, string schema,string tableName) => AddTable(new SqlTable(token,schema, tableName));
        public void AddTable(BaseToken token, string tableName) => AddTable(new SqlTable(token,"dbo", tableName));

        public void EnterSubquery(BaseToken token)
        {
            var cur = new Subquery(token);
            var target = CurrentSubquery ?? this;
            target.Subqueries.Add(cur);
            PendingSubqueries.Push(cur);     
            CurrentSubquery = cur;
        }

        public void ExitSubquery()
        {
            CurrentAliasable = PendingSubqueries.Pop();
            CurrentSubquery = (Subquery)CurrentAliasable;
        }
        private void AddTable(SqlTable tbl)
        {
            CurrentAliasable = tbl;
            Tables.Add(tbl);
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
            return $"{TokenText}:{Start}-{End}\n\tContext:{DbContext}\n\t{preds}\n\t{tables}\n\t{columns}\n\t{subs}";
        }
    }

    public class Subquery : SqlStatement, IAliasable
    {
        public String Alias { get; set; } = "";
        public bool UsedAs { get; set; }

        public Subquery(BaseToken token):base( token) { }

        public Subquery(BaseToken token, String db, bool usesDistinct):base(token,db,usesDistinct){}
    }
}
