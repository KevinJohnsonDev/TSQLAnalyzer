using TSQLParserLib.listeners;
namespace TSQLParserLibTests;

[TestClass]
public class SargabilityTests
{
    [TestMethod]
    public void FunctionOnColumnInWhereIsNonSargable()
    {
        string input = "SELECT a.b AS D, a.c FROM msdb.dbo.A AS a WHERE RTRIM(A.id) = '10' ";
        SqlListener listener = TestMethods.Init(input);
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
        SqlListener listener = TestMethods.Init(input);
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
        SqlListener listener = TestMethods.Init(input);
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
        SqlListener listener = TestMethods.Init(input);
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
        SqlListener listener = TestMethods.Init(input);
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
        SqlListener listener = TestMethods.Init(input);
        foreach (var statement in listener.Statements)
        {
            Console.WriteLine(statement);
            Assert.IsFalse(statement.IsSargable());
        }
    }

    [TestMethod]
    public void FunctionOnJoinColumnNotSargable() {
        string input = "SELECT A.ID FROM msdb.dbo.A AS A JOIN msdb.dbo.B AS B ON ROUND(A.ID) = B.ID ";
        SqlListener listener = TestMethods.Init(input);
        foreach (var statement in listener.Statements) {
            Console.WriteLine(statement);
            Assert.IsFalse(statement.IsSargable());
        }
    }

    [TestMethod]
    public void FunctionVariableInJoinSargable() {
        string input = """
            DECLARE @X FLOAT = 10.2;
            SELECT A.ID FROM msdb.dbo.A AS A JOIN msdb.dbo.B AS B ON A.ID = B.ID AND ROUND(@X) = 10;
            """;
        SqlListener listener = TestMethods.Init(input);
        foreach (var statement in listener.Statements) {
            Console.WriteLine(statement);
            Assert.IsTrue(statement.IsSargable());
        }
    }

    [TestMethod]
    public void MixedSargableAndNonSargableConditionsInNestedJoin() {
        string input = @"
        SELECT A.ID 
        FROM msdb.dbo.A AS A 
        JOIN (
            SELECT B.ID 
            FROM msdb.dbo.B AS B 
            JOIN msdb.dbo.C AS C 
            ON B.ID = C.ID AND ROUND(C.SomeColumn) = 10
        ) AS SubQuery 
        ON A.ID = SubQuery.ID 
        WHERE A.AnotherColumn = 100";

        SqlListener listener = TestMethods.Init(input);
        bool containsNonSargableCondition = false;

        foreach (var statement in listener.Statements) {
            Console.WriteLine(statement);
            // Check if any part of the statement is non-sargable
            if (!statement.IsSargable()) {
                containsNonSargableCondition = true;
            }
        }

        // The test passes if there's a mix: non-sargable in subquery, sargable in main query
        Assert.IsTrue(containsNonSargableCondition);
    }

    [TestMethod]
    public void ComplexFunctionsAndCalculationsInJoinAndWhereClause() {
        string input = @"
        SELECT A.ID 
        FROM msdb.dbo.A AS A 
        JOIN msdb.dbo.B AS B 
        ON A.ID = B.ID 
        AND A.ValueColumn + 1 = ABS(B.ValueColumn - 10)
        WHERE LEN(A.StringColumn) = 5 AND LOWER(B.AnotherStringColumn) = 'example'";

        SqlListener listener = TestMethods.Init(input);
        bool containsNonSargableCondition = false;

        foreach (var statement in listener.Statements) {
            Console.WriteLine(statement);
            if (!statement.IsSargable()) {
                containsNonSargableCondition = true;
            }
        }
        Assert.IsTrue(containsNonSargableCondition);
    }

    [TestMethod]
    public void MixedSargabilityInNestedQueryWithSubqueryAndJoins() {
        string input = @"
        SELECT A.ID 
        FROM msdb.dbo.A AS A 
        JOIN msdb.dbo.B AS B ON A.ID = B.ID 
        LEFT JOIN msdb.dbo.C AS C ON A.ID = C.ID 
        WHERE EXISTS (
            SELECT 1 
            FROM msdb.dbo.D AS D 
            WHERE D.ID = A.ID 
            AND SUBSTRING(D.Name, 1, 3) = 'ABC'
        )
        AND A.ValueColumn = POWER(B.ValueColumn, 2) 
        AND C.CalculatedColumn + 10 = B.AnotherColumn";

        SqlListener listener = TestMethods.Init(input);
        bool containsNonSargableCondition = false;

        foreach (var statement in listener.Statements) {
            Console.WriteLine(statement);
            // Check if any part of the statement is non-sargable
            if (!statement.IsSargable()) {
                containsNonSargableCondition = true;
            }
        }

        // The test passes if there are non-sargable conditions within the nested query and the main query
        Assert.IsTrue(containsNonSargableCondition);
    }
}