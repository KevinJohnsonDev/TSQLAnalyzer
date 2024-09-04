// See https://aka.ms/new-console-template for more information
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using System.Text;
using TSQLParserLib.analysis;
using TSQLParserLib.listeners;
using TSQLParserLib.online;



try {

    List<string> files = new();
    var argumentOption = parseArgs(args);
    if(argumentOption.Quit ) { return; }
    if(argumentOption.FileNames.Count == 0) {
        parseArgs(Array.Empty<string>());
    }


    TokenLoggingSqlListener? listener = null;
    foreach (string fileName in argumentOption.FileNames) {
        string fileContents = File.ReadAllText(fileName);
        AntlrInputStream inputStream = new(fileContents);
        TSqlLexer tsqlLexer = new(inputStream);
        CommonTokenStream commonTokenStream = new(tsqlLexer);
        TSqlParser sqlParser = new(commonTokenStream);
        listener ??= new(sqlParser);
        listener.FileName = fileName;
        ParseTreeWalker.Default.Walk(listener, sqlParser.tsql_file());

    }
    if(listener == null) { throw new InvalidOperationException("After Parsing File, Listener does not exist"); }
    var subReporter = new SubqueryDepthReporter(listener.Statements);
    var sargabilityReporter = new SargabilityReporter(listener.Statements);

    StringBuilder sb = new();
    sb.AppendLine("Sargability Errors:");
    foreach (var Error in sargabilityReporter.Errors) {
        sb.AppendLine($"{Error.ToString()}");
    }
    sb.AppendLine("Subquery Depth Errors");
    foreach (var Error in subReporter.Errors) {
        sb.AppendLine($"{Error.ToString()}");
    }

    Console.WriteLine(sb.ToString());
}
catch (Exception ex) {
    Console.WriteLine("Error: " + ex);
}

static bool IsFullPath(string path) {
    return !String.IsNullOrWhiteSpace(path)
        && path.IndexOfAny(System.IO.Path.GetInvalidPathChars().ToArray()) == -1
        && Path.IsPathRooted(path)
        && !Path.GetPathRoot(path).Equals(Path.DirectorySeparatorChar.ToString(), StringComparison.Ordinal);
}

static InputArgumentOption parseArgs(string[] args) {
    List<string> fileNames = new();
    string? directory = null;
    string? con = null;
    bool recurse = false;
    for(var i =0; i < args.Length; i += 1) {
        if (args[i] == "--directory" && i + 1 < args.Length) {
            directory = args[i + 1];
        }
        if (args[i] == "--con" && i + 1 < args.Length) {
            con = args[i + 1];
        }
        if (args[i] == "--recurse" ) {
            recurse = true;
        }
    }


    if (directory == null) {
        Console.WriteLine("Error: --directory is required. specify below or type q to exit");
        directory = Console.ReadLine();
        while (String.IsNullOrWhiteSpace(directory)) { directory = Console.ReadLine(); }
        directory = directory.Trim();
        if (directory == "q") { return new InputArgumentOption(fileNames, true); }
    }

    if(con != null) {
        CatalogFetcher CF = new(con);
        CF.PopulateCatalog();
    }

    string absDirectory = Path.GetFullPath(directory);

    if(!Directory.Exists(absDirectory)){
        Console.WriteLine("Error: --directory provided does not exist...exiting");
        return new InputArgumentOption(fileNames, true);
    }
    
    SearchOption so = recurse ? SearchOption.AllDirectories : SearchOption.TopDirectoryOnly;
    fileNames.AddRange( Directory.GetFiles(absDirectory, "*.sql", so));

    return new InputArgumentOption(fileNames,false);
}

class InputArgumentOption {

    public  List<string> FileNames { get; init; }
    public  bool Quit { get; init; }

    public InputArgumentOption(List<string> fileNames, bool quit) {
        FileNames = fileNames;
        Quit = quit;
    }

}