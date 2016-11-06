grammar PSeIntLanguage;

mainprocess	: 'main' LLIZ command LLDE 
			| EOF
			;
			
command 	: drawellipse command
			|
			;
			
drawellipse : 'drawRandomEllipse' SMCOLON ;

LINE_COMMENT: '//' ~[\r\n]* -> skip ;

WS		    : [ \t\r\n]+ -> skip ;

SMCOLON : ';' ;
COMA	: ',' ;

DOUBLE	: [0-9]+[.][0-9]+ ;
STRING : COMI ~( '\r' | '\n' | '"' )* COMI ;
INTEGER : [0-9]+ ;
BOOLEAN : ( TRUE | FALSE ) ;
TRUE	: [v|V][e|E][r|R][d|D][a|A][d|D][e|E][r|R][o|O] ;
FALSE	: [f|F][a|A][l|L][s|S][o|O] ;

COMI	: ( '"' | '\'' ) ;

LLIZ    : '{' ;
LLDE    : '}' ;

ID 		: [a-zA-Z][a-zA-Z0-9_]* ;
