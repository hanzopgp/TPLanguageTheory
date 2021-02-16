lexer grammar JetonsJava;

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

UNMATCH
    : .
    ;