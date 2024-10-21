using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TSQLAnalyzerLib.statementComponent;

namespace TSQLAnalyzerLib.analysis
{
    public class SargabilityReporter
    {
        public List<ISargable> Errors { get; init; }
        public SargabilityReporter(IEnumerable<Statement> statements) {
            Errors = new List<ISargable>();

            foreach (Statement statement in statements)
            {
                Errors.AddRange(SargableDFS(statement));
            }
            
        }

        public IEnumerable<ISargable> SargableDFS(Statement statement)
        {
            List<ISargable> tokens = new();
            foreach (Statement subquery in statement.Subqueries)
            {
                if (subquery == null) { continue; }
                if (subquery.IsSargable()) { continue; }
                tokens.AddRange(SargableDFS(subquery));

            }
            tokens.AddRange(SargableDFS(statement.Predicates));

            return tokens;
        }

        private IEnumerable<ISargable> SargableDFS(IEnumerable<Predicate> predicates)
        {
            List<ISargable> tokens = new();

            foreach (Predicate predicate in predicates)
            {
                if (predicate == null) { continue; }
                if (predicate.IsSargable()) { continue; }
                tokens.Add(predicate);
            }
            return tokens;
        }
    }
}
