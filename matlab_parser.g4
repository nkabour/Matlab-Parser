grammar matlab_parser;

/*
* Parser rules
*/

script : command EOF ;

command : (var | array | ifstatment | elsestatment | elseifstatment | forstatment | NL |  WS ) command* ;

var : VARNAME ASSIGN INT ;

elseifstatment : ( IF condition (ifstatment)* (ELSEIF condition (ifstatment)*)+  ELSE (ifstatment)* END ) ;

elsestatment : ( IF condition (ifstatment)* ELSE (ifstatment)* END) ; 

ifstatment :  IF condition (ifstatment)* END   ;

forstatment : FOR range (forstatment)* END   ;

condition: ( relationalC CL relationalC | NEGATE '('relationalC CL relationalC')' | relationalC );

relationalC: ( VARNAME CR  VARNAME | NEGATE '(' VARNAME CR  VARNAME')' ) ;

range: VARNAME ASSIGN INT COLON INT ;

array : (VARNAME ASSIGN '['row ']' | VARNAME ASSIGN '['col']') ;

row : (INT COMMA row COMMA  INT | INT COMMA  INT |  INT  ) ;

col : (INT COMMA col COMMA  INT | INT col INT |  SEMICOLON  ) ;

/*
* lexer rules
*/

fragment I : ('i');
fragment F : ('f');
fragment E : ('e');
fragment L : ('l');
fragment S : ('s');
fragment N : ('n');
fragment D : ('d');
fragment O : ('o');
fragment R : ('r');

IF : I F ;
ELSE : E L S E ;
ELSEIF : E L S E I F ;
FOR : F O R ;
END : E N D;

fragment LE : '<=';
fragment GE : '>=';
fragment LT : '<' ;
fragment GT : '>' ;
fragment EQ : '==';
fragment NE : '!=';
fragment AND : '&&';
fragment OR : '||';


CR : ( LE | GE | LT | GT | EQ | NE) ;
CL : ( AND | OR ) ;
NEGATE : '~' ;
ASSIGN : '=' ;
COMMA : ',';
SEMICOLON : ';' ;
COLON : ':' ;

fragment LOWER : [a-z] ;
fragment UPPER : [A-Z] ;
VARNAME : (LOWER | UPPER )+ ;

fragment Digit : [0-9] ;
INT : Digit+ ;

WS : (' ' | '\t') -> skip ;
NL : ('\r'? '\n' | '\r')+ -> skip ;
