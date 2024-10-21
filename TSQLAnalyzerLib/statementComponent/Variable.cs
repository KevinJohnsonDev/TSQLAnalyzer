namespace TSQLAnalyzerLib.statementComponent {
    public class Variable : ITokenText
    {

        public string TokenText { get; init; }
        public int Start { get; init; }
        public int End { get; init; }

        public string Name { get; init; }
        public DataType DeclaredDataType { get; init; }

        public Variable(BaseToken token, string name, DataType declaredDataType)
        {
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
            Name = name;
            DeclaredDataType = declaredDataType;
        }
    }
}
