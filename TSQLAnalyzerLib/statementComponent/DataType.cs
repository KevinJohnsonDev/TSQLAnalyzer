namespace TSQLAnalyzerLib.statementComponent {
    public class DataType : ITokenText, IEquatable<DataType?>
    {
        /*Declaration TokenText */
        public BaseToken Token { get; init; }
        public string TokenText => Token.TokenText;
        public int Start => Token.Start;
        public int End => Token.End;

        public SqlDataTypes BaseType { get; init; }
        public int? Precision { get; init; }
        public int? Scale { get; init; }

        public DataType(BaseToken token, string dataType, int? precision = null, int? scale = null)
        {
            Token = token;
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

        public override bool Equals(object? obj) {
            return Equals(obj as DataType);
        }
    }
}
