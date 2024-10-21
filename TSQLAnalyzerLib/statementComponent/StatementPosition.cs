namespace TSQLAnalyzerLib.statementComponent {
    public class StatementPosition : IEquatable<StatementPosition?>,ICloneable {
        public int SelectDepth { get; set; } = 0;
        public int SubqueryDepth { get; set; } = 0;
        public int WhereDepth { get; set; } = 0;

        public StatementPosition() { }

        public void Reset() {
            SelectDepth = 0;
            SubqueryDepth = 0;
            WhereDepth = 0;
        }
        public  object Clone() {
            return this.MemberwiseClone();
        }

        public override bool Equals(object? obj) {
            return Equals(obj as StatementPosition);
        }

        public bool Equals(StatementPosition? other) {
            return other is not null &&
                   SelectDepth == other.SelectDepth &&
                   SubqueryDepth == other.SubqueryDepth &&
                   WhereDepth == other.WhereDepth;
        }

        public override int GetHashCode() {
            return HashCode.Combine(SelectDepth, SubqueryDepth, WhereDepth);
        }

        public static bool operator ==(StatementPosition? left, StatementPosition? right) {
            return EqualityComparer<StatementPosition>.Default.Equals(left, right);
        }

        public static bool operator !=(StatementPosition? left, StatementPosition? right) {
            return !(left == right);
        }
    }
}
