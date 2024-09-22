using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TSQLParserLib.analysis;
using TSQLParserLib.listeners;

namespace TSQLParserLibTests {
    [TestClass]
    public class ResolutionTests {

        [TestMethod]
        public void FullyQualifiedNameResolvesTableDuringParse() {
            BaseToken dummy = BaseToken.OnlineToken;
            DeclaredSqlTable dst = new(dummy, "TestDB", "dbo", "example");
            var input = "SELECT a.b AS D FROM TestDB.dbo.example";
            SqlListener listener = TestMethods.Init(input,new List<DeclaredSqlTable>() { dst });
            Assert.IsTrue(listener.Statements[0].Tables[0].ResolvedTable == dst);
        }
        [TestMethod]
        public void FullyQualifiedDoesNotResolveWhenNotInCatalog() {
            BaseToken dummy = BaseToken.OnlineToken;
            DeclaredSqlTable dst = new(dummy, "TestDB", "dbo", "example");
            var input = "SELECT a.b AS D FROM TestDB.dbo.example2";
            SqlListener listener = TestMethods.Init(input, new List<DeclaredSqlTable>() { dst });
            Assert.IsTrue(listener.Statements[0].Tables[0].ResolvedTable is null);
        }
        [TestMethod]
        public void FullyQualifiedResolvesFromTSQLDeclarations() {
            var input = @"
            USE TestDB
            GO
            CREATE TABLE dbo.example( ID INT PRIMARY KEY)
            GO
            SELECT a.b AS D FROM TestDB.dbo.example
            ";
            SqlListener listener = TestMethods.Init(input);
            Assert.IsTrue(listener.Statements[2].Tables[0].ResolvedTable == listener.DbCatalog.Tables[0]);
        }
    }
}
