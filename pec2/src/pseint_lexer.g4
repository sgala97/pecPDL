lexer grammar pseint_lexer;
ENTERO:[0-9]+;
CADENA:('\''(ESCAPAR|.)*?'\'')|('"'(ESCAPAR|.)*?'"');
fragment ESCAPAR:'\\'["'\\];

//Keywords
ALGORITMO:A L G O R I T M O;
FUNCION: F U N C I O N;

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
