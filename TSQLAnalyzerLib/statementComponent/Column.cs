using System.Linq;

namespace TSQLAnalyzerLib.statementComponent {


    public abstract class Column : ITokenText, IAliasable {

        public StatementPosition Position { get; init; }
        public BaseToken Token { get; init; }
        public string TokenText => Token.TokenText;
        public int Start => Token.Start;
        public int End => Token.End;
        public bool UsedAs { get; set; }

        public string Alias { get; set; }

        public Column(BaseToken token, StatementPosition postition) {
            Token = token;
            Position = postition;
        }

    }

    public class ConstantColumn : Column {

        public string Value { get; init; }
        public ConstantColumn(BaseToken token, StatementPosition postition,string value):base(token, postition) {
            Value = value;
        }
    }
    public class SimpleColumn : Column {

        private ResolvedColumn? resolvedColumn = null;
        public ResolvedColumn? ResolvedColumn {
            get { return resolvedColumn; }
            set {
                if (resolvedColumn is not null) { throw new InvalidOperationException("Cannot Reassign Resolved Table"); }
                resolvedColumn = value ?? throw new ArgumentNullException(nameof(value));
                Table = resolvedColumn.Table;
            }
        }

        public string ColumnName { get; init; }

        /* This references the fully resolved table post parse */
        public ResolvedTable? Table { get; set; }

        /* This represents either the table OR the named table expression that this column references during parseTime */
        public string OwnerID { get; set; }

        public SimpleColumn(BaseToken token, string ownerID, string columnName,StatementPosition postition):base(token, postition)
        {
            Token = token;
            ColumnName = columnName;
            OwnerID = ownerID;
            Position = postition;
        }

        public override string ToString() => $"{TokenText}:{Start}-{End}\n\tColumnName:{ColumnName}\n\tUsedAs:{UsedAs}\n\tOwnerID:{OwnerID}\n\tTable:{Table?.ToString()}";

    }

    public class DerivedColumn : Column, ITokenText {

        public List<Column> ProjectedColumns { get; init; } = new();
        public Subquery Subquery { get; init; }
        public DerivedColumn(BaseToken token, StatementPosition postition, Subquery subquery) : base(token, postition) {
            Subquery = subquery;
            /*The plus 1 is for the column being in the select position of another select position*/
            var cols = subquery.Columns.Where(c => c.Position.SelectDepth > c.Position.WhereDepth+1);
            ProjectedColumns.AddRange(cols);
        }
    }

    public class CompoundColumn: Column, ITokenText {
        public List<Column> Columns { get; init; } = new();
        public CompoundColumn(BaseToken token, StatementPosition postition,List<Column> columns) : base(token, postition) {
            Columns = columns;
        }
    }

    public class ColumnBuilder : Column, ITokenText {

        public List<Column> Columns { get; init; } = new();
        public ColumnBuilder(BaseToken token, StatementPosition postition) : base(token, postition) {

        }

        public Column? Resolve() {
            if (Columns.Count == 0) { return null; }
            if (Columns.Count == 1) { return Columns[0]; }
            return new CompoundColumn(Token, Position, Columns);

        }
    }
    public class ResolvedColumn : Column,ITokenText {

        public string ColumnName { get; init; }

        public bool IsNullable { get; init; }

        public ResolvedTable Table { get; set; }

        public DataType SqlType { get; init; }
        public ResolvedColumn(BaseToken token, string columnName, DataType sqlType, bool isNullable,ResolvedTable table):base(token,new StatementPosition()) {
            ColumnName = columnName;
            SqlType = sqlType;
            IsNullable = isNullable;
            Table = table;
        }

        public static ResolvedColumn FromDatabase(string columnName, DataType sqlType, bool isNullable,ResolvedTable table) {
            return new ResolvedColumn(BaseToken.OnlineToken, columnName, sqlType, isNullable,table);
        }

        public SimpleColumn AsColumn() {
            return new SimpleColumn(BaseToken.OnlineToken, Table?.TableName, ColumnName, new StatementPosition()) {
                ResolvedColumn = this
            };
        }
    }
}
