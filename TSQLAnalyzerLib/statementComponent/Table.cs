using Antlr4.Runtime;

namespace TSQLAnalyzerLib.statementComponent {
    public class Table : ITokenText, IAliasable, IEquatable<Table?>
    {
        public BaseToken Token { get; init; }
        public Identifier Id { get; init; }
        public string Alias { get; set; } = "";
        public string TokenText => Token.TokenText;
        public int Start => Token.Start; 
        public string FQN => Id.FQN;
        public int End => Token.End;
 
        public bool UsedAs { get { return Id.UsedAs; } set {} }
        public string Database => Id.Database;
        public string Schema => Id.Schema;
        public string TableName => Id.Name;

        private List<Column> _columns = new();
        public virtual List<Column> Columns { get { return _columns; } }

        public List<ResolvedColumn> ResolvedColumns { get; init; } = new List<ResolvedColumn>();

        private ResolvedTable? _resolvedTable = null;
        public ResolvedTable? ResolvedTable {
            get { return _resolvedTable; }
            set {
                if (value == null) throw new ArgumentNullException(nameof(value));
                if(_resolvedTable is not null) { throw new InvalidOperationException("Cannot Reassign Resolved Table"); }
                _resolvedTable = value;
                Columns.AddRange(_resolvedTable.Columns.Select((x)=> x.AsColumn()));
            } }

        public Table(BaseToken token,  Identifier id, ResolvedTable? rt = null)
    {
            Token = token;
            Id = id;
            Alias = id.Alias;
            if(rt is not null) ResolvedTable = rt;
        }




        public override string ToString() => $"{TokenText}:{Start}-{End}\n\tDatabase:{Database}\n\tSchema:{Schema}\n\tTableName:{TableName}\n\tAlias:{Alias}\n\tUsedAs:{UsedAs}";

        public override bool Equals(object? obj)
        {
            return Equals(obj as Table);
        }

        public bool Equals(Table? other)
        {
            return other is not null &&
                   TokenText == other.TokenText &&
                   Database == other.Database &&
                   Schema == other.Schema &&
                   TableName == other.TableName;
        }

        public override int GetHashCode()
        {
            return HashCode.Combine(TokenText, Database, Schema, TableName);
        }

        public static bool operator ==(Table? left, Table? right)
        {
            return EqualityComparer<Table>.Default.Equals(left, right);
        }

        public static bool operator !=(Table? left, Table? right)
        {
            return !(left == right);
        }
    }

    public class DerivedTable : Table {

        private List<Column> _columns = new();
        public override List<Column> Columns { get { return _columns; } }

        private readonly Statement _sub;
        public DerivedTable(BaseToken token, Statement sub, Identifier id):base(token,id) {
            Alias = id.Alias;
            UsedAs = id.UsedAs;
            _sub = sub;
            if(_sub is not null){
                _columns.
                    AddRange(sub.Columns.Where((col) => col.Position.IsProjected).ToList());
            }
        }
    }
}
