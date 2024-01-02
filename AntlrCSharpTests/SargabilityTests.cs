using Antlr4.Runtime.Tree;
using Antlr4.Runtime;
using AntlrCSharp.listeners;
namespace AntlrCSharpTests;

[TestClass]
public class SargabilityTests
{
    [TestMethod]
    public void FunctionOnColumnInWhereIsNonSargable()
    {
        string input = "SELECT a.b AS D, a.c FROM msdb.dbo.A AS a WHERE RTRIM(A.id) = '10' ";
        SqlListener listener = Init(input);
        foreach (var statement in listener.Statements)
        {
            Console.WriteLine(statement);
            Assert.IsFalse(statement.IsSargable());
        }
    }

    [TestMethod]
    public void FunctionOnColumnInSelectIsSargable()
    {
        string input = "SELECT RTRIM(a.b) AS D, a.c FROM msdb.dbo.A AS a WHERE A.id = '10' ";
        SqlListener listener = Init(input);
        foreach (var statement in listener.Statements)
        {
            Console.WriteLine(statement);
            Assert.IsTrue(statement.IsSargable());
        }
    }

    [TestMethod]
    public void FunctionOnConstantInWhereIsSargable()
    {
        string input = "SELECT a.b AS D, a.c FROM msdb.dbo.A AS a WHERE A.id = RTRIM('10') ";
        SqlListener listener = Init(input);
        foreach (var statement in listener.Statements)
        {
            Console.WriteLine(statement);
            Assert.IsTrue(statement.IsSargable());
        }
    }


    [TestMethod]
    public void PlainStatementIsSargable()
    {
        string input = "SELECT a.b AS D, a.c FROM msdb.dbo.A AS a WHERE A.id = '10' ";
        SqlListener listener = Init(input);
        foreach (var statement in listener.Statements)
        {
            Console.WriteLine(statement);
            Assert.IsTrue(statement.IsSargable());
        }
    }

    [TestMethod]
    public void CaseInWhereIsNotSargable()
    {
        string input = "SELECT a.b AS D, a.c FROM msdb.dbo.A AS a WHERE A.id = CASE WHEN @x IS NULL THEN  '10' ELSE '20' END ";
        SqlListener listener = Init(input);
        foreach (var statement in listener.Statements)
        {
            Console.WriteLine(statement);
            Assert.IsFalse(statement.IsSargable());
        }
    }
    [TestMethod]
    public void FunctionInSubqueryNotSargable()
    {
        string input = "SELECT a.b AS D, a.c FROM msdb.dbo.A AS a WHERE A.id IN (SELECT RTRIM(B.ID) AS ID FROM msdb.dbo.B AS B) ";
        SqlListener listener = Init(input);
        foreach (var statement in listener.Statements)
        {
            Console.WriteLine(statement);
            Assert.IsFalse(statement.IsSargable());
        }
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