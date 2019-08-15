// Generated from /home/milan/programming/ltlverif/src/main/java/hu/mondokm/ltlverif/antlr/LTLGrammar.g4 by ANTLR 4.7.2
package hu.mondokm.ltlverif.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LTLGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, IMPLIES=3, NOT=4, EQ=5, NEQ=6, LT=7, GT=8, LEQ=9, GEQ=10, 
		PLUS=11, MINUS=12, MUL=13, DIV=14, MOD=15, LPAREN=16, RPAREN=17, F_OP=18, 
		G_OP=19, U_OP=20, W_OP=21, M_OP=22, R_OP=23, INTLIT=24, BOOLLIT=25, ID=26, 
		WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AND", "OR", "IMPLIES", "NOT", "EQ", "NEQ", "LT", "GT", "LEQ", "GEQ", 
			"PLUS", "MINUS", "MUL", "DIV", "MOD", "LPAREN", "RPAREN", "F_OP", "G_OP", 
			"U_OP", "W_OP", "M_OP", "R_OP", "INTLIT", "BOOLLIT", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'and'", "'or'", "'->'", "'not'", "'='", "'/='", "'<'", "'>'", 
			"'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'F'", 
			"'G'", "'U'", "'W'", "'M'", "'R'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "IMPLIES", "NOT", "EQ", "NEQ", "LT", "GT", "LEQ", 
			"GEQ", "PLUS", "MINUS", "MUL", "DIV", "MOD", "LPAREN", "RPAREN", "F_OP", 
			"G_OP", "U_OP", "W_OP", "M_OP", "R_OP", "INTLIT", "BOOLLIT", "ID", "WS"
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


	public LTLGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LTLGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u008b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\6\31r\n\31\r\31\16\31s\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\5\32\177\n\32\3\33\3\33\7\33\u0083\n\33\f\33\16\33\u0086\13\33\3\34"+
		"\3\34\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\35\3\2\6\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\""+
		"\2\u008d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2"+
		"\2\2\5=\3\2\2\2\7@\3\2\2\2\tC\3\2\2\2\13G\3\2\2\2\rI\3\2\2\2\17L\3\2\2"+
		"\2\21N\3\2\2\2\23P\3\2\2\2\25S\3\2\2\2\27V\3\2\2\2\31X\3\2\2\2\33Z\3\2"+
		"\2\2\35\\\3\2\2\2\37^\3\2\2\2!`\3\2\2\2#b\3\2\2\2%d\3\2\2\2\'f\3\2\2\2"+
		")h\3\2\2\2+j\3\2\2\2-l\3\2\2\2/n\3\2\2\2\61q\3\2\2\2\63~\3\2\2\2\65\u0080"+
		"\3\2\2\2\67\u0087\3\2\2\29:\7c\2\2:;\7p\2\2;<\7f\2\2<\4\3\2\2\2=>\7q\2"+
		"\2>?\7t\2\2?\6\3\2\2\2@A\7/\2\2AB\7@\2\2B\b\3\2\2\2CD\7p\2\2DE\7q\2\2"+
		"EF\7v\2\2F\n\3\2\2\2GH\7?\2\2H\f\3\2\2\2IJ\7\61\2\2JK\7?\2\2K\16\3\2\2"+
		"\2LM\7>\2\2M\20\3\2\2\2NO\7@\2\2O\22\3\2\2\2PQ\7>\2\2QR\7?\2\2R\24\3\2"+
		"\2\2ST\7@\2\2TU\7?\2\2U\26\3\2\2\2VW\7-\2\2W\30\3\2\2\2XY\7/\2\2Y\32\3"+
		"\2\2\2Z[\7,\2\2[\34\3\2\2\2\\]\7\61\2\2]\36\3\2\2\2^_\7\'\2\2_ \3\2\2"+
		"\2`a\7*\2\2a\"\3\2\2\2bc\7+\2\2c$\3\2\2\2de\7H\2\2e&\3\2\2\2fg\7I\2\2"+
		"g(\3\2\2\2hi\7W\2\2i*\3\2\2\2jk\7Y\2\2k,\3\2\2\2lm\7O\2\2m.\3\2\2\2no"+
		"\7T\2\2o\60\3\2\2\2pr\t\2\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2"+
		"t\62\3\2\2\2uv\7v\2\2vw\7t\2\2wx\7w\2\2x\177\7g\2\2yz\7h\2\2z{\7c\2\2"+
		"{|\7n\2\2|}\7u\2\2}\177\7g\2\2~u\3\2\2\2~y\3\2\2\2\177\64\3\2\2\2\u0080"+
		"\u0084\t\3\2\2\u0081\u0083\t\4\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\66\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0087\u0088\t\5\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\34\2\2"+
		"\u008a8\3\2\2\2\6\2s~\u0084\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}