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
		CHOICE=1, NONDET_OR=2, SEMICOLON=3, ASSUME=4, AND=5, OR=6, IMPLIES=7, 
		NOT=8, EQ=9, NEQ=10, LT=11, GT=12, LEQ=13, GEQ=14, PLUS=15, MINUS=16, 
		MUL=17, DIV=18, MOD=19, LPAREN=20, RPAREN=21, PRIME=22, ASSIGN=23, EQUALS=24, 
		VAR=25, INT=26, BOOL=27, DP=28, COMMA=29, TYPE=30, LCURLY=31, RCURLY=32, 
		INTLIT=33, BOOLLIT=34, ID=35, WS=36;
	public static final int
		RULE_xsts = 0, RULE_action = 1, RULE_nonDetAction = 2, RULE_sequentialAction = 3, 
		RULE_assumeAction = 4, RULE_assignAction = 5, RULE_assignLHS = 6, RULE_implyExpression = 7, 
		RULE_orExpr = 8, RULE_andExpr = 9, RULE_notExpr = 10, RULE_eqExpr = 11, 
		RULE_eqOperator = 12, RULE_relationExpr = 13, RULE_relationOperator = 14, 
		RULE_additiveExpr = 15, RULE_additiveOperator = 16, RULE_multiplicativeExpr = 17, 
		RULE_multiplicativeOperator = 18, RULE_negExpr = 19, RULE_primaryExpr = 20, 
		RULE_parenExpr = 21, RULE_prime = 22, RULE_variableDeclaration = 23, RULE_value = 24, 
		RULE_literal = 25, RULE_reference = 26, RULE_typeName = 27, RULE_customType = 28, 
		RULE_typeDeclaration = 29, RULE_typeLiteral = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"xsts", "action", "nonDetAction", "sequentialAction", "assumeAction", 
			"assignAction", "assignLHS", "implyExpression", "orExpr", "andExpr", 
			"notExpr", "eqExpr", "eqOperator", "relationExpr", "relationOperator", 
			"additiveExpr", "additiveOperator", "multiplicativeExpr", "multiplicativeOperator", 
			"negExpr", "primaryExpr", "parenExpr", "prime", "variableDeclaration", 
			"value", "literal", "reference", "typeName", "customType", "typeDeclaration", 
			"typeLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'choice'", "'or'", "';'", "'assume'", "'&&'", "'||'", "'->'", 
			"'!'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'('", "')'", "'''", "':='", "'='", "'var'", "'integer'", 
			"'boolean'", "':'", "','", "'type'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CHOICE", "NONDET_OR", "SEMICOLON", "ASSUME", "AND", "OR", "IMPLIES", 
			"NOT", "EQ", "NEQ", "LT", "GT", "LEQ", "GEQ", "PLUS", "MINUS", "MUL", 
			"DIV", "MOD", "LPAREN", "RPAREN", "PRIME", "ASSIGN", "EQUALS", "VAR", 
			"INT", "BOOL", "DP", "COMMA", "TYPE", "LCURLY", "RCURLY", "INTLIT", "BOOLLIT", 
			"ID", "WS"
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
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(62);
				((XstsContext)_localctx).typeDeclaration = typeDeclaration();
				((XstsContext)_localctx).typeDeclarations.add(((XstsContext)_localctx).typeDeclaration);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			((XstsContext)_localctx).variableDeclaration = variableDeclaration();
			((XstsContext)_localctx).variableDeclarations.add(((XstsContext)_localctx).variableDeclaration);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(69);
				((XstsContext)_localctx).variableDeclaration = variableDeclaration();
				((XstsContext)_localctx).variableDeclarations.add(((XstsContext)_localctx).variableDeclaration);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			((XstsContext)_localctx).transitions = nonDetAction();
			setState(76);
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
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSUME:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				assumeAction();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				assignAction();
				}
				break;
			case CHOICE:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
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
			setState(83);
			match(CHOICE);
			setState(84);
			match(LCURLY);
			setState(85);
			((NonDetActionContext)_localctx).sequentialAction = sequentialAction();
			((NonDetActionContext)_localctx).choices.add(((NonDetActionContext)_localctx).sequentialAction);
			setState(86);
			match(RCURLY);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NONDET_OR) {
				{
				{
				setState(87);
				match(NONDET_OR);
				setState(88);
				match(LCURLY);
				setState(89);
				((NonDetActionContext)_localctx).sequentialAction = sequentialAction();
				((NonDetActionContext)_localctx).choices.add(((NonDetActionContext)_localctx).sequentialAction);
				setState(90);
				match(RCURLY);
				}
				}
				setState(96);
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
			setState(97);
			((SequentialActionContext)_localctx).action = action();
			((SequentialActionContext)_localctx).actions.add(((SequentialActionContext)_localctx).action);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHOICE) | (1L << ASSUME) | (1L << ID))) != 0)) {
				{
				{
				setState(98);
				((SequentialActionContext)_localctx).action = action();
				((SequentialActionContext)_localctx).actions.add(((SequentialActionContext)_localctx).action);
				}
				}
				setState(103);
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
			setState(104);
			match(ASSUME);
			setState(105);
			((AssumeActionContext)_localctx).cond = implyExpression();
			setState(106);
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
			setState(108);
			((AssignActionContext)_localctx).lhs = assignLHS();
			setState(109);
			match(ASSIGN);
			setState(110);
			((AssignActionContext)_localctx).rhs = implyExpression();
			setState(111);
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
			setState(113);
			((AssignLHSContext)_localctx).name = match(ID);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRIME) {
				{
				{
				setState(114);
				match(PRIME);
				}
				}
				setState(119);
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
		enterRule(_localctx, 14, RULE_implyExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			((ImplyExpressionContext)_localctx).orExpr = orExpr();
			((ImplyExpressionContext)_localctx).ops.add(((ImplyExpressionContext)_localctx).orExpr);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLIES) {
				{
				setState(121);
				match(IMPLIES);
				setState(122);
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
		enterRule(_localctx, 16, RULE_orExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			((OrExprContext)_localctx).andExpr = andExpr();
			((OrExprContext)_localctx).ops.add(((OrExprContext)_localctx).andExpr);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(126);
				match(OR);
				setState(127);
				((OrExprContext)_localctx).andExpr = andExpr();
				((OrExprContext)_localctx).ops.add(((OrExprContext)_localctx).andExpr);
				}
				}
				setState(132);
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
		enterRule(_localctx, 18, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			((AndExprContext)_localctx).notExpr = notExpr();
			((AndExprContext)_localctx).ops.add(((AndExprContext)_localctx).notExpr);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(134);
				match(AND);
				setState(135);
				((AndExprContext)_localctx).notExpr = notExpr();
				((AndExprContext)_localctx).ops.add(((AndExprContext)_localctx).notExpr);
				}
				}
				setState(140);
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
		enterRule(_localctx, 20, RULE_notExpr);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case LPAREN:
			case INTLIT:
			case BOOLLIT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				eqExpr();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(NOT);
				setState(143);
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
		enterRule(_localctx, 22, RULE_eqExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			((EqExprContext)_localctx).relationExpr = relationExpr();
			((EqExprContext)_localctx).ops.add(((EqExprContext)_localctx).relationExpr);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ || _la==NEQ) {
				{
				setState(147);
				((EqExprContext)_localctx).oper = eqOperator();
				setState(148);
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
		enterRule(_localctx, 24, RULE_eqOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
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
		enterRule(_localctx, 26, RULE_relationExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			((RelationExprContext)_localctx).additiveExpr = additiveExpr();
			((RelationExprContext)_localctx).ops.add(((RelationExprContext)_localctx).additiveExpr);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LEQ) | (1L << GEQ))) != 0)) {
				{
				setState(155);
				((RelationExprContext)_localctx).oper = relationOperator();
				setState(156);
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
		enterRule(_localctx, 28, RULE_relationOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
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
		enterRule(_localctx, 30, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			((AdditiveExprContext)_localctx).multiplicativeExpr = multiplicativeExpr();
			((AdditiveExprContext)_localctx).ops.add(((AdditiveExprContext)_localctx).multiplicativeExpr);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(163);
				((AdditiveExprContext)_localctx).additiveOperator = additiveOperator();
				((AdditiveExprContext)_localctx).opers.add(((AdditiveExprContext)_localctx).additiveOperator);
				setState(164);
				((AdditiveExprContext)_localctx).multiplicativeExpr = multiplicativeExpr();
				((AdditiveExprContext)_localctx).ops.add(((AdditiveExprContext)_localctx).multiplicativeExpr);
				}
				}
				setState(170);
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
		enterRule(_localctx, 32, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
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
		enterRule(_localctx, 34, RULE_multiplicativeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			((MultiplicativeExprContext)_localctx).negExpr = negExpr();
			((MultiplicativeExprContext)_localctx).ops.add(((MultiplicativeExprContext)_localctx).negExpr);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				{
				setState(174);
				((MultiplicativeExprContext)_localctx).multiplicativeOperator = multiplicativeOperator();
				((MultiplicativeExprContext)_localctx).opers.add(((MultiplicativeExprContext)_localctx).multiplicativeOperator);
				setState(175);
				((MultiplicativeExprContext)_localctx).negExpr = negExpr();
				((MultiplicativeExprContext)_localctx).ops.add(((MultiplicativeExprContext)_localctx).negExpr);
				}
				}
				setState(181);
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
		enterRule(_localctx, 36, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
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
		enterRule(_localctx, 38, RULE_negExpr);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case INTLIT:
			case BOOLLIT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				primaryExpr();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(MINUS);
				setState(186);
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
		enterRule(_localctx, 40, RULE_primaryExpr);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
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
		enterRule(_localctx, 42, RULE_parenExpr);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(LPAREN);
				setState(194);
				((ParenExprContext)_localctx).implyExpression = implyExpression();
				((ParenExprContext)_localctx).ops.add(((ParenExprContext)_localctx).implyExpression);
				setState(195);
				match(RPAREN);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_prime, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(201);
			reference();
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
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
					setState(203);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(204);
					match(PRIME);
					}
					} 
				}
				setState(209);
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
		enterRule(_localctx, 46, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(VAR);
			setState(211);
			((VariableDeclarationContext)_localctx).name = match(ID);
			setState(212);
			match(DP);
			setState(213);
			((VariableDeclarationContext)_localctx).type = typeName();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(214);
				match(EQUALS);
				setState(215);
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
		enterRule(_localctx, 48, RULE_value);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLIT:
			case BOOLLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				literal();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
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
		enterRule(_localctx, 50, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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
		enterRule(_localctx, 52, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
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
		enterRule(_localctx, 54, RULE_typeName);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(INT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(BOOL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
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
		enterRule(_localctx, 56, RULE_customType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
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
		enterRule(_localctx, 58, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(TYPE);
			setState(234);
			((TypeDeclarationContext)_localctx).name = match(ID);
			setState(235);
			match(DP);
			setState(236);
			match(LCURLY);
			setState(237);
			((TypeDeclarationContext)_localctx).typeLiteral = typeLiteral();
			((TypeDeclarationContext)_localctx).literals.add(((TypeDeclarationContext)_localctx).typeLiteral);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(238);
				match(COMMA);
				setState(239);
				((TypeDeclarationContext)_localctx).typeLiteral = typeLiteral();
				((TypeDeclarationContext)_localctx).literals.add(((TypeDeclarationContext)_localctx).typeLiteral);
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
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
		enterRule(_localctx, 60, RULE_typeLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
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
		case 22:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00fc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\7\2B\n\2\f\2\16\2E\13\2\3\2\3\2\7\2I\n\2\f\2\16\2L\13\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\5\3T\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4_\n\4\f\4\16"+
		"\4b\13\4\3\5\3\5\7\5f\n\5\f\5\16\5i\13\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\7\bv\n\b\f\b\16\by\13\b\3\t\3\t\3\t\5\t~\n\t\3\n\3\n\3"+
		"\n\7\n\u0083\n\n\f\n\16\n\u0086\13\n\3\13\3\13\3\13\7\13\u008b\n\13\f"+
		"\13\16\13\u008e\13\13\3\f\3\f\3\f\5\f\u0093\n\f\3\r\3\r\3\r\3\r\5\r\u0099"+
		"\n\r\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00a1\n\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\7\21\u00a9\n\21\f\21\16\21\u00ac\13\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\7\23\u00b4\n\23\f\23\16\23\u00b7\13\23\3\24\3\24\3\25\3\25"+
		"\3\25\5\25\u00be\n\25\3\26\3\26\5\26\u00c2\n\26\3\27\3\27\3\27\3\27\3"+
		"\27\5\27\u00c9\n\27\3\30\3\30\3\30\3\30\3\30\7\30\u00d0\n\30\f\30\16\30"+
		"\u00d3\13\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00db\n\31\3\32\3\32\5"+
		"\32\u00df\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\5\35\u00e8\n\35\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u00f3\n\37\f\37\16\37\u00f6"+
		"\13\37\3\37\3\37\3 \3 \3 \2\3.!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>\2\7\3\2\13\f\3\2\r\20\3\2\21\22\3\2\23\25\3"+
		"\2#$\2\u00f4\2C\3\2\2\2\4S\3\2\2\2\6U\3\2\2\2\bc\3\2\2\2\nj\3\2\2\2\f"+
		"n\3\2\2\2\16s\3\2\2\2\20z\3\2\2\2\22\177\3\2\2\2\24\u0087\3\2\2\2\26\u0092"+
		"\3\2\2\2\30\u0094\3\2\2\2\32\u009a\3\2\2\2\34\u009c\3\2\2\2\36\u00a2\3"+
		"\2\2\2 \u00a4\3\2\2\2\"\u00ad\3\2\2\2$\u00af\3\2\2\2&\u00b8\3\2\2\2(\u00bd"+
		"\3\2\2\2*\u00c1\3\2\2\2,\u00c8\3\2\2\2.\u00ca\3\2\2\2\60\u00d4\3\2\2\2"+
		"\62\u00de\3\2\2\2\64\u00e0\3\2\2\2\66\u00e2\3\2\2\28\u00e7\3\2\2\2:\u00e9"+
		"\3\2\2\2<\u00eb\3\2\2\2>\u00f9\3\2\2\2@B\5<\37\2A@\3\2\2\2BE\3\2\2\2C"+
		"A\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FJ\5\60\31\2GI\5\60\31\2HG\3\2"+
		"\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\5\6\4\2NO\5\6"+
		"\4\2O\3\3\2\2\2PT\5\n\6\2QT\5\f\7\2RT\5\6\4\2SP\3\2\2\2SQ\3\2\2\2SR\3"+
		"\2\2\2T\5\3\2\2\2UV\7\3\2\2VW\7!\2\2WX\5\b\5\2X`\7\"\2\2YZ\7\4\2\2Z[\7"+
		"!\2\2[\\\5\b\5\2\\]\7\"\2\2]_\3\2\2\2^Y\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a"+
		"\3\2\2\2a\7\3\2\2\2b`\3\2\2\2cg\5\4\3\2df\5\4\3\2ed\3\2\2\2fi\3\2\2\2"+
		"ge\3\2\2\2gh\3\2\2\2h\t\3\2\2\2ig\3\2\2\2jk\7\6\2\2kl\5\20\t\2lm\7\5\2"+
		"\2m\13\3\2\2\2no\5\16\b\2op\7\31\2\2pq\5\20\t\2qr\7\5\2\2r\r\3\2\2\2s"+
		"w\7%\2\2tv\7\30\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\17\3\2\2"+
		"\2yw\3\2\2\2z}\5\22\n\2{|\7\t\2\2|~\5\22\n\2}{\3\2\2\2}~\3\2\2\2~\21\3"+
		"\2\2\2\177\u0084\5\24\13\2\u0080\u0081\7\b\2\2\u0081\u0083\5\24\13\2\u0082"+
		"\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\23\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008c\5\26\f\2\u0088\u0089"+
		"\7\7\2\2\u0089\u008b\5\26\f\2\u008a\u0088\3\2\2\2\u008b\u008e\3\2\2\2"+
		"\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\25\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008f\u0093\5\30\r\2\u0090\u0091\7\n\2\2\u0091\u0093\5\26\f\2"+
		"\u0092\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0093\27\3\2\2\2\u0094\u0098"+
		"\5\34\17\2\u0095\u0096\5\32\16\2\u0096\u0097\5\34\17\2\u0097\u0099\3\2"+
		"\2\2\u0098\u0095\3\2\2\2\u0098\u0099\3\2\2\2\u0099\31\3\2\2\2\u009a\u009b"+
		"\t\2\2\2\u009b\33\3\2\2\2\u009c\u00a0\5 \21\2\u009d\u009e\5\36\20\2\u009e"+
		"\u009f\5 \21\2\u009f\u00a1\3\2\2\2\u00a0\u009d\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\35\3\2\2\2\u00a2\u00a3\t\3\2\2\u00a3\37\3\2\2\2\u00a4\u00aa"+
		"\5$\23\2\u00a5\u00a6\5\"\22\2\u00a6\u00a7\5$\23\2\u00a7\u00a9\3\2\2\2"+
		"\u00a8\u00a5\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab!\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\t\4\2\2\u00ae"+
		"#\3\2\2\2\u00af\u00b5\5(\25\2\u00b0\u00b1\5&\24\2\u00b1\u00b2\5(\25\2"+
		"\u00b2\u00b4\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6%\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00b9\t\5\2\2\u00b9\'\3\2\2\2\u00ba\u00be\5*\26\2\u00bb\u00bc\7\22\2"+
		"\2\u00bc\u00be\5(\25\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be)"+
		"\3\2\2\2\u00bf\u00c2\5\62\32\2\u00c0\u00c2\5,\27\2\u00c1\u00bf\3\2\2\2"+
		"\u00c1\u00c0\3\2\2\2\u00c2+\3\2\2\2\u00c3\u00c4\7\26\2\2\u00c4\u00c5\5"+
		"\20\t\2\u00c5\u00c6\7\27\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c9\5.\30\2\u00c8"+
		"\u00c3\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9-\3\2\2\2\u00ca\u00cb\b\30\1\2"+
		"\u00cb\u00cc\5\66\34\2\u00cc\u00d1\3\2\2\2\u00cd\u00ce\f\3\2\2\u00ce\u00d0"+
		"\7\30\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2"+
		"\u00d1\u00d2\3\2\2\2\u00d2/\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7"+
		"\33\2\2\u00d5\u00d6\7%\2\2\u00d6\u00d7\7\36\2\2\u00d7\u00da\58\35\2\u00d8"+
		"\u00d9\7\32\2\2\u00d9\u00db\5\62\32\2\u00da\u00d8\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\61\3\2\2\2\u00dc\u00df\5\64\33\2\u00dd\u00df\5\66\34\2"+
		"\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\63\3\2\2\2\u00e0\u00e1"+
		"\t\6\2\2\u00e1\65\3\2\2\2\u00e2\u00e3\7%\2\2\u00e3\67\3\2\2\2\u00e4\u00e8"+
		"\7\34\2\2\u00e5\u00e8\7\35\2\2\u00e6\u00e8\5:\36\2\u00e7\u00e4\3\2\2\2"+
		"\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e89\3\2\2\2\u00e9\u00ea\7"+
		"%\2\2\u00ea;\3\2\2\2\u00eb\u00ec\7 \2\2\u00ec\u00ed\7%\2\2\u00ed\u00ee"+
		"\7\36\2\2\u00ee\u00ef\7!\2\2\u00ef\u00f4\5> \2\u00f0\u00f1\7\37\2\2\u00f1"+
		"\u00f3\5> \2\u00f2\u00f0\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2"+
		"\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8"+
		"\7\"\2\2\u00f8=\3\2\2\2\u00f9\u00fa\7%\2\2\u00fa?\3\2\2\2\30CJS`gw}\u0084"+
		"\u008c\u0092\u0098\u00a0\u00aa\u00b5\u00bd\u00c1\u00c8\u00d1\u00da\u00de"+
		"\u00e7\u00f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}