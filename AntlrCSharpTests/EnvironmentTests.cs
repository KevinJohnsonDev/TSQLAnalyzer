using AntlrCSharp.analysis;
using AntlrCSharp.listeners;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AntlrCSharpTests
{
    [TestClass]
    public class EnvironmentTests
    {
        [TestMethod]
        public void DeclarationsAreTracked()
        {
            var input = "DECLARE @X VARCHAR(10)";
            SqlListener listener = TestMethods.Init(input);
            Assert.IsTrue(listener.Environments.Count == 1);
            var env = listener.Environments[0]; 
            Assert.IsTrue(env.Variables.Count == 1);
        }

        [TestMethod]
        public void GoCreatesScopeForVariables()
        {
            var input = "DECLARE @X INT\nGO\nDECLARE @X NUMERIC(15,10)";
            SqlListener listener = TestMethods.Init(input);
            Assert.IsTrue(listener.Environments.Count == 2);
            var env = listener.Environments[0];
            Assert.IsTrue(env.Variables.Count == 1);
            Assert.IsTrue(IsXInt(env.Variables[0]));

            env = listener.Environments[1];
            Assert.IsTrue(env.Variables.Count == 1);
            Assert.IsTrue(IsXNumeric(env.Variables[0],15,10));
        }

        private static bool IsXInt(SqlVariable v) => v.Name == "@X" && v.DataType == "INT";
        private static bool IsXNumeric(SqlVariable v, int? precision, int? scale)
        {
           return v.Name == "@X" && v.DataType == "NUMERIC" && v.Precision == precision && v.Scale == scale;
        }

    }
}
