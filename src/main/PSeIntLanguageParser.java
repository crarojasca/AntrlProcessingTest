// Generated from PSeIntLanguage.g by ANTLR 4.5.3
package main;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PSeIntLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, LINE_COMMENT=3, WS=4, SMCOLON=5, COMA=6, DOUBLE=7, STRING=8, 
		INTEGER=9, BOOLEAN=10, TRUE=11, FALSE=12, COMI=13, LLIZ=14, LLDE=15, ID=16;
	public static final int
		RULE_mainprocess = 0, RULE_command = 1, RULE_drawellipse = 2;
	public static final String[] ruleNames = {
		"mainprocess", "command", "drawellipse"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'drawRandomEllipse'", null, null, "';'", "','", null, 
		null, null, null, null, null, null, "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "LINE_COMMENT", "WS", "SMCOLON", "COMA", "DOUBLE", "STRING", 
		"INTEGER", "BOOLEAN", "TRUE", "FALSE", "COMI", "LLIZ", "LLDE", "ID"
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
	public String getGrammarFileName() { return "PSeIntLanguage.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PSeIntLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MainprocessContext extends ParserRuleContext {
		public TerminalNode LLIZ() { return getToken(PSeIntLanguageParser.LLIZ, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode LLDE() { return getToken(PSeIntLanguageParser.LLDE, 0); }
		public TerminalNode EOF() { return getToken(PSeIntLanguageParser.EOF, 0); }
		public MainprocessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainprocess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntLanguageListener ) ((PSeIntLanguageListener)listener).enterMainprocess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntLanguageListener ) ((PSeIntLanguageListener)listener).exitMainprocess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeIntLanguageVisitor ) return ((PSeIntLanguageVisitor<? extends T>)visitor).visitMainprocess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainprocessContext mainprocess() throws RecognitionException {
		MainprocessContext _localctx = new MainprocessContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mainprocess);
		try {
			setState(12);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				match(T__0);
				setState(7);
				match(LLIZ);
				setState(8);
				command();
				setState(9);
				match(LLDE);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				match(EOF);
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

	public static class CommandContext extends ParserRuleContext {
		public DrawellipseContext drawellipse() {
			return getRuleContext(DrawellipseContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntLanguageListener ) ((PSeIntLanguageListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntLanguageListener ) ((PSeIntLanguageListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeIntLanguageVisitor ) return ((PSeIntLanguageVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(18);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				drawellipse();
				setState(15);
				command();
				}
				break;
			case LLDE:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DrawellipseContext extends ParserRuleContext {
		public TerminalNode SMCOLON() { return getToken(PSeIntLanguageParser.SMCOLON, 0); }
		public DrawellipseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawellipse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntLanguageListener ) ((PSeIntLanguageListener)listener).enterDrawellipse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSeIntLanguageListener ) ((PSeIntLanguageListener)listener).exitDrawellipse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSeIntLanguageVisitor ) return ((PSeIntLanguageVisitor<? extends T>)visitor).visitDrawellipse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrawellipseContext drawellipse() throws RecognitionException {
		DrawellipseContext _localctx = new DrawellipseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_drawellipse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__1);
			setState(21);
			match(SMCOLON);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22\32\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\5\2\17\n\2\3\3\3\3\3\3\3\3\5\3\25"+
		"\n\3\3\4\3\4\3\4\3\4\2\2\5\2\4\6\2\2\30\2\16\3\2\2\2\4\24\3\2\2\2\6\26"+
		"\3\2\2\2\b\t\7\3\2\2\t\n\7\20\2\2\n\13\5\4\3\2\13\f\7\21\2\2\f\17\3\2"+
		"\2\2\r\17\7\2\2\3\16\b\3\2\2\2\16\r\3\2\2\2\17\3\3\2\2\2\20\21\5\6\4\2"+
		"\21\22\5\4\3\2\22\25\3\2\2\2\23\25\3\2\2\2\24\20\3\2\2\2\24\23\3\2\2\2"+
		"\25\5\3\2\2\2\26\27\7\4\2\2\27\30\7\7\2\2\30\7\3\2\2\2\4\16\24";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}