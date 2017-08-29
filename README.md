# Multi-User-Spreadsheet-Editor

NOTICE: This project was recently moved to its own repository. It was originally developed in the ‘Current’ repository (Now renamed to [UniCade](https://github.com/benlen10/UniCade)) which contains the previous commits and versions.  

# Project Description
- This program implements basic functionality for storing and editing spreadsheets with multiple users.   

- This program was originally developed as a school project at UW Madison.

# Basic Usage 
- The server class is responsible for program flow.
- Call the run() method from the server class to parse the input text file and import existing users and documents
- This input file also contains operations (See below)
- Once the input file is parsed and all operations have been applied to the database, the program will generate an output.txt file representing the current state of the database ()

# Supported Operations
- SET (set,row,col,const -> set [row,col] to const)
- CLEAR (clear,row,col -> set [row,col] to 0)
- ADD (add,row,col,const -> add [row,col] by const)
- SUB (sub,row,col,const -> sub [row,col] by const)
- MUL (mul,row,col,const -> mul [row,col] by const)
- DIV (div,row,col,const -> div [row,col] by const)
- UNDO (Undo the last operation)
- REDO (Redo the last operation)
