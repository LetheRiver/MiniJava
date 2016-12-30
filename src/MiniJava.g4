grammar MiniJava;

goal:mainclass ( classdeclaration )* EOF ;
mainclass:'class' identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' identifier ')' '{' statement '}' '}';
classdeclaration:'class' identifier ( 'extends' identifier )? '{' ( vardeclaration )* ( methoddeclaration )* '}';
vardeclaration:type identifier ';';
methoddeclaration:'public' type identifier '(' ( type identifier ( ',' type identifier )* )? ')' '{' ( vardeclaration )* ( statement )* 'return' expression ';' '}';
type:'int' '[' ']'
    |'boolean'
    |'int'
    |identifier
	;
statement:'{' ( statement )* '}' 
    |'if' '(' expression ')' statement 'else' statement 
    |'while' '(' expression ')' statement  
    |'System.out.println' '(' expression ')' ';'
    |identifier '=' expression ';' 
    |identifier '[' expression ']' '=' expression ';'
    ;

expression:andExpr;	

andExpr:andExpr '&&' lessExpr 
	| lessExpr 
	;
lessExpr:lessExpr '<' addExpr 
	| addExpr
	;
addExpr:addExpr '+' multiplyExpr 
    |addExpr '-' multiplyExpr 
	|multiplyExpr 
	;
multiplyExpr : multiplyExpr '*' notExpr 
	|notExpr 
	;
notExpr:'!' notExpr 
	|newarrayExpr 
	;
newarrayExpr:'new' 'int' '[' special ']' 
	|newidExpr 
	;
newidExpr:'new' identifier '(' ')' 
	|arrayExpr 
	;
arrayExpr:arrayExpr '[' special ']'
	|arrayExpr '.' 'length' 
	|arrayExpr '.' identifier '(' args ')'  
	|element
	;
element:integer
	|specialElement
	|identifier 
    |'('andExpr')'
	;
args:(special ( ',' special )*)?;
special:integer
	|specialElement
	|identifier 
    |andExpr
	;

specialElement:'true' | 'false';
identifier:Identifier;
integer:INTEGER_LITERAL;

Identifier:[A-Za-z][A-Za-z0-9_]*;
INTEGER_LITERAL:[0-9]+;
WS:[ \t\r\n]+ -> skip;


