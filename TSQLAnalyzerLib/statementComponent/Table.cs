namespace TSQLAnalyzerLib.statementComponent {
    public class Table : ITokenText, IAliasable, IEquatable<Table?>
    {
        public string Alias { get; set; } = "";
        public string TokenText { get; init; }
        public int Start { get; init; }
        public string FQN { get; init; }
        public int End { get; init; }
        public bool UsedAs { get; set; }
        public string Database { get; init; }
        public string Schema { get; init; }
        public string TableName { get; init; }

        public ResolvedTable? ResolvedTable { get; init; }

        public Table(BaseToken token, ResolvedTable dst, string alias, bool usedAs)
        {
            Database = dst.Database;
            Schema = dst.Schema;
            TableName = dst.TableName;
            Start = token.Start;
            End = token.End;
            TokenText = token.TokenText;
            var prefix = string.IsNullOrWhiteSpace(Database) ? "" : $"{Database}.";
            FQN = $"{prefix}{Schema}.{TableName}";
            ResolvedTable = dst;
            Alias = alias;
            UsedAs = usedAs;
        }

        public Table(BaseToken token, string database, string schema, string tableName, string alias, bool usedAs)
        {
            Database = database;
            Schema = schema;
            TableName = tableName;
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
            var prefix = string.IsNullOrWhiteSpace(Database) ? "" : $"{Database}.";
            FQN = $"{prefix}{Schema}.{TableName}";
            Alias = alias;
            UsedAs = usedAs;
        }

        public Table(BaseToken token, string schema, string tableName, string alias, bool usedAs)
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
            return Equals(obj as Table);
        }

        public bool Equals(Table? other)
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

        public static bool operator ==(Table? left, Table? right)
        {
            return EqualityComparer<Table>.Default.Equals(left, right);
        }

        public static bool operator !=(Table? left, Table? right)
        {
            return !(left == right);
        }
    }

    public class DerivedTable : Table {

        public DerivedTable(BaseToken token, Subquery sub, string database, string schema, string tableName, string alias, bool usedAS) : base(token, database, schema, tableName, alias, usedAS) {
            Alias = tableName;
            UsedAs = usedAS;
        }
    }
}
