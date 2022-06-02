grammar Example2;

// rules
start2		: checkSatResponse checkModelResponse EOF;

checkSatResponse    : SAT | UNSAT;

checkModelResponse  : PARANL model* PARANR;

model : (PARANL DEFINE_FUN ID PARANL PARANR INT NUMBER PARANR)    #modelR;

//tokens
MODEL              : 'model';
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
