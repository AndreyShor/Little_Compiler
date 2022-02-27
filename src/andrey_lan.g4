grammar andrey_lan;
import MyLexerRules;

prog: stat+;

stat: expr ';' NEWLINE                  # printExpr
    | VARIABLE '=' expr ';' NEWLINE     # assign
    | NEWLINE                           # blank
    ;

expr: expr op=('*' | '/') expr          # mulDiv
    | expr op=('+' | '-') expr          # addSub
    | INTTEGER                          # int
    | VARIABLE                          # var
    | FLOATING                          # float
    | '(' expr ')'                      # parens
    ;

