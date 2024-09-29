using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TSQLAnalyzerLib.listeners;

namespace TSQLAnalyzerLibTests {
    [TestClass]

    public class TriggerTests {

        [TestMethod]
        public void UpdateColumnsClauseDoesntThrowAnException() {
            string input = @"
            CREATE TRIGGER Purchasing.PreventKeyUpdate  
            ON Purchasing.PurchaseOrderHeader
            AFTER UPDATE
            AS
            IF UPDATE(PurchaseOrderID)
            RAISERROR('Update Primary Key Detected', 16, 10);
            GO;";
            SqlListener listener = TestMethods.Init(input);

        }
    }
}
