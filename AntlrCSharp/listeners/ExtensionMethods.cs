using Antlr4.Runtime.Misc;
using Antlr4.Runtime;
using System;
using System.Threading.Tasks;


namespace AntlrCSharp.listeners
{
    public static class ExtensionMethods 
    {
        public static string GetFullText(this ParserRuleContext context)
        {
            if (context.Start == null || context.Stop == null || context.Start.StartIndex < 0 || context.Stop.StopIndex < 0)
                return context.GetText(); // Fallback

            return context.Start.InputStream.GetText(Interval.Of(context.Start.StartIndex, context.Stop.StopIndex));
        }
    }
}
