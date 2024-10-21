using SqlDataTypes = TSQLAnalyzerLib.statementComponent.SqlDataTypes;

namespace TSQLAnalyzerLibTests
{
    [TestClass]
    public class DDLTests {

        [TestMethod]
        public void TableColumnDeclarationsTrackedInCatalog() {
            var query = @"CREATE TABLE dbo.B(
                ID INT CONSTRAINT PK_dbo_B_ID PRIMARY KEY,
                ActionBy VARCHAR(25) NOT NULL,
                ActionDate DATETIME NULL
            )";
            var result = TestMethods.Init(query);
            var catalog = result.DbCatalog;
            Assert.IsTrue(catalog.Tables.Count == 1);
            var table = catalog.Tables[0];
            Assert.IsTrue(table.Schema == "dbo");
            Assert.IsTrue(table.TableName == "B");
            Assert.IsTrue(table.Columns.Count == 3);
            /*Primary Key Columns are implicitly not nullable*/
            Assert.IsTrue(table.Columns[0].IsNullable == false);
            Assert.IsTrue(table.Columns[1].IsNullable == false);
            Assert.IsTrue(table.Columns[2].IsNullable == true);


        }



        [TestMethod]
        public void TablesPersistAcrossBatches() {
            var query = @"
            CREATE TABLE dbo.B(
                ID INT NOT NULL CONSTRAINT PK_dbo_B_ID PRIMARY KEY,
                ActionBy VARCHAR(25) NOT NULL,
                ActionDate DATETIME NOT NULL
            )
            GO
             CREATE TABLE extra.C(
                CID INT NOT NULL CONSTRAINT PK_dbo_C_ID PRIMARY KEY,
                StudentID DATETIME NOT NULL
            )               ";
            var result = TestMethods.Init(query);
            var catalog = result.DbCatalog;
            Assert.IsTrue(catalog.Tables.Count == 2 );
            var table = catalog.Tables[0];
            Assert.IsTrue(table.Schema == "dbo");
            Assert.IsTrue(table.TableName == "B");
            Assert.IsTrue(table.Columns.Count == 3);
            table = catalog.Tables[1];
            Assert.IsTrue(table.Schema == "extra");
            Assert.IsTrue(table.TableName == "C");
            Assert.IsTrue(table.Columns.Count == 2);


        }
        [TestMethod]
        public void AddingAColumnUpdatesCatalog() {
            var query = @"
            CREATE TABLE dbo.B(
                ID INT NOT NULL CONSTRAINT PK_dbo_B_ID PRIMARY KEY,
                ActionBy VARCHAR(25) NOT NULL,
                ActionDate DATETIME NOT NULL
            );
            GO
            ALTER TABLE dbo.B ADD NewColumn CHAR(1);";
            var result = TestMethods.Init(query);
            var catalog = result.DbCatalog;
            var table = catalog.Tables[0];
            Assert.IsTrue(table.Columns.Count == 4);
            Assert.IsTrue(table.Columns[3].ColumnName == "NewColumn");
            Assert.IsTrue(table.Columns[3].SqlType.BaseType == SqlDataTypes.CHAR);
            Assert.IsTrue(table.Columns[3].SqlType.Precision == 1);

        }
        [TestMethod]
        public void DroppingAColumnUpdatesCatalog() {
            var query = @"
            CREATE TABLE dbo.B(
                ID INT NOT NULL CONSTRAINT PK_dbo_B_ID PRIMARY KEY,
                ActionBy VARCHAR(25) NOT NULL,
                ActionDate DATETIME NOT NULL
            );
            GO
            ALTER TABLE dbo.B DROP COLUMN ActionDate";
            var result = TestMethods.Init(query);
            var catalog = result.DbCatalog;
            var table = catalog.Tables[0];
            Assert.IsTrue(table.Columns.Count == 2);
            Assert.IsTrue(!(table.Columns.Where((x)=> x.ColumnName == "ActionDate").Any()));


        }
        [TestMethod]

        public void ComputedColumnDataTypesAreMappedIfTheyUseACast() {
            var query = @"
            CREATE TABLE dbo.A(
                ID INT NOT NULL,
                Computed AS CAST(ID AS VARCHAR(50))
            );";
            var result = TestMethods.Init(query);
            var catalog = result.DbCatalog;
            var table = catalog.Tables[0];
            var dt = table.Columns[1].SqlType;
            Assert.IsTrue(dt.BaseType == SqlDataTypes.VARCHAR);
            Assert.IsTrue(dt.Precision == 50);
        }

        [TestMethod]
        public void ComputedColumnCanResolveNestedCasts() {
            var query = @"
            CREATE TABLE dbo.A(
                ID INT NOT NULL,
                Computed AS CAST(CAST(CAST(ID AS VARCHAR(50)) AS INT) AS CHAR(22))
            );";
            var result = TestMethods.Init(query);
            var catalog = result.DbCatalog;
            var table = catalog.Tables[0];
            var dt = table.Columns[1].SqlType;
            Assert.IsTrue(dt.BaseType == SqlDataTypes.CHAR);
            Assert.IsTrue(dt.Precision == 22);
        }
        [TestMethod]
        public void ComputedColumnCanResolveNestedCastsWithIsNullOutside() {
            var query = @"
            CREATE TABLE dbo.A(
                ID INT NOT NULL,
                Computed AS ISNULL(CAST(CAST(CAST(ID AS VARCHAR(50)) AS INT) AS CHAR(22)),'Hello')
            );";
            var result = TestMethods.Init(query);
            var catalog = result.DbCatalog;
            var table = catalog.Tables[0];
            var dt = table.Columns[1].SqlType;
            Assert.IsTrue(dt.BaseType == SqlDataTypes.CHAR);
            Assert.IsTrue(dt.Precision == 22);
        }

        [TestMethod]
        public void ComputedColumnCanResolveNestedCastsWithIsNullInside() {
            var query = @"
            CREATE TABLE dbo.A(
                ID INT NOT NULL,
                Computed AS CAST(ISNULL(CAST(CAST(ID AS VARCHAR(50)) AS INT),'-1') AS CHAR(22))
            );";
            var result = TestMethods.Init(query);
            var catalog = result.DbCatalog;
            var table = catalog.Tables[0];
            var dt = table.Columns[1].SqlType;
            Assert.IsTrue(dt.BaseType == SqlDataTypes.CHAR);
            Assert.IsTrue(dt.Precision == 22);
        }
    }
}
