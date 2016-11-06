// Generated from PSeIntLanguage.g by ANTLR 4.5.3
package main;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PSeIntLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, LINE_COMMENT=3, WS=4, SMCOLON=5, COMA=6, DOUBLE=7, STRING=8, 
		INTEGER=9, BOOLEAN=10, TRUE=11, FALSE=12, COMI=13, LLIZ=14, LLDE=15, ID=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "LINE_COMMENT", "WS", "SMCOLON", "COMA", "DOUBLE", "STRING", 
		"INTEGER", "BOOLEAN", "TRUE", "FALSE", "COMI", "LLIZ", "LLDE", "ID"
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


	public PSeIntLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PSeIntLanguage.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22\u008a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4B\13\4\3\4\3\4\3\5\6"+
		"\5G\n\5\r\5\16\5H\3\5\3\5\3\6\3\6\3\7\3\7\3\b\6\bR\n\b\r\b\16\bS\3\b\3"+
		"\b\6\bX\n\b\r\b\16\bY\3\t\3\t\7\t^\n\t\f\t\16\ta\13\t\3\t\3\t\3\n\6\n"+
		"f\n\n\r\n\16\ng\3\13\3\13\5\13l\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\7\21\u0086\n\21\f\21\16\21\u0089\13\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\23\4\2\f"+
		"\f\17\17\5\2\13\f\17\17\"\"\3\2\62;\3\2\60\60\5\2\f\f\17\17$$\5\2XXxx"+
		"~~\5\2GGgg~~\5\2TTtt~~\5\2FFff~~\5\2CCcc~~\5\2QQqq~~\5\2HHhh~~\5\2NNn"+
		"n~~\5\2UUuu~~\4\2$$))\4\2C\\c|\6\2\62;C\\aac|\u0091\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5(\3\2\2\2\7:\3"+
		"\2\2\2\tF\3\2\2\2\13L\3\2\2\2\rN\3\2\2\2\17Q\3\2\2\2\21[\3\2\2\2\23e\3"+
		"\2\2\2\25k\3\2\2\2\27m\3\2\2\2\31w\3\2\2\2\33}\3\2\2\2\35\177\3\2\2\2"+
		"\37\u0081\3\2\2\2!\u0083\3\2\2\2#$\7o\2\2$%\7c\2\2%&\7k\2\2&\'\7p\2\2"+
		"\'\4\3\2\2\2()\7f\2\2)*\7t\2\2*+\7c\2\2+,\7y\2\2,-\7T\2\2-.\7c\2\2./\7"+
		"p\2\2/\60\7f\2\2\60\61\7q\2\2\61\62\7o\2\2\62\63\7G\2\2\63\64\7n\2\2\64"+
		"\65\7n\2\2\65\66\7k\2\2\66\67\7r\2\2\678\7u\2\289\7g\2\29\6\3\2\2\2:;"+
		"\7\61\2\2;<\7\61\2\2<@\3\2\2\2=?\n\2\2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2"+
		"@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\b\4\2\2D\b\3\2\2\2EG\t\3\2\2FE\3\2\2"+
		"\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\b\5\2\2K\n\3\2\2\2LM\7=\2"+
		"\2M\f\3\2\2\2NO\7.\2\2O\16\3\2\2\2PR\t\4\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2"+
		"\2\2ST\3\2\2\2TU\3\2\2\2UW\t\5\2\2VX\t\4\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2"+
		"\2\2YZ\3\2\2\2Z\20\3\2\2\2[_\5\33\16\2\\^\n\6\2\2]\\\3\2\2\2^a\3\2\2\2"+
		"_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\5\33\16\2c\22\3\2\2\2df\t\4"+
		"\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\24\3\2\2\2il\5\27\f\2jl"+
		"\5\31\r\2ki\3\2\2\2kj\3\2\2\2l\26\3\2\2\2mn\t\7\2\2no\t\b\2\2op\t\t\2"+
		"\2pq\t\n\2\2qr\t\13\2\2rs\t\n\2\2st\t\b\2\2tu\t\t\2\2uv\t\f\2\2v\30\3"+
		"\2\2\2wx\t\r\2\2xy\t\13\2\2yz\t\16\2\2z{\t\17\2\2{|\t\f\2\2|\32\3\2\2"+
		"\2}~\t\20\2\2~\34\3\2\2\2\177\u0080\7}\2\2\u0080\36\3\2\2\2\u0081\u0082"+
		"\7\177\2\2\u0082 \3\2\2\2\u0083\u0087\t\21\2\2\u0084\u0086\t\22\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\"\3\2\2\2\u0089\u0087\3\2\2\2\13\2@HSY_gk\u0087\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}