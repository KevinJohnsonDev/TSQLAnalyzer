namespace TSQLAnalyzerLib.statementComponent {
    public class DataType : ITokenText, IEquatable<DataType?>
    {
        /*Declaration TokenText */
        public string TokenText { get; init; }
        public int Start { get; init; }
        public int End { get; init; }


        public SqlDataTypes BaseType { get; init; }
        public int? Precision { get; init; }
        public int? Scale { get; init; }

        public DataType(BaseToken token, string dataType, int? precision = null, int? scale = null)
        {
            TokenText = token.TokenText;
            Start = token.Start;
            End = token.End;
            BaseType = Enum.TryParse(dataType, out SqlDataTypes dt) ? dt : SqlDataTypes.USER_DEFINED;
            Precision = precision;
            Scale = scale;
        }

        public bool Equals(DataType? other)
        {
            return other is not null &&
                   BaseType == other.BaseType &&
                   Precision == other.Precision &&
                   Scale == other.Scale;
        }

        public override int GetHashCode()
        {
            return HashCode.Combine(BaseType, Precision, Scale);
        }

        public static bool operator ==(DataType? left, DataType? right)
        {
            return EqualityComparer<DataType>.Default.Equals(left, right);
        }

        public static bool operator !=(DataType? left, DataType? right)
        {
            return !(left == right);
        }

        public static DataType FromDatabase(string dataType, int? precision = null, int? scale = null)
        {
            return new DataType(BaseToken.OnlineToken, dataType, precision, scale);
        }
    }
}
