# Little_Compiler
## 1. Specification

Language’s syntax is created in a way to differentiate logical sentences according to expression, one expression is line which is ended with “;”. Language syntax included variable declaration and processing with Float and Integer value
Lexical rules or tokens are:
```
VARIABLE: [a-zA-Z]+;
INTTEGER: [0-9]+;
FLOATING: [+-]?([0-9]*[.])?[0-9]+;

NEWLINE: '\r'? '\n';
WS_SKIP: [ \t]+ -> skip;

END: ';';
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
```
**Variable** accept any English letters without numbers and specific characters
**Integer** can be any size long
**Floating point** numbers accept, 3 types of declaration:
1)	23.45
2)	.45
3)	-10.12
Also, laxer understand **adding**, **subtraction**, **multiplication**, **division** and **brackets** 
Overall, we have 10 different tokens types except grammar tokens

## 2.	The Implementation
Language grammars consist of 3 rules and 7 alternatives inside this rule

```
prog: stat+;

stat: expr NEWLINE                  # printExpr
    | VARIABLE '=' expr END             # assign
    | NEWLINE                           # blank
    ;

expr: expr op=('*' | '/') expr          # mulDiv
    | expr op=('+' | '-') expr          # addSub
    | INTTEGER                          # int
    | VARIABLE                          # var
    | FLOATING                          # float
    | '(' expr ')'                      # parens
    ;
```

### Evaluate

Each rule and alternative marked by ANTLER marking system (or how to call it…) e.g printExpr, assign, blank for further logical specification in a Visitor class. 
The evaluator is able to evaluate any mathematical expression with and without brackets, bet need variable declaration, e.g it will accept “a = 3+5”, bet don’t accept “
3+5”

Further explanation is written in Visitor class in comments 

### Pretty print

Pretty print is combined with evaluator and is going during process of traversing tree in Visitor class e.g., it will be printed pretty version more like interpreter 

## 3.	Extended Features

### 1.	Main menu
I added main menu for compiler in console to simplify process of using and testing program. 
Compiler compile code from provided file. E.g., for testing perspective u can use

```
./src/test.txt
```
1.	Main menu, enter file url (enter file of your code to compile)
After entering url, it will give potential syntax errors in a file, if there is any, correct them and restart program 

2.	Choice option to work with
2.1	Print Parse Tree 
This command will print parse tree in console, I implemented this feature mainly for testing perspective because ANTLER preview is unstable and don’t want to work correctly on my PC

2.2	Print Pretty print and execute code

This is main part of a compiler it will compile result of mathematical expression and print pretty version of it

### 2.	Float numbers

I added float numbers use for this language. Parser can differentiate between Integer and float bet all calculations is done in float because I don’t have time to dive into low level programming and t is easier to convert int to float then float to int  . For father language development I will be needed to add rounding of values for logical statements like if 

## Main code files: 

•	andrey_lan.g4
•	MyLexerRules.g4
•	MyVisitor.java
•	run.java
