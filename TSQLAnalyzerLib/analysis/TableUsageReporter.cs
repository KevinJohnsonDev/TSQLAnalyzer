using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TSQLAnalyzerLib.statementComponent;

namespace TSQLAnalyzerLib.analysis
{
    public class TableUsageReporter {

        public Dictionary<string, List<Statement>> Tables { get; init; } = new();
        public Dictionary<string, List<Statement>> Unresolved { get; init; } = new();

        /*
         * The idea of this reporter is to report the statements queries that a particular table is used in
         * Equivilent to find all references although it should work cross database 
         * 
         */
        public TableUsageReporter(IEnumerable<Statement> statements) {
            foreach (Statement statement in statements) {
                TraverseSubqueries(statement);
                foreach (var table in statement.Tables) {
                    /*
                    Derived tables don't have fully qualified names 
                    currently derived tables are also counted by the statement subqueries
                    so we only need to traverse all subqueries for base tables 
                    */
                    if (String.IsNullOrWhiteSpace(table.FQN)) { continue; } 

                    MapTable(statement, table);
                }
                if(statement.DmlTarget is not null) {

                    MapTable(statement, statement.DmlTarget);
                }

            }
        }

        private void TraverseSubqueries(Statement statement) {
            foreach(Statement sub in statement.Subqueries) {
                   TraverseSubqueries(sub);
                    foreach (var table in sub.Tables) {MapTable(statement, table);  }
            }
        }

        private void MapTable(Statement statement, Table table) {
            if (!Tables.ContainsKey(table.FQN)) {
                Tables.Add(table.FQN, new List<Statement>());
            }
            if (!Tables[table.FQN].Contains(statement)) {
                Tables[table.FQN].Add(statement);
            }
            if (table.ResolvedTable != null) { return; }
            if (!Unresolved.TryGetValue(table.FQN, out List<Statement>? value)) {
                value = new List<Statement>();
                Unresolved.Add(table.FQN, value);
                Unresolved[table.FQN].Add(statement);
            }
            if (!value.Contains(statement)) {
                value.Add(statement);
            }
        }
    }
}
