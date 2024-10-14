using Microsoft.Data.SqlClient;
using TSQLAnalyzerLib.analysis;
using System.Collections.Generic;
using System.Linq;
using TSQLAnalyzerLib.listeners;
using static System.Formats.Asn1.AsnWriter;
using System.ComponentModel.DataAnnotations;
using System;

namespace TSQLAnalyzerLib.online
{
    public class CatalogFetcher
    {
        private readonly string _connectionString;
        private readonly Dictionary<string, List<DeclaredSqlTable>> _databaseSchemaTables = new();


        public List<string> DatabaseNames { get; } = new List<string>();

        public CatalogFetcher(string connectionString)
        {
            _connectionString = connectionString;
        }
        public void InjectCatalog<T>(T sl) where T : SqlListener {
            var catalog = sl.DbCatalog;
            foreach(KeyValuePair<string, List<DeclaredSqlTable>> kvp in _databaseSchemaTables){
                foreach(var table in kvp.Value) {
                    catalog.Add(table);
                }
            }
        }
        public void PopulateCatalog()
        {
            try
            {
                using SqlConnection con = new(_connectionString);
                con.Open();

                string queryStatement = "SELECT name FROM sys.databases WHERE name <> 'master' AND  HAS_DBACCESS(name) = 1";
                using SqlCommand cmd = new(queryStatement, con);
                using SqlDataReader sdr = cmd.ExecuteReader();

                while (sdr.Read())
                {
                    string name = sdr.GetString(sdr.GetOrdinal("name"));
                    DatabaseNames.Add(name);
                    _databaseSchemaTables.Add(name, new List<DeclaredSqlTable>());
                }

                sdr.Close();

                foreach (string name in DatabaseNames)
                {
                    PopulateSchemasAndTables(con, name);
                }
            }
            catch (SqlException ex)
            {
                Console.WriteLine($"SQL Error: {ex.Message}");
            }
            catch (ArgumentException ex) {
                Console.WriteLine($"Connection String Invalid: {ex.Message}");
            }
            catch (Exception ex)
            {
                Console.WriteLine($"Error: {ex.Message}");
            }
        }

        private void PopulateSchemasAndTables(SqlConnection con, string databaseName)
        {
            try
            {
                con.ChangeDatabase(databaseName);

                string query = @"
                    SELECT 
                        S.Name AS SchemaName,
                        T.Name AS TableName
                    FROM 
                        Sys.Schemas AS S
                    JOIN 
                        Sys.Tables AS T ON S.Schema_ID = T.Schema_ID
                    WHERE 
                        S.Name COLLATE Latin1_General_100_CI_AI NOT IN 
                        (
                            SELECT M.Name COLLATE Latin1_General_100_CI_AI
                            FROM Master.sys.schemas AS M 
                            WHERE M.Name COLLATE Latin1_General_100_CI_AI <> 'dbo'
                        )
                    ORDER BY 
                        S.Name, T.Name;";

                using SqlCommand cmd = new(query, con);
                using SqlDataReader sdr = cmd.ExecuteReader();

                var tables = new List<DeclaredSqlTable>();

                while (sdr.Read())
                {
                    string schemaName = sdr.GetString(sdr.GetOrdinal("SchemaName"));
                    string tableName = sdr.GetString(sdr.GetOrdinal("TableName"));

                    DeclaredSqlTable table = DeclaredSqlTable.FromDatabase(databaseName, schemaName, tableName);
                    tables.Add(table);
                    _databaseSchemaTables[databaseName].Add(table);
                }

                sdr.Close();

                PopulateTableColumns(con, tables);
                PopulateTableIndexes(con, tables);
            }
            catch (SqlException ex)
            {
                Console.WriteLine($"SQL Error in {databaseName}: {ex.Message}");
            }
            catch (Exception ex)
            {
                Console.WriteLine($"Error in {databaseName}: {ex.Message}");
            }
        }

