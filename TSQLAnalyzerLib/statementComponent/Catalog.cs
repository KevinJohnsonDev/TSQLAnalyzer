namespace TSQLAnalyzerLib.statementComponent {
    public class Catalog
    {

        public List<ResolvedTable> Tables { get; init; }
        public Catalog()
        {
            Tables = new();
        }

        public ResolvedTable? Seek(string db, string schema, string tableName)
        {
            db = db.Replace("[", "").Replace("]", "");
            schema = schema.Replace("[", "").Replace("]", "");
            tableName = tableName.Replace("[", "").Replace("]", "");
            return Tables.FirstOrDefault(
                (table) => table.Database == db &&
                            table.Schema == schema &&
                            table.TableName == tableName);
        }

        public ResolvedTable? Seek(Table table) => Seek(table.Id);

        public ResolvedTable? Seek(Identifier id) {
            var db = id.Database;
            var schema = id.Schema;
            var tableName = id.Name;
            return Tables.FirstOrDefault(
                (table) => table.Database == db &&
                            table.Schema == schema &&
                            table.TableName == tableName);
        }
        public ResolvedTable? SeekIgnoreCase(string db, string schema, string tableName)
        {
            db = db.ToLower();
            schema = schema.ToLower();
            tableName = tableName.ToLower();
            return Tables.FirstOrDefault((table) => table.Database.ToLower() == db &&
            table.Schema.ToLower() == schema &&
            table.TableName.ToLower() == tableName
);
        }

        public void Add(ResolvedTable table)
        {
            Tables.Add(table);
        }

    }
}
