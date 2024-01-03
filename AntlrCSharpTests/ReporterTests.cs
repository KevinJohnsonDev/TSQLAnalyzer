using Antlr4.Runtime.Tree;
using Antlr4.Runtime;
using AntlrCSharp.listeners;
using AntlrCSharp.analysis;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AntlrCSharpTests
{
    [TestClass]
    public class ReporterTests
    {
        [TestMethod]
        public void ReportsSargabilityWarnings()
        {
            var input = "SELECT a.b AS D, a.c FROM msdb.dbo.A AS a WHERE A.id IN (SELECT RTRIM(B.ID) AS ID FROM msdb.dbo.B AS B) ";
            SqlListener listener = Init(input);
            SargabilityReporter r = new(listener.Statements);
            Assert.IsTrue(r.Errors.Count == 1);
            Assert.IsTrue(r.Errors[0].TokenText == "A.idIN(SELECTRTRIM(B.ID)ASIDFROMmsdb.dbo.BASB)");
        }
        private static SqlListener Init(string input)
        {
            AntlrInputStream inputStream = new(input);
            tsqlLexer tsqlLexer = new(inputStream);
            CommonTokenStream commonTokenStream = new(tsqlLexer);
            tsqlParser sqlParser = new(commonTokenStream);
            SqlListener listener = new(sqlParser);
            ParseTreeWalker.Default.Walk(listener, sqlParser.tsql_file());
            return listener;
        }
    }
}

