grammar MyGrammar;
// rules
myStart :  statement+ EOF
        ;
statement:   expression # otherExpression
         |   assign_var   # assignment
         |   print_statement  # printAssignment
         |   if_statement  # ifStatement
         |   while_statement # whileStatement
         |   for_statement # forStatement
         ;

while_statement : WHILE condition_block
                ;
assign_var : IDENTIFIER EQUAL expression
           ;

print_statement :  PRINT expression
                ;

for_statement : FOR PARANL statement SEMICOLON expression PARANR statement_block
              ;

if_statement : IF condition_block (ELSE IF condition_block)* (ELSE statement_block)?
             ;

condition_block : expression statement_block
                | expression
                ;

statement_block : OPEN_CURLY_BRACKET statement CLOSE_CURLY_BRACKET
                | statement
                ;

expression :   expression op=MUL expression #  Mul
           |   expression op=DIV expression #  Div
           |   expression op=ADD expression #  Add
           |   expression op=SUB expression #  Sub
           |   expression op=POW expression #  Pow
           |   expression op=FACT  #  Fact
           |   NOT expression  # Not
           |   expression AND expression   # And
           |   expression OR expression    # Or
           |   expression op=(LTEQ | GTEQ | LT | GT) expression   #Relational
           |   expression op=(EQ | NEQ) expression  #Equality
           |   INT   # int
           |   BOOL # bool
           |   STRING #string
           |   IDENTIFIER # identifier
           |   PARANL expression PARANR  # parens
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

EQUAL:  '=';
EQ : '==';
NEQ : '!=';
LTEQ : '<=';
GTEQ : '>=';
LT : '<';
GT : '>';
NOT : 'not';
AND : '&&';
OR : '||';
OPEN_CURLY_BRACKET : '{';
CLOSE_CURLY_BRACKET : '}';

IF : 'if';
ELSE : 'else';
WHILE : 'while';
FOR : 'for';
SEMICOLON : ';';

PRINT:  'print';
IDENTIFIER : [_A-Za-z][A-Za-z_!0-9.]* ;
INT     : [0-9]+ ;
BOOL : 'TRUE' | 'FALSE';
STRING : '"' (~["])+ '"';
COMMENT : '//' .+? ('\n'|EOF) -> skip ;
WS  : [ \t\r\n]+ -> skip;
