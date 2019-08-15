// Generated from /home/milan/programming/ltlverif/src/main/java/hu/mondokm/ltlverif/antlr/LTLGrammar.g4 by ANTLR 4.7.2
package hu.mondokm.ltlverif.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LTLGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, IMPLIES=3, NOT=4, EQ=5, NEQ=6, LT=7, GT=8, LEQ=9, GEQ=10, 
		PLUS=11, MINUS=12, MUL=13, DIV=14, MOD=15, LPAREN=16, RPAREN=17, F_OP=18, 
		G_OP=19, U_OP=20, W_OP=21, M_OP=22, R_OP=23, INTLIT=24, BOOLLIT=25, ID=26, 
		WS=27;
	public static final int
		RULE_model = 0, RULE_implyExpression = 1, RULE_orExpr = 2, RULE_andExpr = 3, 
		RULE_notExpr = 4, RULE_binaryLtlExpr = 5, RULE_binaryLtlOp = 6, RULE_ltlExpr = 7, 
		RULE_ltlOp = 8, RULE_eqExpr = 9, RULE_eqOperator = 10, RULE_relationExpr = 11, 
		RULE_relationOperator = 12, RULE_additiveExpr = 13, RULE_additiveOperator = 14, 
		RULE_multiplicativeExpr = 15, RULE_multiplicativeOperator = 16, RULE_negExpr = 17, 
		RULE_primaryExpr = 18, RULE_boolLitExpr = 19, RULE_parenExpr = 20, RULE_intLitExpr = 21, 
		RULE_variable = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"model", "implyExpression", "orExpr", "andExpr", "notExpr", "binaryLtlExpr", 
			"binaryLtlOp", "ltlExpr", "ltlOp", "eqExpr", "eqOperator", "relationExpr", 
			"relationOperator", "additiveExpr", "additiveOperator", "multiplicativeExpr", 
			"multiplicativeOperator", "negExpr", "primaryExpr", "boolLitExpr", "parenExpr", 
			"intLitExpr", "variable"
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

	@Override
	public String getGrammarFileName() { return "LTLGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LTLGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ModelContext extends ParserRuleContext {
		public ImplyExpressionContext implyExpression;
		public List<ImplyExpressionContext> rules = new ArrayList<ImplyExpressionContext>();
		public List<ImplyExpressionContext> implyExpression() {
			return getRuleContexts(ImplyExpressionContext.class);
		}
		public ImplyExpressionContext implyExpression(int i) {
			return getRuleContext(ImplyExpressionContext.class,i);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).exitModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTLGrammarVisitor ) return ((LTLGrammarVisitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << MINUS) | (1L << LPAREN) | (1L << F_OP) | (1L << G_OP) | (1L << INTLIT) | (1L << BOOLLIT) | (1L << ID))) != 0)) {
				{
				{
				setState(46);
				((ModelContext)_localctx).implyExpression = implyExpression();
				((ModelContext)_localctx).rules.add(((ModelContext)_localctx).implyExpression);
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplyExpressionContext extends ParserRuleContext {
		public OrExprContext orExpr;
		public List<OrExprContext> ops = new ArrayList<OrExprContext>();
		public List<OrExprContext> orExpr() {
			return getRuleContexts(OrExprContext.class);
		}
		public OrExprContext orExpr(int i) {
			return getRuleContext(OrExprContext.class,i);
		}
		public TerminalNode IMPLIES() { return getToken(LTLGrammarParser.IMPLIES, 0); }
		public ImplyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).enterImplyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).exitImplyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTLGrammarVisitor ) return ((LTLGrammarVisitor<? extends T>)visitor).visitImplyExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplyExpressionContext implyExpression() throws RecognitionException {
		ImplyExpressionContext _localctx = new ImplyExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_implyExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			((ImplyExpressionContext)_localctx).orExpr = orExpr();
			((ImplyExpressionContext)_localctx).ops.add(((ImplyExpressionContext)_localctx).orExpr);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLIES) {
				{
				setState(53);
				match(IMPLIES);
				setState(54);
				((ImplyExpressionContext)_localctx).orExpr = orExpr();
				((ImplyExpressionContext)_localctx).ops.add(((ImplyExpressionContext)_localctx).orExpr);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrExprContext extends ParserRuleContext {
		public AndExprContext andExpr;
		public List<AndExprContext> ops = new ArrayList<AndExprContext>();
		public List<AndExprContext> andExpr() {
			return getRuleContexts(AndExprContext.class);
		}
		public AndExprContext andExpr(int i) {
			return getRuleContext(AndExprContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(LTLGrammarParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(LTLGrammarParser.OR, i);
		}
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTLGrammarVisitor ) return ((LTLGrammarVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExprContext orExpr() throws RecognitionException {
		OrExprContext _localctx = new OrExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_orExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			((OrExprContext)_localctx).andExpr = andExpr();
			((OrExprContext)_localctx).ops.add(((OrExprContext)_localctx).andExpr);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(58);
				match(OR);
				setState(59);
				((OrExprContext)_localctx).andExpr = andExpr();
				((OrExprContext)_localctx).ops.add(((OrExprContext)_localctx).andExpr);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExprContext extends ParserRuleContext {
		public NotExprContext notExpr;
		public List<NotExprContext> ops = new ArrayList<NotExprContext>();
		public List<NotExprContext> notExpr() {
			return getRuleContexts(NotExprContext.class);
		}
		public NotExprContext notExpr(int i) {
			return getRuleContext(NotExprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(LTLGrammarParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(LTLGrammarParser.AND, i);
		}
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTLGrammarVisitor ) return ((LTLGrammarVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			((AndExprContext)_localctx).notExpr = notExpr();
			((AndExprContext)_localctx).ops.add(((AndExprContext)_localctx).notExpr);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(66);
				match(AND);
				setState(67);
				((AndExprContext)_localctx).notExpr = notExpr();
				((AndExprContext)_localctx).ops.add(((AndExprContext)_localctx).notExpr);
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotExprContext extends ParserRuleContext {
		public NotExprContext notExpr;
		public List<NotExprContext> ops = new ArrayList<NotExprContext>();
		public BinaryLtlExprContext binaryLtlExpr() {
			return getRuleContext(BinaryLtlExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(LTLGrammarParser.NOT, 0); }
		public NotExprContext notExpr() {
			return getRuleContext(NotExprContext.class,0);
		}
		public NotExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTLGrammarVisitor ) return ((LTLGrammarVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExprContext notExpr() throws RecognitionException {
		NotExprContext _localctx = new NotExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_notExpr);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case LPAREN:
			case F_OP:
			case G_OP:
			case INTLIT:
			case BOOLLIT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				binaryLtlExpr(0);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(NOT);
				setState(75);
				((NotExprContext)_localctx).notExpr = notExpr();
				((NotExprContext)_localctx).ops.add(((NotExprContext)_localctx).notExpr);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryLtlExprContext extends ParserRuleContext {
		public List<BinaryLtlExprContext> ops = new ArrayList<BinaryLtlExprContext>();
		public BinaryLtlOpContext type;
		public BinaryLtlExprContext binaryLtlExpr;
		public LtlExprContext ltlExpr() {
			return getRuleContext(LtlExprContext.class,0);
		}
		public List<BinaryLtlExprContext> binaryLtlExpr() {
			return getRuleContexts(BinaryLtlExprContext.class);
		}
		public BinaryLtlExprContext binaryLtlExpr(int i) {
			return getRuleContext(BinaryLtlExprContext.class,i);
		}
		public BinaryLtlOpContext binaryLtlOp() {
			return getRuleContext(BinaryLtlOpContext.class,0);
		}
		public BinaryLtlExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryLtlExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).enterBinaryLtlExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).exitBinaryLtlExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTLGrammarVisitor ) return ((LTLGrammarVisitor<? extends T>)visitor).visitBinaryLtlExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryLtlExprContext binaryLtlExpr() throws RecognitionException {
		return binaryLtlExpr(0);
	}

	private BinaryLtlExprContext binaryLtlExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BinaryLtlExprContext _localctx = new BinaryLtlExprContext(_ctx, _parentState);
		BinaryLtlExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_binaryLtlExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(79);
			ltlExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinaryLtlExprContext(_parentctx, _parentState);
					_localctx.ops.add(_prevctx);
					pushNewRecursionContext(_localctx, _startState, RULE_binaryLtlExpr);
					setState(81);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(82);
					((BinaryLtlExprContext)_localctx).type = binaryLtlOp();
					setState(83);
					((BinaryLtlExprContext)_localctx).binaryLtlExpr = binaryLtlExpr(2);
					((BinaryLtlExprContext)_localctx).ops.add(((BinaryLtlExprContext)_localctx).binaryLtlExpr);
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BinaryLtlOpContext extends ParserRuleContext {
		public TerminalNode M_OP() { return getToken(LTLGrammarParser.M_OP, 0); }
		public TerminalNode W_OP() { return getToken(LTLGrammarParser.W_OP, 0); }
		public TerminalNode U_OP() { return getToken(LTLGrammarParser.U_OP, 0); }
		public TerminalNode R_OP() { return getToken(LTLGrammarParser.R_OP, 0); }
		public BinaryLtlOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryLtlOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).enterBinaryLtlOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).exitBinaryLtlOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTLGrammarVisitor ) return ((LTLGrammarVisitor<? extends T>)visitor).visitBinaryLtlOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryLtlOpContext binaryLtlOp() throws RecognitionException {
		BinaryLtlOpContext _localctx = new BinaryLtlOpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_binaryLtlOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << U_OP) | (1L << W_OP) | (1L << M_OP) | (1L << R_OP))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LtlExprContext extends ParserRuleContext {
		public LtlOpContext type;
		public LtlExprContext ltlExpr;
		public List<LtlExprContext> ops = new ArrayList<LtlExprContext>();
		public EqExprContext eqExpr() {
			return getRuleContext(EqExprContext.class,0);
		}
		public LtlOpContext ltlOp() {
			return getRuleContext(LtlOpContext.class,0);
		}
		public LtlExprContext ltlExpr() {
			return getRuleContext(LtlExprContext.class,0);
		}
		public LtlExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ltlExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).enterLtlExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).exitLtlExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTLGrammarVisitor ) return ((LTLGrammarVisitor<? extends T>)visitor).visitLtlExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LtlExprContext ltlExpr() throws RecognitionException {
		LtlExprContext _localctx = new LtlExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ltlExpr);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case LPAREN:
			case INTLIT:
			case BOOLLIT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				eqExpr();
				}
				break;
			case F_OP:
			case G_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				((LtlExprContext)_localctx).type = ltlOp();
				setState(94);
				((LtlExprContext)_localctx).ltlExpr = ltlExpr();
				((LtlExprContext)_localctx).ops.add(((LtlExprContext)_localctx).ltlExpr);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LtlOpContext extends ParserRuleContext {
		public TerminalNode F_OP() { return getToken(LTLGrammarParser.F_OP, 0); }
		public TerminalNode G_OP() { return getToken(LTLGrammarParser.G_OP, 0); }
		public LtlOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ltlOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).enterLtlOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).exitLtlOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTLGrammarVisitor ) return ((LTLGrammarVisitor<? extends T>)visitor).visitLtlOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LtlOpContext ltlOp() throws RecognitionException {
		LtlOpContext _localctx = new LtlOpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ltlOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ( !(_la==F_OP || _la==G_OP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqExprContext extends ParserRuleContext {
		public RelationExprContext relationExpr;
		public List<RelationExprContext> ops = new ArrayList<RelationExprContext>();
		public EqOperatorContext oper;
		public List<RelationExprContext> relationExpr() {
			return getRuleContexts(RelationExprContext.class);
		}
		public RelationExprContext relationExpr(int i) {
			return getRuleContext(RelationExprContext.class,i);
		}
		public EqOperatorContext eqOperator() {
			return getRuleContext(EqOperatorContext.class,0);
		}
		public EqExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).exitEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTLGrammarVisitor ) return ((LTLGrammarVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqExprContext eqExpr() throws RecognitionException {
		EqExprContext _localctx = new EqExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_eqExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			((EqExprContext)_localctx).relationExpr = relationExpr();
			((EqExprContext)_localctx).ops.add(((EqExprContext)_localctx).relationExpr);
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(101);
				((EqExprContext)_localctx).oper = eqOperator();
				setState(102);
				((EqExprContext)_localctx).relationExpr = relationExpr();
				((EqExprContext)_localctx).ops.add(((EqExprContext)_localctx).relationExpr);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(LTLGrammarParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(LTLGrammarParser.NEQ, 0); }
		public EqOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).enterEqOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).exitEqOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTLGrammarVisitor ) return ((LTLGrammarVisitor<? extends T>)visitor).visitEqOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqOperatorContext eqOperator() throws RecognitionException {
		EqOperatorContext _localctx = new EqOperatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_eqOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !(_la==EQ || _la==NEQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationExprContext extends ParserRuleContext {
		public AdditiveExprContext additiveExpr;
		public List<AdditiveExprContext> ops = new ArrayList<AdditiveExprContext>();
		public RelationOperatorContext oper;
		public List<AdditiveExprContext> additiveExpr() {
			return getRuleContexts(AdditiveExprContext.class);
		}
		public AdditiveExprContext additiveExpr(int i) {
			return getRuleContext(AdditiveExprContext.class,i);
		}
		public RelationOperatorContext relationOperator() {
			return getRuleContext(RelationOperatorContext.class,0);
		}
		public RelationExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).enterRelationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).exitRelationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTLGrammarVisitor ) return ((LTLGrammarVisitor<? extends T>)visitor).visitRelationExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationExprContext relationExpr() throws RecognitionException {
		RelationExprContext _localctx = new RelationExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_relationExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			((RelationExprContext)_localctx).additiveExpr = additiveExpr();
			((RelationExprContext)_localctx).ops.add(((RelationExprContext)_localctx).additiveExpr);
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(109);
				((RelationExprContext)_localctx).oper = relationOperator();
				setState(110);
				((RelationExprContext)_localctx).additiveExpr = additiveExpr();
				((RelationExprContext)_localctx).ops.add(((RelationExprContext)_localctx).additiveExpr);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationOperatorContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(LTLGrammarParser.LT, 0); }
		public TerminalNode GT() { return getToken(LTLGrammarParser.GT, 0); }
		public TerminalNode LEQ() { return getToken(LTLGrammarParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(LTLGrammarParser.GEQ, 0); }
		public RelationOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).enterRelationOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).exitRelationOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTLGrammarVisitor ) return ((LTLGrammarVisitor<? extends T>)visitor).visitRelationOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationOperatorContext relationOperator() throws RecognitionException {
		RelationOperatorContext _localctx = new RelationOperatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relationOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LEQ) | (1L << GEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExprContext extends ParserRuleContext {
		public MultiplicativeExprContext multiplicativeExpr;
		public List<MultiplicativeExprContext> ops = new ArrayList<MultiplicativeExprContext>();
		public AdditiveOperatorContext additiveOperator;
		public List<AdditiveOperatorContext> opers = new ArrayList<AdditiveOperatorContext>();
		public List<MultiplicativeExprContext> multiplicativeExpr() {
			return getRuleContexts(MultiplicativeExprContext.class);
		}
		public MultiplicativeExprContext multiplicativeExpr(int i) {
			return getRuleContext(MultiplicativeExprContext.class,i);
		}
		public List<AdditiveOperatorContext> additiveOperator() {
			return getRuleContexts(AdditiveOperatorContext.class);
		}
		public AdditiveOperatorContext additiveOperator(int i) {
			return getRuleContext(AdditiveOperatorContext.class,i);
		}
		public AdditiveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).exitAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTLGrammarVisitor ) return ((LTLGrammarVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExprContext additiveExpr() throws RecognitionException {
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_additiveExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			((AdditiveExprContext)_localctx).multiplicativeExpr = multiplicativeExpr();
			((AdditiveExprContext)_localctx).ops.add(((AdditiveExprContext)_localctx).multiplicativeExpr);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(117);
					((AdditiveExprContext)_localctx).additiveOperator = additiveOperator();
					((AdditiveExprContext)_localctx).opers.add(((AdditiveExprContext)_localctx).additiveOperator);
					setState(118);
					((AdditiveExprContext)_localctx).multiplicativeExpr = multiplicativeExpr();
					((AdditiveExprContext)_localctx).ops.add(((AdditiveExprContext)_localctx).multiplicativeExpr);
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(LTLGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LTLGrammarParser.MINUS, 0); }
		public AdditiveOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).enterAdditiveOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).exitAdditiveOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTLGrammarVisitor ) return ((LTLGrammarVisitor<? extends T>)visitor).visitAdditiveOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveOperatorContext additiveOperator() throws RecognitionException {
		AdditiveOperatorContext _localctx = new AdditiveOperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExprContext extends ParserRuleContext {
		public NegExprContext negExpr;
		public List<NegExprContext> ops = new ArrayList<NegExprContext>();
		public MultiplicativeOperatorContext multiplicativeOperator;
		public List<MultiplicativeOperatorContext> opers = new ArrayList<MultiplicativeOperatorContext>();
		public List<NegExprContext> negExpr() {
			return getRuleContexts(NegExprContext.class);
		}
		public NegExprContext negExpr(int i) {
			return getRuleContext(NegExprContext.class,i);
		}
		public List<MultiplicativeOperatorContext> multiplicativeOperator() {
			return getRuleContexts(MultiplicativeOperatorContext.class);
		}
		public MultiplicativeOperatorContext multiplicativeOperator(int i) {
			return getRuleContext(MultiplicativeOperatorContext.class,i);
		}
		public MultiplicativeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).enterMultiplicativeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).exitMultiplicativeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTLGrammarVisitor ) return ((LTLGrammarVisitor<? extends T>)visitor).visitMultiplicativeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExprContext multiplicativeExpr() throws RecognitionException {
		MultiplicativeExprContext _localctx = new MultiplicativeExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_multiplicativeExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			((MultiplicativeExprContext)_localctx).negExpr = negExpr();
			((MultiplicativeExprContext)_localctx).ops.add(((MultiplicativeExprContext)_localctx).negExpr);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(128);
					((MultiplicativeExprContext)_localctx).multiplicativeOperator = multiplicativeOperator();
					((MultiplicativeExprContext)_localctx).opers.add(((MultiplicativeExprContext)_localctx).multiplicativeOperator);
					setState(129);
					((MultiplicativeExprContext)_localctx).negExpr = negExpr();
					((MultiplicativeExprContext)_localctx).ops.add(((MultiplicativeExprContext)_localctx).negExpr);
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeOperatorContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(LTLGrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LTLGrammarParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(LTLGrammarParser.MOD, 0); }
		public MultiplicativeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).enterMultiplicativeOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).exitMultiplicativeOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTLGrammarVisitor ) return ((LTLGrammarVisitor<? extends T>)visitor).visitMultiplicativeOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeOperatorContext multiplicativeOperator() throws RecognitionException {
		MultiplicativeOperatorContext _localctx = new MultiplicativeOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NegExprContext extends ParserRuleContext {
		public NegExprContext negExpr;
		public List<NegExprContext> ops = new ArrayList<NegExprContext>();
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(LTLGrammarParser.MINUS, 0); }
		public NegExprContext negExpr() {
			return getRuleContext(NegExprContext.class,0);
		}
		public NegExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).enterNegExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).exitNegExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTLGrammarVisitor ) return ((LTLGrammarVisitor<? extends T>)visitor).visitNegExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegExprContext negExpr() throws RecognitionException {
		NegExprContext _localctx = new NegExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_negExpr);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case INTLIT:
			case BOOLLIT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				primaryExpr();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(MINUS);
				setState(140);
				((NegExprContext)_localctx).negExpr = negExpr();
				((NegExprContext)_localctx).ops.add(((NegExprContext)_localctx).negExpr);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExprContext extends ParserRuleContext {
		public BoolLitExprContext boolLitExpr() {
			return getRuleContext(BoolLitExprContext.class,0);
		}
		public IntLitExprContext intLitExpr() {
			return getRuleContext(IntLitExprContext.class,0);
		}
		public ParenExprContext parenExpr() {
			return getRuleContext(ParenExprContext.class,0);
		}
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).exitPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTLGrammarVisitor ) return ((LTLGrammarVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_primaryExpr);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				boolLitExpr();
				}
				break;
			case INTLIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				intLitExpr();
				}
				break;
			case LPAREN:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				parenExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolLitExprContext extends ParserRuleContext {
		public Token value;
		public TerminalNode BOOLLIT() { return getToken(LTLGrammarParser.BOOLLIT, 0); }
		public BoolLitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolLitExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).enterBoolLitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).exitBoolLitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTLGrammarVisitor ) return ((LTLGrammarVisitor<? extends T>)visitor).visitBoolLitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolLitExprContext boolLitExpr() throws RecognitionException {
		BoolLitExprContext _localctx = new BoolLitExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_boolLitExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			((BoolLitExprContext)_localctx).value = match(BOOLLIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenExprContext extends ParserRuleContext {
		public ImplyExpressionContext implyExpression;
		public List<ImplyExpressionContext> ops = new ArrayList<ImplyExpressionContext>();
		public TerminalNode LPAREN() { return getToken(LTLGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LTLGrammarParser.RPAREN, 0); }
		public ImplyExpressionContext implyExpression() {
			return getRuleContext(ImplyExpressionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ParenExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTLGrammarVisitor ) return ((LTLGrammarVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenExprContext parenExpr() throws RecognitionException {
		ParenExprContext _localctx = new ParenExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parenExpr);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(LPAREN);
				setState(151);
				((ParenExprContext)_localctx).implyExpression = implyExpression();
				((ParenExprContext)_localctx).ops.add(((ParenExprContext)_localctx).implyExpression);
				setState(152);
				match(RPAREN);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntLitExprContext extends ParserRuleContext {
		public Token value;
		public TerminalNode INTLIT() { return getToken(LTLGrammarParser.INTLIT, 0); }
		public IntLitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intLitExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).enterIntLitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).exitIntLitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTLGrammarVisitor ) return ((LTLGrammarVisitor<? extends T>)visitor).visitIntLitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntLitExprContext intLitExpr() throws RecognitionException {
		IntLitExprContext _localctx = new IntLitExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_intLitExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			((IntLitExprContext)_localctx).value = match(INTLIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(LTLGrammarParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLGrammarListener ) ((LTLGrammarListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTLGrammarVisitor ) return ((LTLGrammarVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			((VariableContext)_localctx).name = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return binaryLtlExpr_sempred((BinaryLtlExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean binaryLtlExpr_sempred(BinaryLtlExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00a4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\7\4?\n\4\f\4\16"+
		"\4B\13\4\3\5\3\5\3\5\7\5G\n\5\f\5\16\5J\13\5\3\6\3\6\3\6\5\6O\n\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7X\n\7\f\7\16\7[\13\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\5\tc\n\t\3\n\3\n\3\13\3\13\3\13\3\13\5\13k\n\13\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\5\rs\n\r\3\16\3\16\3\17\3\17\3\17\3\17\7\17{\n\17\f\17\16\17~\13"+
		"\17\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u0086\n\21\f\21\16\21\u0089\13"+
		"\21\3\22\3\22\3\23\3\23\3\23\5\23\u0090\n\23\3\24\3\24\3\24\5\24\u0095"+
		"\n\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u009e\n\26\3\27\3\27\3\30"+
		"\3\30\3\30\2\3\f\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2"+
		"\b\3\2\26\31\3\2\24\25\3\2\7\b\3\2\t\f\3\2\r\16\3\2\17\21\2\u009b\2\63"+
		"\3\2\2\2\4\66\3\2\2\2\6;\3\2\2\2\bC\3\2\2\2\nN\3\2\2\2\fP\3\2\2\2\16\\"+
		"\3\2\2\2\20b\3\2\2\2\22d\3\2\2\2\24f\3\2\2\2\26l\3\2\2\2\30n\3\2\2\2\32"+
		"t\3\2\2\2\34v\3\2\2\2\36\177\3\2\2\2 \u0081\3\2\2\2\"\u008a\3\2\2\2$\u008f"+
		"\3\2\2\2&\u0094\3\2\2\2(\u0096\3\2\2\2*\u009d\3\2\2\2,\u009f\3\2\2\2."+
		"\u00a1\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2"+
		"\63\64\3\2\2\2\64\3\3\2\2\2\65\63\3\2\2\2\669\5\6\4\2\678\7\5\2\28:\5"+
		"\6\4\29\67\3\2\2\29:\3\2\2\2:\5\3\2\2\2;@\5\b\5\2<=\7\4\2\2=?\5\b\5\2"+
		"><\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\7\3\2\2\2B@\3\2\2\2CH\5\n\6"+
		"\2DE\7\3\2\2EG\5\n\6\2FD\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\t\3\2"+
		"\2\2JH\3\2\2\2KO\5\f\7\2LM\7\6\2\2MO\5\n\6\2NK\3\2\2\2NL\3\2\2\2O\13\3"+
		"\2\2\2PQ\b\7\1\2QR\5\20\t\2RY\3\2\2\2ST\f\3\2\2TU\5\16\b\2UV\5\f\7\4V"+
		"X\3\2\2\2WS\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\r\3\2\2\2[Y\3\2\2\2"+
		"\\]\t\2\2\2]\17\3\2\2\2^c\5\24\13\2_`\5\22\n\2`a\5\20\t\2ac\3\2\2\2b^"+
		"\3\2\2\2b_\3\2\2\2c\21\3\2\2\2de\t\3\2\2e\23\3\2\2\2fj\5\30\r\2gh\5\26"+
		"\f\2hi\5\30\r\2ik\3\2\2\2jg\3\2\2\2jk\3\2\2\2k\25\3\2\2\2lm\t\4\2\2m\27"+
		"\3\2\2\2nr\5\34\17\2op\5\32\16\2pq\5\34\17\2qs\3\2\2\2ro\3\2\2\2rs\3\2"+
		"\2\2s\31\3\2\2\2tu\t\5\2\2u\33\3\2\2\2v|\5 \21\2wx\5\36\20\2xy\5 \21\2"+
		"y{\3\2\2\2zw\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\35\3\2\2\2~|\3\2\2"+
		"\2\177\u0080\t\6\2\2\u0080\37\3\2\2\2\u0081\u0087\5$\23\2\u0082\u0083"+
		"\5\"\22\2\u0083\u0084\5$\23\2\u0084\u0086\3\2\2\2\u0085\u0082\3\2\2\2"+
		"\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088!\3"+
		"\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\t\7\2\2\u008b#\3\2\2\2\u008c\u0090"+
		"\5&\24\2\u008d\u008e\7\16\2\2\u008e\u0090\5$\23\2\u008f\u008c\3\2\2\2"+
		"\u008f\u008d\3\2\2\2\u0090%\3\2\2\2\u0091\u0095\5(\25\2\u0092\u0095\5"+
		",\27\2\u0093\u0095\5*\26\2\u0094\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\'\3\2\2\2\u0096\u0097\7\33\2\2\u0097)\3\2\2\2\u0098"+
		"\u0099\7\22\2\2\u0099\u009a\5\4\3\2\u009a\u009b\7\23\2\2\u009b\u009e\3"+
		"\2\2\2\u009c\u009e\5.\30\2\u009d\u0098\3\2\2\2\u009d\u009c\3\2\2\2\u009e"+
		"+\3\2\2\2\u009f\u00a0\7\32\2\2\u00a0-\3\2\2\2\u00a1\u00a2\7\34\2\2\u00a2"+
		"/\3\2\2\2\20\639@HNYbjr|\u0087\u008f\u0094\u009d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}