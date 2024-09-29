using TSQLAnalyzerLib.analysis;
using TSQLAnalyzerLib.listeners;

namespace TSQLAnalyzerLibTests {
    [TestClass]
    public class VariableDeclarationReporterTests {

        [TestMethod]
        public void ReportsMisMatchVariableDeclarations() {
            var input = "DECLARE @X INT\nGO\nDECLARE @X NUMERIC(15,10)";
            SqlListener listener = TestMethods.Init(input);
            VariableDeclarationReporter r = new(listener.Environments);
            Assert.IsTrue(r.Errors.Count == 1);

            Assert.IsTrue(r.Errors[0].TokenText == "DECLARE @X NUMERIC(15,10)");
        }
        [TestMethod]
        public void IgnoresSameNameTypeDeclarations() {
            var input = "DECLARE @X NUMERIC(15,10)\nGO\nDECLARE @X NUMERIC(15,10)";
            SqlListener listener = TestMethods.Init(input);
            VariableDeclarationReporter r = new(listener.Environments);
            Assert.IsTrue(r.Errors.Count == 0);
        }
        [TestMethod]
        public void IsNotWhitespaceSensitive() {
            var input = "DECLARE @X NUMERIC( 15,  10 )\nGO\nDECLARE @X NUMERIC( 15 , 10 )";
            SqlListener listener = TestMethods.Init(input);
            VariableDeclarationReporter r = new(listener.Environments);
            Assert.IsTrue(r.Errors.Count == 0);
        }

        [TestMethod]
        public void IsScalePrecisionSensitive() {
            var input = "DECLARE @X NUMERIC( 15,9 )\nGO\nDECLARE @X NUMERIC(15,10)";
            SqlListener listener = TestMethods.Init(input);
            VariableDeclarationReporter r = new(listener.Environments);
            Assert.IsTrue(r.Errors.Count == 1);
            Assert.IsTrue(r.Errors[0].TokenText == "DECLARE @X NUMERIC(15,10)");

        }

    }
}
