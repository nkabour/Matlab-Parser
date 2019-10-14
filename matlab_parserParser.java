// Generated from matlab_parser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class matlab_parserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, IF=5, ELSE=6, ELSEIF=7, FOR=8, END=9, 
		CR=10, CL=11, NEGATE=12, ASSIGN=13, COMMA=14, SEMICOLON=15, COLON=16, 
		VARNAME=17, INT=18, WS=19, NL=20;
	public static final int
		RULE_script = 0, RULE_command = 1, RULE_var = 2, RULE_elseifstatment = 3, 
		RULE_elsestatment = 4, RULE_ifstatment = 5, RULE_forstatment = 6, RULE_condition = 7, 
		RULE_relationalC = 8, RULE_range = 9, RULE_array = 10, RULE_row = 11, 
		RULE_col = 12;
	public static final String[] ruleNames = {
		"script", "command", "var", "elseifstatment", "elsestatment", "ifstatment", 
		"forstatment", "condition", "relationalC", "range", "array", "row", "col"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'['", "']'", null, null, null, null, null, null, 
		null, "'~'", "'='", "','", "';'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "IF", "ELSE", "ELSEIF", "FOR", "END", "CR", 
		"CL", "NEGATE", "ASSIGN", "COMMA", "SEMICOLON", "COLON", "VARNAME", "INT", 
		"WS", "NL"
	};
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
	public String getGrammarFileName() { return "matlab_parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public matlab_parserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ScriptContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode EOF() { return getToken(matlab_parserParser.EOF, 0); }
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlab_parserListener ) ((matlab_parserListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlab_parserListener ) ((matlab_parserListener)listener).exitScript(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			command();
			setState(27);
			match(EOF);
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

	public static class CommandContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public IfstatmentContext ifstatment() {
			return getRuleContext(IfstatmentContext.class,0);
		}
		public ElsestatmentContext elsestatment() {
			return getRuleContext(ElsestatmentContext.class,0);
		}
		public ElseifstatmentContext elseifstatment() {
			return getRuleContext(ElseifstatmentContext.class,0);
		}
		public ForstatmentContext forstatment() {
			return getRuleContext(ForstatmentContext.class,0);
		}
		public TerminalNode NL() { return getToken(matlab_parserParser.NL, 0); }
		public TerminalNode WS() { return getToken(matlab_parserParser.WS, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlab_parserListener ) ((matlab_parserListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlab_parserListener ) ((matlab_parserListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(29);
				var();
				}
				break;
			case 2:
				{
				setState(30);
				array();
				}
				break;
			case 3:
				{
				setState(31);
				ifstatment();
				}
				break;
			case 4:
				{
				setState(32);
				elsestatment();
				}
				break;
			case 5:
				{
				setState(33);
				elseifstatment();
				}
				break;
			case 6:
				{
				setState(34);
				forstatment();
				}
				break;
			case 7:
				{
				setState(35);
				match(NL);
				}
				break;
			case 8:
				{
				setState(36);
				match(WS);
				}
				break;
			}
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(39);
					command();
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(matlab_parserParser.VARNAME, 0); }
		public TerminalNode ASSIGN() { return getToken(matlab_parserParser.ASSIGN, 0); }
		public TerminalNode INT() { return getToken(matlab_parserParser.INT, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlab_parserListener ) ((matlab_parserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlab_parserListener ) ((matlab_parserListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(VARNAME);
			setState(46);
			match(ASSIGN);
			setState(47);
			match(INT);
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

	public static class ElseifstatmentContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(matlab_parserParser.IF, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(matlab_parserParser.ELSE, 0); }
		public TerminalNode END() { return getToken(matlab_parserParser.END, 0); }
		public List<IfstatmentContext> ifstatment() {
			return getRuleContexts(IfstatmentContext.class);
		}
		public IfstatmentContext ifstatment(int i) {
			return getRuleContext(IfstatmentContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(matlab_parserParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(matlab_parserParser.ELSEIF, i);
		}
		public ElseifstatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifstatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlab_parserListener ) ((matlab_parserListener)listener).enterElseifstatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlab_parserListener ) ((matlab_parserListener)listener).exitElseifstatment(this);
		}
	}

	public final ElseifstatmentContext elseifstatment() throws RecognitionException {
		ElseifstatmentContext _localctx = new ElseifstatmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_elseifstatment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(49);
			match(IF);
			setState(50);
			condition();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF) {
				{
				{
				setState(51);
				ifstatment();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				match(ELSEIF);
				setState(58);
				condition();
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IF) {
					{
					{
					setState(59);
					ifstatment();
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ELSEIF );
			setState(69);
			match(ELSE);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF) {
				{
				{
				setState(70);
				ifstatment();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(END);
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

	public static class ElsestatmentContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(matlab_parserParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(matlab_parserParser.ELSE, 0); }
		public TerminalNode END() { return getToken(matlab_parserParser.END, 0); }
		public List<IfstatmentContext> ifstatment() {
			return getRuleContexts(IfstatmentContext.class);
		}
		public IfstatmentContext ifstatment(int i) {
			return getRuleContext(IfstatmentContext.class,i);
		}
		public ElsestatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlab_parserListener ) ((matlab_parserListener)listener).enterElsestatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlab_parserListener ) ((matlab_parserListener)listener).exitElsestatment(this);
		}
	}

	public final ElsestatmentContext elsestatment() throws RecognitionException {
		ElsestatmentContext _localctx = new ElsestatmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elsestatment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(78);
			match(IF);
			setState(79);
			condition();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF) {
				{
				{
				setState(80);
				ifstatment();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(ELSE);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF) {
				{
				{
				setState(87);
				ifstatment();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(END);
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

	public static class IfstatmentContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(matlab_parserParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode END() { return getToken(matlab_parserParser.END, 0); }
		public List<IfstatmentContext> ifstatment() {
			return getRuleContexts(IfstatmentContext.class);
		}
		public IfstatmentContext ifstatment(int i) {
			return getRuleContext(IfstatmentContext.class,i);
		}
		public IfstatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlab_parserListener ) ((matlab_parserListener)listener).enterIfstatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlab_parserListener ) ((matlab_parserListener)listener).exitIfstatment(this);
		}
	}

	public final IfstatmentContext ifstatment() throws RecognitionException {
		IfstatmentContext _localctx = new IfstatmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifstatment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(IF);
			setState(96);
			condition();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF) {
				{
				{
				setState(97);
				ifstatment();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(END);
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

	public static class ForstatmentContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(matlab_parserParser.FOR, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TerminalNode END() { return getToken(matlab_parserParser.END, 0); }
		public List<ForstatmentContext> forstatment() {
			return getRuleContexts(ForstatmentContext.class);
		}
		public ForstatmentContext forstatment(int i) {
			return getRuleContext(ForstatmentContext.class,i);
		}
		public ForstatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlab_parserListener ) ((matlab_parserListener)listener).enterForstatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlab_parserListener ) ((matlab_parserListener)listener).exitForstatment(this);
		}
	}

	public final ForstatmentContext forstatment() throws RecognitionException {
		ForstatmentContext _localctx = new ForstatmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forstatment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(FOR);
			setState(106);
			range();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FOR) {
				{
				{
				setState(107);
				forstatment();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(END);
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

	public static class ConditionContext extends ParserRuleContext {
		public List<RelationalCContext> relationalC() {
			return getRuleContexts(RelationalCContext.class);
		}
		public RelationalCContext relationalC(int i) {
			return getRuleContext(RelationalCContext.class,i);
		}
		public TerminalNode CL() { return getToken(matlab_parserParser.CL, 0); }
		public TerminalNode NEGATE() { return getToken(matlab_parserParser.NEGATE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlab_parserListener ) ((matlab_parserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlab_parserListener ) ((matlab_parserListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(115);
				relationalC();
				setState(116);
				match(CL);
				setState(117);
				relationalC();
				}
				break;
			case 2:
				{
				setState(119);
				match(NEGATE);
				setState(120);
				match(T__0);
				setState(121);
				relationalC();
				setState(122);
				match(CL);
				setState(123);
				relationalC();
				setState(124);
				match(T__1);
				}
				break;
			case 3:
				{
				setState(126);
				relationalC();
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

	public static class RelationalCContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(matlab_parserParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(matlab_parserParser.VARNAME, i);
		}
		public TerminalNode CR() { return getToken(matlab_parserParser.CR, 0); }
		public TerminalNode NEGATE() { return getToken(matlab_parserParser.NEGATE, 0); }
		public RelationalCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlab_parserListener ) ((matlab_parserListener)listener).enterRelationalC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlab_parserListener ) ((matlab_parserListener)listener).exitRelationalC(this);
		}
	}

	public final RelationalCContext relationalC() throws RecognitionException {
		RelationalCContext _localctx = new RelationalCContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_relationalC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				{
				setState(129);
				match(VARNAME);
				setState(130);
				match(CR);
				setState(131);
				match(VARNAME);
				}
				break;
			case NEGATE:
				{
				setState(132);
				match(NEGATE);
				setState(133);
				match(T__0);
				setState(134);
				match(VARNAME);
				setState(135);
				match(CR);
				setState(136);
				match(VARNAME);
				setState(137);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class RangeContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(matlab_parserParser.VARNAME, 0); }
		public TerminalNode ASSIGN() { return getToken(matlab_parserParser.ASSIGN, 0); }
		public List<TerminalNode> INT() { return getTokens(matlab_parserParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(matlab_parserParser.INT, i);
		}
		public TerminalNode COLON() { return getToken(matlab_parserParser.COLON, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlab_parserListener ) ((matlab_parserListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlab_parserListener ) ((matlab_parserListener)listener).exitRange(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(VARNAME);
			setState(141);
			match(ASSIGN);
			setState(142);
			match(INT);
			setState(143);
			match(COLON);
			setState(144);
			match(INT);
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(matlab_parserParser.VARNAME, 0); }
		public TerminalNode ASSIGN() { return getToken(matlab_parserParser.ASSIGN, 0); }
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public ColContext col() {
			return getRuleContext(ColContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlab_parserListener ) ((matlab_parserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlab_parserListener ) ((matlab_parserListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(146);
				match(VARNAME);
				setState(147);
				match(ASSIGN);
				setState(148);
				match(T__2);
				setState(149);
				row();
				setState(150);
				match(T__3);
				}
				break;
			case 2:
				{
				setState(152);
				match(VARNAME);
				setState(153);
				match(ASSIGN);
				setState(154);
				match(T__2);
				setState(155);
				col();
				setState(156);
				match(T__3);
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

	public static class RowContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(matlab_parserParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(matlab_parserParser.INT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(matlab_parserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(matlab_parserParser.COMMA, i);
		}
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlab_parserListener ) ((matlab_parserListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlab_parserListener ) ((matlab_parserListener)listener).exitRow(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_row);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(160);
				match(INT);
				setState(161);
				match(COMMA);
				setState(162);
				row();
				setState(163);
				match(COMMA);
				setState(164);
				match(INT);
				}
				break;
			case 2:
				{
				setState(166);
				match(INT);
				setState(167);
				match(COMMA);
				setState(168);
				match(INT);
				}
				break;
			case 3:
				{
				setState(169);
				match(INT);
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

	public static class ColContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(matlab_parserParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(matlab_parserParser.INT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(matlab_parserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(matlab_parserParser.COMMA, i);
		}
		public ColContext col() {
			return getRuleContext(ColContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(matlab_parserParser.SEMICOLON, 0); }
		public ColContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlab_parserListener ) ((matlab_parserListener)listener).enterCol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlab_parserListener ) ((matlab_parserListener)listener).exitCol(this);
		}
	}

	public final ColContext col() throws RecognitionException {
		ColContext _localctx = new ColContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_col);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(172);
				match(INT);
				setState(173);
				match(COMMA);
				setState(174);
				col();
				setState(175);
				match(COMMA);
				setState(176);
				match(INT);
				}
				break;
			case 2:
				{
				setState(178);
				match(INT);
				setState(179);
				col();
				setState(180);
				match(INT);
				}
				break;
			case 3:
				{
				setState(182);
				match(SEMICOLON);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u00bc\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3(\n\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\7\5\67\n\5\f\5\16\5:\13\5\3\5\3\5\3\5\7\5?\n\5\f\5\16\5B\13\5\6\5D"+
		"\n\5\r\5\16\5E\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\5\3\5\3\6\3\6\3\6\7\6"+
		"T\n\6\f\6\16\6W\13\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\6\3\6\3\7\3\7\3"+
		"\7\7\7e\n\7\f\7\16\7h\13\7\3\7\3\7\3\b\3\b\3\b\7\bo\n\b\f\b\16\br\13\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0082\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008d\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a1\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ad\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ba\n\16\3\16\2\2\17\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\2\2\2\u00c6\2\34\3\2\2\2\4\'\3\2\2\2\6"+
		"/\3\2\2\2\b\63\3\2\2\2\nP\3\2\2\2\fa\3\2\2\2\16k\3\2\2\2\20\u0081\3\2"+
		"\2\2\22\u008c\3\2\2\2\24\u008e\3\2\2\2\26\u00a0\3\2\2\2\30\u00ac\3\2\2"+
		"\2\32\u00b9\3\2\2\2\34\35\5\4\3\2\35\36\7\2\2\3\36\3\3\2\2\2\37(\5\6\4"+
		"\2 (\5\26\f\2!(\5\f\7\2\"(\5\n\6\2#(\5\b\5\2$(\5\16\b\2%(\7\26\2\2&(\7"+
		"\25\2\2\'\37\3\2\2\2\' \3\2\2\2\'!\3\2\2\2\'\"\3\2\2\2\'#\3\2\2\2\'$\3"+
		"\2\2\2\'%\3\2\2\2\'&\3\2\2\2(,\3\2\2\2)+\5\4\3\2*)\3\2\2\2+.\3\2\2\2,"+
		"*\3\2\2\2,-\3\2\2\2-\5\3\2\2\2.,\3\2\2\2/\60\7\23\2\2\60\61\7\17\2\2\61"+
		"\62\7\24\2\2\62\7\3\2\2\2\63\64\7\7\2\2\648\5\20\t\2\65\67\5\f\7\2\66"+
		"\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29C\3\2\2\2:8\3\2\2\2;<\7"+
		"\t\2\2<@\5\20\t\2=?\5\f\7\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AD"+
		"\3\2\2\2B@\3\2\2\2C;\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2G"+
		"K\7\b\2\2HJ\5\f\7\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2"+
		"MK\3\2\2\2NO\7\13\2\2O\t\3\2\2\2PQ\7\7\2\2QU\5\20\t\2RT\5\f\7\2SR\3\2"+
		"\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2X\\\7\b\2\2Y[\5"+
		"\f\7\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2"+
		"_`\7\13\2\2`\13\3\2\2\2ab\7\7\2\2bf\5\20\t\2ce\5\f\7\2dc\3\2\2\2eh\3\2"+
		"\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7\13\2\2j\r\3\2\2\2kl\7"+
		"\n\2\2lp\5\24\13\2mo\5\16\b\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2"+
		"qs\3\2\2\2rp\3\2\2\2st\7\13\2\2t\17\3\2\2\2uv\5\22\n\2vw\7\r\2\2wx\5\22"+
		"\n\2x\u0082\3\2\2\2yz\7\16\2\2z{\7\3\2\2{|\5\22\n\2|}\7\r\2\2}~\5\22\n"+
		"\2~\177\7\4\2\2\177\u0082\3\2\2\2\u0080\u0082\5\22\n\2\u0081u\3\2\2\2"+
		"\u0081y\3\2\2\2\u0081\u0080\3\2\2\2\u0082\21\3\2\2\2\u0083\u0084\7\23"+
		"\2\2\u0084\u0085\7\f\2\2\u0085\u008d\7\23\2\2\u0086\u0087\7\16\2\2\u0087"+
		"\u0088\7\3\2\2\u0088\u0089\7\23\2\2\u0089\u008a\7\f\2\2\u008a\u008b\7"+
		"\23\2\2\u008b\u008d\7\4\2\2\u008c\u0083\3\2\2\2\u008c\u0086\3\2\2\2\u008d"+
		"\23\3\2\2\2\u008e\u008f\7\23\2\2\u008f\u0090\7\17\2\2\u0090\u0091\7\24"+
		"\2\2\u0091\u0092\7\22\2\2\u0092\u0093\7\24\2\2\u0093\25\3\2\2\2\u0094"+
		"\u0095\7\23\2\2\u0095\u0096\7\17\2\2\u0096\u0097\7\5\2\2\u0097\u0098\5"+
		"\30\r\2\u0098\u0099\7\6\2\2\u0099\u00a1\3\2\2\2\u009a\u009b\7\23\2\2\u009b"+
		"\u009c\7\17\2\2\u009c\u009d\7\5\2\2\u009d\u009e\5\32\16\2\u009e\u009f"+
		"\7\6\2\2\u009f\u00a1\3\2\2\2\u00a0\u0094\3\2\2\2\u00a0\u009a\3\2\2\2\u00a1"+
		"\27\3\2\2\2\u00a2\u00a3\7\24\2\2\u00a3\u00a4\7\20\2\2\u00a4\u00a5\5\30"+
		"\r\2\u00a5\u00a6\7\20\2\2\u00a6\u00a7\7\24\2\2\u00a7\u00ad\3\2\2\2\u00a8"+
		"\u00a9\7\24\2\2\u00a9\u00aa\7\20\2\2\u00aa\u00ad\7\24\2\2\u00ab\u00ad"+
		"\7\24\2\2\u00ac\u00a2\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ac\u00ab\3\2\2\2"+
		"\u00ad\31\3\2\2\2\u00ae\u00af\7\24\2\2\u00af\u00b0\7\20\2\2\u00b0\u00b1"+
		"\5\32\16\2\u00b1\u00b2\7\20\2\2\u00b2\u00b3\7\24\2\2\u00b3\u00ba\3\2\2"+
		"\2\u00b4\u00b5\7\24\2\2\u00b5\u00b6\5\32\16\2\u00b6\u00b7\7\24\2\2\u00b7"+
		"\u00ba\3\2\2\2\u00b8\u00ba\7\21\2\2\u00b9\u00ae\3\2\2\2\u00b9\u00b4\3"+
		"\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\33\3\2\2\2\21\',8@EKU\\fp\u0081\u008c"+
		"\u00a0\u00ac\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}