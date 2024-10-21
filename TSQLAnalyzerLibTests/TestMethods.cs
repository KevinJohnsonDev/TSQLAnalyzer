using Antlr4.Runtime.Tree;
using Antlr4.Runtime;
using TSQLAnalyzerLib.listeners;
using TSQLAnalyzerLib.statementComponent;

namespace TSQLAnalyzerLibTests
{
    public static class TestMethods
    {
        public static SqlListener Init(string input, List<ResolvedTable>? CatalogItems = null)
        {
            AntlrInputStream inputStream = new(input);
            TSqlLexer tsqlLexer = new(inputStream);
            CommonTokenStream commonTokenStream = new(tsqlLexer);
            TSqlParser sqlParser = new(commonTokenStream);
            TokenLoggingSqlListener listener = new(sqlParser);
            if(CatalogItems != null) {
                foreach( var catalogItem in CatalogItems ) {
                    listener.DbCatalog.Add(catalogItem);
                }
            }
            ParseTreeWalker.Default.Walk(listener, sqlParser.tsql_file());

            return listener;
        }


    }
}
