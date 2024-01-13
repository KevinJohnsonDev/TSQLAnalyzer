using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AntlrCSharpTests {
    [TestClass]
    public class TableCreateTests {

        [TestMethod]
        public void TableColumnDeclarationsTracked() {
            var query = @"CREATE TABLE dbo.B(
                ID INT NOT NULL CONSTRAINT PK_dbo_B_ID PRIMARY KEY,
                ActionBy VARCHAR(25) NOT NULL,
                ActionDate DATETIME NOT NULL
            )";
            var result = TestMethods.Init(query);
            var statement = result.Statements[0];
            Assert.IsTrue(statement.Tables.Count == 1);
            var table = statement.Tables[0];
            Assert.IsTrue(table.Schema == "dbo");
            Assert.IsTrue(table.TableName == "B");
            Assert.IsTrue(table.Columns.Count == 3);

        }
    }
}
