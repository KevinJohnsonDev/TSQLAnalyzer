// See https://aka.ms/new-console-template for more information
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using AntlrCSharp.listeners;


try
{
    
    string input = "SELECT DISTINCT RTRIM(a.b) AS D, a.c FROM msdb.dbo.A AS a WHERE RTRIM(A.id) = '10' AND A.D = 20 OR A.D IS NULL \r\n SELECT a.b, a.c FROM dbo.A AS a WHERE A.id = 10 AND A.D = 20 OR A.D IS NULL ";
    AntlrInputStream inputStream = new AntlrInputStream(input);
    tsqlLexer tsqlLexer = new tsqlLexer(inputStream);
    CommonTokenStream commonTokenStream = new CommonTokenStream(tsqlLexer);
    tsqlParser sqlParser = new tsqlParser(commonTokenStream);
    SqlListener listener = new SqlListener(sqlParser);
    ParseTreeWalker.Default.Walk(listener, sqlParser.tsql_file());
    foreach(var statement in listener.Statements){
        Console.WriteLine(statement);
    }
}
catch (Exception ex)
{
    Console.WriteLine("Error: " + ex);
}