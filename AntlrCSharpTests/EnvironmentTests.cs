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
            Assert.IsTrue(env.Variables[0].Name == "@X");
            Assert.IsTrue(IsXNumeric(env.Variables[0].DeclaredDataType,15,10));
        }

        private static bool IsXInt(SqlVariable v) => v.Name == "@X" && v.DeclaredDataType.BaseType == DataType.INT;
        private static bool IsXNumeric(SqlDataType v, int? precision, int? scale)
        {
           return v.BaseType == DataType.NUMERIC && v.Precision == precision && v.Scale == scale;
        }

    }
}
