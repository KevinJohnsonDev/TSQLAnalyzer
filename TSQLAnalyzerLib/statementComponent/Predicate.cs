namespace TSQLAnalyzerLib.statementComponent {
    public class Predicate : ISargable, ITokenText
    {
        public string TokenText { get; init; }
        public int Start { get; init; }
        public int End { get; init; }
        public ISargable Left { get; set; }

        public bool InWhere { get; init; }

        public string Op { get; set; }

        public ISargable Right { get; set; }

        public string FileName { get; init; } = "";

        public Predicate(BaseToken token, ISargable left, ISargable right, string op, bool inWhere, string fileName)
        {
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
            Left = left;
            Right = right;
            Left = left;
            Op = op;
            InWhere = inWhere;
            FileName = fileName;
        }
        public bool IsSargable()
        {
            return Left.IsSargable() && Right.IsSargable();
        }

        public override string ToString()
        {
            var prefix = string.IsNullOrWhiteSpace(FileName) ? "" : $"FileName:{FileName}\n";
            return $"{prefix}{FileName}{TokenText}:{Start}-{End}\n\tLeft:{Left}\n\tOp:{Op}\n\tRight:{Right}";
        }
    }
}
