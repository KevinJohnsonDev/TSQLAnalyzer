namespace TSQLAnalyzerLib.statementComponent {
    public record Index
    {
        public IList<ResolvedColumn> Columns { get; init; }
        public IList<ResolvedColumn> IncludedColumns { get; init; }

        public string Name { get; init; }
        public string? WhereClause { get; init; }

        public bool IsUnique { get; init; }
        public bool IsClustered { get; init; }
        public bool IsPrimaryKey { get; init; }

        public Index(string name, IList<ResolvedColumn> columns, string? whereClause, IList<ResolvedColumn> includedColumns, bool isUnique, bool isClustered, bool isPrimaryKey)
        {
            Name = name;
            Columns = columns;
            WhereClause = whereClause;
            IncludedColumns = includedColumns;
            IsUnique = isUnique;
            IsClustered = isClustered;
            IsPrimaryKey = isPrimaryKey;
        }

        public Index(string name, string? whereClause, bool isUnique, bool isClustered, bool isPrimaryKey)
        {
            Name = name;
            Columns = new List<ResolvedColumn>();
            WhereClause = whereClause;
            IncludedColumns = new List<ResolvedColumn>();
            IsUnique = isUnique;
            IsClustered = isClustered;
            IsPrimaryKey = isPrimaryKey;
        }

    }
}
