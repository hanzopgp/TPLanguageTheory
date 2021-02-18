grammar AnBn;

file
    :   anbn EOF ;

anbn
    :   A anbn B
    |    ;

A   :   'a';
B   :   'b';
C   :   'c';

UNMATCH :  . ->  skip;