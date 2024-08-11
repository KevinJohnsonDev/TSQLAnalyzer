using TSQLParserLib.listeners;
using TSQLParserLib.analysis;

namespace TSQLParserLibTests {
    [TestClass]
    public class SubqueryDepthTests
    {

        private String _sampleQuery =  @"
            SELECT 1 AS ID 
            FROM (
                SELECT 1 AS ID2 
                FROM (
                    SELECT 1 AS ID3
                    FROM (
                        SELECT 1 AS ID4
                    ) AS L3
                ) AS L2
            ) AS L1 ";
        [TestMethod]
        public void DepthReporterMarksQueriesDeeperThanMaxAsError()
        {

            SqlListener listener = TestMethods.Init(_sampleQuery);
            SubqueryDepthReporter r = new(listener.Statements,2);
            Assert.IsTrue(r.Errors.Count==1);
            Assert.IsTrue(r.Errors[0].TokenText == listener.Statements[0].TokenText);

        }
        [TestMethod]
        public void DepthReporterIgnoresLessThanEqualToMax()
        {
            SqlListener listener = TestMethods.Init(_sampleQuery);
            SubqueryDepthReporter r = new(listener.Statements, 3);
            Assert.IsTrue(r.Errors.Count == 0);
        }
    }




}
