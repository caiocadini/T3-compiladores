// Generated from /home/caio/Faculdade/Compiladores/t3/la-semantico/src/main/antlr4/br/ufscar/dc/compiladores/la/semantico/LaSemantic.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LaSemanticParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, ALGORITMO=20, FIM_ALGORITMO=21, LIT=22, INT=23, REAL=24, 
		LOG=25, REG=26, FIM_REG=27, VAR=28, CONST=29, VERDADEIRO=30, FALSO=31, 
		ENDERECO=32, PONTEIRO=33, PONTO=34, ABRE_VETOR=35, FECHA_VETOR=36, DELIM=37, 
		ABREPAR=38, FECHAPAR=39, COMMA=40, PROCEDIMENTO=41, FIM_PROCEDIMENTO=42, 
		FUNCAO=43, FIM_FUNCAO=44, INTERVALO=45, OPARIT_SOMA=46, OPARIT_SUB=47, 
		OPARIT_MULT=48, OPARIT_DIV=49, OPARIT_RESTO=50, OPREL_MENOR=51, OPREL_MAIOR=52, 
		OPREL_IGUAL=53, OPREL_DIFER=54, OPREL_MAIORIGUAL=55, OPREL_MENORIGUAL=56, 
		OPLOG_E=57, OPLOG_OU=58, OPLOG_NAO=59, NUM_INT=60, NUM_REAL=61, IDENT=62, 
		CADEIA=63, COMENTARIO=64, WS=65, CADEIA_LITERAL_NAO_FECHADA=66, COMENTARIO_NAO_FECHADO=67, 
		SIMBOLO_NAO_ENCONTRADO=68;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_decl_local_global = 2, RULE_declaracao_local = 3, 
		RULE_variavel = 4, RULE_identificador = 5, RULE_dimensao = 6, RULE_tipo = 7, 
		RULE_tipo_basico = 8, RULE_tipo_basico_ident = 9, RULE_tipo_estendido = 10, 
		RULE_valor_constante = 11, RULE_registro = 12, RULE_declaracao_global = 13, 
		RULE_parametro = 14, RULE_parametros = 15, RULE_corpo = 16, RULE_cmd = 17, 
		RULE_cmdLeia = 18, RULE_cmdEscreva = 19, RULE_cmdSe = 20, RULE_cmdCaso = 21, 
		RULE_cmdPara = 22, RULE_cmdEnquanto = 23, RULE_cmdFaca = 24, RULE_cmdAtribuicao = 25, 
		RULE_cmdChamada = 26, RULE_cmdRetorne = 27, RULE_selecao = 28, RULE_item_selecao = 29, 
		RULE_constantes = 30, RULE_numero_intervalo = 31, RULE_op_unario = 32, 
		RULE_exp_aritmetica = 33, RULE_termo = 34, RULE_fator = 35, RULE_op1 = 36, 
		RULE_op2 = 37, RULE_op3 = 38, RULE_parcela = 39, RULE_parcela_unario = 40, 
		RULE_parcela_nao_unario = 41, RULE_exp_relacional = 42, RULE_op_relacional = 43, 
		RULE_expressao = 44, RULE_termo_logico = 45, RULE_fator_logico = 46, RULE_parcela_logica = 47, 
		RULE_op_logico1 = 48, RULE_op_logico2 = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "decl_local_global", "declaracao_local", "variavel", 
			"identificador", "dimensao", "tipo", "tipo_basico", "tipo_basico_ident", 
			"tipo_estendido", "valor_constante", "registro", "declaracao_global", 
			"parametro", "parametros", "corpo", "cmd", "cmdLeia", "cmdEscreva", "cmdSe", 
			"cmdCaso", "cmdPara", "cmdEnquanto", "cmdFaca", "cmdAtribuicao", "cmdChamada", 
			"cmdRetorne", "selecao", "item_selecao", "constantes", "numero_intervalo", 
			"op_unario", "exp_aritmetica", "termo", "fator", "op1", "op2", "op3", 
			"parcela", "parcela_unario", "parcela_nao_unario", "exp_relacional", 
			"op_relacional", "expressao", "termo_logico", "fator_logico", "parcela_logica", 
			"op_logico1", "op_logico2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'declare'", "'tipo'", "'leia'", "'escreva'", "'se'", "'entao'", 
			"'senao'", "'fim_se'", "'caso'", "'seja'", "'fim_caso'", "'para'", "'<-'", 
			"'ate'", "'faca'", "'fim_para'", "'enquanto'", "'fim_enquanto'", "'retorne'", 
			"'algoritmo'", "'fim_algoritmo'", "'literal'", "'inteiro'", "'real'", 
			"'logico'", "'registro'", "'fim_registro'", "'var'", "'constante'", "'verdadeiro'", 
			"'falso'", "'^'", "'&'", "'.'", "'['", "']'", "':'", "'('", "')'", "','", 
			"'procedimento'", "'fim_procedimento'", "'funcao'", "'fim_funcao'", "'..'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", "'='", "'<>'", "'>='", 
			"'<='", "'e'", "'ou'", "'nao'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "ALGORITMO", "FIM_ALGORITMO", 
			"LIT", "INT", "REAL", "LOG", "REG", "FIM_REG", "VAR", "CONST", "VERDADEIRO", 
			"FALSO", "ENDERECO", "PONTEIRO", "PONTO", "ABRE_VETOR", "FECHA_VETOR", 
			"DELIM", "ABREPAR", "FECHAPAR", "COMMA", "PROCEDIMENTO", "FIM_PROCEDIMENTO", 
			"FUNCAO", "FIM_FUNCAO", "INTERVALO", "OPARIT_SOMA", "OPARIT_SUB", "OPARIT_MULT", 
			"OPARIT_DIV", "OPARIT_RESTO", "OPREL_MENOR", "OPREL_MAIOR", "OPREL_IGUAL", 
			"OPREL_DIFER", "OPREL_MAIORIGUAL", "OPREL_MENORIGUAL", "OPLOG_E", "OPLOG_OU", 
			"OPLOG_NAO", "NUM_INT", "NUM_REAL", "IDENT", "CADEIA", "COMENTARIO", 
			"WS", "CADEIA_LITERAL_NAO_FECHADA", "COMENTARIO_NAO_FECHADO", "SIMBOLO_NAO_ENCONTRADO"
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
	public String getGrammarFileName() { return "LaSemantic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LaSemanticParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public TerminalNode ALGORITMO() { return getToken(LaSemanticParser.ALGORITMO, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode FIM_ALGORITMO() { return getToken(LaSemanticParser.FIM_ALGORITMO, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			declaracoes();
			setState(101);
			match(ALGORITMO);
			setState(102);
			corpo();
			setState(103);
			match(FIM_ALGORITMO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracoesContext extends ParserRuleContext {
		public Decl_local_globalContext decl_local_global() {
			return getRuleContext(Decl_local_globalContext.class,0);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			decl_local_global();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Decl_local_globalContext extends ParserRuleContext {
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<Declaracao_globalContext> declaracao_global() {
			return getRuleContexts(Declaracao_globalContext.class);
		}
		public Declaracao_globalContext declaracao_global(int i) {
			return getRuleContext(Declaracao_globalContext.class,i);
		}
		public Decl_local_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_local_global; }
	}

	public final Decl_local_globalContext decl_local_global() throws RecognitionException {
		Decl_local_globalContext _localctx = new Decl_local_globalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_local_global);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 10995653148678L) != 0)) {
				{
				setState(109);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case CONST:
					{
					setState(107);
					declaracao_local();
					}
					break;
				case PROCEDIMENTO:
				case FUNCAO:
					{
					setState(108);
					declaracao_global();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(113);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_localContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode CONST() { return getToken(LaSemanticParser.CONST, 0); }
		public TerminalNode IDENT() { return getToken(LaSemanticParser.IDENT, 0); }
		public TerminalNode DELIM() { return getToken(LaSemanticParser.DELIM, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode OPREL_IGUAL() { return getToken(LaSemanticParser.OPREL_IGUAL, 0); }
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_local);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(T__0);
				setState(115);
				variavel();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(CONST);
				setState(117);
				match(IDENT);
				setState(118);
				match(DELIM);
				setState(119);
				tipo_basico();
				setState(120);
				match(OPREL_IGUAL);
				setState(121);
				valor_constante();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(T__1);
				setState(124);
				match(IDENT);
				setState(125);
				match(DELIM);
				setState(126);
				tipo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariavelContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode DELIM() { return getToken(LaSemanticParser.DELIM, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(LaSemanticParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LaSemanticParser.COMMA, i);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			identificador();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(130);
				match(COMMA);
				setState(131);
				identificador();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			match(DELIM);
			setState(138);
			tipo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentificadorContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(LaSemanticParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LaSemanticParser.IDENT, i);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public List<TerminalNode> PONTO() { return getTokens(LaSemanticParser.PONTO); }
		public TerminalNode PONTO(int i) {
			return getToken(LaSemanticParser.PONTO, i);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(IDENT);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PONTO) {
				{
				{
				setState(141);
				match(PONTO);
				setState(142);
				match(IDENT);
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			dimensao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DimensaoContext extends ParserRuleContext {
		public List<TerminalNode> ABRE_VETOR() { return getTokens(LaSemanticParser.ABRE_VETOR); }
		public TerminalNode ABRE_VETOR(int i) {
			return getToken(LaSemanticParser.ABRE_VETOR, i);
		}
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public List<TerminalNode> FECHA_VETOR() { return getTokens(LaSemanticParser.FECHA_VETOR); }
		public TerminalNode FECHA_VETOR(int i) {
			return getToken(LaSemanticParser.FECHA_VETOR, i);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dimensao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABRE_VETOR) {
				{
				{
				setState(150);
				match(ABRE_VETOR);
				setState(151);
				exp_aritmetica();
				setState(152);
				match(FECHA_VETOR);
				}
				}
				setState(158);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REG:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				registro();
				}
				break;
			case LIT:
			case INT:
			case REAL:
			case LOG:
			case ENDERECO:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				tipo_estendido();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_basicoContext extends ParserRuleContext {
		public TerminalNode LIT() { return getToken(LaSemanticParser.LIT, 0); }
		public TerminalNode INT() { return getToken(LaSemanticParser.INT, 0); }
		public TerminalNode REAL() { return getToken(LaSemanticParser.REAL, 0); }
		public TerminalNode LOG() { return getToken(LaSemanticParser.LOG, 0); }
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tipo_basico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_basico_identContext extends ParserRuleContext {
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LaSemanticParser.IDENT, 0); }
		public Tipo_basico_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico_ident; }
	}

	public final Tipo_basico_identContext tipo_basico_ident() throws RecognitionException {
		Tipo_basico_identContext _localctx = new Tipo_basico_identContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipo_basico_ident);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIT:
			case INT:
			case REAL:
			case LOG:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				tipo_basico();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(IDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_estendidoContext extends ParserRuleContext {
		public Tipo_basico_identContext tipo_basico_ident() {
			return getRuleContext(Tipo_basico_identContext.class,0);
		}
		public TerminalNode ENDERECO() { return getToken(LaSemanticParser.ENDERECO, 0); }
		public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estendido; }
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo_estendido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENDERECO) {
				{
				setState(169);
				match(ENDERECO);
				}
			}

			setState(172);
			tipo_basico_ident();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(LaSemanticParser.CADEIA, 0); }
		public TerminalNode NUM_INT() { return getToken(LaSemanticParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LaSemanticParser.NUM_REAL, 0); }
		public TerminalNode VERDADEIRO() { return getToken(LaSemanticParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(LaSemanticParser.FALSO, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -5764607519813009408L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class RegistroContext extends ParserRuleContext {
		public TerminalNode REG() { return getToken(LaSemanticParser.REG, 0); }
		public TerminalNode FIM_REG() { return getToken(LaSemanticParser.FIM_REG, 0); }
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(REG);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(177);
				variavel();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			match(FIM_REG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_globalContext extends ParserRuleContext {
		public TerminalNode PROCEDIMENTO() { return getToken(LaSemanticParser.PROCEDIMENTO, 0); }
		public TerminalNode IDENT() { return getToken(LaSemanticParser.IDENT, 0); }
		public TerminalNode ABREPAR() { return getToken(LaSemanticParser.ABREPAR, 0); }
		public TerminalNode FECHAPAR() { return getToken(LaSemanticParser.FECHAPAR, 0); }
		public TerminalNode FIM_PROCEDIMENTO() { return getToken(LaSemanticParser.FIM_PROCEDIMENTO, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode FUNCAO() { return getToken(LaSemanticParser.FUNCAO, 0); }
		public TerminalNode DELIM() { return getToken(LaSemanticParser.DELIM, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode FIM_FUNCAO() { return getToken(LaSemanticParser.FIM_FUNCAO, 0); }
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaracao_global);
		int _la;
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(PROCEDIMENTO);
				setState(186);
				match(IDENT);
				setState(187);
				match(ABREPAR);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==IDENT) {
					{
					setState(188);
					parametros();
					}
				}

				setState(191);
				match(FECHAPAR);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 536870918L) != 0)) {
					{
					{
					setState(192);
					declaracao_local();
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022723047992L) != 0)) {
					{
					{
					setState(198);
					cmd();
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				match(FIM_PROCEDIMENTO);
				}
				break;
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(FUNCAO);
				setState(206);
				match(IDENT);
				setState(207);
				match(ABREPAR);
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==IDENT) {
					{
					setState(208);
					parametros();
					}
				}

				setState(211);
				match(FECHAPAR);
				setState(212);
				match(DELIM);
				setState(213);
				tipo_estendido();
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 536870918L) != 0)) {
					{
					{
					setState(214);
					declaracao_local();
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022723047992L) != 0)) {
					{
					{
					setState(220);
					cmd();
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(226);
				match(FIM_FUNCAO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode DELIM() { return getToken(LaSemanticParser.DELIM, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode VAR() { return getToken(LaSemanticParser.VAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LaSemanticParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LaSemanticParser.COMMA, i);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(230);
				match(VAR);
				}
			}

			setState(233);
			identificador();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(234);
				match(COMMA);
				setState(235);
				identificador();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
			match(DELIM);
			setState(242);
			tipo_estendido();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LaSemanticParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LaSemanticParser.COMMA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			parametro();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(245);
				match(COMMA);
				setState(246);
				parametro();
				}
				}
				setState(251);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CorpoContext extends ParserRuleContext {
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 536870918L) != 0)) {
				{
				{
				setState(252);
				declaracao_local();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022723047992L) != 0)) {
				{
				{
				setState(258);
				cmd();
				}
				}
				setState(263);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdContext extends ParserRuleContext {
		public CmdLeiaContext cmdLeia() {
			return getRuleContext(CmdLeiaContext.class,0);
		}
		public CmdEscrevaContext cmdEscreva() {
			return getRuleContext(CmdEscrevaContext.class,0);
		}
		public CmdSeContext cmdSe() {
			return getRuleContext(CmdSeContext.class,0);
		}
		public CmdCasoContext cmdCaso() {
			return getRuleContext(CmdCasoContext.class,0);
		}
		public CmdParaContext cmdPara() {
			return getRuleContext(CmdParaContext.class,0);
		}
		public CmdEnquantoContext cmdEnquanto() {
			return getRuleContext(CmdEnquantoContext.class,0);
		}
		public CmdFacaContext cmdFaca() {
			return getRuleContext(CmdFacaContext.class,0);
		}
		public CmdAtribuicaoContext cmdAtribuicao() {
			return getRuleContext(CmdAtribuicaoContext.class,0);
		}
		public CmdChamadaContext cmdChamada() {
			return getRuleContext(CmdChamadaContext.class,0);
		}
		public CmdRetorneContext cmdRetorne() {
			return getRuleContext(CmdRetorneContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmd);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				cmdLeia();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				cmdEscreva();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				cmdSe();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				cmdCaso();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				cmdPara();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(269);
				cmdEnquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(270);
				cmdFaca();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(271);
				cmdAtribuicao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(272);
				cmdChamada();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(273);
				cmdRetorne();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdLeiaContext extends ParserRuleContext {
		public TerminalNode ABREPAR() { return getToken(LaSemanticParser.ABREPAR, 0); }
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode FECHAPAR() { return getToken(LaSemanticParser.FECHAPAR, 0); }
		public List<TerminalNode> ENDERECO() { return getTokens(LaSemanticParser.ENDERECO); }
		public TerminalNode ENDERECO(int i) {
			return getToken(LaSemanticParser.ENDERECO, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LaSemanticParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LaSemanticParser.COMMA, i);
		}
		public CmdLeiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeia; }
	}

	public final CmdLeiaContext cmdLeia() throws RecognitionException {
		CmdLeiaContext _localctx = new CmdLeiaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmdLeia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__2);
			setState(277);
			match(ABREPAR);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENDERECO) {
				{
				setState(278);
				match(ENDERECO);
				}
			}

			setState(281);
			identificador();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(282);
				match(COMMA);
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENDERECO) {
					{
					setState(283);
					match(ENDERECO);
					}
				}

				setState(286);
				identificador();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			match(FECHAPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdEscrevaContext extends ParserRuleContext {
		public TerminalNode ABREPAR() { return getToken(LaSemanticParser.ABREPAR, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHAPAR() { return getToken(LaSemanticParser.FECHAPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LaSemanticParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LaSemanticParser.COMMA, i);
		}
		public CmdEscrevaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscreva; }
	}

	public final CmdEscrevaContext cmdEscreva() throws RecognitionException {
		CmdEscrevaContext _localctx = new CmdEscrevaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmdEscreva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__3);
			setState(295);
			match(ABREPAR);
			setState(296);
			expressao();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(297);
				match(COMMA);
				setState(298);
				expressao();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
			match(FECHAPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdSeContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSe; }
	}

	public final CmdSeContext cmdSe() throws RecognitionException {
		CmdSeContext _localctx = new CmdSeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmdSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(T__4);
			setState(307);
			expressao();
			setState(308);
			match(T__5);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022723047992L) != 0)) {
				{
				{
				setState(309);
				cmd();
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(315);
				match(T__6);
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022723047992L) != 0)) {
					{
					{
					setState(316);
					cmd();
					}
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(324);
			match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdCasoContext extends ParserRuleContext {
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdCasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCaso; }
	}

	public final CmdCasoContext cmdCaso() throws RecognitionException {
		CmdCasoContext _localctx = new CmdCasoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmdCaso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(T__8);
			setState(327);
			exp_aritmetica();
			setState(328);
			match(T__9);
			setState(329);
			selecao();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(330);
				match(T__6);
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022723047992L) != 0)) {
					{
					{
					setState(331);
					cmd();
					}
					}
					setState(336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(339);
			match(T__10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdParaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LaSemanticParser.IDENT, 0); }
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPara; }
	}

	public final CmdParaContext cmdPara() throws RecognitionException {
		CmdParaContext _localctx = new CmdParaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cmdPara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(T__11);
			setState(342);
			match(IDENT);
			setState(343);
			match(T__12);
			setState(344);
			exp_aritmetica();
			setState(345);
			match(T__13);
			setState(346);
			exp_aritmetica();
			setState(347);
			match(T__14);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022723047992L) != 0)) {
				{
				{
				setState(348);
				cmd();
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(354);
			match(T__15);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdEnquantoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEnquanto; }
	}

	public final CmdEnquantoContext cmdEnquanto() throws RecognitionException {
		CmdEnquantoContext _localctx = new CmdEnquantoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cmdEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(T__16);
			setState(357);
			expressao();
			setState(358);
			match(T__14);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022723047992L) != 0)) {
				{
				{
				setState(359);
				cmd();
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
			match(T__17);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdFacaContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdFacaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFaca; }
	}

	public final CmdFacaContext cmdFaca() throws RecognitionException {
		CmdFacaContext _localctx = new CmdFacaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cmdFaca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(T__14);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022723047992L) != 0)) {
				{
				{
				setState(368);
				cmd();
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(374);
			match(T__13);
			setState(375);
			expressao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdAtribuicaoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ENDERECO() { return getToken(LaSemanticParser.ENDERECO, 0); }
		public CmdAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtribuicao; }
	}

	public final CmdAtribuicaoContext cmdAtribuicao() throws RecognitionException {
		CmdAtribuicaoContext _localctx = new CmdAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cmdAtribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENDERECO) {
				{
				setState(377);
				match(ENDERECO);
				}
			}

			setState(380);
			identificador();
			setState(381);
			match(T__12);
			setState(382);
			expressao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdChamadaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LaSemanticParser.IDENT, 0); }
		public TerminalNode ABREPAR() { return getToken(LaSemanticParser.ABREPAR, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHAPAR() { return getToken(LaSemanticParser.FECHAPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LaSemanticParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LaSemanticParser.COMMA, i);
		}
		public CmdChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdChamada; }
	}

	public final CmdChamadaContext cmdChamada() throws RecognitionException {
		CmdChamadaContext _localctx = new CmdChamadaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cmdChamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(IDENT);
			setState(385);
			match(ABREPAR);
			setState(386);
			expressao();
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(387);
				match(COMMA);
				setState(388);
				expressao();
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394);
			match(FECHAPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdRetorneContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CmdRetorneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRetorne; }
	}

	public final CmdRetorneContext cmdRetorne() throws RecognitionException {
		CmdRetorneContext _localctx = new CmdRetorneContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cmdRetorne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(T__18);
			setState(397);
			expressao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelecaoContext extends ParserRuleContext {
		public List<Item_selecaoContext> item_selecao() {
			return getRuleContexts(Item_selecaoContext.class);
		}
		public Item_selecaoContext item_selecao(int i) {
			return getRuleContext(Item_selecaoContext.class,i);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPARIT_SUB || _la==NUM_INT) {
				{
				{
				setState(399);
				item_selecao();
				}
				}
				setState(404);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Item_selecaoContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public TerminalNode DELIM() { return getToken(LaSemanticParser.DELIM, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public Item_selecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_selecao; }
	}

	public final Item_selecaoContext item_selecao() throws RecognitionException {
		Item_selecaoContext _localctx = new Item_selecaoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_item_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			constantes();
			setState(406);
			match(DELIM);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686022723047992L) != 0)) {
				{
				{
				setState(407);
				cmd();
				}
				}
				setState(412);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantesContext extends ParserRuleContext {
		public List<Numero_intervaloContext> numero_intervalo() {
			return getRuleContexts(Numero_intervaloContext.class);
		}
		public Numero_intervaloContext numero_intervalo(int i) {
			return getRuleContext(Numero_intervaloContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LaSemanticParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LaSemanticParser.COMMA, i);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			numero_intervalo();
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(414);
				match(COMMA);
				setState(415);
				numero_intervalo();
				}
				}
				setState(420);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Numero_intervaloContext extends ParserRuleContext {
		public List<TerminalNode> NUM_INT() { return getTokens(LaSemanticParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(LaSemanticParser.NUM_INT, i);
		}
		public List<Op_unarioContext> op_unario() {
			return getRuleContexts(Op_unarioContext.class);
		}
		public Op_unarioContext op_unario(int i) {
			return getRuleContext(Op_unarioContext.class,i);
		}
		public TerminalNode INTERVALO() { return getToken(LaSemanticParser.INTERVALO, 0); }
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_numero_intervalo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPARIT_SUB) {
				{
				setState(421);
				op_unario();
				}
			}

			setState(424);
			match(NUM_INT);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERVALO) {
				{
				setState(425);
				match(INTERVALO);
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPARIT_SUB) {
					{
					setState(426);
					op_unario();
					}
				}

				setState(429);
				match(NUM_INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op_unarioContext extends ParserRuleContext {
		public TerminalNode OPARIT_SUB() { return getToken(LaSemanticParser.OPARIT_SUB, 0); }
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_op_unario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(OPARIT_SUB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_aritmeticaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Op1Context> op1() {
			return getRuleContexts(Op1Context.class);
		}
		public Op1Context op1(int i) {
			return getRuleContext(Op1Context.class,i);
		}
		public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetica; }
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_exp_aritmetica);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			termo();
			setState(440);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(435);
					op1();
					setState(436);
					termo();
					}
					} 
				}
				setState(442);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<Op2Context> op2() {
			return getRuleContexts(Op2Context.class);
		}
		public Op2Context op2(int i) {
			return getRuleContext(Op2Context.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			fator();
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPARIT_MULT || _la==OPARIT_DIV) {
				{
				{
				setState(444);
				op2();
				setState(445);
				fator();
				}
				}
				setState(451);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public List<Op3Context> op3() {
			return getRuleContexts(Op3Context.class);
		}
		public Op3Context op3(int i) {
			return getRuleContext(Op3Context.class,i);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			parcela();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPARIT_RESTO) {
				{
				{
				setState(453);
				op3();
				setState(454);
				parcela();
				}
				}
				setState(460);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op1Context extends ParserRuleContext {
		public TerminalNode OPARIT_SOMA() { return getToken(LaSemanticParser.OPARIT_SOMA, 0); }
		public TerminalNode OPARIT_SUB() { return getToken(LaSemanticParser.OPARIT_SUB, 0); }
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_la = _input.LA(1);
			if ( !(_la==OPARIT_SOMA || _la==OPARIT_SUB) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op2Context extends ParserRuleContext {
		public TerminalNode OPARIT_MULT() { return getToken(LaSemanticParser.OPARIT_MULT, 0); }
		public TerminalNode OPARIT_DIV() { return getToken(LaSemanticParser.OPARIT_DIV, 0); }
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_la = _input.LA(1);
			if ( !(_la==OPARIT_MULT || _la==OPARIT_DIV) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op3Context extends ParserRuleContext {
		public TerminalNode OPARIT_RESTO() { return getToken(LaSemanticParser.OPARIT_RESTO, 0); }
		public Op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op3; }
	}

	public final Op3Context op3() throws RecognitionException {
		Op3Context _localctx = new Op3Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_op3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(OPARIT_RESTO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParcelaContext extends ParserRuleContext {
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parcela);
		int _la;
		try {
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENDERECO:
			case ABREPAR:
			case OPARIT_SUB:
			case NUM_INT:
			case NUM_REAL:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPARIT_SUB) {
					{
					setState(467);
					op_unario();
					}
				}

				setState(470);
				parcela_unario();
				}
				break;
			case PONTEIRO:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				parcela_nao_unario();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parcela_unarioContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode ENDERECO() { return getToken(LaSemanticParser.ENDERECO, 0); }
		public TerminalNode IDENT() { return getToken(LaSemanticParser.IDENT, 0); }
		public TerminalNode ABREPAR() { return getToken(LaSemanticParser.ABREPAR, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHAPAR() { return getToken(LaSemanticParser.FECHAPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LaSemanticParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LaSemanticParser.COMMA, i);
		}
		public TerminalNode NUM_INT() { return getToken(LaSemanticParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LaSemanticParser.NUM_REAL, 0); }
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_parcela_unario);
		int _la;
		try {
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENDERECO) {
					{
					setState(474);
					match(ENDERECO);
					}
				}

				setState(477);
				identificador();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				match(IDENT);
				setState(479);
				match(ABREPAR);
				setState(480);
				expressao();
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(481);
					match(COMMA);
					setState(482);
					expressao();
					}
					}
					setState(487);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(488);
				match(FECHAPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(490);
				match(NUM_INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(491);
				match(NUM_REAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(492);
				match(ABREPAR);
				setState(493);
				expressao();
				setState(494);
				match(FECHAPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public TerminalNode PONTEIRO() { return getToken(LaSemanticParser.PONTEIRO, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(LaSemanticParser.CADEIA, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parcela_nao_unario);
		try {
			setState(501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PONTEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				match(PONTEIRO);
				setState(499);
				identificador();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				match(CADEIA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_relacionalContext extends ParserRuleContext {
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Exp_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_relacional; }
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_exp_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			exp_aritmetica();
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 141863388262170624L) != 0)) {
				{
				setState(504);
				op_relacional();
				setState(505);
				exp_aritmetica();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op_relacionalContext extends ParserRuleContext {
		public TerminalNode OPREL_IGUAL() { return getToken(LaSemanticParser.OPREL_IGUAL, 0); }
		public TerminalNode OPREL_DIFER() { return getToken(LaSemanticParser.OPREL_DIFER, 0); }
		public TerminalNode OPREL_MAIORIGUAL() { return getToken(LaSemanticParser.OPREL_MAIORIGUAL, 0); }
		public TerminalNode OPREL_MENORIGUAL() { return getToken(LaSemanticParser.OPREL_MENORIGUAL, 0); }
		public TerminalNode OPREL_MAIOR() { return getToken(LaSemanticParser.OPREL_MAIOR, 0); }
		public TerminalNode OPREL_MENOR() { return getToken(LaSemanticParser.OPREL_MENOR, 0); }
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 141863388262170624L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
		}
		public List<Op_logico1Context> op_logico1() {
			return getRuleContexts(Op_logico1Context.class);
		}
		public Op_logico1Context op_logico1(int i) {
			return getRuleContext(Op_logico1Context.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			termo_logico();
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPLOG_OU) {
				{
				{
				setState(512);
				op_logico1();
				setState(513);
				termo_logico();
				}
				}
				setState(519);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Termo_logicoContext extends ParserRuleContext {
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public List<Op_logico2Context> op_logico2() {
			return getRuleContexts(Op_logico2Context.class);
		}
		public Op_logico2Context op_logico2(int i) {
			return getRuleContext(Op_logico2Context.class,i);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_termo_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			fator_logico();
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPLOG_E) {
				{
				{
				setState(521);
				op_logico2();
				setState(522);
				fator_logico();
				}
				}
				setState(528);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Fator_logicoContext extends ParserRuleContext {
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
		}
		public TerminalNode OPLOG_NAO() { return getToken(LaSemanticParser.OPLOG_NAO, 0); }
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fator_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPLOG_NAO) {
				{
				setState(529);
				match(OPLOG_NAO);
				}
			}

			setState(532);
			parcela_logica();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parcela_logicaContext extends ParserRuleContext {
		public TerminalNode VERDADEIRO() { return getToken(LaSemanticParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(LaSemanticParser.FALSO, 0); }
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parcela_logica);
		int _la;
		try {
			setState(536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERDADEIRO:
			case FALSO:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				_la = _input.LA(1);
				if ( !(_la==VERDADEIRO || _la==FALSO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ENDERECO:
			case PONTEIRO:
			case ABREPAR:
			case OPARIT_SUB:
			case NUM_INT:
			case NUM_REAL:
			case IDENT:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				exp_relacional();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op_logico1Context extends ParserRuleContext {
		public TerminalNode OPLOG_OU() { return getToken(LaSemanticParser.OPLOG_OU, 0); }
		public Op_logico1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico1; }
	}

	public final Op_logico1Context op_logico1() throws RecognitionException {
		Op_logico1Context _localctx = new Op_logico1Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_op_logico1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(OPLOG_OU);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op_logico2Context extends ParserRuleContext {
		public TerminalNode OPLOG_E() { return getToken(LaSemanticParser.OPLOG_E, 0); }
		public Op_logico2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico2; }
	}

	public final Op_logico2Context op_logico2() throws RecognitionException {
		Op_logico2Context _localctx = new Op_logico2Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_op_logico2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(OPLOG_E);
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
		"\u0004\u0001D\u021f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0005\u0002n\b\u0002\n\u0002\f\u0002q\t"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u0080\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u0085\b\u0004\n\u0004\f\u0004\u0088\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u0090\b\u0005\n\u0005\f\u0005\u0093\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u009b\b\u0006\n"+
		"\u0006\f\u0006\u009e\t\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u00a2"+
		"\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t\u00a8\b\t\u0001\n\u0003"+
		"\n\u00ab\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005"+
		"\f\u00b3\b\f\n\f\f\f\u00b6\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0003\r\u00be\b\r\u0001\r\u0001\r\u0005\r\u00c2\b\r\n\r\f\r\u00c5"+
		"\t\r\u0001\r\u0005\r\u00c8\b\r\n\r\f\r\u00cb\t\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00d2\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u00d8\b\r\n\r\f\r\u00db\t\r\u0001\r\u0005\r\u00de\b\r\n\r\f\r\u00e1"+
		"\t\r\u0001\r\u0001\r\u0003\r\u00e5\b\r\u0001\u000e\u0003\u000e\u00e8\b"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00ed\b\u000e\n"+
		"\u000e\f\u000e\u00f0\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00f8\b\u000f\n\u000f\f\u000f"+
		"\u00fb\t\u000f\u0001\u0010\u0005\u0010\u00fe\b\u0010\n\u0010\f\u0010\u0101"+
		"\t\u0010\u0001\u0010\u0005\u0010\u0104\b\u0010\n\u0010\f\u0010\u0107\t"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0113"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0118\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u011d\b\u0012\u0001\u0012"+
		"\u0005\u0012\u0120\b\u0012\n\u0012\f\u0012\u0123\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u012c\b\u0013\n\u0013\f\u0013\u012f\t\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0137\b\u0014"+
		"\n\u0014\f\u0014\u013a\t\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u013e"+
		"\b\u0014\n\u0014\f\u0014\u0141\t\u0014\u0003\u0014\u0143\b\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u014d\b\u0015\n\u0015\f\u0015\u0150\t\u0015"+
		"\u0003\u0015\u0152\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u015e\b\u0016\n\u0016\f\u0016\u0161\t\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0169"+
		"\b\u0017\n\u0017\f\u0017\u016c\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u0172\b\u0018\n\u0018\f\u0018\u0175\t\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0003\u0019\u017b\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0186\b\u001a\n\u001a\f\u001a"+
		"\u0189\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0005\u001c\u0191\b\u001c\n\u001c\f\u001c\u0194\t\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0199\b\u001d\n\u001d\f\u001d"+
		"\u019c\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u01a1\b"+
		"\u001e\n\u001e\f\u001e\u01a4\t\u001e\u0001\u001f\u0003\u001f\u01a7\b\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01ac\b\u001f\u0001\u001f"+
		"\u0003\u001f\u01af\b\u001f\u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0005"+
		"!\u01b7\b!\n!\f!\u01ba\t!\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u01c0"+
		"\b\"\n\"\f\"\u01c3\t\"\u0001#\u0001#\u0001#\u0001#\u0005#\u01c9\b#\n#"+
		"\f#\u01cc\t#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0003\'"+
		"\u01d5\b\'\u0001\'\u0001\'\u0003\'\u01d9\b\'\u0001(\u0003(\u01dc\b(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u01e4\b(\n(\f(\u01e7\t(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u01f1\b(\u0001"+
		")\u0001)\u0001)\u0003)\u01f6\b)\u0001*\u0001*\u0001*\u0001*\u0003*\u01fc"+
		"\b*\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0005,\u0204\b,\n,\f,\u0207"+
		"\t,\u0001-\u0001-\u0001-\u0001-\u0005-\u020d\b-\n-\f-\u0210\t-\u0001."+
		"\u0003.\u0213\b.\u0001.\u0001.\u0001/\u0001/\u0003/\u0219\b/\u00010\u0001"+
		"0\u00011\u00011\u00011\u0000\u00002\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`b\u0000\u0006\u0001\u0000\u0016\u0019\u0003\u0000\u001e"+
		"\u001f<=??\u0001\u0000./\u0001\u000001\u0001\u000038\u0001\u0000\u001e"+
		"\u001f\u0231\u0000d\u0001\u0000\u0000\u0000\u0002i\u0001\u0000\u0000\u0000"+
		"\u0004o\u0001\u0000\u0000\u0000\u0006\u007f\u0001\u0000\u0000\u0000\b"+
		"\u0081\u0001\u0000\u0000\u0000\n\u008c\u0001\u0000\u0000\u0000\f\u009c"+
		"\u0001\u0000\u0000\u0000\u000e\u00a1\u0001\u0000\u0000\u0000\u0010\u00a3"+
		"\u0001\u0000\u0000\u0000\u0012\u00a7\u0001\u0000\u0000\u0000\u0014\u00aa"+
		"\u0001\u0000\u0000\u0000\u0016\u00ae\u0001\u0000\u0000\u0000\u0018\u00b0"+
		"\u0001\u0000\u0000\u0000\u001a\u00e4\u0001\u0000\u0000\u0000\u001c\u00e7"+
		"\u0001\u0000\u0000\u0000\u001e\u00f4\u0001\u0000\u0000\u0000 \u00ff\u0001"+
		"\u0000\u0000\u0000\"\u0112\u0001\u0000\u0000\u0000$\u0114\u0001\u0000"+
		"\u0000\u0000&\u0126\u0001\u0000\u0000\u0000(\u0132\u0001\u0000\u0000\u0000"+
		"*\u0146\u0001\u0000\u0000\u0000,\u0155\u0001\u0000\u0000\u0000.\u0164"+
		"\u0001\u0000\u0000\u00000\u016f\u0001\u0000\u0000\u00002\u017a\u0001\u0000"+
		"\u0000\u00004\u0180\u0001\u0000\u0000\u00006\u018c\u0001\u0000\u0000\u0000"+
		"8\u0192\u0001\u0000\u0000\u0000:\u0195\u0001\u0000\u0000\u0000<\u019d"+
		"\u0001\u0000\u0000\u0000>\u01a6\u0001\u0000\u0000\u0000@\u01b0\u0001\u0000"+
		"\u0000\u0000B\u01b2\u0001\u0000\u0000\u0000D\u01bb\u0001\u0000\u0000\u0000"+
		"F\u01c4\u0001\u0000\u0000\u0000H\u01cd\u0001\u0000\u0000\u0000J\u01cf"+
		"\u0001\u0000\u0000\u0000L\u01d1\u0001\u0000\u0000\u0000N\u01d8\u0001\u0000"+
		"\u0000\u0000P\u01f0\u0001\u0000\u0000\u0000R\u01f5\u0001\u0000\u0000\u0000"+
		"T\u01f7\u0001\u0000\u0000\u0000V\u01fd\u0001\u0000\u0000\u0000X\u01ff"+
		"\u0001\u0000\u0000\u0000Z\u0208\u0001\u0000\u0000\u0000\\\u0212\u0001"+
		"\u0000\u0000\u0000^\u0218\u0001\u0000\u0000\u0000`\u021a\u0001\u0000\u0000"+
		"\u0000b\u021c\u0001\u0000\u0000\u0000de\u0003\u0002\u0001\u0000ef\u0005"+
		"\u0014\u0000\u0000fg\u0003 \u0010\u0000gh\u0005\u0015\u0000\u0000h\u0001"+
		"\u0001\u0000\u0000\u0000ij\u0003\u0004\u0002\u0000j\u0003\u0001\u0000"+
		"\u0000\u0000kn\u0003\u0006\u0003\u0000ln\u0003\u001a\r\u0000mk\u0001\u0000"+
		"\u0000\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p\u0005\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000rs\u0005\u0001\u0000\u0000s\u0080\u0003"+
		"\b\u0004\u0000tu\u0005\u001d\u0000\u0000uv\u0005>\u0000\u0000vw\u0005"+
		"%\u0000\u0000wx\u0003\u0010\b\u0000xy\u00055\u0000\u0000yz\u0003\u0016"+
		"\u000b\u0000z\u0080\u0001\u0000\u0000\u0000{|\u0005\u0002\u0000\u0000"+
		"|}\u0005>\u0000\u0000}~\u0005%\u0000\u0000~\u0080\u0003\u000e\u0007\u0000"+
		"\u007fr\u0001\u0000\u0000\u0000\u007ft\u0001\u0000\u0000\u0000\u007f{"+
		"\u0001\u0000\u0000\u0000\u0080\u0007\u0001\u0000\u0000\u0000\u0081\u0086"+
		"\u0003\n\u0005\u0000\u0082\u0083\u0005(\u0000\u0000\u0083\u0085\u0003"+
		"\n\u0005\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0005%\u0000\u0000\u008a\u008b\u0003\u000e\u0007"+
		"\u0000\u008b\t\u0001\u0000\u0000\u0000\u008c\u0091\u0005>\u0000\u0000"+
		"\u008d\u008e\u0005\"\u0000\u0000\u008e\u0090\u0005>\u0000\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091"+
		"\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092"+
		"\u0094\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0003\f\u0006\u0000\u0095\u000b\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0005#\u0000\u0000\u0097\u0098\u0003B!\u0000\u0098\u0099\u0005$\u0000"+
		"\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u0096\u0001\u0000\u0000"+
		"\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\r\u0001\u0000\u0000\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a2\u0003\u0018\f\u0000\u00a0"+
		"\u00a2\u0003\u0014\n\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u000f\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0007\u0000\u0000\u0000\u00a4\u0011\u0001\u0000\u0000\u0000\u00a5\u00a8"+
		"\u0003\u0010\b\u0000\u00a6\u00a8\u0005>\u0000\u0000\u00a7\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u0013\u0001"+
		"\u0000\u0000\u0000\u00a9\u00ab\u0005 \u0000\u0000\u00aa\u00a9\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0003\u0012\t\u0000\u00ad\u0015\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0007\u0001\u0000\u0000\u00af\u0017\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b4\u0005\u001a\u0000\u0000\u00b1\u00b3\u0003\b\u0004\u0000"+
		"\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0005\u001b\u0000\u0000\u00b8\u0019\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0005)\u0000\u0000\u00ba\u00bb\u0005>\u0000\u0000\u00bb\u00bd"+
		"\u0005&\u0000\u0000\u00bc\u00be\u0003\u001e\u000f\u0000\u00bd\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c3\u0005\'\u0000\u0000\u00c0\u00c2\u0003\u0006"+
		"\u0003\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c9\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c8\u0003\"\u0011\u0000\u00c7\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00e5\u0005*\u0000\u0000"+
		"\u00cd\u00ce\u0005+\u0000\u0000\u00ce\u00cf\u0005>\u0000\u0000\u00cf\u00d1"+
		"\u0005&\u0000\u0000\u00d0\u00d2\u0003\u001e\u000f\u0000\u00d1\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0005\'\u0000\u0000\u00d4\u00d5\u0005%"+
		"\u0000\u0000\u00d5\u00d9\u0003\u0014\n\u0000\u00d6\u00d8\u0003\u0006\u0003"+
		"\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000"+
		"\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000"+
		"\u0000\u00da\u00df\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000"+
		"\u0000\u00dc\u00de\u0003\"\u0011\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000"+
		"\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005,\u0000\u0000\u00e3"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e4\u00b9\u0001\u0000\u0000\u0000\u00e4"+
		"\u00cd\u0001\u0000\u0000\u0000\u00e5\u001b\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e8\u0005\u001c\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ee\u0003\n\u0005\u0000\u00ea\u00eb\u0005(\u0000\u0000\u00eb\u00ed"+
		"\u0003\n\u0005\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0005%\u0000\u0000\u00f2\u00f3\u0003\u0014"+
		"\n\u0000\u00f3\u001d\u0001\u0000\u0000\u0000\u00f4\u00f9\u0003\u001c\u000e"+
		"\u0000\u00f5\u00f6\u0005(\u0000\u0000\u00f6\u00f8\u0003\u001c\u000e\u0000"+
		"\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fa\u001f\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fe\u0003\u0006\u0003\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0105\u0001\u0000\u0000\u0000"+
		"\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0104\u0003\"\u0011\u0000\u0103"+
		"\u0102\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105"+
		"\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106"+
		"!\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u0113"+
		"\u0003$\u0012\u0000\u0109\u0113\u0003&\u0013\u0000\u010a\u0113\u0003("+
		"\u0014\u0000\u010b\u0113\u0003*\u0015\u0000\u010c\u0113\u0003,\u0016\u0000"+
		"\u010d\u0113\u0003.\u0017\u0000\u010e\u0113\u00030\u0018\u0000\u010f\u0113"+
		"\u00032\u0019\u0000\u0110\u0113\u00034\u001a\u0000\u0111\u0113\u00036"+
		"\u001b\u0000\u0112\u0108\u0001\u0000\u0000\u0000\u0112\u0109\u0001\u0000"+
		"\u0000\u0000\u0112\u010a\u0001\u0000\u0000\u0000\u0112\u010b\u0001\u0000"+
		"\u0000\u0000\u0112\u010c\u0001\u0000\u0000\u0000\u0112\u010d\u0001\u0000"+
		"\u0000\u0000\u0112\u010e\u0001\u0000\u0000\u0000\u0112\u010f\u0001\u0000"+
		"\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0111\u0001\u0000"+
		"\u0000\u0000\u0113#\u0001\u0000\u0000\u0000\u0114\u0115\u0005\u0003\u0000"+
		"\u0000\u0115\u0117\u0005&\u0000\u0000\u0116\u0118\u0005 \u0000\u0000\u0117"+
		"\u0116\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118"+
		"\u0119\u0001\u0000\u0000\u0000\u0119\u0121\u0003\n\u0005\u0000\u011a\u011c"+
		"\u0005(\u0000\u0000\u011b\u011d\u0005 \u0000\u0000\u011c\u011b\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000"+
		"\u0000\u0000\u011e\u0120\u0003\n\u0005\u0000\u011f\u011a\u0001\u0000\u0000"+
		"\u0000\u0120\u0123\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0124\u0001\u0000\u0000"+
		"\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u0125\u0005\'\u0000\u0000"+
		"\u0125%\u0001\u0000\u0000\u0000\u0126\u0127\u0005\u0004\u0000\u0000\u0127"+
		"\u0128\u0005&\u0000\u0000\u0128\u012d\u0003X,\u0000\u0129\u012a\u0005"+
		"(\u0000\u0000\u012a\u012c\u0003X,\u0000\u012b\u0129\u0001\u0000\u0000"+
		"\u0000\u012c\u012f\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000"+
		"\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u0130\u0001\u0000\u0000"+
		"\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u0131\u0005\'\u0000\u0000"+
		"\u0131\'\u0001\u0000\u0000\u0000\u0132\u0133\u0005\u0005\u0000\u0000\u0133"+
		"\u0134\u0003X,\u0000\u0134\u0138\u0005\u0006\u0000\u0000\u0135\u0137\u0003"+
		"\"\u0011\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000"+
		"\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000"+
		"\u0000\u0000\u0139\u0142\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000"+
		"\u0000\u0000\u013b\u013f\u0005\u0007\u0000\u0000\u013c\u013e\u0003\"\u0011"+
		"\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013e\u0141\u0001\u0000\u0000"+
		"\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000"+
		"\u0000\u0140\u0143\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000"+
		"\u0000\u0142\u013b\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0145\u0005\b\u0000\u0000"+
		"\u0145)\u0001\u0000\u0000\u0000\u0146\u0147\u0005\t\u0000\u0000\u0147"+
		"\u0148\u0003B!\u0000\u0148\u0149\u0005\n\u0000\u0000\u0149\u0151\u0003"+
		"8\u001c\u0000\u014a\u014e\u0005\u0007\u0000\u0000\u014b\u014d\u0003\""+
		"\u0011\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014d\u0150\u0001\u0000"+
		"\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000"+
		"\u0000\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000"+
		"\u0000\u0000\u0151\u014a\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000"+
		"\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0154\u0005\u000b"+
		"\u0000\u0000\u0154+\u0001\u0000\u0000\u0000\u0155\u0156\u0005\f\u0000"+
		"\u0000\u0156\u0157\u0005>\u0000\u0000\u0157\u0158\u0005\r\u0000\u0000"+
		"\u0158\u0159\u0003B!\u0000\u0159\u015a\u0005\u000e\u0000\u0000\u015a\u015b"+
		"\u0003B!\u0000\u015b\u015f\u0005\u000f\u0000\u0000\u015c\u015e\u0003\""+
		"\u0011\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015e\u0161\u0001\u0000"+
		"\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000"+
		"\u0000\u0000\u0160\u0162\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0005\u0010\u0000\u0000\u0163-\u0001\u0000\u0000"+
		"\u0000\u0164\u0165\u0005\u0011\u0000\u0000\u0165\u0166\u0003X,\u0000\u0166"+
		"\u016a\u0005\u000f\u0000\u0000\u0167\u0169\u0003\"\u0011\u0000\u0168\u0167"+
		"\u0001\u0000\u0000\u0000\u0169\u016c\u0001\u0000\u0000\u0000\u016a\u0168"+
		"\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016d"+
		"\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016d\u016e"+
		"\u0005\u0012\u0000\u0000\u016e/\u0001\u0000\u0000\u0000\u016f\u0173\u0005"+
		"\u000f\u0000\u0000\u0170\u0172\u0003\"\u0011\u0000\u0171\u0170\u0001\u0000"+
		"\u0000\u0000\u0172\u0175\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000"+
		"\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0176\u0001\u0000"+
		"\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0176\u0177\u0005\u000e"+
		"\u0000\u0000\u0177\u0178\u0003X,\u0000\u01781\u0001\u0000\u0000\u0000"+
		"\u0179\u017b\u0005 \u0000\u0000\u017a\u0179\u0001\u0000\u0000\u0000\u017a"+
		"\u017b\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c"+
		"\u017d\u0003\n\u0005\u0000\u017d\u017e\u0005\r\u0000\u0000\u017e\u017f"+
		"\u0003X,\u0000\u017f3\u0001\u0000\u0000\u0000\u0180\u0181\u0005>\u0000"+
		"\u0000\u0181\u0182\u0005&\u0000\u0000\u0182\u0187\u0003X,\u0000\u0183"+
		"\u0184\u0005(\u0000\u0000\u0184\u0186\u0003X,\u0000\u0185\u0183\u0001"+
		"\u0000\u0000\u0000\u0186\u0189\u0001\u0000\u0000\u0000\u0187\u0185\u0001"+
		"\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u018a\u0001"+
		"\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u018a\u018b\u0005"+
		"\'\u0000\u0000\u018b5\u0001\u0000\u0000\u0000\u018c\u018d\u0005\u0013"+
		"\u0000\u0000\u018d\u018e\u0003X,\u0000\u018e7\u0001\u0000\u0000\u0000"+
		"\u018f\u0191\u0003:\u001d\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0191"+
		"\u0194\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192"+
		"\u0193\u0001\u0000\u0000\u0000\u01939\u0001\u0000\u0000\u0000\u0194\u0192"+
		"\u0001\u0000\u0000\u0000\u0195\u0196\u0003<\u001e\u0000\u0196\u019a\u0005"+
		"%\u0000\u0000\u0197\u0199\u0003\"\u0011\u0000\u0198\u0197\u0001\u0000"+
		"\u0000\u0000\u0199\u019c\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000"+
		"\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b;\u0001\u0000\u0000"+
		"\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019d\u01a2\u0003>\u001f\u0000"+
		"\u019e\u019f\u0005(\u0000\u0000\u019f\u01a1\u0003>\u001f\u0000\u01a0\u019e"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a4\u0001\u0000\u0000\u0000\u01a2\u01a0"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3=\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a5\u01a7\u0003"+
		"@ \u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01ae\u0005<\u0000\u0000"+
		"\u01a9\u01ab\u0005-\u0000\u0000\u01aa\u01ac\u0003@ \u0000\u01ab\u01aa"+
		"\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ad"+
		"\u0001\u0000\u0000\u0000\u01ad\u01af\u0005<\u0000\u0000\u01ae\u01a9\u0001"+
		"\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af?\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b1\u0005/\u0000\u0000\u01b1A\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b8\u0003D\"\u0000\u01b3\u01b4\u0003H$\u0000\u01b4\u01b5\u0003"+
		"D\"\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b7\u01ba\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9C\u0001\u0000\u0000"+
		"\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01bb\u01c1\u0003F#\u0000\u01bc"+
		"\u01bd\u0003J%\u0000\u01bd\u01be\u0003F#\u0000\u01be\u01c0\u0001\u0000"+
		"\u0000\u0000\u01bf\u01bc\u0001\u0000\u0000\u0000\u01c0\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c2E\u0001\u0000\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000"+
		"\u0000\u01c4\u01ca\u0003N\'\u0000\u01c5\u01c6\u0003L&\u0000\u01c6\u01c7"+
		"\u0003N\'\u0000\u01c7\u01c9\u0001\u0000\u0000\u0000\u01c8\u01c5\u0001"+
		"\u0000\u0000\u0000\u01c9\u01cc\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cbG\u0001\u0000"+
		"\u0000\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000\u01cd\u01ce\u0007\u0002"+
		"\u0000\u0000\u01ceI\u0001\u0000\u0000\u0000\u01cf\u01d0\u0007\u0003\u0000"+
		"\u0000\u01d0K\u0001\u0000\u0000\u0000\u01d1\u01d2\u00052\u0000\u0000\u01d2"+
		"M\u0001\u0000\u0000\u0000\u01d3\u01d5\u0003@ \u0000\u01d4\u01d3\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d9\u0003P(\u0000\u01d7\u01d9\u0003R)\u0000"+
		"\u01d8\u01d4\u0001\u0000\u0000\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000"+
		"\u01d9O\u0001\u0000\u0000\u0000\u01da\u01dc\u0005 \u0000\u0000\u01db\u01da"+
		"\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc\u01dd"+
		"\u0001\u0000\u0000\u0000\u01dd\u01f1\u0003\n\u0005\u0000\u01de\u01df\u0005"+
		">\u0000\u0000\u01df\u01e0\u0005&\u0000\u0000\u01e0\u01e5\u0003X,\u0000"+
		"\u01e1\u01e2\u0005(\u0000\u0000\u01e2\u01e4\u0003X,\u0000\u01e3\u01e1"+
		"\u0001\u0000\u0000\u0000\u01e4\u01e7\u0001\u0000\u0000\u0000\u01e5\u01e3"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e8"+
		"\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e8\u01e9"+
		"\u0005\'\u0000\u0000\u01e9\u01f1\u0001\u0000\u0000\u0000\u01ea\u01f1\u0005"+
		"<\u0000\u0000\u01eb\u01f1\u0005=\u0000\u0000\u01ec\u01ed\u0005&\u0000"+
		"\u0000\u01ed\u01ee\u0003X,\u0000\u01ee\u01ef\u0005\'\u0000\u0000\u01ef"+
		"\u01f1\u0001\u0000\u0000\u0000\u01f0\u01db\u0001\u0000\u0000\u0000\u01f0"+
		"\u01de\u0001\u0000\u0000\u0000\u01f0\u01ea\u0001\u0000\u0000\u0000\u01f0"+
		"\u01eb\u0001\u0000\u0000\u0000\u01f0\u01ec\u0001\u0000\u0000\u0000\u01f1"+
		"Q\u0001\u0000\u0000\u0000\u01f2\u01f3\u0005!\u0000\u0000\u01f3\u01f6\u0003"+
		"\n\u0005\u0000\u01f4\u01f6\u0005?\u0000\u0000\u01f5\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f4\u0001\u0000\u0000\u0000\u01f6S\u0001\u0000\u0000"+
		"\u0000\u01f7\u01fb\u0003B!\u0000\u01f8\u01f9\u0003V+\u0000\u01f9\u01fa"+
		"\u0003B!\u0000\u01fa\u01fc\u0001\u0000\u0000\u0000\u01fb\u01f8\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fcU\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fe\u0007\u0004\u0000\u0000\u01feW\u0001\u0000\u0000\u0000"+
		"\u01ff\u0205\u0003Z-\u0000\u0200\u0201\u0003`0\u0000\u0201\u0202\u0003"+
		"Z-\u0000\u0202\u0204\u0001\u0000\u0000\u0000\u0203\u0200\u0001\u0000\u0000"+
		"\u0000\u0204\u0207\u0001\u0000\u0000\u0000\u0205\u0203\u0001\u0000\u0000"+
		"\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206Y\u0001\u0000\u0000\u0000"+
		"\u0207\u0205\u0001\u0000\u0000\u0000\u0208\u020e\u0003\\.\u0000\u0209"+
		"\u020a\u0003b1\u0000\u020a\u020b\u0003\\.\u0000\u020b\u020d\u0001\u0000"+
		"\u0000\u0000\u020c\u0209\u0001\u0000\u0000\u0000\u020d\u0210\u0001\u0000"+
		"\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000"+
		"\u0000\u0000\u020f[\u0001\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000"+
		"\u0000\u0211\u0213\u0005;\u0000\u0000\u0212\u0211\u0001\u0000\u0000\u0000"+
		"\u0212\u0213\u0001\u0000\u0000\u0000\u0213\u0214\u0001\u0000\u0000\u0000"+
		"\u0214\u0215\u0003^/\u0000\u0215]\u0001\u0000\u0000\u0000\u0216\u0219"+
		"\u0007\u0005\u0000\u0000\u0217\u0219\u0003T*\u0000\u0218\u0216\u0001\u0000"+
		"\u0000\u0000\u0218\u0217\u0001\u0000\u0000\u0000\u0219_\u0001\u0000\u0000"+
		"\u0000\u021a\u021b\u0005:\u0000\u0000\u021ba\u0001\u0000\u0000\u0000\u021c"+
		"\u021d\u00059\u0000\u0000\u021dc\u0001\u0000\u0000\u00009mo\u007f\u0086"+
		"\u0091\u009c\u00a1\u00a7\u00aa\u00b4\u00bd\u00c3\u00c9\u00d1\u00d9\u00df"+
		"\u00e4\u00e7\u00ee\u00f9\u00ff\u0105\u0112\u0117\u011c\u0121\u012d\u0138"+
		"\u013f\u0142\u014e\u0151\u015f\u016a\u0173\u017a\u0187\u0192\u019a\u01a2"+
		"\u01a6\u01ab\u01ae\u01b8\u01c1\u01ca\u01d4\u01d8\u01db\u01e5\u01f0\u01f5"+
		"\u01fb\u0205\u020e\u0212\u0218";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}