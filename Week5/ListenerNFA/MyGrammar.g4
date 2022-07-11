grammar MyGrammar;

// rules
myStart        : statement EOF;

statement : checkSatResponse PARANL checkModelResponse PARANR;

checkSatResponse    : SAT | UNSAT | UNKNOWN;

checkModelResponse  :   MODEL? declarFun* ;

declarFun : PARANL DEFINE_FUN ID PARANL parameter* PARANR types expr* PARANR   # StatementFunction;

parameter: PARANL ID types PARANR;

types: STRING | BOOL | INT;

expr:
        ID                  # ValueVariable
      | BOOLEAN             # ValueBoolean
      | NUMBER              # ValueBasicNumber
      | TEXT                # ValueString
      | comparisonExpr      # ValueComparisonExpresssion
      | iteExpr             # StatementIfElse
      | logicalExpr         # ValueLogicalExpr
      | letExpr             # ValueLetExpr
      | mathExpr            # ValueMathExpr
      | func_call           # ValueFunc_call
      ;

func_call: PARANL (ID.PLUS | ID) expr*? PARANR;


iteExpr: PARANL ITE expr expr expr PARANR;

letExpr: PARANL LET PARANL expr+ PARANR expr PARANR;

logicalExpr :  PARANL OR expr*  PARANR
             | PARANL AND expr* PARANR
             | PARANL NOT expr PARANR;

comparisonExpr:
              PARANL LESS_THAN expr expr PARANR
            | PARANL GREATER_THAN expr expr PARANR
            | PARANL GREATER_THAN_OR_EQUAL expr expr PARANR
            | PARANL LESS_THAN_OR_EQUAL expr expr PARANR
            | PARANL EQUAL expr expr PARANR
            ;

mathExpr : PARANL PLUS expr* PARANR
         | PARANL MINUS expr* PARANR
         | PARANL DIVIDE expr* PARANR
         | PARANL MULTIPLY expr* PARANR;

//tokens
MODEL                   : 'model';
UNKNOWN                 : 'unknown';
ITE                     : 'ite';
GREATER_THAN            : '>' ;
LESS_THAN               : '<' ;
GREATER_THAN_OR_EQUAL   : '>=' ;
LESS_THAN_OR_EQUAL      : '<=' ;
PLUS                    :  '+';
MINUS                   :  '-';
DIVIDE                  :  '/';
MULTIPLY                :  '*';
STRING                  : 'String';
BOOL                    : 'Bool';
AND                     : 'and';
OR                      :  'or';
NOT                     : 'not';
LET                     :  'let';
EQUAL                   :  '=';
INT                     : 'Int';
NUMBER                  : [0-9]+;
TEXT                    : '"' ~('\r' | '\n' | '"')* '"';
UNSAT                   : 'unsat';
SAT                     : 'sat';
DEFINE_FUN              : 'define-fun';
BOOLEAN                 : 'true'| 'false';
ID                      :  [_A-Za-z][A-Za-z_!0-9.]* ;
PARANL                  : '(';
PARANR                  : ')';
NEWLINE                 : [ \t\r\n]+ -> skip;
