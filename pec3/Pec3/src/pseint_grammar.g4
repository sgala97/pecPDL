parser grammar pseint_grammar;
options { tokenVocab = pseint_lexer;}
@header
{
    package gen;
}
pseint: lineavacia* (funcion lineavacia+)* algoritmo (lineavacia+ funcion)* lineavacia* EOF;

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
definicion: ((DEFINIR NOMBRE COMO TIPOVARIABLE)
    | (DIMENSION NOMBRE ACORCHETE (operacion(COMA operacion)*) CCORCHETE))
    fininstruccion;

asignacion: NOMBRE (ACORCHETE (operacion(COMA operacion)*) CCORCHETE)? ASIGNACION operacion fininstruccion;

escribir: ESCRIBIR operacion (COMA operacion)* fininstruccion;

leer: LEER NOMBRE (COMA NOMBRE)* fininstruccion;

bloquesi: bloque+;
bloqueno: bloque+;
sientonces: SI operacion ENTONCES fininstruccion
    bloquesi
    (SINO fininstruccion bloqueno)?
    FINSI fininstruccion;

segun: SEGUN NOMBRE HACER fininstruccion
    caso*
    (DEOTROMODO DOSPUNTOS fininstruccion
    bloque*)?
    FINSEGUN fininstruccion;

caso: (operacion(COMA operacion)* DOSPUNTOS fininstruccion bloque*);

mientras: MIENTRAS operacion HACER fininstruccion
    bloque*
    FINMIENTRAS fininstruccion;

repetir: REPETIR fininstruccion
    bloque*
    HASTAQUE operacion fininstruccion;

para: PARA NOMBRE ASIGNACION ENTERO HASTA ENTERO (CONPASO ENTERO)? HACER fininstruccion
    bloque*
    FINPARA fininstruccion;

lineavacia: SALTOLINEA;

//fininstruccion
fininstruccion: ((PUNTOCOMA SALTOLINEA?)|SALTOLINEA);

//operaciones
operacion: (RESTA|SUMA) operacion #conOperadores
    |   operacion (POTENCIACION) operacion #conOperadores
    |   operacion (MODULO|DIVISION|MULTIPLICACION) operacion #conOperadores
    |   operacion (SUMA|RESTA) operacion #conOperadores
    |   operacion (MAYOR|IGUAL|MENOR|DISTINTO|MENORIGUAL|MAYORIGUAL) operacion #conOperadores
    |   NEGACION operacion #conOperadores
    |   operacion (CONJUNCION|DISYUNCION) operacion #conOperadores
    |  (NOMBRE|ENTERO|REAL|LOGICO|CADENA|usodimension|usofuncion|(APARENTESIS operacion CPARENTESIS)) #sinOperadores;


usofuncion: NOMBRE APARENTESIS (operacion (COMA operacion)*)? CPARENTESIS;
usodimension: NOMBRE ACORCHETE ENTERO (COMA ENTERO)* CCORCHETE;

