using Antlr4.Runtime.Misc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AntlrCSharp.visitors
{
    internal class StatementVisitor : tsqlBaseVisitor<object>
    {
        public List<string> result = new List<string>();
        public override object VisitUse_statement([NotNull] tsqlParser.Use_statementContext context)
        {
            result.Add($"{context.Start.Text} {context.Stop.Text}");
            return base.VisitUse_statement(context);
        }
    }
}
