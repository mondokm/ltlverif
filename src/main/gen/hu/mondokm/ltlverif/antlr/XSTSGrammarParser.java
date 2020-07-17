// Generated from /home/milan/programming/ltlverif/src/main/java/hu/mondokm/ltlverif/antlr/XSTSGrammar.g4 by ANTLR 4.7.2
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
public class XSTSGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HAVOC=1, CHOICE=2, NONDET_OR=3, SEMICOLON=4, ASSUME=5, AND=6, OR=7, IMPLIES=8, 
		NOT=9, EQ=10, NEQ=11, LT=12, GT=13, LEQ=14, GEQ=15, PLUS=16, MINUS=17, 
		MUL=18, DIV=19, MOD=20, LPAREN=21, RPAREN=22, PRIME=23, ASSIGN=24, EQUALS=25, 
		VAR=26, INT=27, BOOL=28, DP=29, COMMA=30, TYPE=31, LCURLY=32, RCURLY=33, 
		INTLIT=34, BOOLLIT=35, ID=36, WS=37;
	public static final int
		RULE_xsts = 0, RULE_action = 1, RULE_nonDetAction = 2, RULE_sequentialAction = 3, 
		RULE_assumeAction = 4, RULE_assignAction = 5, RULE_assignLHS = 6, RULE_havocAction = 7, 
		RULE_implyExpression = 8, RULE_orExpr = 9, RULE_andExpr = 10, RULE_notExpr = 11, 
		RULE_eqExpr = 12, RULE_eqOperator = 13, RULE_relationExpr = 14, RULE_relationOperator = 15, 
		RULE_additiveExpr = 16, RULE_additiveOperator = 17, RULE_multiplicativeExpr = 18, 
		RULE_multiplicativeOperator = 19, RULE_negExpr = 20, RULE_primaryExpr = 21, 
		RULE_parenExpr = 22, RULE_prime = 23, RULE_variableDeclaration = 24, RULE_value = 25, 
		RULE_literal = 26, RULE_reference = 27, RULE_typeName = 28, RULE_customType = 29, 
		RULE_typeDeclaration = 30, RULE_typeLiteral = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"xsts", "action", "nonDetAction", "sequentialAction", "assumeAction", 
			"assignAction", "assignLHS", "havocAction", "implyExpression", "orExpr", 
			"andExpr", "notExpr", "eqExpr", "eqOperator", "relationExpr", "relationOperator", 
			"additiveExpr", "additiveOperator", "multiplicativeExpr", "multiplicativeOperator", 
			"negExpr", "primaryExpr", "parenExpr", "prime", "variableDeclaration", 
			"value", "literal", "reference", "typeName", "customType", "typeDeclaration", 
			"typeLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'havoc'", "'choice'", "'or'", "';'", "'assume'", "'&&'", "'||'", 
			"'->'", "'!'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'('", "')'", "'''", "':='", "'='", "'var'", "'integer'", 
			"'boolean'", "':'", "','", "'type'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HAVOC", "CHOICE", "NONDET_OR", "SEMICOLON", "ASSUME", "AND", "OR", 
			"IMPLIES", "NOT", "EQ", "NEQ", "LT", "GT", "LEQ", "GEQ", "PLUS", "MINUS", 
			"MUL", "DIV", "MOD", "LPAREN", "RPAREN", "PRIME", "ASSIGN", "EQUALS", 
			"VAR", "INT", "BOOL", "DP", "COMMA", "TYPE", "LCURLY", "RCURLY", "INTLIT", 
			"BOOLLIT", "ID", "WS"
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
	public String getGrammarFileName() { return "XSTSGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XSTSGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class XstsContext extends ParserRuleContext {
		public TypeDeclarationContext typeDeclaration;
		public List<TypeDeclarationContext> typeDeclarations = new ArrayList<TypeDeclarationContext>();
		public VariableDeclarationContext variableDeclaration;
		public List<VariableDeclarationContext> variableDeclarations = new ArrayList<VariableDeclarationContext>();
		public NonDetActionContext transitions;
		public NonDetActionContext initAction;
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<NonDetActionContext> nonDetAction() {
			return getRuleContexts(NonDetActionContext.class);
		}
		public NonDetActionContext nonDetAction(int i) {
			return getRuleContext(NonDetActionContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public XstsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xsts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterXsts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitXsts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitXsts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XstsContext xsts() throws RecognitionException {
		XstsContext _localctx = new XstsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_xsts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(64);
				((XstsContext)_localctx).typeDeclaration = typeDeclaration();
				((XstsContext)_localctx).typeDeclarations.add(((XstsContext)_localctx).typeDeclaration);
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			((XstsContext)_localctx).variableDeclaration = variableDeclaration();
			((XstsContext)_localctx).variableDeclarations.add(((XstsContext)_localctx).variableDeclaration);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(71);
				((XstsContext)_localctx).variableDeclaration = variableDeclaration();
				((XstsContext)_localctx).variableDeclarations.add(((XstsContext)_localctx).variableDeclaration);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			((XstsContext)_localctx).transitions = nonDetAction();
			setState(78);
			((XstsContext)_localctx).initAction = nonDetAction();
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

	public static class ActionContext extends ParserRuleContext {
		public AssumeActionContext assumeAction() {
			return getRuleContext(AssumeActionContext.class,0);
		}
		public AssignActionContext assignAction() {
			return getRuleContext(AssignActionContext.class,0);
		}
		public HavocActionContext havocAction() {
			return getRuleContext(HavocActionContext.class,0);
		}
		public NonDetActionContext nonDetAction() {
			return getRuleContext(NonDetActionContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_action);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSUME:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				assumeAction();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				assignAction();
				}
				break;
			case HAVOC:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				havocAction();
				}
				break;
			case CHOICE:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				nonDetAction();
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

	public static class NonDetActionContext extends ParserRuleContext {
		public SequentialActionContext sequentialAction;
		public List<SequentialActionContext> choices = new ArrayList<SequentialActionContext>();
		public TerminalNode CHOICE() { return getToken(XSTSGrammarParser.CHOICE, 0); }
		public List<TerminalNode> LCURLY() { return getTokens(XSTSGrammarParser.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(XSTSGrammarParser.LCURLY, i);
		}
		public List<TerminalNode> RCURLY() { return getTokens(XSTSGrammarParser.RCURLY); }
		public TerminalNode RCURLY(int i) {
			return getToken(XSTSGrammarParser.RCURLY, i);
		}
		public List<SequentialActionContext> sequentialAction() {
			return getRuleContexts(SequentialActionContext.class);
		}
		public SequentialActionContext sequentialAction(int i) {
			return getRuleContext(SequentialActionContext.class,i);
		}
		public List<TerminalNode> NONDET_OR() { return getTokens(XSTSGrammarParser.NONDET_OR); }
		public TerminalNode NONDET_OR(int i) {
			return getToken(XSTSGrammarParser.NONDET_OR, i);
		}
		public NonDetActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonDetAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterNonDetAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitNonDetAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitNonDetAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonDetActionContext nonDetAction() throws RecognitionException {
		NonDetActionContext _localctx = new NonDetActionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nonDetAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(CHOICE);
			setState(87);
			match(LCURLY);
			setState(88);
			((NonDetActionContext)_localctx).sequentialAction = sequentialAction();
			((NonDetActionContext)_localctx).choices.add(((NonDetActionContext)_localctx).sequentialAction);
			setState(89);
			match(RCURLY);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NONDET_OR) {
				{
				{
				setState(90);
				match(NONDET_OR);
				setState(91);
				match(LCURLY);
				setState(92);
				((NonDetActionContext)_localctx).sequentialAction = sequentialAction();
				((NonDetActionContext)_localctx).choices.add(((NonDetActionContext)_localctx).sequentialAction);
				setState(93);
				match(RCURLY);
				}
				}
				setState(99);
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

	public static class SequentialActionContext extends ParserRuleContext {
		public ActionContext action;
		public List<ActionContext> actions = new ArrayList<ActionContext>();
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public SequentialActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequentialAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterSequentialAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitSequentialAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitSequentialAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequentialActionContext sequentialAction() throws RecognitionException {
		SequentialActionContext _localctx = new SequentialActionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sequentialAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			((SequentialActionContext)_localctx).action = action();
			((SequentialActionContext)_localctx).actions.add(((SequentialActionContext)_localctx).action);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HAVOC) | (1L << CHOICE) | (1L << ASSUME) | (1L << ID))) != 0)) {
				{
				{
				setState(101);
				((SequentialActionContext)_localctx).action = action();
				((SequentialActionContext)_localctx).actions.add(((SequentialActionContext)_localctx).action);
				}
				}
				setState(106);
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

	public static class AssumeActionContext extends ParserRuleContext {
		public ImplyExpressionContext cond;
		public TerminalNode ASSUME() { return getToken(XSTSGrammarParser.ASSUME, 0); }
		public TerminalNode SEMICOLON() { return getToken(XSTSGrammarParser.SEMICOLON, 0); }
		public ImplyExpressionContext implyExpression() {
			return getRuleContext(ImplyExpressionContext.class,0);
		}
		public AssumeActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assumeAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterAssumeAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitAssumeAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitAssumeAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssumeActionContext assumeAction() throws RecognitionException {
		AssumeActionContext _localctx = new AssumeActionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assumeAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(ASSUME);
			setState(108);
			((AssumeActionContext)_localctx).cond = implyExpression();
			setState(109);
			match(SEMICOLON);
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

	public static class AssignActionContext extends ParserRuleContext {
		public AssignLHSContext lhs;
		public ImplyExpressionContext rhs;
		public TerminalNode ASSIGN() { return getToken(XSTSGrammarParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(XSTSGrammarParser.SEMICOLON, 0); }
		public AssignLHSContext assignLHS() {
			return getRuleContext(AssignLHSContext.class,0);
		}
		public ImplyExpressionContext implyExpression() {
			return getRuleContext(ImplyExpressionContext.class,0);
		}
		public AssignActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterAssignAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitAssignAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitAssignAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignActionContext assignAction() throws RecognitionException {
		AssignActionContext _localctx = new AssignActionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			((AssignActionContext)_localctx).lhs = assignLHS();
			setState(112);
			match(ASSIGN);
			setState(113);
			((AssignActionContext)_localctx).rhs = implyExpression();
			setState(114);
			match(SEMICOLON);
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

	public static class AssignLHSContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(XSTSGrammarParser.ID, 0); }
		public List<TerminalNode> PRIME() { return getTokens(XSTSGrammarParser.PRIME); }
		public TerminalNode PRIME(int i) {
			return getToken(XSTSGrammarParser.PRIME, i);
		}
		public AssignLHSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignLHS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterAssignLHS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitAssignLHS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitAssignLHS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignLHSContext assignLHS() throws RecognitionException {
		AssignLHSContext _localctx = new AssignLHSContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignLHS);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			((AssignLHSContext)_localctx).name = match(ID);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRIME) {
				{
				{
				setState(117);
				match(PRIME);
				}
				}
				setState(122);
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

	public static class HavocActionContext extends ParserRuleContext {
		public Token name;
		public TerminalNode HAVOC() { return getToken(XSTSGrammarParser.HAVOC, 0); }
		public TerminalNode SEMICOLON() { return getToken(XSTSGrammarParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(XSTSGrammarParser.ID, 0); }
		public HavocActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havocAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterHavocAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitHavocAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitHavocAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavocActionContext havocAction() throws RecognitionException {
		HavocActionContext _localctx = new HavocActionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_havocAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(HAVOC);
			setState(124);
			((HavocActionContext)_localctx).name = match(ID);
			setState(125);
			match(SEMICOLON);
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
		public TerminalNode IMPLIES() { return getToken(XSTSGrammarParser.IMPLIES, 0); }
		public ImplyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterImplyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitImplyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitImplyExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplyExpressionContext implyExpression() throws RecognitionException {
		ImplyExpressionContext _localctx = new ImplyExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_implyExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			((ImplyExpressionContext)_localctx).orExpr = orExpr();
			((ImplyExpressionContext)_localctx).ops.add(((ImplyExpressionContext)_localctx).orExpr);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLIES) {
				{
				setState(128);
				match(IMPLIES);
				setState(129);
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
		public List<TerminalNode> OR() { return getTokens(XSTSGrammarParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(XSTSGrammarParser.OR, i);
		}
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExprContext orExpr() throws RecognitionException {
		OrExprContext _localctx = new OrExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_orExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			((OrExprContext)_localctx).andExpr = andExpr();
			((OrExprContext)_localctx).ops.add(((OrExprContext)_localctx).andExpr);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(133);
				match(OR);
				setState(134);
				((OrExprContext)_localctx).andExpr = andExpr();
				((OrExprContext)_localctx).ops.add(((OrExprContext)_localctx).andExpr);
				}
				}
				setState(139);
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
		public List<TerminalNode> AND() { return getTokens(XSTSGrammarParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(XSTSGrammarParser.AND, i);
		}
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			((AndExprContext)_localctx).notExpr = notExpr();
			((AndExprContext)_localctx).ops.add(((AndExprContext)_localctx).notExpr);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(141);
				match(AND);
				setState(142);
				((AndExprContext)_localctx).notExpr = notExpr();
				((AndExprContext)_localctx).ops.add(((AndExprContext)_localctx).notExpr);
				}
				}
				setState(147);
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
		public EqExprContext eqExpr() {
			return getRuleContext(EqExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(XSTSGrammarParser.NOT, 0); }
		public NotExprContext notExpr() {
			return getRuleContext(NotExprContext.class,0);
		}
		public NotExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExprContext notExpr() throws RecognitionException {
		NotExprContext _localctx = new NotExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_notExpr);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case LPAREN:
			case INTLIT:
			case BOOLLIT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				eqExpr();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(NOT);
				setState(150);
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
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqExprContext eqExpr() throws RecognitionException {
		EqExprContext _localctx = new EqExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_eqExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			((EqExprContext)_localctx).relationExpr = relationExpr();
			((EqExprContext)_localctx).ops.add(((EqExprContext)_localctx).relationExpr);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ || _la==NEQ) {
				{
				setState(154);
				((EqExprContext)_localctx).oper = eqOperator();
				setState(155);
				((EqExprContext)_localctx).relationExpr = relationExpr();
				((EqExprContext)_localctx).ops.add(((EqExprContext)_localctx).relationExpr);
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

	public static class EqOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(XSTSGrammarParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(XSTSGrammarParser.NEQ, 0); }
		public EqOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterEqOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitEqOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitEqOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqOperatorContext eqOperator() throws RecognitionException {
		EqOperatorContext _localctx = new EqOperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_eqOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
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
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterRelationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitRelationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitRelationExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationExprContext relationExpr() throws RecognitionException {
		RelationExprContext _localctx = new RelationExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_relationExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			((RelationExprContext)_localctx).additiveExpr = additiveExpr();
			((RelationExprContext)_localctx).ops.add(((RelationExprContext)_localctx).additiveExpr);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LEQ) | (1L << GEQ))) != 0)) {
				{
				setState(162);
				((RelationExprContext)_localctx).oper = relationOperator();
				setState(163);
				((RelationExprContext)_localctx).additiveExpr = additiveExpr();
				((RelationExprContext)_localctx).ops.add(((RelationExprContext)_localctx).additiveExpr);
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

	public static class RelationOperatorContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(XSTSGrammarParser.LT, 0); }
		public TerminalNode GT() { return getToken(XSTSGrammarParser.GT, 0); }
		public TerminalNode LEQ() { return getToken(XSTSGrammarParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(XSTSGrammarParser.GEQ, 0); }
		public RelationOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterRelationOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitRelationOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitRelationOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationOperatorContext relationOperator() throws RecognitionException {
		RelationOperatorContext _localctx = new RelationOperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_relationOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExprContext additiveExpr() throws RecognitionException {
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			((AdditiveExprContext)_localctx).multiplicativeExpr = multiplicativeExpr();
			((AdditiveExprContext)_localctx).ops.add(((AdditiveExprContext)_localctx).multiplicativeExpr);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(170);
				((AdditiveExprContext)_localctx).additiveOperator = additiveOperator();
				((AdditiveExprContext)_localctx).opers.add(((AdditiveExprContext)_localctx).additiveOperator);
				setState(171);
				((AdditiveExprContext)_localctx).multiplicativeExpr = multiplicativeExpr();
				((AdditiveExprContext)_localctx).ops.add(((AdditiveExprContext)_localctx).multiplicativeExpr);
				}
				}
				setState(177);
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

	public static class AdditiveOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(XSTSGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(XSTSGrammarParser.MINUS, 0); }
		public AdditiveOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterAdditiveOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitAdditiveOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitAdditiveOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveOperatorContext additiveOperator() throws RecognitionException {
		AdditiveOperatorContext _localctx = new AdditiveOperatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
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
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterMultiplicativeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitMultiplicativeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitMultiplicativeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExprContext multiplicativeExpr() throws RecognitionException {
		MultiplicativeExprContext _localctx = new MultiplicativeExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multiplicativeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			((MultiplicativeExprContext)_localctx).negExpr = negExpr();
			((MultiplicativeExprContext)_localctx).ops.add(((MultiplicativeExprContext)_localctx).negExpr);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				{
				setState(181);
				((MultiplicativeExprContext)_localctx).multiplicativeOperator = multiplicativeOperator();
				((MultiplicativeExprContext)_localctx).opers.add(((MultiplicativeExprContext)_localctx).multiplicativeOperator);
				setState(182);
				((MultiplicativeExprContext)_localctx).negExpr = negExpr();
				((MultiplicativeExprContext)_localctx).ops.add(((MultiplicativeExprContext)_localctx).negExpr);
				}
				}
				setState(188);
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

	public static class MultiplicativeOperatorContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(XSTSGrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(XSTSGrammarParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(XSTSGrammarParser.MOD, 0); }
		public MultiplicativeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterMultiplicativeOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitMultiplicativeOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitMultiplicativeOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeOperatorContext multiplicativeOperator() throws RecognitionException {
		MultiplicativeOperatorContext _localctx = new MultiplicativeOperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
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
		public TerminalNode MINUS() { return getToken(XSTSGrammarParser.MINUS, 0); }
		public NegExprContext negExpr() {
			return getRuleContext(NegExprContext.class,0);
		}
		public NegExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterNegExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitNegExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitNegExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegExprContext negExpr() throws RecognitionException {
		NegExprContext _localctx = new NegExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_negExpr);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case INTLIT:
			case BOOLLIT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				primaryExpr();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(MINUS);
				setState(193);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_primaryExpr);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				parenExpr();
				}
				break;
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
		public TerminalNode LPAREN() { return getToken(XSTSGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XSTSGrammarParser.RPAREN, 0); }
		public ImplyExpressionContext implyExpression() {
			return getRuleContext(ImplyExpressionContext.class,0);
		}
		public PrimeContext prime() {
			return getRuleContext(PrimeContext.class,0);
		}
		public ParenExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenExprContext parenExpr() throws RecognitionException {
		ParenExprContext _localctx = new ParenExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parenExpr);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(LPAREN);
				setState(201);
				((ParenExprContext)_localctx).implyExpression = implyExpression();
				((ParenExprContext)_localctx).ops.add(((ParenExprContext)_localctx).implyExpression);
				setState(202);
				match(RPAREN);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				prime(0);
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

	public static class PrimeContext extends ParserRuleContext {
		public PrimeContext ref;
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode PRIME() { return getToken(XSTSGrammarParser.PRIME, 0); }
		public PrimeContext prime() {
			return getRuleContext(PrimeContext.class,0);
		}
		public PrimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterPrime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitPrime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitPrime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimeContext prime() throws RecognitionException {
		return prime(0);
	}

	private PrimeContext prime(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimeContext _localctx = new PrimeContext(_ctx, _parentState);
		PrimeContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_prime, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(208);
			reference();
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrimeContext(_parentctx, _parentState);
					_localctx.ref = _prevctx;
					_localctx.ref = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_prime);
					setState(210);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(211);
					match(PRIME);
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public Token name;
		public TypeNameContext type;
		public ValueContext initValue;
		public TerminalNode VAR() { return getToken(XSTSGrammarParser.VAR, 0); }
		public TerminalNode DP() { return getToken(XSTSGrammarParser.DP, 0); }
		public TerminalNode ID() { return getToken(XSTSGrammarParser.ID, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(XSTSGrammarParser.EQUALS, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(VAR);
			setState(218);
			((VariableDeclarationContext)_localctx).name = match(ID);
			setState(219);
			match(DP);
			setState(220);
			((VariableDeclarationContext)_localctx).type = typeName();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(221);
				match(EQUALS);
				setState(222);
				((VariableDeclarationContext)_localctx).initValue = value();
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

	public static class ValueContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_value);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLIT:
			case BOOLLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				literal();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				reference();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTLIT() { return getToken(XSTSGrammarParser.INTLIT, 0); }
		public TerminalNode BOOLLIT() { return getToken(XSTSGrammarParser.BOOLLIT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ( !(_la==INTLIT || _la==BOOLLIT) ) {
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

	public static class ReferenceContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(XSTSGrammarParser.ID, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			((ReferenceContext)_localctx).name = match(ID);
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

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(XSTSGrammarParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(XSTSGrammarParser.BOOL, 0); }
		public CustomTypeContext customType() {
			return getRuleContext(CustomTypeContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_typeName);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(INT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(BOOL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				customType();
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

	public static class CustomTypeContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(XSTSGrammarParser.ID, 0); }
		public CustomTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterCustomType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitCustomType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitCustomType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomTypeContext customType() throws RecognitionException {
		CustomTypeContext _localctx = new CustomTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_customType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			((CustomTypeContext)_localctx).name = match(ID);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public Token name;
		public TypeLiteralContext typeLiteral;
		public List<TypeLiteralContext> literals = new ArrayList<TypeLiteralContext>();
		public TerminalNode TYPE() { return getToken(XSTSGrammarParser.TYPE, 0); }
		public TerminalNode DP() { return getToken(XSTSGrammarParser.DP, 0); }
		public TerminalNode LCURLY() { return getToken(XSTSGrammarParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(XSTSGrammarParser.RCURLY, 0); }
		public TerminalNode ID() { return getToken(XSTSGrammarParser.ID, 0); }
		public List<TypeLiteralContext> typeLiteral() {
			return getRuleContexts(TypeLiteralContext.class);
		}
		public TypeLiteralContext typeLiteral(int i) {
			return getRuleContext(TypeLiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XSTSGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XSTSGrammarParser.COMMA, i);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(TYPE);
			setState(241);
			((TypeDeclarationContext)_localctx).name = match(ID);
			setState(242);
			match(DP);
			setState(243);
			match(LCURLY);
			setState(244);
			((TypeDeclarationContext)_localctx).typeLiteral = typeLiteral();
			((TypeDeclarationContext)_localctx).literals.add(((TypeDeclarationContext)_localctx).typeLiteral);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(245);
				match(COMMA);
				setState(246);
				((TypeDeclarationContext)_localctx).typeLiteral = typeLiteral();
				((TypeDeclarationContext)_localctx).literals.add(((TypeDeclarationContext)_localctx).typeLiteral);
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252);
			match(RCURLY);
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

	public static class TypeLiteralContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(XSTSGrammarParser.ID, 0); }
		public TypeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).enterTypeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSTSGrammarListener ) ((XSTSGrammarListener)listener).exitTypeLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSTSGrammarVisitor ) return ((XSTSGrammarVisitor<? extends T>)visitor).visitTypeLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeLiteralContext typeLiteral() throws RecognitionException {
		TypeLiteralContext _localctx = new TypeLiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_typeLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			((TypeLiteralContext)_localctx).name = match(ID);
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
		case 23:
			return prime_sempred((PrimeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean prime_sempred(PrimeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0103\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\5\3W\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7"+
		"\4b\n\4\f\4\16\4e\13\4\3\5\3\5\7\5i\n\5\f\5\16\5l\13\5\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\7\by\n\b\f\b\16\b|\13\b\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\5\n\u0085\n\n\3\13\3\13\3\13\7\13\u008a\n\13\f\13\16\13\u008d"+
		"\13\13\3\f\3\f\3\f\7\f\u0092\n\f\f\f\16\f\u0095\13\f\3\r\3\r\3\r\5\r\u009a"+
		"\n\r\3\16\3\16\3\16\3\16\5\16\u00a0\n\16\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\5\20\u00a8\n\20\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00b0\n\22\f\22\16"+
		"\22\u00b3\13\22\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00bb\n\24\f\24\16"+
		"\24\u00be\13\24\3\25\3\25\3\26\3\26\3\26\5\26\u00c5\n\26\3\27\3\27\5\27"+
		"\u00c9\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u00d0\n\30\3\31\3\31\3\31\3"+
		"\31\3\31\7\31\u00d7\n\31\f\31\16\31\u00da\13\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\5\32\u00e2\n\32\3\33\3\33\5\33\u00e6\n\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\36\5\36\u00ef\n\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \7 \u00fa"+
		"\n \f \16 \u00fd\13 \3 \3 \3!\3!\3!\2\3\60\"\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\7\3\2\f\r\3\2\16\21\3\2\22\23"+
		"\3\2\24\26\3\2$%\2\u00fb\2E\3\2\2\2\4V\3\2\2\2\6X\3\2\2\2\bf\3\2\2\2\n"+
		"m\3\2\2\2\fq\3\2\2\2\16v\3\2\2\2\20}\3\2\2\2\22\u0081\3\2\2\2\24\u0086"+
		"\3\2\2\2\26\u008e\3\2\2\2\30\u0099\3\2\2\2\32\u009b\3\2\2\2\34\u00a1\3"+
		"\2\2\2\36\u00a3\3\2\2\2 \u00a9\3\2\2\2\"\u00ab\3\2\2\2$\u00b4\3\2\2\2"+
		"&\u00b6\3\2\2\2(\u00bf\3\2\2\2*\u00c4\3\2\2\2,\u00c8\3\2\2\2.\u00cf\3"+
		"\2\2\2\60\u00d1\3\2\2\2\62\u00db\3\2\2\2\64\u00e5\3\2\2\2\66\u00e7\3\2"+
		"\2\28\u00e9\3\2\2\2:\u00ee\3\2\2\2<\u00f0\3\2\2\2>\u00f2\3\2\2\2@\u0100"+
		"\3\2\2\2BD\5> \2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3"+
		"\2\2\2HL\5\62\32\2IK\5\62\32\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2"+
		"MO\3\2\2\2NL\3\2\2\2OP\5\6\4\2PQ\5\6\4\2Q\3\3\2\2\2RW\5\n\6\2SW\5\f\7"+
		"\2TW\5\20\t\2UW\5\6\4\2VR\3\2\2\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\5\3\2"+
		"\2\2XY\7\4\2\2YZ\7\"\2\2Z[\5\b\5\2[c\7#\2\2\\]\7\5\2\2]^\7\"\2\2^_\5\b"+
		"\5\2_`\7#\2\2`b\3\2\2\2a\\\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\7\3"+
		"\2\2\2ec\3\2\2\2fj\5\4\3\2gi\5\4\3\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3"+
		"\2\2\2k\t\3\2\2\2lj\3\2\2\2mn\7\7\2\2no\5\22\n\2op\7\6\2\2p\13\3\2\2\2"+
		"qr\5\16\b\2rs\7\32\2\2st\5\22\n\2tu\7\6\2\2u\r\3\2\2\2vz\7&\2\2wy\7\31"+
		"\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\17\3\2\2\2|z\3\2\2\2}~\7"+
		"\3\2\2~\177\7&\2\2\177\u0080\7\6\2\2\u0080\21\3\2\2\2\u0081\u0084\5\24"+
		"\13\2\u0082\u0083\7\n\2\2\u0083\u0085\5\24\13\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\23\3\2\2\2\u0086\u008b\5\26\f\2\u0087\u0088\7\t\2"+
		"\2\u0088\u008a\5\26\f\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\25\3\2\2\2\u008d\u008b\3\2\2"+
		"\2\u008e\u0093\5\30\r\2\u008f\u0090\7\b\2\2\u0090\u0092\5\30\r\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\27\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u009a\5\32\16\2\u0097"+
		"\u0098\7\13\2\2\u0098\u009a\5\30\r\2\u0099\u0096\3\2\2\2\u0099\u0097\3"+
		"\2\2\2\u009a\31\3\2\2\2\u009b\u009f\5\36\20\2\u009c\u009d\5\34\17\2\u009d"+
		"\u009e\5\36\20\2\u009e\u00a0\3\2\2\2\u009f\u009c\3\2\2\2\u009f\u00a0\3"+
		"\2\2\2\u00a0\33\3\2\2\2\u00a1\u00a2\t\2\2\2\u00a2\35\3\2\2\2\u00a3\u00a7"+
		"\5\"\22\2\u00a4\u00a5\5 \21\2\u00a5\u00a6\5\"\22\2\u00a6\u00a8\3\2\2\2"+
		"\u00a7\u00a4\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\37\3\2\2\2\u00a9\u00aa"+
		"\t\3\2\2\u00aa!\3\2\2\2\u00ab\u00b1\5&\24\2\u00ac\u00ad\5$\23\2\u00ad"+
		"\u00ae\5&\24\2\u00ae\u00b0\3\2\2\2\u00af\u00ac\3\2\2\2\u00b0\u00b3\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2#\3\2\2\2\u00b3\u00b1"+
		"\3\2\2\2\u00b4\u00b5\t\4\2\2\u00b5%\3\2\2\2\u00b6\u00bc\5*\26\2\u00b7"+
		"\u00b8\5(\25\2\u00b8\u00b9\5*\26\2\u00b9\u00bb\3\2\2\2\u00ba\u00b7\3\2"+
		"\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\'\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\t\5\2\2\u00c0)\3\2\2\2\u00c1"+
		"\u00c5\5,\27\2\u00c2\u00c3\7\23\2\2\u00c3\u00c5\5*\26\2\u00c4\u00c1\3"+
		"\2\2\2\u00c4\u00c2\3\2\2\2\u00c5+\3\2\2\2\u00c6\u00c9\5\64\33\2\u00c7"+
		"\u00c9\5.\30\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9-\3\2\2\2"+
		"\u00ca\u00cb\7\27\2\2\u00cb\u00cc\5\22\n\2\u00cc\u00cd\7\30\2\2\u00cd"+
		"\u00d0\3\2\2\2\u00ce\u00d0\5\60\31\2\u00cf\u00ca\3\2\2\2\u00cf\u00ce\3"+
		"\2\2\2\u00d0/\3\2\2\2\u00d1\u00d2\b\31\1\2\u00d2\u00d3\58\35\2\u00d3\u00d8"+
		"\3\2\2\2\u00d4\u00d5\f\3\2\2\u00d5\u00d7\7\31\2\2\u00d6\u00d4\3\2\2\2"+
		"\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\61"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7\34\2\2\u00dc\u00dd\7&\2\2\u00dd"+
		"\u00de\7\37\2\2\u00de\u00e1\5:\36\2\u00df\u00e0\7\33\2\2\u00e0\u00e2\5"+
		"\64\33\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\63\3\2\2\2\u00e3"+
		"\u00e6\5\66\34\2\u00e4\u00e6\58\35\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3"+
		"\2\2\2\u00e6\65\3\2\2\2\u00e7\u00e8\t\6\2\2\u00e8\67\3\2\2\2\u00e9\u00ea"+
		"\7&\2\2\u00ea9\3\2\2\2\u00eb\u00ef\7\35\2\2\u00ec\u00ef\7\36\2\2\u00ed"+
		"\u00ef\5<\37\2\u00ee\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2"+
		"\2\2\u00ef;\3\2\2\2\u00f0\u00f1\7&\2\2\u00f1=\3\2\2\2\u00f2\u00f3\7!\2"+
		"\2\u00f3\u00f4\7&\2\2\u00f4\u00f5\7\37\2\2\u00f5\u00f6\7\"\2\2\u00f6\u00fb"+
		"\5@!\2\u00f7\u00f8\7 \2\2\u00f8\u00fa\5@!\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2"+
		"\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\7#\2\2\u00ff?\3\2\2\2\u0100\u0101"+
		"\7&\2\2\u0101A\3\2\2\2\30ELVcjz\u0084\u008b\u0093\u0099\u009f\u00a7\u00b1"+
		"\u00bc\u00c4\u00c8\u00cf\u00d8\u00e1\u00e5\u00ee\u00fb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}