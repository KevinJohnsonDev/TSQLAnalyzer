// See https://aka.ms/new-console-template for more information
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using AntlrCSharp.listeners;


try
{
    
    string input = "SELECT a.b AS D, a.c FROM msdb.dbo.A AS a WHERE A.id = CASE WHEN @x IS NULL THEN  '10' ELSE '20' END";
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