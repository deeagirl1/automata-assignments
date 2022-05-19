grammar MyGrammar;

// rules
myStart :  stat+ EOF;

// rules
stat:   expr;

expr:   expr op=MUL expr #  Mul
    |   expr op=DIV expr #  Div
    |   expr op=ADD expr #  Add
    |   expr op=SUB expr #  Sub
    |   expr op=POW expr #  Pow
    |   expr op=FACT  #  Fact
    |   PARANL expr PARANR  # parens //add '(' as token
    |   INT     # int
    ;

// tokens
MUL:    '*';
DIV:    '/';
ADD:    '+';
SUB:    '-';
POW:    '^';
FACT:   '!';
PARANL: '(';
PARANR: ')';
INT     : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip;