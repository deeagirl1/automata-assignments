grammar Example2;

// rules
start2		: checkSatResponse checkModelResponse EOF;

checkSatResponse    : SAT | UNSAT;

checkModelResponse  : PARANL model* PARANR;

model : (PARANL DEFINE_FUN ID PARANL PARANR INT NUMBER PARANR)             #modelR
      | (PARANL DEFINE_FUN ID PARANL define define PARANR INT) checkOut*    #modelB;

checkOut: (PARANL ITE PARANL AND output output PARANR NUMBER) NUMBER? PARANR* ;

output: PARANL EQUAL ID NUMBER PARANR;
define: PARANL ID INT PARANR;

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
