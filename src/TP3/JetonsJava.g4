lexer grammar JetonsJava; // declaration definissant le nom de la grammaire :

// identifiant : expression-réguliere { instructions-java  } ;

// identifiant toujours en majuscule

// pour regexp :
// 1) litteraux entre simple quote
// 2) un point pour un caractere quelconque
// 3) une intervalle de caractere avec ".." ou entre crochets comme par ex. pour un chiffre decimal : '0'..'9' ou [0-9]
// 4) operateurs :
// concatenation : rien
// alternative : |
// parenthesage : (et)
// multiplicateur 0 ou 1 fois : ?
// multiplicateur 1 ou n fois : +
// multiplicateur 0 ou n fois : *
// negation : ~

// Isolation de jetons dans un code source Java

OPERATEUR
    : '<'|'<='|'>'|'>='|'=='|'!='
;

MOTCLE
    :  'break' | 'class' | 'double' | 'else' | 'if' | 'import' | 'public' | 'static' | 'throws'
;

IDENTIFIANT
    :   ('a'..'z' | 'A'..'Z' | '_')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*
;

WHITE_SPACE
    : (' '|'\n'|'\t'|'\r')+
;

UNMATCH // regle correspondant au reste :
    : .
;