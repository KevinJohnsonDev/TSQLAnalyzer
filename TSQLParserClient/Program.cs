// See https://aka.ms/new-console-template for more information
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using System.Text;
using TSQLParserLib.listeners;


try {

    List<string> files = new();
    var argumentOption = parseArgs(args);
    if(argumentOption.Quit ) { return; }
    if(argumentOption.FileNames.Count == 0) {
        parseArgs(Array.Empty<string>());
    }


    StringBuilder sb = new StringBuilder();
    foreach(string fileName in argumentOption.FileNames) {
        string fileContents = File.ReadAllText(fileName);

        sb.Append(fileContents);
        sb.AppendLine();
    }
    string input = sb.ToString();
    AntlrInputStream inputStream = new AntlrInputStream(input);
    TSqlLexer tsqlLexer = new(inputStream);
    CommonTokenStream commonTokenStream = new CommonTokenStream(tsqlLexer);
    TSqlParser sqlParser = new(commonTokenStream);
    TokenLoggingSqlListener listener = new TokenLoggingSqlListener(sqlParser);

    ParseTreeWalker.Default.Walk(listener, sqlParser.tsql_file());

    foreach (var statement in listener.Statements) {
        Console.WriteLine(statement);
    }

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

    if (args.Length == 0) {
        Console.WriteLine("Please provide a path for your *.sql fileNames seperated by spaces");
        Console.WriteLine("q+enter to quit");

        string? input = Console.ReadLine();
        while (String.IsNullOrWhiteSpace(input)) { input = Console.ReadLine(); }
        input = input.Trim();
        if(input == "q") { return new InputArgumentOption(fileNames, true); }
        if (input.Contains(' ')) { fileNames.AddRange(input.Split(" ")); }
        else { fileNames.Add(input); }

    }
    else {
        foreach (string arg in args) {
            fileNames.Add(arg);
        }
    }

    for (var i = fileNames.Count - 1; i >= 0; i--) {
        string fileName = fileNames[i];
        string absoluteName = Path.GetFullPath(fileName);
        if (!File.Exists(fileName)) {
            Console.WriteLine($"{fileName} is an invalid path, translated relative path:({absoluteName})");
            fileNames.RemoveAt(i);
        }
        else {
            fileNames[i] = absoluteName;
        }
    }
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