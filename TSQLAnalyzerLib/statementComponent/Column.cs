namespace TSQLAnalyzerLib.statementComponent {
    public class Column : ITokenText, IAliasable {

        public StatementPosition Position{get;init;}

        private ResolvedColumn? resolvedColumn = null;
        public ResolvedColumn? ResolvedColumn {
            get { return resolvedColumn; }
            set {
                if (resolvedColumn is not null) { throw new InvalidOperationException("Cannot Reassign Resolved Table"); }
                resolvedColumn = value ?? throw new ArgumentNullException(nameof(value));
                Table = resolvedColumn.Table;
            }
        }

        public BaseToken Token { get; init; }
        public string TokenText => Token.TokenText;
        public int Start => Token.Start;
        public int End => Token.End;
        public string ColumnName { get; init; }
        public bool UsedAs { get; set; }

        public string Alias { get; set; } 

        /* This references the fully resolved table post parse */
        public ResolvedTable? Table { get; set; }

        /* This represents either the table OR the named table expression that this column references during parseTime */
        public string OwnerID { get; set; }

        public Column(BaseToken token, string ownerID, string columnName,StatementPosition postition)
        {
            Token = token;
            ColumnName = columnName;
            OwnerID = ownerID;
            Position = postition;
        }



        public override string ToString() => $"{TokenText}:{Start}-{End}\n\tColumnName:{ColumnName}\n\tUsedAs:{UsedAs}\n\tOwnerID:{OwnerID}\n\tTable:{Table?.ToString()}";


    }
}
