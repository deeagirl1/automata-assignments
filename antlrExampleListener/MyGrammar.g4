grammar MyGrammar;

// rules
myStart :  stat+ EOF;

// rules
stat:   expr;

expr:   expr op=(MUL|DIV) expr #  MulDiv
    |   expr op=(ADD|SUB) expr #  AddSub
    |   expr op=POW expr #  Pow
    |   expr op=FACT  #  Fact
    |   '(' expr ')'  # parens
    |   INT     # int
    ;

// tokens
MUL:    '*';
DIV:    '/';
ADD:    '+';
SUB:    '-';
POW:    '^';
FACT:   '!';
INT     : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip;