parser grammar pseint_grammar;
options { tokenVocab = pseint_lexer;}
pseint:  TIPOVARIABLE EOF;