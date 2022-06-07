grammar Example2;

start2		: statement* EOF;

statement:   variables
         |   print_func
         |   while_statement
         |   if_statement
         |   function_declaration
         |   function_call
         |   returnStat
         |   expression
         ;

print_func:   Print op=(INT| BOOLEAN |ID |STRING)  #printVar
          |   Print mathExpression                 #printExpr
          ;

variables : int_variable
          | bool_variable
          | string_variable
          ;


returnStat: RETURN expression;

variables_type: IntType| BoolType | StringType;

parameters_funcDec:  (variables_type ID (COMMA variables_type ID)*)? ;

parameters_funcCall:  (expression (COMMA expression)*)? ;

function_declaration : FUNCTION ID PARANL parameters_funcDec PARANR code_block;

function_call : ID PARANL parameters_funcCall PARANR;

if_statement:   IF condition_block (ELSE code_block)?;

while_statement: WHILE condition_block;

condition_block: PARANL expression PARANR code_block;

code_block:   OPEN_CURLY_BRACKET statement* CLOSE_CURLY_BRACKET
          |   statement
          ;

string_variable : StringType ID (IS_EQUAL STRING)? # stringAssign
                | ID IS_EQUAL STRING  # stringAssignValue
                ;

bool_variable : BoolType ID (IS_EQUAL BOOLEAN)?  # boolAssign
              | ID IS_EQUAL BOOLEAN  # boolAssignValue
              ;

int_variable :  IntType ID (IS_EQUAL mathExpression)?        # intAssign
             |  ID IS_EQUAL mathExpression                   # intAssignValue
             |  ID (ADD_INCREMENT| SUB_INCREMENT | INCREMENT | DECREMENT) mathExpression?  # incrementAndDecrementInt
             ;

expression:   mathExpression #MathExp
          |   BOOLEAN        #ValueBoolean
          |   STRING         #ValueString
          |   expression (GREATER_OR_EQUAL | SMALLER_OR_EQUAL | GREATHER_THAN | SMALLER_THAN | EQUAL | NOT_EQUAL) expression	# ComparisonExpression
          |   expression AND expression									# AndExpression
          |   expression OR expression									# OrExpression
          |   function_call                                             # FUNCTIONExpr
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
             |   function_call                                        # FUNCTIONMathExpr
             ;


// tokens
IS_EQUAL: '=';
MUL:    '*';
DIV:    '/';
ADD:    '+';
SUB:    '-';
POW:    '^';
FACT:   '!';
PARANL: '(';
PARANR: ')';
DOT : '.';

ADD_INCREMENT : '+=';
SUB_INCREMENT : '-=';
INCREMENT : '++';
DECREMENT : '--';

OPEN_CURLY_BRACKET : '{';
CLOSE_CURLY_BRACKET : '}';

AND : 'and';
OR : 'or';

GREATER_OR_EQUAL : '>=';
SMALLER_OR_EQUAL : '<=';
GREATHER_THAN : '>';
SMALLER_THAN : '<';
EQUAL : '==';
NOT_EQUAL : '!=';


IntType: 'int';
BoolType: 'bool';
StringType: 'string';

WHILE : 'while';
COMMA: ',';
SEMICOLON: ';';

IF : 'if';
ELSE : 'else';
FOR : 'for';

VOID : 'void';
RETURN: 'return';
FUNCTION: 'function';
Print: 'print';

INT     : SUB?[0-9]+(DOT[0-9]+)? ;
BOOLEAN: 'True'|'False';
ID: [_A-Za-z][A-Za-z_!0-9.]* ;
STRING : '"' ~('\r' | '\n' | '"')* '"';

COMMENT : '//' .+? ('\n'|EOF) -> skip;
WS  : [ \t\r\n]+ -> skip;