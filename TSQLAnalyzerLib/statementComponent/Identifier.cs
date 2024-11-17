using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TSQLAnalyzerLib.statementComponent {
    public class Identifier : IEquatable<Identifier?> {
 
        public readonly string[] components = new string[3];

        private readonly string _alias = "";
        private readonly bool _usedAs = false;
        public string Alias { get { return _alias; } }
        public bool UsedAs { get { return _usedAs; } }
        public string Database { get {  return components[2]; } }
        public string Schema { get { return components[1]; } }
        public string Name { get { return components[0]; } }

        public string FQN { get; init; }
        public Identifier(string? alias,bool usedAs, string name, string? schema, string? database) {
            components[0] = name.Replace("[", "").Replace("]", "");
            components[1] = schema?.Replace("[", "").Replace("]", "") ?? "dbo";
            components[2] = database?.Replace("[", "").Replace("]", "") ?? "";
            _alias = alias?.Replace("[", "").Replace("]", "") ?? "";
            _usedAs = usedAs;
            var prefix = string.IsNullOrWhiteSpace(Database) ? "" : $"{Database}.";
            FQN = $"{prefix}{Schema}.{Name}";
        }

        public Identifier(string alias,bool usedAs) {
            _alias = alias;
            _usedAs = usedAs;
            components[0] = alias;
            components[1] =  "dbo";
            components[2] =  "";
            FQN = "";
        }

        public override bool Equals(object? obj) {
            return Equals(obj as Identifier);
        }

        public bool Equals(Identifier? other) {
            return other is not null &&
                   Alias == other.Alias &&
                   UsedAs == other.UsedAs &&
                   Database == other.Database &&
                   Schema == other.Schema &&
                   Name == other.Name;
        }

        public bool Matches2PartName(Identifier? other) {
            return other is not null &&
                   Schema == other.Schema &&
                   Name == other.Name;
        }

        public override int GetHashCode() {
            return HashCode.Combine(Alias, UsedAs, Database, Schema, Name);
        }

        public static bool operator ==(Identifier? left, Identifier? right) {
            return EqualityComparer<Identifier>.Default.Equals(left, right);
        }

        public static bool operator !=(Identifier? left, Identifier? right) {
            return !(left == right);
        }
        public override string ToString() {
            string result = $"{components[2]}.{components[1]}.{components[0]}";
            if (_usedAs) { result += " AS"; }
            result += _alias;
            return result;
        }

    }
}
