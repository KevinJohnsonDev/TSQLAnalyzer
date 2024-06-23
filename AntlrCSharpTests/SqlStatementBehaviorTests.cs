using TSQLParserLib.analysis;
using TSQLParserLib.listeners;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TSQLParserLibTests
{
    [TestClass]
    public class SqlStatementBehaviorTests
    {
        [TestMethod]
        public void SubqueriesColumnsAreMapped()
        {
            var input = "SELECT a.b AS D, a.c FROM msdb.dbo.A AS a WHERE A.id IN (SELECT RTRIM(B.ID) AS BID FROM msdb.dbo.B AS B) ";
            SqlListener listener = TestMethods.Init(input);
            Assert.IsTrue(listener.Statements[0].Subqueries[0].Columns.Count == 1);
            var column = listener.Statements[0].Subqueries[0].Columns[0];
            var owner = column.OwnerID;
            Assert.IsTrue(column.ColumnName == "ID");
            Assert.IsTrue(column.TokenText == "B.ID");
            Assert.IsTrue(column.Alias == "BID");
            Assert.IsTrue(owner =="B");
        }

    }
}
