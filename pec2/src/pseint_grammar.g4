parser grammar pseint_grammar;
options { tokenVocab = pseint_lexer;}
pseint: SALTOLINEA* (funcion SALTOLINEA+)* algoritmo (SALTOLINEA+ funcion)* SALTOLINEA* EOF;

//funciones y procesos
funcion: (FUNCION|SUBPROCESO|SUBALGORITMO) NOMBRE ASIGNACION NOMBRE APARENTESIS (NOMBRE(COMA NOMBRE)*)? CPARENTESIS SALTOLINEA
    bloque*
    (FINFUNCION|FINSUBPROCESO|FINSUBALGORITMO);

algoritmo: (ALGORITMO|PROCESO) NOMBRE SALTOLINEA
    bloque*
    (FINALGORITMO|FINPROCESO);

//bloque
bloque: definicion|asignacion|escribir|leer|sientonces|segun|mientras|repetir|para|lineavacia;
//expansión de bloque
definicion: (DEFINIR NOMBRE COMO TIPOVARIABLE)
    | (DIMENSION NOMBRE ACORCHETE (ENTERO(COMA ENTERO)*) CCORCHETE)
    fininstruccion;

asignacion: NOMBRE ASIGNACION (operacion|expresionlogica) fininstruccion;

escribir: ESCRIBIR operacion (COMA operacion)* fininstruccion;

leer: LEER NOMBRE (COMA NOMBRE)* fininstruccion;
sientonces: SI expresionlogica ENTONCES fininstruccion
    bloque+
    (SINO fininstruccion
    bloque+)?
    FINSI fininstruccion;

segun: SEGUN NOMBRE HACER fininstruccion
    ((operacion|expresionlogica)(COMA (operacion|expresionlogica))* DOSPUNTOS fininstruccion
    bloque*)*
    (DEOTROMODO DOSPUNTOS fininstruccion
    bloque*)?
    FINSEGUN fininstruccion;

mientras: MIENTRAS expresionlogica HACER fininstruccion
    bloque*
    FINMIENTRAS fininstruccion;

repetir: REPETIR fininstruccion
    bloque*
    HASTAQUE expresionlogica fininstruccion;

para: PARA NOMBRE ASIGNACION ENTERO HASTA ENTERO (CONPASO ENTERO)? HACER fininstruccion
    bloque*
    FINPARA fininstruccion;

lineavacia: fininstruccion;

//operaciones y expresiones
expresionlogica: expresionlogica (IGUAL|DISTINTO|CONJUNCION|DISYUNCION|NEGACION) expresionlogica
    | APARENTESIS expresionlogica CPARENTESIS
    | operacion ((MAYOR|IGUAL|MENOR|DISTINTO|MENORIGUAL|MAYORIGUAL) operacion)+
    | LOGICO;

operacion: operacion operadores operacion
    |  (NOMBRE|ENTERO|REAL|LOGICO|CADENA|usodimension|usofuncion|(APARENTESIS operacion CPARENTESIS));
operadores: (MODULO|POTENCIACION|DIVISION|MULTIPLICACION|SUMA|RESTA);

usofuncion: NOMBRE APARENTESIS (operacion (COMA (operacion|expresionlogica))*)? CPARENTESIS;
usodimension: NOMBRE ACORCHETE (ENTERO(COMA ENTERO)*) CCORCHETE;

//fininstruccion
fininstruccion: ((PUNTOCOMA SALTOLINEA?)|SALTOLINEA);
