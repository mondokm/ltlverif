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
		G_OP=19, INTLIT=20, BOOLLIT=21, ID=22, WS=23;
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
			"INTLIT", "BOOLLIT", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'and'", "'or'", "'->'", "'not'", "'='", "'/='", "'<'", "'>'", 
			"'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'F'", 
			"'G'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "IMPLIES", "NOT", "EQ", "NEQ", "LT", "GT", "LEQ", 
			"GEQ", "PLUS", "MINUS", "MUL", "DIV", "MOD", "LPAREN", "RPAREN", "F_OP", 
			"G_OP", "INTLIT", "BOOLLIT", "ID", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31{\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\6\25b\n\25"+
		"\r\25\16\25c\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26o\n\26\3"+
		"\27\3\27\7\27s\n\27\f\27\16\27v\13\27\3\30\3\30\3\30\3\30\2\2\31\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\6\3\2\62;\4\2C\\c|\6\2\62;C\\aa"+
		"c|\5\2\13\f\17\17\"\"\2}\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\65\3\2\2\2\78\3\2\2\2\t;\3\2\2"+
		"\2\13?\3\2\2\2\rA\3\2\2\2\17D\3\2\2\2\21F\3\2\2\2\23H\3\2\2\2\25K\3\2"+
		"\2\2\27N\3\2\2\2\31P\3\2\2\2\33R\3\2\2\2\35T\3\2\2\2\37V\3\2\2\2!X\3\2"+
		"\2\2#Z\3\2\2\2%\\\3\2\2\2\'^\3\2\2\2)a\3\2\2\2+n\3\2\2\2-p\3\2\2\2/w\3"+
		"\2\2\2\61\62\7c\2\2\62\63\7p\2\2\63\64\7f\2\2\64\4\3\2\2\2\65\66\7q\2"+
		"\2\66\67\7t\2\2\67\6\3\2\2\289\7/\2\29:\7@\2\2:\b\3\2\2\2;<\7p\2\2<=\7"+
		"q\2\2=>\7v\2\2>\n\3\2\2\2?@\7?\2\2@\f\3\2\2\2AB\7\61\2\2BC\7?\2\2C\16"+
		"\3\2\2\2DE\7>\2\2E\20\3\2\2\2FG\7@\2\2G\22\3\2\2\2HI\7>\2\2IJ\7?\2\2J"+
		"\24\3\2\2\2KL\7@\2\2LM\7?\2\2M\26\3\2\2\2NO\7-\2\2O\30\3\2\2\2PQ\7/\2"+
		"\2Q\32\3\2\2\2RS\7,\2\2S\34\3\2\2\2TU\7\61\2\2U\36\3\2\2\2VW\7\'\2\2W"+
		" \3\2\2\2XY\7*\2\2Y\"\3\2\2\2Z[\7+\2\2[$\3\2\2\2\\]\7H\2\2]&\3\2\2\2^"+
		"_\7I\2\2_(\3\2\2\2`b\t\2\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2d"+
		"*\3\2\2\2ef\7v\2\2fg\7t\2\2gh\7w\2\2ho\7g\2\2ij\7h\2\2jk\7c\2\2kl\7n\2"+
		"\2lm\7u\2\2mo\7g\2\2ne\3\2\2\2ni\3\2\2\2o,\3\2\2\2pt\t\3\2\2qs\t\4\2\2"+
		"rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u.\3\2\2\2vt\3\2\2\2wx\t\5\2\2"+
		"xy\3\2\2\2yz\b\30\2\2z\60\3\2\2\2\6\2cnt\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}