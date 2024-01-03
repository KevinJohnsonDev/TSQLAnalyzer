using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AntlrCSharp.analysis
{
    public class SargabilityReporter
    {
        public List<ISargable> Errors { get; init; }
        public SargabilityReporter(IEnumerable<SqlStatement> statements) {
            Errors = new List<ISargable>();

            foreach (SqlStatement statement in statements)
            {
                Errors.AddRange(SargableDFS(statement));
            }
            
        }

        public IEnumerable<ISargable> SargableDFS(SqlStatement statement)
        {
            List<ISargable> tokens = new();
            foreach (SqlStatement subquery in statement.Subqueries)
            {
                if (subquery == null) { continue; }
                if (subquery.IsSargable()) { continue; }
                tokens.AddRange(SargableDFS(subquery));

            }
            tokens.AddRange(SargableDFS(statement.Predicates));

            return tokens;
        }

        private IEnumerable<ISargable> SargableDFS(IEnumerable<SqlPredicate> predicates)
        {
            List<ISargable> tokens = new();

            foreach (SqlPredicate predicate in predicates)
            {
                if (predicate == null) { continue; }
                if (predicate.IsSargable()) { continue; }
                tokens.Add(predicate);
            }
            return tokens;
        }
    }
}
