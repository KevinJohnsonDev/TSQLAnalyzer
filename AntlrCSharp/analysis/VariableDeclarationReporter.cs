using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AntlrCSharp.analysis
{
    public class VariableDeclarationReporter
    {
        public List<SqlVariable> Errors { get; init; }

        public VariableDeclarationReporter(IEnumerable<Environment> environments) {
            Errors = new();
            Dictionary<string, string> VariableDataTypes = new();
            foreach(var environment in environments){
                foreach(var variable in environment.Variables){
                    var dataType = variable.DataType;
                    var name = variable.Name;
                    if (!VariableDataTypes.ContainsKey(name)){
                        VariableDataTypes.Add(name, dataType);
                        continue;
                    }
                    var expected = VariableDataTypes[variable.Name];
                    if (variable.DataType != expected){
                        Errors.Add(variable);
                    }
                }
            }
        }


    }
}
