grammar Example2;

// rules
start2		: checkSatResponse checkModelResponse EOF;

checkSatResponse    : SAT | UNSAT;

checkModelResponse  : PARANL model* PARANR;

model : (PARANL DEFINE_FUN ID PARANL PARANR INT NUMBER PARANR)                           #modelR
      | (PARANL DEFINE_FUN ID PARANL global_declarations* PARANR INT) ite PARANR         #modelB;

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
