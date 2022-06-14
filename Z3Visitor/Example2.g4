grammar Example2;

// rules
start2        : statement EOF;


statement : checkSatResponse checkModelResponse;

checkSatResponse    : SAT | UNSAT | UNKNOWN;

checkModelResponse  : PARANL  MODEL? (declarFun | expr) PARANR;

declarFun : PARANL DEFINE_FUN ID PARANL global_declarations* PARANR types expr* PARANR   #modelR;

//ite: PARANL ITE PARANL AND get_assignment* PARANR NUMBER (NUMBER| ite| BOOLEAN)* PARANR;

global_declarations: PARANL ID types PARANR;

types: STRING | BOOL | INT;

expr: andExpr | orExpr | iteExpr | logicalExpr | returnExpr | letExpr |mathExpr | func_call  ;

func_call: PARANL ID expr*? PARANR;

andExpr: PARANL AND expr* PARANR;

returnExpr: TEXT | BOOLEAN | NUMBER | ID;

orExpr: PARANL OR expr* PARANR;

iteExpr: PARANL ITE expr expr expr PARANR;

letExpr: PARANL LET PARANL PARANL  ID  expr* PARANR PARANR;

logicalExpr: PARANL '<' expr* PARANR
            |PARANL '>' expr* PARANR
            |PARANL '>=' expr* PARANR
            |PARANL '<=' expr* PARANR
            |PARANL '=' expr* PARANR
            |PARANL 'not' expr* PARANR ;

mathExpr: PARANL '+' expr* PARANR
        | PARANL '-' expr* PARANR
        | PARANL '/' expr* PARANR
        | PARANL '*' expr* PARANR;

//tokens
MODEL              : 'model';
UNKNOWN            : 'unknown';
ITE                : 'ite';
STRING             : 'String';
BOOL               : 'Bool';
AND                : 'and';
OR                 :  'or';
LET                :  'let';
EQUAL              :  '=';
INT                : 'Int';
NUMBER             : [0-9]+;
TEXT               : '"' ~('\r' | '\n' | '"')* '"';
UNSAT              : 'unsat';
SAT                : 'sat';
DEFINE_FUN         : 'define-fun';
BOOLEAN            : 'true'| 'false';
ID                 :  [_A-Za-z][A-Za-z_!0-9.]* ;
PARANL             : '(';
PARANR             : ')';
NEWLINE            : [ \t\r\n]+ -> skip;