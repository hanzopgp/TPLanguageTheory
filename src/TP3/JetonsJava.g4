lexer grammar JetonsJava;

OPERATEUR:
	('<' | '<=' | '>' | '>=' | '==' | '!=') { System.out.print(getText()); };

MOTCLE:
	(
		'break'
		| 'class'
		| 'float'
		| 'long'
		| 'double'
		| 'else'
		| 'if'
		| 'import'
		| 'public'
		| 'protected'
		| 'private'
		| 'static'
		| 'abstract'
		| 'throws'
		| 'throw'
		| 'new'
	) { System.out.print("[motcle : " + getText() + " ]"); };

IDENTIFIANT: (
		('a' ..'z' | 'A' ..'Z' | '_') (
			'a' ..'z'
			| 'A' ..'Z'
			| '_'
			| '0' ..'9'
		)*
	) {
System.out.print("[ident : " + getText() + " ]"); };

WHITE_SPACE: (('_' | '\n' | '\t' | '\r')+) { System.out.print(getText()); };

fragment EXPOSANT: ('e' | 'E') ('+' | '-')? ('0' ..'9')+;

NUMBER: (
		('+' | '-')? ('0' ..'9')+ (('.') ('0' ..'9')*)? EXPOSANT? )
		{ System.out.print("[number : " + getText() + " ]"); };

SIGNLE_LINE_COMMENT:
	('//' .*?)
	{ System.out.print("[comment : " + getText() + " ]"); };

MULTIPLE_LINES_COMMENT: ('/*' .*? '*/')
{ System.out.print("[multiple line comment : " + getText() + " ]"); };

UNMATCH: . { System.out.print(getText()); };
