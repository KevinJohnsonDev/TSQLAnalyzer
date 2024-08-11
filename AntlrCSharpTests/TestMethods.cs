using Antlr4.Runtime.Tree;
using Antlr4.Runtime;
using TSQLParserLib.listeners;

namespace TSQLParserLibTests {
    public static class TestMethods
    {
        public static SqlListener Init(string input)
        {
            AntlrInputStream inputStream = new(input);
            TSqlLexer tsqlLexer = new(inputStream);
            CommonTokenStream commonTokenStream = new(tsqlLexer);
            TSqlParser sqlParser = new(commonTokenStream);
            TokenLoggingSqlListener listener = new(sqlParser);
            ParseTreeWalker.Default.Walk(listener, sqlParser.tsql_file());
            return listener;
        }
    }
}
