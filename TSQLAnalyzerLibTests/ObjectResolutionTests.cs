using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TSQLAnalyzerLib.listeners;

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
            Assert.IsTrue(statement.ResolvedTables.Count == 1); 
            Assert.IsTrue(statement.ResolvedColumns.Count == 3);

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
            var resolvedTables = statement.ResolvedTables;
            var resolvedColumns = statement.ResolvedColumns;
            var entries = resolvedColumns.ToArray().OrderBy((kvp) => kvp.Key.Start).ToArray();
Assert.IsTrue(resolvedTables.Count == 2);
            Assert.IsTrue(resolvedColumns.Count == 5);
            Assert.IsTrue(entries[0].Value.Table == cTable);
            Assert.IsTrue(entries[1].Value.Table == bTable);
            Assert.IsTrue(entries[2].Value.Table == bTable);
            Assert.IsTrue(entries[3].Value.Table == cTable);
            Assert.IsTrue(entries[4].Value.Table == bTable);


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
            var resolvedTables = statement.ResolvedTables;
            var resolvedColumns = statement.ResolvedColumns;
            var entries = resolvedColumns.ToArray().OrderBy((kvp) => kvp.Key.Start).ToArray();
            Assert.IsTrue(resolvedTables.Count == 2);
            Assert.IsTrue(resolvedColumns.Count == 5);
            Assert.IsTrue(entries[0].Value.Table == cTable);
            Assert.IsTrue(entries[1].Value.Table == bTable);
            Assert.IsTrue(entries[2].Value.Table == bTable);
            Assert.IsTrue(entries[3].Value.Table == cTable);
            Assert.IsTrue(entries[4].Value.Table == bTable);


        }
        */
    }
}
