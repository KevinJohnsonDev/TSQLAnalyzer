# TSQLParser

TSQLParser is an open source, TSQL parser built with ANTLR4.

The parser was originally compiled using the ANTLR4 grammar syntax support vscode plugin that was developed by Mike Lischke.

However it just uses ANTLR4 currently

The TSQL grammar was derived from the official [ANTLR4 TSQL Grammar](
https://github.com/antlr/grammars-v4/blob/master/sql/tsql/TSqlParser.g4)

This project will be renamed eventually

# What does this do
Reports various things about SQL that is fed into it.

The main idea of this project is to statically analyze sql without being connected to the actual database in ways linters really wouldn't want to bother with such as:

- Maximum subquery depth
    - Once you get into a certain depth for your subqueries, optimizers tend to have issues performing optimizations on join order 
- Inconsistent variable usage
    - Help prevent implicit conversion performance loss
- Table usage tracking
    - While tracked by SSMS, this takes text, including SQL outside of SSMS 
- SARGability analysis on queries without needing to rely on an execution plan
    - Find potential performance issues before they start

# How to use 

Currently you'd have to modify the program.cs to get real use out of this as it's really just a bundle of tools currently. 

I'm still trying to sus out whether this is even useful for other people as this mostly started out as a little project for fun.


    - Clone the repository 
    - Run in Visual Studio 2022

# Planned Features

- Specific Table column usage tracking 
    -  To help database refactors
- Parsing CREATE TABLE statements to proactively create a catalog so when the table is encountered the type of column is known when comparing to variables and other columns to check for implicit conversions


# Contributing

You can submit a pull request or file a bug report, I'll get to it when I can, usually with 2-5 days I work a full time job and this is just a fun little passion project.

If it picks up steam, I'll start putting more time into it.

#Rebuilding parser

java -jar antlr-4.13.1-complete.jar -Dlanguage=CSharp -listener -visitor -o generated  
"{PathToTSqLLexer}\TSqlLexer.g4"  "{PathToTSqlParser}\TSqlParser.g4"


