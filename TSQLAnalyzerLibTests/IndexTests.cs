using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TSQLAnalyzerLib.listeners;

namespace TSQLAnalyzerLibTests {
    [TestClass]
    public class IndexTests {

        [TestMethod]
        public void CreateIndex_CreateIndexInTable() {
            var input = @"
                USE Sample_DB

                GO

                CREATE TABLE dbo.B(
                    ID INT CONSTRAINT PK_dbo_B_ID PRIMARY KEY,
                    ActionBy VARCHAR(25) NOT NULL,
                    ActionDate DATETIME NULL
                )

                CREATE UNIQUE NONCLUSTERED INDEX [B_No_DupActions] ON [dbo].[b] ([ActionDate] ASC)
                INCLUDE(ActionBy)
                ";
            SqlListener listener = TestMethods.Init(input);
            var table = listener.DbCatalog.Seek("Sample_DB", "dbo", "B");
            Assert.IsNotNull(table);
            Assert.IsTrue(table.Indexes.Count == 2);
            var index = table.Indexes[1];
            Assert.IsNotNull(index);
            Assert.IsTrue(index.IsUnique);
            Assert.IsTrue(index.Name == "B_No_DupActions");
            Assert.IsFalse(index.IsClustered);
            Assert.IsTrue(index.Columns.Count == 2);
            Assert.IsTrue(index.Columns[0].ColumnName == "ActionDate");
            Assert.IsTrue(index.Columns[1].ColumnName == "ActionBy");
            Assert.IsTrue(index.IncludedColumns.Count == 1);
            Assert.IsTrue(index.IncludedColumns[0].ColumnName == "ActionBy");




        }
        [TestMethod]
        public void AddingUniqueConstraint_CreatesIndexInTable() {
            var input = @"
                USE Sample_DB

                GO

                CREATE TABLE dbo.B(
                    ID INT CONSTRAINT PK_dbo_B_ID PRIMARY KEY,
                    ActionBy VARCHAR(25) NOT NULL,
                    ActionDate DATETIME NULL
                );

                ALTER TABLE dbo.B ADD CONSTRAINT UQ_B_ActionBy_ActionDate UNIQUE(ActionBy,ActionDate); 

                ";
            SqlListener listener = TestMethods.Init(input);
            var table = listener.DbCatalog.Seek("Sample_DB", "dbo", "B");
            Assert.IsNotNull(table);
            Assert.IsTrue(table.Indexes.Count == 2);
            var index = table.Indexes[1];
            Assert.IsTrue(index.IsUnique);
            Assert.IsTrue(index.Name == "UQ_B_ActionBy_ActionDate");
            Assert.IsFalse(index.IsClustered);
            Assert.IsTrue(index.Columns.Count == 2);
            Assert.IsTrue(index.Columns[0].ColumnName == "ActionBy");
            Assert.IsTrue(index.Columns[1].ColumnName == "ActionDate");
        }
    }
}
