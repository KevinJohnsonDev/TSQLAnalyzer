using Antlr4.Runtime.Tree;
using Antlr4.Runtime;
using AntlrCSharp.listeners;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AntlrCSharpTests
{
    public static class TestMethods
    {
        public static SqlListener Init(string input)
        {
            AntlrInputStream inputStream = new(input);
            tsqlLexer tsqlLexer = new(inputStream);
            CommonTokenStream commonTokenStream = new(tsqlLexer);
            tsqlParser sqlParser = new(commonTokenStream);
            TokenLoggingSqlListener listener = new(sqlParser);
            ParseTreeWalker.Default.Walk(listener, sqlParser.tsql_file());
            return listener;
        }
    }
}
