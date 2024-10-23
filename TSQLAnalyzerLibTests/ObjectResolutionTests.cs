using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TSQLAnalyzerLib.listeners;
using TSQLAnalyzerLib.statementComponent;

namespace TSQLAnalyzerLibTests {

    [TestClass]
    public class ObjectResolutionTests {
        [TestMethod]
        public void Simple_Statement_MapsColumnsToCatalog() {
            var input = @"
                USE Sample_DB

                GO

                CREATE TABLE dbo.B(
                    ID INT CONSTRAINT PK_dbo_B_ID PRIMARY KEY,
                    ActionBy VARCHAR(25) NOT NULL,
                    ActionDate DATETIME NULL
                )

                GO

                SELECT B.ID,B.ActionBy,B.ActionDate FROM dbo.B;";

            SqlListener listener = TestMethods.Init(input);
            var table = listener.DbCatalog.Seek("Sample_DB", "dbo", "B");
            var statement = listener.Statements[2];
            Assert.IsTrue(statement.Tables.Where((table) => table.ResolvedTable is not null).Count() == 1); 
            Assert.IsTrue(statement.Columns.Where((col) => col.ResolvedColumn is not null).Count() == 3);

        }
        [TestMethod]
        public void AliasEachOther_MapsColumnsToCatalog() {
            var input = @"
                USE Sample_DB

                GO

                CREATE TABLE dbo.B(
                    ID INT CONSTRAINT PK_dbo_B_ID PRIMARY KEY,
                    ActionBy VARCHAR(25) NOT NULL,
                    ActionDate DATETIME NULL
                )
                CREATE TABLE dbo.C(
                    ID INT CONSTRAINT PK_dbo_C_ID PRIMARY KEY,
                    ActionBy VARCHAR(25) NOT NULL,
                    ActionDate DATETIME NULL
                )

                GO

                SELECT B.ID,C.ActionBy,C.ActionDate 
                FROM dbo.B AS C
                JOIN dbo.C AS B ON B.ID = C.ID;";

            SqlListener listener = TestMethods.Init(input);
            var bTable = listener.DbCatalog.Seek("Sample_DB", "dbo", "B");
            var cTable = listener.DbCatalog.Seek("Sample_DB", "dbo", "C");
            var statement = listener.Statements[3];
            var resolvedTables = statement.Tables.Where((table) => table.ResolvedTable is not null).ToList();
            var resolvedColumns =
                statement.Columns
                .Where(col => col.ResolvedColumn is not null)
                .OrderBy((col) => col.Start).ToArray();

            Assert.IsTrue(resolvedTables.Count == 2);
            Assert.IsTrue(resolvedColumns.Count() == 5);
            Assert.IsTrue(resolvedColumns[0].ResolvedColumn.Table == cTable);
            Assert.IsTrue(resolvedColumns[1].ResolvedColumn.Table == bTable);
            Assert.IsTrue(resolvedColumns[2].ResolvedColumn.Table == bTable);
            Assert.IsTrue(resolvedColumns[3].ResolvedColumn.Table == cTable);
            Assert.IsTrue(resolvedColumns[4].ResolvedColumn.Table == bTable);


        }

        [TestMethod]
        public void Statement_PositionTracked() {
            var input = @"
                SELECT B.ID
                FROM (SELECT B.ID FROM dbo.B) AS C
                JOIN (SELECT C.ID FROM dbo.C ) AS B ON B.ID = C.ID;";
            SqlListener listener = TestMethods.Init(input);
            var statement = listener.Statements[0];
            Assert.IsTrue(statement.Columns[0].Position == new StatementPosition(1,0,0));
            Assert.IsTrue(statement.Columns[1].Position == new StatementPosition(1, 0, 1));
            Assert.IsTrue(statement.Columns[2].Position == new StatementPosition(1, 0, 1));
            Assert.IsTrue(statement.Subqueries[0].Columns[0].Position == new StatementPosition(2, 1, 1));
            Assert.IsTrue(statement.Subqueries[1].Columns[0].Position == new StatementPosition(2, 1, 1));
        }
        [TestMethod]
        public void Subquery_PositionTracked() {
            var input = @"
                SELECT B.ID
                FROM (SELECT B.ID FROM dbo.B) AS C
                JOIN (SELECT C.ID FROM dbo.C ) AS B ON B.ID = C.ID;";
            SqlListener listener = TestMethods.Init(input);
            var statement = listener.Statements[0];
            Assert.IsTrue(statement.Columns.All((col) => col.Position.SubqueryDepth == 0));
            foreach (Subquery sq in statement.Subqueries) {
                Assert.IsTrue(sq.Columns.All((col) => col.Position.SubqueryDepth == 1));
            }
        }
        /*
        [TestMethod]
        public void Subquery_MapsColumnsToCatalog() {
            var input = @"
                USE Sample_DB

                GO

                CREATE TABLE dbo.B(
                    ID INT CONSTRAINT PK_dbo_B_ID PRIMARY KEY,
                    ActionBy VARCHAR(25) NOT NULL,
                    ActionDate DATETIME NULL
                )
                CREATE TABLE dbo.C(
                    ID INT CONSTRAINT PK_dbo_C_ID PRIMARY KEY,
                    ActionBy VARCHAR(25) NOT NULL,
                    ActionDate DATETIME NULL
                )

                GO

                SELECT B.ID,B.ActionBy,B.ActionDate 
                FROM (SELECT B.ID FROM dbo.B) AS C
                JOIN (SELECT C.ID,C.ActionBy,C.ActionDate FROM dbo.C ) AS B ON B.ID = C.ID;";

            SqlListener listener = TestMethods.Init(input);
            var bTable = listener.DbCatalog.Seek("Sample_DB", "dbo", "B");
            var cTable = listener.DbCatalog.Seek("Sample_DB", "dbo", "C");
            var statement = listener.Statements[3];
            var resolvedTables = statement.Tables.Where((table) => table.ResolvedTable is not null).ToList();
            var resolvedColumns = statement.Columns
                .Where((col) => col.ResolvedColumn is not null)
                .OrderBy((col) => col.Start)
                .ToArray();
;
            Assert.IsTrue(resolvedTables.Count == 2);
            Assert.IsTrue(resolvedColumns.Length == 5);
            Assert.IsTrue(resolvedColumns[0].Table == cTable);
            Assert.IsTrue(resolvedColumns[1].Table == bTable);
            Assert.IsTrue(resolvedColumns[2].Table == bTable);
            Assert.IsTrue(resolvedColumns[3].Table == cTable);
            Assert.IsTrue(resolvedColumns[4].Table == bTable);


        }
        */
        
    }
}
