using TSQLAnalyzerLib.statementComponent;

namespace TSQLAnalyzerLib.analysis {
    /*
     * The idea of this reporter is to report variable names that are used inconsistently
     * across various SQL Batches and Procedures
     */
    public class VariableDeclarationReporter
    {
        public List<Variable> Errors { get; init; }

        public VariableDeclarationReporter(IEnumerable<statementComponent.Environment> environments) {
            Errors = new();
            Dictionary<string, Variable> VariableDataTypes = new();
            foreach(var environment in environments){
                foreach(var variable in environment.Variables){
                    var name = variable.Name;
                    if (!VariableDataTypes.ContainsKey(name)){
                        VariableDataTypes.Add(name, variable);
                        continue;
                    }
                    var expected = VariableDataTypes[variable.Name];
                    if (!variable.DeclaredDataType.Equals(expected.DeclaredDataType)){
                        Errors.Add(variable);
                    }
                }
            }
        }


    }
}
