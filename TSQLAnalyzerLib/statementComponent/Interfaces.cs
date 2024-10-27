using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TSQLAnalyzerLib.statementComponent {

    public interface ITokenText {
        string TokenText { get; }
        int Start { get;  }
        int End { get; }
    }
    public interface ISargable : ITokenText {
        bool IsSargable();

    }

    public interface INonSargableTokens {
        IEnumerable<ISargable> NonSargableTokens { get; }
    }

    public interface IAliasable : ITokenText {
        string Alias { get; set; }
        bool UsedAs { get; set; }
    }

}
