using TSQLAnalyzerLib.listeners;
using TSQLAnalyzerLib.analysis;

namespace TSQLAnalyzerLibTests {
    [TestClass]
    public class ReporterTests
    {
        [TestMethod]
        public void ReportsSargabilityWarnings()
        {
            var input = "SELECT a.b AS D, a.c FROM msdb.dbo.A AS a WHERE A.id IN (SELECT RTRIM(B.ID) AS ID FROM msdb.dbo.B AS B) ";
            SqlListener listener = TestMethods.Init(input);
            SargabilityReporter r = new(listener.Statements);
            Assert.IsTrue(r.Errors.Count == 1);
            Assert.IsTrue(r.Errors[0].TokenText == "A.id IN (SELECT RTRIM(B.ID) AS ID FROM msdb.dbo.B AS B)");
        }

    }
}