        private void PopulateTableColumns(SqlConnection con, List<DeclaredSqlTable> tables)
        {
            if (tables.Count == 0) return;

            string query = @"
                SELECT 
                    C.TABLE_SCHEMA,
                    C.TABLE_NAME,
                    C.COLUMN_NAME,
                    C.ORDINAL_POSITION,
                    C.IS_NULLABLE,
                    C.DATA_TYPE,
                    C.CHARACTER_MAXIMUM_LENGTH,
                    C.NUMERIC_PRECISION,
                    C.NUMERIC_SCALE,
                    C.DATETIME_PRECISION,
                    C.COLUMN_DEFAULT
                FROM INFORMATION_SCHEMA.COLUMNS AS C
                JOIN 
                    sys.tables AS T 
                    ON C.TABLE_NAME = T.name 
                    AND C.TABLE_SCHEMA = SCHEMA_NAME(T.schema_id)
                ORDER BY 
                    C.TABLE_SCHEMA ASC, C.TABLE_NAME ASC;";

            using SqlCommand cmd = new(query, con);
            using SqlDataReader sdr = cmd.ExecuteReader();

            // Create a lookup dictionary for quick table matching
            var tableMap = tables.ToDictionary(t => (t.Schema, t.TableName));

            while (sdr.Read())
            {
                string schema = sdr.GetString(sdr.GetOrdinal("TABLE_SCHEMA"));
                string tableName = sdr.GetString(sdr.GetOrdinal("TABLE_NAME"));
                string columnName = sdr.GetString(sdr.GetOrdinal("COLUMN_NAME"));

                string dataType = sdr.GetString(sdr.GetOrdinal("DATA_TYPE")).ToUpper();
                int? precision = null;
                int? scale = null;
                bool nullable = sdr.GetString(sdr.GetOrdinal("IS_NULLABLE")).ToUpper() == "YES";

                switch (dataType)
                {
                    case "DATETIME":
                    case "DATETIME2":
                        precision = sdr.IsDBNull(sdr.GetOrdinal("DATETIME_PRECISION")) 
                            ? null 
                            : sdr.GetInt16(sdr.GetOrdinal("DATETIME_PRECISION"));
                        break;

                    case "CHAR":
                    case "VARCHAR":
                    case "NVARCHAR":
                    case "NCHAR":
                        precision = sdr.IsDBNull(sdr.GetOrdinal("CHARACTER_MAXIMUM_LENGTH")) 
                            ? null 
                            : sdr.GetInt32(sdr.GetOrdinal("CHARACTER_MAXIMUM_LENGTH"));
                        break;

                    case "DECIMAL":
                    case "NUMERIC":
                        precision = sdr.IsDBNull(sdr.GetOrdinal("NUMERIC_PRECISION")) 
                            ? null 
                            : sdr.GetByte(sdr.GetOrdinal("NUMERIC_PRECISION"));
                        scale = sdr.IsDBNull(sdr.GetOrdinal("NUMERIC_SCALE")) 
                            ? null 
                            : sdr.GetInt32(sdr.GetOrdinal("NUMERIC_SCALE"));
                        break;
                }

                if (tableMap.TryGetValue((schema, tableName), out var table))
                {
                    SqlDataType sdt = SqlDataType.FromDatabase(dataType, precision, scale);
                    DeclaredSqlColumn col = DeclaredSqlColumn.FromDatabase(columnName, sdt, nullable);
                    table.Add(col);
                }
                else
                {
                    Console.WriteLine($"Table {schema}.{tableName} not found in current list.");
                }
            }

            sdr.Close();
        }

        public static void PopulateTableIndexes(SqlConnection con, List<DeclaredSqlTable> tables) {
            if (tables.Count == 0) return;

            // Create a lookup dictionary for quick table matching
            var tableMap = tables.ToDictionary(t => (t.Schema, t.TableName));

            string query = @"
            SELECT	S.Name AS SchemaName,
		            T.Name AS TableName,
		            I.Name AS IndexName,
		            I.Type AS IndexType,
		            I.Is_Unique AS IsUnique,
		            I.is_unique_constraint AS IsUniqueConstraint,
		            I.is_primary_key AS IsPrimaryKey,
		            I.filter_definition AS WhereClause,
                    IC.is_included_column AS IsIncludedColumn,
		            IC.index_column_id AS IndexOrdinal,
		            IC.column_id AS ColumnOrdinal
            FROM Sys.Indexes AS I
            JOIN Sys.index_columns AS IC ON I.Object_Id = IC.object_id AND I.Index_Id = IC.index_id 
            JOIN sys.tables AS T  ON T.object_Id = I.Object_Id 
            JOIN sys.columns AS C ON C.Object_Id = T.Object_Id AND IC.column_id = C.column_id
            JOIN sys.schemas AS S ON T.schema_id = S.schema_id
            ORDER BY S.Name ASC, T.Name ASC, I.Name ASC,IC.index_column_id";

            using SqlCommand cmd = new(query, con);
            using SqlDataReader sdr = cmd.ExecuteReader();
            SqlIndex? idx = null;
            while (sdr.Read()) {
                string schema = sdr.GetString(sdr.GetOrdinal("SchemaName"));
                string tableName = sdr.GetString(sdr.GetOrdinal("TableName"));
                string indexName = sdr.GetString(sdr.GetOrdinal("IndexName"));
                Byte indexType = sdr.GetByte(sdr.GetOrdinal("IndexType"));
                bool isUnique = sdr.GetBoolean(sdr.GetOrdinal("IsUnique"));
                bool IsUniqueConstraint = sdr.GetBoolean(sdr.GetOrdinal("IsUniqueConstraint"));
                bool isPrimaryKey = sdr.GetBoolean(sdr.GetOrdinal("IsPrimaryKey"));
                bool isIncludedColumn = sdr.GetBoolean(sdr.GetOrdinal("IsIncludedColumn"));
                string predicate = sdr.GetString(sdr.GetOrdinal("WhereClause"));
                int indexOrdinal = sdr.GetInt32(sdr.GetOrdinal("IndexOrdinal"));
                int columnOrdinal = sdr.GetInt32(sdr.GetOrdinal("ColumnOrdinal"));

                if (tableMap.TryGetValue((schema, tableName), out DeclaredSqlTable? table)) {
                    if(columnOrdinal > table.Columns.Count) {
                        throw new InvalidOperationException($"Table {schema}.{tableName} does not have a {columnOrdinal} column, only has {table.Columns.Count} columns");
                    }

                    DeclaredSqlColumn column = table.Columns[columnOrdinal - 1];

                    if (indexOrdinal == 1) {
                        Console.WriteLine($"Index Processed {idx?.ToString() ?? "starting..."}");
                        var columns = new List<DeclaredSqlColumn>() { column };
                        var uniquish = isUnique || IsUniqueConstraint;
                        var includedColumns = new List<DeclaredSqlColumn>();
                        var isClustered = indexType == 1;
                        idx = new SqlIndex(indexName, columns, predicate, includedColumns, uniquish, isClustered, isPrimaryKey);
                        table.Add(idx);
                    }
                    else {
                        idx.Columns.Add(column);
                        if (isIncludedColumn) { idx.IncludedColumns.Add(column); }
                    }
                }
                else {
                    Console.WriteLine($"Table {schema}.{tableName} not found in current list when populating indexes.");
                }

            }

        }
    }
}
