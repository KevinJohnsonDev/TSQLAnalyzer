namespace TSQLAnalyzerLib.statementComponent {
    public class Column : ITokenText, IAliasable
    {
        public string TokenText { get; init; }
        public int Start { get; init; }
        public int End { get; init; }
        public string ColumnName { get; init; }
        public bool UsedAs { get; set; }

        public string Alias { get; set; }

        /* This references the fully resolved table post parse */
        public ResolvedTable? Table { get; set; }

        /* This represents either the table OR the named table expression that this column references during parseTime */
        public string OwnerID { get; set; }

        public DataType? SqlType { get; set; }

        public Column(BaseToken token, string ownerID, string columnName, DataType sqlType = null)
        {
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
            ColumnName = columnName;
            OwnerID = ownerID;
            SqlType = sqlType;
        }



        public override string ToString() => $"{TokenText}:{Start}-{End}\n\tColumnName:{ColumnName}\n\tUsedAs:{UsedAs}\n\tOwnerID:{OwnerID}\n\tTable:{Table?.ToString()}";


    }
}
