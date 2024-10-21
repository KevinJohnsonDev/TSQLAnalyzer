# TSQLAnalyzer

TSQLAnalyzer is open source program to statically analyze TSQL;


# What does this do
Reports various things about SQL that is fed into it.

This projects goal is to statically analyze TSQL without *needing* for it to be connected to a database.

Some environments don't allow direct access to the database or have/allow local copies.

You would ideally export your tables from SSMS into a file or directory and this would be used for the catalog to analyze your SQL statements

This is being designed to analyze queries in ways known linters don't really address such as:

- Maximum subquery depth
    - Once you get into a certain depth for your subqueries, optimizers tend to have issues performing optimizations on join order 
- Inconsistent variable type usage
    - Help prevent implicit conversion performance loss
	- Keeps things predictable @ID should always be an \[INT\]
- Table usage tracking
    - While tracked by SSMS, this takes text, including SQL outside of SSMS 
- SARGability analysis on queries without needing to rely on an execution plan
    - Find potential performance issues before they start

# How to use 

Currently you'd have to modify the program.cs to get real use out of this as it's really just a bundle of tools currently. 

The core of these libraries is still in progress and the console program will be extended as things get closer to completion

- Clone the repository 
- Run in Visual Studio 2022

# Planned Features

- Derived Table (Subquery) Name Resolution
- Temp Table Name Resolution
- Table and Column Usage Analysis that can recommend filtered indexes

# Credits 
The TSQL parser built with ANTLR4.

The TSQL grammar was derived from the official [ANTLR4 TSQL Grammar](
https://github.com/antlr/grammars-v4/blob/master/sql/tsql/TSQLAnalyzer.g4)

# Contributing

Contributers are welcome!

You can submit a pull request with a different branch or file a bug report.

If you submit a pull request, please ensure that the current set of tests pass or it will not be merged




