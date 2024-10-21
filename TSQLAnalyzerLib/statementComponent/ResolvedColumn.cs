namespace TSQLAnalyzerLib.statementComponent {
    public class ResolvedColumn : ITokenText
    {
        public string TokenText { get; init; }
        public int Start { get; init; }
        public int End { get; init; }
        public string ColumnName { get; init; }

        public bool IsNullable { get; init; }

        public ResolvedTable Table { get; set; }

        public DataType SqlType { get; init; }
        public ResolvedColumn(BaseToken token, string columnName, DataType sqlType, bool isNullable)
        {
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
            ColumnName = columnName;
            SqlType = sqlType;
            IsNullable = isNullable;
        }

        public static ResolvedColumn FromDatabase(string columnName, DataType sqlType, bool isNullable)
        {
            return new ResolvedColumn(BaseToken.OnlineToken, columnName, sqlType, isNullable);
        }
    }
}
