grammar Example2;

start2		: NEWLINE* statement (NEWLINE+ statement)* NEWLINE* EOF;

statement:   expression      #otherExpr
         |   value           #assign
         |   print_func      #print
         |   while_statement #while_stat
         |   if_statement    #if_stat
         |   NEWLINE         #newLine
         ;

print_func:   Print op=(INT| BOOLEAN |ID |STRING)  #printVar
          |   Print mathExpression                 #printExpr
          ;

value : int_variable
      | bool_variable
      | string_variable
      ;

if_statement
        :   'if' condition_block ('else if' condition_block)* ('else' code_block)?
        ;

while_statement
        :   'while' condition_block
        ;

condition_block
        :   '(' expression ')' code_block
        ;

code_block
        :   NEWLINE* '{' (NEWLINE*|statement*) '}'
        |   NEWLINE? statement
        ;

string_variable : StringType ID (Equals STRING)? # stringAssign
                | ID Equals STRING  # stringAssignValue
                ;

bool_variable : BoolType ID (Equals BOOLEAN)?  # boolAssign
              | ID Equals BOOLEAN  # boolAssignValue
              ;

int_variable :  IntType ID (Equals mathExpression)?        # intAssign
             |  ID Equals mathExpression                   # intAssignValue
             |  ID ('+='|'-='|'++'| '--') mathExpression?  # incrementAndDecrementInt
             ;


expression:   mathExpression #MathExp
          |   BOOLEAN        #ValueBoolean
          |   STRING         #ValueString
          |   expression ('<=' | '>=' | '<' | '>' | '==' | '!=') expression	# ComparisonExpression
          |   expression '&&' expression									# AndExpression
          |   expression '||' expression									# OrExpression
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
NEWLINE:   ('\r'? '\n');

Equals: '=';
MUL:    '*';
DIV:    '/';
ADD:    '+';
SUB:    '-';
POW:    '^';
FACT:   '!';
PARANL: '(';
PARANR: ')';

IntType: 'int';
BoolType: 'bool';
StringType: 'string';

DOT: '.';
COMMA: ',';
SEMICOLON: ';';

Print: 'print';

INT     : SUB?[0-9]+(DOT[0-9]+)? ;
BOOLEAN: 'True'|'False';
ID: [_A-Za-z][A-Za-z_!0-9.]* ;
STRING : '"' ~('\r' | '\n' | '"')* '"';

COMMENT : '//' .+? ('\n'|EOF) -> skip;
WS  : [ \t\r\n]+ -> skip;