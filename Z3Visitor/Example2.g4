grammar Example2;

// rules
start2		: statement* EOF;


statement : checkSatResponse
          | checkModelResponse
          ;

checkSatResponse    : SAT | UNSAT | UNKNOWN;

checkModelResponse  : PARANL model* PARANR;

model : (PARANL DEFINE_FUN ID PARANL global_declarations* PARANR INT) (NUMBER | ite)  PARANR   #modelR;

ite: PARANL ITE PARANL AND get_assignment* PARANR NUMBER (NUMBER| ite)* PARANR;

get_assignment: PARANL EQUAL ID NUMBER PARANR;

global_declarations: PARANL ID INT PARANR;

//tokens
MODEL              : 'model';
ITE                : 'ite';
AND                : 'and';
EQUAL              :  '=';
INT                : 'Int';
NUMBER             : [0-9]+;
TEXT               : '"' ~('\r' | '\n' | '"')* '"';
UNSAT              : 'unsat';
SAT                : 'sat';
DEFINE_FUN         : 'define-fun';
ID                 :  [_A-Za-z][A-Za-z_!0-9.]* ;
PARANL             : '(';
PARANR             : ')';
NEWLINE            : [ \t\r\n]+ -> skip;
