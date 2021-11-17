lexer grammar pseint_lexer;
//Keywords
ALGORITMO:A L G O R I T M O;
FINALGORITMO:F I N ' '* A L G O R I T M O;
PROCESO: P R O C E S O;
FINPROCESO: F I N ' '* P R O C E S O;
FUNCION: F U N C I O N;
FINFUNCION:F I N ' '* F U N C I O N;
SUBPROCESO: S U B P R O C E S O;
FINSUBPROCESO: F I N ' '* S U B P R O C E S O;
SUBALGORITMO: S U B A L G O R I T M O;
FINSUBALGORITMO: F I N ' '* S U B A L G O R I T M O;
TIPOVARIABLE:(R E A L)|(E N T E R O)|(L O G I C O)|(C A R A C T E R);
DEFINIR: D E F I N I R;
COMO: C O M O;
LEER: L E E R;
ESCRIBIR:E S C R I B I R;
MIENTRAS: M I E N T R A S;
FINMIENTRAS: F I N ' '* M I E N T R A S;
PARA: P A R A;
FINPARA: F I N ' '* P A R A;
CONPASO: C O N ' '+ P A S O;
DIMENSION: D I M E N S I O N;
SI: S I;
FINSI: F I ' '* N S I;
ENTONCES: E N T O N C E S;
SINO: S I N O;
SEGUN: S E G U N;
HACER: H A C E R;
DEOTROMODO: D E ' '+ O T R O ' '+ M O D O;
FINSEGUN: F I N S E G U N;
REPETIR: R E P E T I R;
HASTAQUE: H A S T A ' '* Q U E;
HASTA: H A S T A;
ASIGNACION:'<-';
APARENTESIS:'(';
CPARENTESIS:')';
ACORCHETE:'[';
CCORCHETE:']';
PUNTOCOMA: ';';
SALTOLINEA: '\n';
COMA: ',';
DOSPUNTOS: ':';

//Operadores
MAYOR: '>';
MENOR: '<';
IGUAL: '=';
DISTINTO: '<>'|'!=';
MENORIGUAL: '<=';
MAYORIGUAL: '>=';
CONJUNCION: '&'|Y;
DISYUNCION: '|'|O;
NEGACION: '~'|(N O);
POTENCIACION:'^';
MODULO: '%'|(M O D);
MULTIPLICACION:'*';
DIVISION:'/';
SUMA:'+';
RESTA:'-';

//Funciones integradas

//Nombre Variable, funcion, algoritmo
NOMBRE:[A-Za-z][A-Za-z_0-9]*;
//Tipos de dato
ENTERO:[0-9]+;
REAL:[0-9]+('.'[0-9]+)?;
LOGICO: (V E R D A D E R O)|(F A L S O);
CADENA:(['"](ESCAPAR|~['"])*?['"]);


//saltar
COMENTARIOLINEA:('//'~[\n]*) -> skip;
COMENTARIOMULTILINEA:('/*'.*?'*/')-> skip;
WS:[ \t]+ -> skip;
//

fragment ESCAPAR:'\\'["'\\];
//Letras
fragment A:[Aa];
fragment B:[Bb];
fragment C:[Cc];
fragment D:[Dd];
fragment E:[Ee];
fragment F:[Ff];
fragment G:[Gg];
fragment H:[Hh];
fragment I:[Ii];
fragment J:[Jj];
fragment K:[Kk];
fragment L:[Ll];
fragment M:[Mm];
fragment N:[Nn];
fragment O:[Oo];
fragment P:[Pp];
fragment Q:[Qq];
fragment R:[Rr];
fragment S:[Ss];
fragment T:[Tt];
fragment U:[Uu];
fragment V:[Vv];
fragment W:[Ww];
fragment X:[Xx];
fragment Y:[Yy];
fragment Z:[Zz];
