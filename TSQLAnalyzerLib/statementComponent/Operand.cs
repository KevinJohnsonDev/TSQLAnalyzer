namespace TSQLAnalyzerLib.statementComponent {
    public class Operand : ISargable, ITokenText
    {
        public string TokenText { get; init; }
        public int Start { get; init; }
        public int End { get; init; }
        public bool UsedFunction { get; init; }
        public bool IsConstant { get; init; }

        public bool InCaseStatement { get; init; }
        public bool InWhere { get; init; }
        public bool InSubquery => SubQueryDepth > 0;


        public int SubQueryDepth { get; init; }

        public Operand(BaseToken token, bool usedFunction, bool isConstant, bool inWhere, bool inCaseStatement, int subqueryDepth)
        {
            IsConstant = isConstant;
            UsedFunction = usedFunction;
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
            InCaseStatement = inCaseStatement;
            InWhere = inWhere;
            SubQueryDepth = subqueryDepth;
        }
        public bool IsSargable()
        {
            if (!InWhere && !InSubquery) { return true; }
            if (InCaseStatement) { return false; }
            if (IsConstant) { return true; }
            if (UsedFunction) { return false; }
            return true;
        }

        public override string ToString()
        {
            return $"{TokenText}:{Start}-{End}\n\tInWhere:{InWhere}\n\tInCaseStatement:{InCaseStatement}\n\tUsedFunction:{UsedFunction}";
        }
    }
}
