// Generated from C:/Users/andre/Desktop/Projects/LC_assigment_1/src\andrey_lan.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class andrey_lanLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, VARIABLE=4, INTTEGER=5, FLOATING=6, NEWLINE=7, 
		WS_SKIP=8, END=9, MUL=10, DIV=11, ADD=12, SUB=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "VARIABLE", "INTTEGER", "FLOATING", "NEWLINE", 
			"WS_SKIP", "END", "MUL", "DIV", "ADD", "SUB"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", null, null, null, null, null, "';'", "'*'", 
			"'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "VARIABLE", "INTTEGER", "FLOATING", "NEWLINE", 
			"WS_SKIP", "END", "MUL", "DIV", "ADD", "SUB"
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


	public andrey_lanLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "andrey_lan.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17T\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6\5%\n\5\r\5"+
		"\16\5&\3\6\6\6*\n\6\r\6\16\6+\3\7\5\7/\n\7\3\7\7\7\62\n\7\f\7\16\7\65"+
		"\13\7\3\7\5\78\n\7\3\7\6\7;\n\7\r\7\16\7<\3\b\5\b@\n\b\3\b\3\b\3\t\6\t"+
		"E\n\t\r\t\16\tF\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\2"+
		"\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3"+
		"\2\7\4\2C\\c|\3\2\62;\4\2--//\3\2\60\60\4\2\13\13\"\"\2[\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7!\3\2\2\2\t$\3\2\2\2\13)\3\2\2"+
		"\2\r.\3\2\2\2\17?\3\2\2\2\21D\3\2\2\2\23J\3\2\2\2\25L\3\2\2\2\27N\3\2"+
		"\2\2\31P\3\2\2\2\33R\3\2\2\2\35\36\7?\2\2\36\4\3\2\2\2\37 \7*\2\2 \6\3"+
		"\2\2\2!\"\7+\2\2\"\b\3\2\2\2#%\t\2\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&"+
		"\'\3\2\2\2\'\n\3\2\2\2(*\t\3\2\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2"+
		"\2,\f\3\2\2\2-/\t\4\2\2.-\3\2\2\2./\3\2\2\2/\67\3\2\2\2\60\62\t\3\2\2"+
		"\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2"+
		"\65\63\3\2\2\2\668\t\5\2\2\67\63\3\2\2\2\678\3\2\2\28:\3\2\2\29;\t\3\2"+
		"\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\16\3\2\2\2>@\7\17\2\2?>\3"+
		"\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\f\2\2B\20\3\2\2\2CE\t\6\2\2DC\3\2\2\2E"+
		"F\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\b\t\2\2I\22\3\2\2\2JK\7=\2\2"+
		"K\24\3\2\2\2LM\7,\2\2M\26\3\2\2\2NO\7\61\2\2O\30\3\2\2\2PQ\7-\2\2Q\32"+
		"\3\2\2\2RS\7/\2\2S\34\3\2\2\2\13\2&+.\63\67<?F\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}