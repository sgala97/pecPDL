parser grammar pseint_grammar;
options { tokenVocab = pseint_lexer;}
//pseint:  (instruccion (;|\n))* EOF;
declaracion: DEFINIR NOMBREVARIABLE COMO TIPOVARIABLE;
asignacion: NOMBREVARIABLE ASIGNACION operacion;

operacion: (operando (operadores operando)*);
operadores: (MODULO|POTENCIACION|DIVISION|MULTIPLICACION|SUMA|RESTA);
operando: (NOMBREVARIABLE|ENTERO|REAL|(APARENTESIS operacion CPARENTESIS));
