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
