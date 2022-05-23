grammar MyGrammar;

// rules
myStart :  stat+ EOF;

// rules
stat:   expr     #otherExpr
    |   value_type ID Is expr SEMICOLON  # assign
    |   Print expr SEMICOLON # printExpr
    ;

value_type
    : IntType
    | BoolType
    | StringType
    ;

expr:   expr op=MUL expr #  Mul
    |   expr op=DIV expr #  Div
    |   expr op=ADD expr #  Add
    |   expr op=SUB expr #  Sub
    |   expr op=POW expr #  Pow
    |   expr op=FACT  #  Fact
    |   PARANL expr PARANR  # parens //add '(' as token
    |   ID    #ValueVariable
    |   BOOLEAN       #ValueBoolean
    |   INT        #ValueNumber
    ;

// tokens
IntType: 'int';
BoolType: 'bool';
StringType: 'string';
Print: 'print';
MUL:    '*';
Is:      '=';
COMMA: ',';
SEMICOLON: ';';
StringParen: '"';
DIV:    '/';
ADD:    '+';
SUB:    '-';
POW:    '^';
FACT:   '!';
PARANL: '(';
PARANR: ')';
INT     : [0-9]+ ;
BOOLEAN: 'true'|'false';
ID: [_A-Za-z][A-Za-z_!0-9.]* ;
COMMENT : '//' .+? ('\n'|EOF) -> skip;
WS  : [ \t\r\n]+ -> skip;