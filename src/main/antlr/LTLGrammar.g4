/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar LTLGrammar;

model:
	rules+=implyExpression*;

implyExpression:
	ops+=orExpr (IMPLIES ops+=orExpr)?
;

orExpr:
	ops+=andExpr (OR ops+=andExpr)*
;

andExpr:
	ops+=notExpr (AND ops+=notExpr)*
;

notExpr:
	binaryLtlExpr|
	NOT ops+=notExpr
;

binaryLtlExpr:
    ltlExpr |
    op1=binaryLtlExpr type=binaryLtlOp op2=binaryLtlExpr;

binaryLtlOp:
    M_OP | W_OP | U_OP | R_OP;

ltlExpr:
	eqExpr |
	type=ltlOp ops+=ltlExpr
;

ltlOp:
         F_OP|G_OP
     ;

eqExpr:
	ops+=relationExpr (oper=eqOperator ops+=relationExpr)?
;

eqOperator:
	EQ|NEQ
;

relationExpr:
	ops+=additiveExpr (oper=relationOperator ops+=additiveExpr)?
;

relationOperator:
	LT|GT|LEQ|GEQ
;

additiveExpr:
	ops+=multiplicativeExpr (opers+=additiveOperator ops+=multiplicativeExpr)*
;

additiveOperator:
	PLUS|MINUS
;

multiplicativeExpr:
	ops+=negExpr (opers+=multiplicativeOperator ops+=negExpr)*
;

multiplicativeOperator:
	MUL|DIV|MOD
;

negExpr:
	primaryExpr|
	MINUS ops+=negExpr
;

primaryExpr:
	boolLitExpr|
	intLitExpr|
	parenExpr
;

boolLitExpr:
	value=BOOLLIT
;

parenExpr:
	LPAREN ops+=implyExpression RPAREN | variable
;

intLitExpr:
	value=INTLIT
;

variable:
	name=ID
;

AND: 'and';
OR: 'or';
IMPLIES: '->';
NOT: 'not';
EQ: '=';
NEQ: '/=';
LT: '<';
GT: '>';
LEQ: '<=';
GEQ: '>=';
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
MOD: '%';
LPAREN: '(';
RPAREN: ')';
F_OP: 'F';
G_OP: 'G';
U_OP: 'U';
W_OP: 'W';
M_OP: 'M';
R_OP: 'R';
INTLIT: [0-9]+;
BOOLLIT: 'true' | 'false';
ID: [a-zA-Z][a-zA-Z0-9_]*;
WS: (' '| '\t' | '\n' | '\r') -> skip;

