using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using AntlrCSharp.analysis;
using DataType = AntlrCSharp.analysis.DataType;

namespace AntlrCSharpTests {
    [TestClass]
    public class DDLTests {

        [TestMethod]
        public void TableColumnDeclarationsTrackedInCatalog() {
            var query = @"CREATE TABLE dbo.B(
                ID INT NOT NULL CONSTRAINT PK_dbo_B_ID PRIMARY KEY,
                ActionBy VARCHAR(25) NOT NULL,
                ActionDate DATETIME NOT NULL
            )";
            var result = TestMethods.Init(query);
            var catalog = result.DbCatalog;
            Assert.IsTrue(catalog.Tables.Count == 1);
            var table = catalog.Tables[0];
            Assert.IsTrue(table.Schema == "dbo");
            Assert.IsTrue(table.TableName == "B");
            Assert.IsTrue(table.Columns.Count == 3);

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
                CID INT NOT NULL CONSTRAINT PK_dbo_B_ID PRIMARY KEY,
                Sample INT NOT NULL,
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
            Assert.IsTrue(table.Columns[3].SqlType.BaseType == DataType.CHAR);
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

    }
}
