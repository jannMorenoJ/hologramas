// Generated from /home/jann/Documents/UN/algoritmos/prueba/Hologram.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HologramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEW=1, D3=2, D2=3, SOLIDO=4, FIGURA=5, NUM=6, ARISTA=7, AMARILLO=8, ROJO=9, 
		BLANCO=10, AZUL=11, ESPACIO=12, ID=13;
	public static final int
		RULE_inicio = 0, RULE_holograma = 1, RULE_solido = 2, RULE_color = 3, 
		RULE_rgb = 4, RULE_figura = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "holograma", "solido", "color", "rgb", "figura"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'amarillo'", "'rojo'", 
			"'blanco'", "'azul'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEW", "D3", "D2", "SOLIDO", "FIGURA", "NUM", "ARISTA", "AMARILLO", 
			"ROJO", "BLANCO", "AZUL", "ESPACIO", "ID"
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
	public String getGrammarFileName() { return "Hologram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HologramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(HologramParser.NEW, 0); }
		public TerminalNode ID() { return getToken(HologramParser.ID, 0); }
		public HologramaContext holograma() {
			return getRuleContext(HologramaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HologramParser.EOF, 0); }
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HologramListener ) ((HologramListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HologramListener ) ((HologramListener)listener).exitInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HologramVisitor ) return ((HologramVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			setState(16);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				match(NEW);
				setState(13);
				match(ID);
				setState(14);
				holograma();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
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

	public static class HologramaContext extends ParserRuleContext {
		public TerminalNode D3() { return getToken(HologramParser.D3, 0); }
		public SolidoContext solido() {
			return getRuleContext(SolidoContext.class,0);
		}
		public TerminalNode D2() { return getToken(HologramParser.D2, 0); }
		public FiguraContext figura() {
			return getRuleContext(FiguraContext.class,0);
		}
		public HologramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_holograma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HologramListener ) ((HologramListener)listener).enterHolograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HologramListener ) ((HologramListener)listener).exitHolograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HologramVisitor ) return ((HologramVisitor<? extends T>)visitor).visitHolograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HologramaContext holograma() throws RecognitionException {
		HologramaContext _localctx = new HologramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_holograma);
		try {
			setState(22);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D3:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match(D3);
				setState(19);
				solido();
				}
				break;
			case D2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(D2);
				setState(21);
				figura();
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

	public static class SolidoContext extends ParserRuleContext {
		public TerminalNode SOLIDO() { return getToken(HologramParser.SOLIDO, 0); }
		public TerminalNode NUM() { return getToken(HologramParser.NUM, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public SolidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HologramListener ) ((HologramListener)listener).enterSolido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HologramListener ) ((HologramListener)listener).exitSolido(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HologramVisitor ) return ((HologramVisitor<? extends T>)visitor).visitSolido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SolidoContext solido() throws RecognitionException {
		SolidoContext _localctx = new SolidoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_solido);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(SOLIDO);
			setState(25);
			match(NUM);
			setState(26);
			color();
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

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode AMARILLO() { return getToken(HologramParser.AMARILLO, 0); }
		public TerminalNode ROJO() { return getToken(HologramParser.ROJO, 0); }
		public TerminalNode BLANCO() { return getToken(HologramParser.BLANCO, 0); }
		public TerminalNode AZUL() { return getToken(HologramParser.AZUL, 0); }
		public RgbContext rgb() {
			return getRuleContext(RgbContext.class,0);
		}
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HologramListener ) ((HologramListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HologramListener ) ((HologramListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HologramVisitor ) return ((HologramVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_color);
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AMARILLO:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(AMARILLO);
				}
				break;
			case ROJO:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(ROJO);
				}
				break;
			case BLANCO:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				match(BLANCO);
				}
				break;
			case AZUL:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				match(AZUL);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(32);
				rgb();
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

	public static class RgbContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(HologramParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(HologramParser.NUM, i);
		}
		public RgbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rgb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HologramListener ) ((HologramListener)listener).enterRgb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HologramListener ) ((HologramListener)listener).exitRgb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HologramVisitor ) return ((HologramVisitor<? extends T>)visitor).visitRgb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RgbContext rgb() throws RecognitionException {
		RgbContext _localctx = new RgbContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rgb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(NUM);
			setState(36);
			match(NUM);
			setState(37);
			match(NUM);
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

	public static class FiguraContext extends ParserRuleContext {
		public TerminalNode FIGURA() { return getToken(HologramParser.FIGURA, 0); }
		public TerminalNode NUM() { return getToken(HologramParser.NUM, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public FiguraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_figura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HologramListener ) ((HologramListener)listener).enterFigura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HologramListener ) ((HologramListener)listener).exitFigura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HologramVisitor ) return ((HologramVisitor<? extends T>)visitor).visitFigura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FiguraContext figura() throws RecognitionException {
		FiguraContext _localctx = new FiguraContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_figura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(FIGURA);
			setState(40);
			match(NUM);
			setState(41);
			color();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17.\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\5\2\23\n\2\3\3\3\3"+
		"\3\3\3\3\5\3\31\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5$\n\5\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2-\2\22\3\2\2\2\4"+
		"\30\3\2\2\2\6\32\3\2\2\2\b#\3\2\2\2\n%\3\2\2\2\f)\3\2\2\2\16\17\7\3\2"+
		"\2\17\20\7\17\2\2\20\23\5\4\3\2\21\23\7\2\2\3\22\16\3\2\2\2\22\21\3\2"+
		"\2\2\23\3\3\2\2\2\24\25\7\4\2\2\25\31\5\6\4\2\26\27\7\5\2\2\27\31\5\f"+
		"\7\2\30\24\3\2\2\2\30\26\3\2\2\2\31\5\3\2\2\2\32\33\7\6\2\2\33\34\7\b"+
		"\2\2\34\35\5\b\5\2\35\7\3\2\2\2\36$\7\n\2\2\37$\7\13\2\2 $\7\f\2\2!$\7"+
		"\r\2\2\"$\5\n\6\2#\36\3\2\2\2#\37\3\2\2\2# \3\2\2\2#!\3\2\2\2#\"\3\2\2"+
		"\2$\t\3\2\2\2%&\7\b\2\2&\'\7\b\2\2\'(\7\b\2\2(\13\3\2\2\2)*\7\7\2\2*+"+
		"\7\b\2\2+,\5\b\5\2,\r\3\2\2\2\5\22\30#";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}