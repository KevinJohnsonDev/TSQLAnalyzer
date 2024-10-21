namespace TSQLAnalyzerLib.statementComponent {
    public class Environment
    {
        public List<Variable> Variables { get; init; }
        public Environment()
        {
            Variables = new();
        }

        public void AppendVariable(BaseToken token, string name, DataType sdt)
        {
            Variables.Add(new Variable(token, name, sdt));
        }
    }
}
