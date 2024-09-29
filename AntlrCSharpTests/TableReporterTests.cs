using TSQLParserLib.analysis;
using TSQLParserLib.listeners;

namespace TSQLParserLibTests {
    [TestClass]
    public class TableReporterTests {

        private string _sampleStatements = @"
        SELECT A.ID FROM dbo.A JOIN dbo.B ON A.ID = B.AID;
        SELECT B.AID FROM dbo.B;
        SELECT B.ID FROM dbo.B INNER JOIN dbo.C ON B.ID = C.BID;
        ";



        [TestMethod]
        public void TableUsageReporterCountsEachDistinctTable() {

            SqlListener listener = TestMethods.Init(_sampleStatements);
            TableUsageReporter tur = new(listener.Statements);
            Assert.IsTrue(tur.Tables.Count == 3);
        }

        [TestMethod]

        public void TableUsageReporterIdentifiesUnResolvedTables() {
            string statements = @"
                CREATE TABLE dbo.A(ID INT PRIMARY KEY);
                SELECT A.ID FROM dbo.A JOIN dbo.B ON A.ID = B.ID";

            SqlListener listener = TestMethods.Init(statements);
            TableUsageReporter tur = new(listener.Statements);
            Assert.IsFalse(tur.Unresolved.ContainsKey("dbo.A"));
            Assert.IsTrue(tur.Unresolved.ContainsKey("dbo.B"));
            Assert.IsTrue(tur.Unresolved["dbo.B"].Count == 1);
            Assert.IsTrue(tur.Unresolved["dbo.B"][0].TokenText == "SELECT A.ID FROM dbo.A JOIN dbo.B ON A.ID = B.ID");

        }

        [TestMethod]

        public void TableUsageReporterIdentifiersEveryStatementUnResolvedTableIsIn() {
            string statements = @"
                CREATE TABLE dbo.A(ID INT PRIMARY KEY);
                SELECT A.ID FROM dbo.A JOIN dbo.B ON A.ID = B.ID
                SELECT B.ID FROM dbo.B
                SELECT A.ID FROM dbo.A";

            SqlListener listener = TestMethods.Init(statements);
            TableUsageReporter tur = new(listener.Statements);
            Assert.IsFalse(tur.Unresolved.ContainsKey("dbo.A"));
            Assert.IsTrue(tur.Unresolved.ContainsKey("dbo.B"));
            Assert.IsTrue(tur.Unresolved["dbo.B"].Count == 2);
            Assert.IsTrue(tur.Unresolved["dbo.B"][0].TokenText == "SELECT A.ID FROM dbo.A JOIN dbo.B ON A.ID = B.ID");
            Assert.IsTrue(tur.Unresolved["dbo.B"][1].TokenText == "SELECT B.ID FROM dbo.B");

        }

        [TestMethod]
        public void TableUsageReporterTiesFullyQualifiedNamesToStatementsUsed() {
            SqlListener listener = TestMethods.Init(_sampleStatements);
            TableUsageReporter tur = new(listener.Statements);
            var dboA = tur.Tables["dbo.A"];

            Assert.IsTrue(dboA.Count == 1);
            Assert.IsTrue(dboA[0].TokenText == "SELECT A.ID FROM dbo.A JOIN dbo.B ON A.ID = B.AID;");

            var dboB = tur.Tables["dbo.B"];
            Assert.IsTrue(dboB.Count == 3);
            Assert.IsTrue(dboB[0].TokenText == "SELECT A.ID FROM dbo.A JOIN dbo.B ON A.ID = B.AID;");
            Assert.IsTrue(dboB[1].TokenText == "SELECT B.AID FROM dbo.B;");
            Assert.IsTrue(dboB[2].TokenText == "SELECT B.ID FROM dbo.B INNER JOIN dbo.C ON B.ID = C.BID;");

            var dboC = tur.Tables["dbo.C"];
            Assert.IsTrue(dboC.Count == 1);
            Assert.IsTrue(dboC[0].TokenText == "SELECT B.ID FROM dbo.B INNER JOIN dbo.C ON B.ID = C.BID;");


        }

        [TestMethod]

        public void TableUsageReporterUsesFullyQualifiedNameForKeys() {
        var fullyQualifiedWithImplicitSameName = @"
        SELECT A.ID FROM dbo.A AS A JOIN SampleDB.dbo.A AS SA ON A.ID = SA.ID;
        ";
        SqlListener listener = TestMethods.Init(fullyQualifiedWithImplicitSameName);
        TableUsageReporter tur = new(listener.Statements);
        Assert.IsTrue(tur.Tables.Count == 2);
            Assert.IsTrue(tur.Tables.ContainsKey("dbo.A"));
            Assert.IsTrue(tur.Tables.ContainsKey("SampleDB.dbo.A"));
        }

        [TestMethod]

        public void TableUsageReporterCountsInsertStatements() {
            var fullyQualifiedWithImplicitSameName = @"
        INSERT INTO dbo.B(ID,Val)
        SELECT ID,BVal FROM dbo.C;
        ";
            SqlListener listener = TestMethods.Init(fullyQualifiedWithImplicitSameName);
            TableUsageReporter tur = new(listener.Statements);
            Assert.IsTrue(tur.Tables.Count == 2);
            Assert.IsTrue(tur.Tables.ContainsKey("dbo.B"));
            Assert.IsTrue(tur.Tables.ContainsKey("dbo.C"));

        }
        [TestMethod]

        public void TableUsageReporterCountsUpdateStatements() {
            var fullyQualifiedWithImplicitSameName = @"
        UPDATE B
        SET VAL = VAL 
        FROM dbo.B AS B
        JOIN dbo.C AS C
        WHERE B.ID = C.ID;
        ";
            SqlListener listener = TestMethods.Init(fullyQualifiedWithImplicitSameName);
            TableUsageReporter tur = new(listener.Statements);
            Assert.IsTrue(tur.Tables.Count == 2);
            Assert.IsTrue(tur.Tables.ContainsKey("dbo.B"));
            Assert.IsTrue(tur.Tables.ContainsKey("dbo.C"));

        }
        [TestMethod]

        public void TableUsageReporterCountDeleteStatements() {
            var fullyQualifiedWithImplicitSameName = @"
        DELETE B
        FROM dbo.B AS B
        JOIN dbo.C AS C
        WHERE B.ID = C.ID;
        ";
            SqlListener listener = TestMethods.Init(fullyQualifiedWithImplicitSameName);
            TableUsageReporter tur = new(listener.Statements);
            Assert.IsTrue(tur.Tables.Count == 2);
            Assert.IsTrue(tur.Tables.ContainsKey("dbo.B"));
            Assert.IsTrue(tur.Tables.ContainsKey("dbo.C"));

        }

    }
}
