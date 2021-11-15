parser grammar pseint_grammar;
options { tokenVocab = pseint_lexer;}
pseint:  funcion* algoritmo funcion* EOF;
funcion: (FUNCION|SUBPROCESO) NOMBREVARIABLE ASIGNACION NOMBREFUNCION APARENTESIS (NOMBREVARIABLE(COMA NOMBREVARIABLE)*)? CPARENTESIS SALTOLINEA
    bloque*
    (FINFUNCION|FINSUBPROCESO) SALTOLINEA;

algoritmo: (ALGORITMO|PROCESO) NOMBREALGORITMO SALTOLINEA
    bloque*
    (FINALGORITMO|FINPROCESO) SALTOLINEA;

//bloque
bloque: definicion|asignacion|escribir|leer|sientonces|segun|mientras|repetir|para;
//expansión de bloque
definicion: DEFINIR NOMBREVARIABLE COMO TIPOVARIABLE fininstruccion;

asignacion: NOMBREVARIABLE ASIGNACION operacion fininstruccion;

escribir: ESCRIBIR (NOMBREVARIABLE|ENTERO|REAL|LOGICO|CADENA) (COMA (NOMBREVARIABLE|ENTERO|REAL|LOGICO|CADENA))* fininstruccion;

leer: LEER NOMBREVARIABLE (COMA NOMBREVARIABLE)* fininstruccion;

sientonces: SI expresionlogica ENTONCES fininstruccion
    bloque+
    (SINO fininstruccion
    bloque+)?
    FINSI fininstruccion;

segun: SEGUN NOMBREVARIABLE HACER fininstruccion
    (ENTERO(COMA ENTERO)* DOSPUNTOS fininstruccion
    bloque*)*
    (DEOTROMODO DOSPUNTOS fininstruccion
    bloque*)?
    FINSEGUN fininstruccion;

mientras: MIENTRAS expresionlogica HACER fininstruccion
    bloque*
    FINMIENTRAS fininstruccion;

repetir: REPETIR fininstruccion
    bloque*
    HASTA expresionlogica fininstruccion;

para: PARA NOMBREVARIABLE ASIGNACION ENTERO HASTA ENTERO (CONPASO ENTERO)? HACER fininstruccion
    bloque*
    FINPARA fininstruccion;


expresionlogica:


operacion: (operando (operadores operando)*);
operadores: (MODULO|POTENCIACION|DIVISION|MULTIPLICACION|SUMA|RESTA);
operando: (NOMBREVARIABLE|ENTERO|REAL|(APARENTESIS operacion CPARENTESIS));

fininstruccion: ((PUNTOCOMA SALTOLINEA?)|SALTOLINEA);
