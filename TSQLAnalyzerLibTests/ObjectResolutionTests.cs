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
                SELECT B.ID,B.ActionBy,B.ActionDate FROM dbo.B;";

            SqlListener listener = TestMethods.Init(input, MockTables());
            var table = listener.DbCatalog.Seek("Sample_DB", "dbo", "B");
            var statement = listener.Statements[1];
            Assert.IsTrue(statement.Tables.Where((table) => table.ResolvedTable is not null).Count() == 1);
            Assert.IsTrue(statement.Columns.All((x) => x is SimpleColumn));
            Assert.IsTrue(statement.Columns.Where((col) => col is SimpleColumn sc && sc.ResolvedColumn is not null).Count() == 3);

        }
        [TestMethod]
        public void AliasEachOther_MapsColumnsToCatalog() {
            var input = @"
                USE Sample_DB
                GO
                SELECT B.ID,C.ActionBy,C.ActionDate 
                FROM dbo.B AS C
                JOIN dbo.C AS B ON B.ID = C.ID;";

            SqlListener listener = TestMethods.Init(input, MockTables());
            var bTable = listener.DbCatalog.Seek("Sample_DB", "dbo", "B");
            var cTable = listener.DbCatalog.Seek("Sample_DB", "dbo", "C");
            var statement = listener.Statements[1];
            var resolvedTables = statement.Tables.Where((table) => table.ResolvedTable is not null).ToList();
            var resolvedColumns =
                statement.Columns
                .Where(col => col is SimpleColumn sc && sc.ResolvedColumn is not null)
                .OrderBy((col) => col.Start).ToArray();

            Assert.IsTrue(resolvedTables.Count == 2);
            Assert.IsTrue(resolvedColumns.Count() == 5);
            Assert.IsTrue(resolvedColumns[0] is SimpleColumn sc  && sc?.ResolvedColumn.Table == cTable);
            Assert.IsTrue(resolvedColumns[1] is SimpleColumn sc1  && sc1?.ResolvedColumn.Table == bTable);
            Assert.IsTrue(resolvedColumns[2] is SimpleColumn sc2  && sc2?.ResolvedColumn.Table == bTable);
            Assert.IsTrue(resolvedColumns[3] is SimpleColumn sc3  && sc3?.ResolvedColumn.Table == cTable);
            Assert.IsTrue(resolvedColumns[4] is SimpleColumn sc4  && sc4?.ResolvedColumn.Table == bTable);


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
        
        [TestMethod]       
        public void Subquery_MapsColumnsToCatalog() {
            var input = @"
                USE Sample_DB

                GO

                SELECT B.ID,B.ActionBy,B.ActionDate 
                FROM (SELECT B.ID FROM dbo.B) AS C
                JOIN (SELECT C.ID,C.ActionBy,C.ActionDate FROM dbo.C ) AS B ON B.ID = C.ID;";

            SqlListener listener = TestMethods.Init(input,MockTables());
            var bTable = listener.DbCatalog.Seek("Sample_DB", "dbo", "B");
            var cTable = listener.DbCatalog.Seek("Sample_DB", "dbo", "C");
            var statement = listener.Statements[1];
            var resolvedTables = statement.Tables.Where((table) =>  table.Columns.Count > 0).ToList();
            var resolvedColumns = statement.Columns
                .Where((col) => col is SimpleColumn sc && sc.ResolvedColumn is not null)
                .OrderBy((col) => col.Start)
                .ToArray();
;
            Assert.IsTrue(resolvedTables.Count == 2);
            Assert.IsTrue(resolvedColumns.Length == 5);
            Assert.IsTrue(resolvedColumns[0] is SimpleColumn sc &&  sc.Table == cTable);
            Assert.IsTrue(resolvedColumns[1] is SimpleColumn sc1 && sc1.Table == cTable);
            Assert.IsTrue(resolvedColumns[2] is SimpleColumn sc2 && sc2.Table == cTable);
            Assert.IsTrue(resolvedColumns[3] is SimpleColumn sc3 && sc3.Table == cTable);
            Assert.IsTrue(resolvedColumns[4] is SimpleColumn sc4 && sc4.Table == bTable);


        }
        [TestMethod]
        public void Subquery_MapsMultipleSubqueriesDeepColumnsToCatalog() {
            var input = @"
                USE Sample_DB

                GO

                SELECT C.ID,C.ActionBy,C.ActionDate,B.ID
                FROM (
                    SELECT C.ID,C.ActionBy,C.ActionDate
                    FROM (
                        SELECT B.ID,B.ActionBy,B.ActionDate
                        FROM dbo.B
                    ) AS C
                 ) AS C
                JOIN (
                    SELECT B.ID,B.ActionBy,B.ActionDate
                    FROM (
                       SELECT C.ID,C.ActionBy,C.ActionDate
                       FROM dbo.C 
                    ) AS B 
                ) AS B ON B.ID = C.ID;";

            SqlListener listener = TestMethods.Init(input, MockTables());
            var bTable = listener.DbCatalog.Seek("Sample_DB", "dbo", "B");
            var cTable = listener.DbCatalog.Seek("Sample_DB", "dbo", "C");
            var statement = listener.Statements[1];
            var resolvedTables = statement.Tables.Where((table) => table.Columns.Count > 0).ToList();
            var resolvedColumns = statement.Columns
                .Where((col) => col is SimpleColumn sc && sc.ResolvedColumn is not null)
                .OrderBy((col) => col.Start)
                .ToArray();
            ;
            Assert.IsTrue(resolvedTables.Count == 2);

            Assert.IsTrue(resolvedColumns.Length == 6);
            for(int i = 0; i < 3; i += 1) {
                Assert.IsTrue(resolvedColumns[i] is SimpleColumn sc1 && sc1.Table == bTable);
            }
            Assert.IsTrue(resolvedColumns[3] is SimpleColumn sc2 && sc2.Table == cTable);
            Assert.IsTrue(resolvedColumns[4] is SimpleColumn sc3 && sc3.Table == cTable);
            Assert.IsTrue(resolvedColumns[5] is SimpleColumn sc4 && sc4.Table == bTable);
            Assert.IsNotNull(bTable);
            Assert.IsNotNull(cTable);
            CheckSub(statement, 0, bTable);
            CheckSub(statement, 1, cTable);

        }



        
        [TestMethod]
        public void CTE_MapsToCatalog() {
            var input = @"
                USE Sample_DB
                GO
                CREATE TABLE dbo.T(ID INT );
                GO
                WITH CTE(ID,Val) AS (SELECT T.ID, 'Hello' FROM dbo.T)
                SELECT CTE.ID,CTE.Val FROM CTE
            ";
            SqlListener listener = TestMethods.Init(input, MockTables());
            var bTable = listener.DbCatalog.Seek("Sample_DB", "dbo", "B");
            var statement = listener.Statements[2];
            var resolvedCtes = statement.CTEs.Where((table) => table.Columns.Count > 0).ToList();
            var resolvedColumns = statement.Columns.OfType<SimpleColumn>()
                .Where((col) => col.ResolvedColumn is not null)
                .OrderBy((col) => col.Start)
                .ToArray();
            Assert.IsTrue(resolvedCtes.Count == 1);
            Assert.IsTrue(resolvedColumns.Length > 0);
            Assert.IsTrue(resolvedColumns[0]?.ResolvedColumn.Table.TableName == "T");

        }



        [TestMethod]
        public void NestedCTE_MapsToCatalog() {
            var input = @"
                USE Sample_DB
                GO
                CREATE TABLE dbo.T(ID INT );
                GO
                WITH CTE(ID,Val) AS (SELECT T.ID, 'Hello' FROM dbo.T),
                     CTE2(ID,Val) AS ( SELECT CTE.ID,CTE.Val FROM CTE)
                SELECT CTE2.ID,CTE2.Val FROM CTE2
            ";
            SqlListener listener = TestMethods.Init(input, MockTables());
            var bTable = listener.DbCatalog.Seek("Sample_DB", "dbo", "B");
            var statement = listener.Statements[2];
            var resolvedCtes = statement.CTEs.Where((table) => table.Columns.Count > 0).ToList();
            var resolvedColumns = statement.Columns.OfType<SimpleColumn>()
                .Where((col) => col.ResolvedColumn is not null)
                .OrderBy((col) => col.Start)
                .ToArray();
            Assert.IsTrue(resolvedCtes.Count == 2);
            Assert.IsTrue(resolvedColumns.Length > 0);
            Assert.IsTrue(resolvedColumns[0]?.ResolvedColumn.Table.TableName == "T");

        }

        [TestMethod]
        public void CTE_MapsToCatalogInSubqury() {
            var input = @"
                USE Sample_DB
                GO
                CREATE TABLE dbo.T(ID INT );
                GO
                WITH CTE(ID,Val) AS (SELECT T.ID, 'Hello' FROM dbo.T)
                SELECT C.ID,C.Val FROM (SELECT CTE.ID,CTE.Val FROM CTE) AS C
            ";
            SqlListener listener = TestMethods.Init(input, MockTables());
            var bTable = listener.DbCatalog.Seek("Sample_DB", "dbo", "B");
            var statement = listener.Statements[2];
            var resolvedCtes = statement.CTEs.Where((table) => table.Columns.Count > 0).ToList();
            var resolvedColumns = statement.Columns.OfType<SimpleColumn>()
                .Where((col) => col.ResolvedColumn is not null)
                .OrderBy((col) => col.Start)
                .ToArray();
            Assert.IsTrue(resolvedCtes.Count == 1);
            Assert.IsTrue(resolvedColumns.Length > 0);
            Assert.IsTrue(resolvedColumns[0]?.ResolvedColumn?.Table.TableName == "T");

        }

        static void CheckSub(Statement statement, int idx, ResolvedTable expected) {

        var resolvedInnerColumns = statement.Subqueries[idx].Columns
            .OfType<SimpleColumn>()
            .Where((col) => col.ResolvedColumn is not null)
            .OrderBy((col) => col.Start)
            .ToArray();

        Assert.IsTrue(resolvedInnerColumns.Length == 3);
        Assert.IsTrue(resolvedInnerColumns.All(col => col.Table == expected));

        var deepInnerColumns = statement.Subqueries[idx].Subqueries[0].Columns
            .OfType<SimpleColumn>()
            .Where((col) => col.ResolvedColumn is not null)
            .OrderBy((col) => col.Start)
            .ToArray();

        Assert.IsTrue(deepInnerColumns.Length == 3);
        Assert.IsTrue(deepInnerColumns.All(col => col.Table == expected));
        }

        static List<ResolvedTable> MockTables() {
            var bTable = new ResolvedTable(BaseToken.OnlineToken, "Sample_DB", "dbo", "B");
            List<ResolvedColumn> bColumns = new(){
                new ResolvedColumn(BaseToken.OnlineToken,"ID",new DataType(BaseToken.OnlineToken,"INT",null,null),false),
                new ResolvedColumn(BaseToken.OnlineToken,"ActionBy",new DataType(BaseToken.OnlineToken,"VARCHAR",25,null),false),
                new ResolvedColumn(BaseToken.OnlineToken,"ActionDate",new DataType(BaseToken.OnlineToken,"DATETIME",null),true)

             };
            bTable.Add(bColumns);

            var cTable = new ResolvedTable(BaseToken.OnlineToken, "Sample_DB", "dbo", "C");
            List<ResolvedColumn> cColumns = new(){
                new ResolvedColumn(BaseToken.OnlineToken,"ID",new DataType(BaseToken.OnlineToken,"INT",null,null),false),
                new ResolvedColumn(BaseToken.OnlineToken,"ActionBy",new DataType(BaseToken.OnlineToken,"VARCHAR",25,null),false),
                new ResolvedColumn(BaseToken.OnlineToken,"ActionDate",new DataType(BaseToken.OnlineToken,"DATETIME",null),true)

             };
            cTable.Add(cColumns);
            return new List<ResolvedTable>() { bTable, cTable };


        }

    }
}
