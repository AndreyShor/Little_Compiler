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
    | '(' expr ')'                      # parens
    ;


VARIABLE: [a-zA-Z]+;
INTTEGER: [0-9]+;

NEWLINE: '\r'? '\n';
WS_SKIP: [ \t]+ -> skip;

END: ';';
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
