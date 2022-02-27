lexer grammar MyLexerRules;

VARIABLE: [a-zA-Z]+;
INTTEGER: [0-9]+;

NEWLINE: '\r'? '\n';
WS_SKIP: [ \t]+ -> skip;

END: ';';
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';


