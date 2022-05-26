grammar MyGrammar;

// rules
myStart :  statement + EOF;

statement:   expression     #otherExpr
    |   variable_declaration # assign
    |   Print op=(INT| BOOLEAN |ID)  # printExpr
    ;

variable_declaration : int_variable_assignment
                     | bool_variable_assignment
                     | string_variable_assignment
                     ;

string_variable_assignment : StringType ID  # stringDeclaration
                           | StringType ID Equals STRING # stringAssign
                           | ID Equals STRING  # stringAssignValue
                           ;

bool_variable_assignment : BoolType ID  # boolDeclaration
                         | BoolType ID Equals BOOLEAN  # boolAssign
                         | ID Equals BOOLEAN  # boolAssignValue
                         ;

int_variable_assignment :  IntType ID  # intDeclaration
                         | IntType ID Equals expression  # intAssign
                         | ID Equals expression  # intAssignValue
                         ;

expression:   expression op=MUL expression #  Mul
    |   expression op=DIV expression #  Div
    |   expression op=ADD expression #  Add
    |   expression op=SUB expression #  Sub
    |   expression op=POW expression #  Pow
    |   expression op=FACT  #  Fact
    |   PARANL expression PARANR  # parens
    |   ID    #ValueVariable
    |   BOOLEAN       #ValueBoolean
    |   INT        #ValueNumber
    |   STRING     #ValueString
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

Equals:      '=';

IntType: 'int';
BoolType: 'bool';
StringType: 'string';

DOT: '.';
COMMA: ',';
SEMICOLON: ';';
StringParen: '"';

Print: 'print';

INT     : SUB?[0-9]+(DOT[0-9]+)? ;
BOOLEAN: 'True'|'False';
ID: [_A-Za-z][A-Za-z_!0-9.]* ;
STRING : '"' ID '"';

COMMENT : '//' .+? ('\n'|EOF) -> skip;
WS  : [ \t\r\n]+ -> skip;