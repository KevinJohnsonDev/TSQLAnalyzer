namespace TSQLAnalyzerLib.statementComponent {
    public class BaseToken : ITokenText
    {
        public string TokenText { get; init; }

        public static BaseToken OnlineToken { get; }

        static BaseToken()
        {
            OnlineToken = new BaseToken("[ONLINE]", -1, -1);
        }

        public int Start { get; init; }
        public int End { get; init; }

        public BaseToken(string tokenText, int start, int end)
        {
            TokenText = tokenText;
            Start = start;
            End = end;
        }
    }
}
