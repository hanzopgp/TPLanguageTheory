// Generated from C:/Users/karna/Desktop/JavaProject/TPLanguageTheory/src/TP3\JetonsJava.g4 by ANTLR 4.9.1
package TP3;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JetonsJava extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPERATEUR=1, MOTCLE=2, IDENTIFIANT=3, WHITE_SPACE=4, UNMATCH=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OPERATEUR", "MOTCLE", "IDENTIFIANT", "WHITE_SPACE", "UNMATCH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPERATEUR", "MOTCLE", "IDENTIFIANT", "WHITE_SPACE", "UNMATCH"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public JetonsJava(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JetonsJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7W\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\5\2\30\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3H\n\3\3\4"+
		"\3\4\7\4L\n\4\f\4\16\4O\13\4\3\5\6\5R\n\5\r\5\16\5S\3\6\3\6\2\2\7\3\3"+
		"\5\4\7\5\t\6\13\7\3\2\5\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2"+
		"e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\27\3"+
		"\2\2\2\5G\3\2\2\2\7I\3\2\2\2\tQ\3\2\2\2\13U\3\2\2\2\r\30\7>\2\2\16\17"+
		"\7>\2\2\17\30\7?\2\2\20\30\7@\2\2\21\22\7@\2\2\22\30\7?\2\2\23\24\7?\2"+
		"\2\24\30\7?\2\2\25\26\7#\2\2\26\30\7?\2\2\27\r\3\2\2\2\27\16\3\2\2\2\27"+
		"\20\3\2\2\2\27\21\3\2\2\2\27\23\3\2\2\2\27\25\3\2\2\2\30\4\3\2\2\2\31"+
		"\32\7d\2\2\32\33\7t\2\2\33\34\7g\2\2\34\35\7c\2\2\35H\7m\2\2\36\37\7e"+
		"\2\2\37 \7n\2\2 !\7c\2\2!\"\7u\2\2\"H\7u\2\2#$\7f\2\2$%\7q\2\2%&\7w\2"+
		"\2&\'\7d\2\2\'(\7n\2\2(H\7g\2\2)*\7g\2\2*+\7n\2\2+,\7u\2\2,H\7g\2\2-."+
		"\7k\2\2.H\7h\2\2/\60\7k\2\2\60\61\7o\2\2\61\62\7r\2\2\62\63\7q\2\2\63"+
		"\64\7t\2\2\64H\7v\2\2\65\66\7r\2\2\66\67\7w\2\2\678\7d\2\289\7n\2\29:"+
		"\7k\2\2:H\7e\2\2;<\7u\2\2<=\7v\2\2=>\7c\2\2>?\7v\2\2?@\7k\2\2@H\7e\2\2"+
		"AB\7v\2\2BC\7j\2\2CD\7t\2\2DE\7q\2\2EF\7y\2\2FH\7u\2\2G\31\3\2\2\2G\36"+
		"\3\2\2\2G#\3\2\2\2G)\3\2\2\2G-\3\2\2\2G/\3\2\2\2G\65\3\2\2\2G;\3\2\2\2"+
		"GA\3\2\2\2H\6\3\2\2\2IM\t\2\2\2JL\t\3\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2"+
		"\2MN\3\2\2\2N\b\3\2\2\2OM\3\2\2\2PR\t\4\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2"+
		"\2\2ST\3\2\2\2T\n\3\2\2\2UV\13\2\2\2V\f\3\2\2\2\7\2\27GMS\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}