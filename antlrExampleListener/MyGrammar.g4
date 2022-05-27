grammar MyGrammar;

// rules
myStart :  statement + EOF;

statement:   expression     #otherExpr
         |   variable_declaration # assign
         |   Print op=(INT| BOOLEAN |ID |STRING)  # printVar
         |   Print mathExpression  # printExpr
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
                         | IntType ID Equals mathExpression  # intAssign
                         | ID Equals mathExpression  # intAssignValue
                         ;

expression:   mathExpression #MathExp
          |   BOOLEAN       #ValueBoolean
          |   STRING     #ValueString
          ;

mathExpression:  mathExpression op=MUL mathExpression #  Mul
             |   mathExpression op=DIV mathExpression #  Div
             |   mathExpression op=ADD mathExpression #  Add
             |   mathExpression op=SUB mathExpression #  Sub
             |   mathExpression op=POW mathExpression #  Pow
             |   mathExpression op=FACT  #  Fact
             |   PARANL mathExpression PARANR  # parens
             |   INT #ValueNumber
             |   ID    #ValueVariable
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