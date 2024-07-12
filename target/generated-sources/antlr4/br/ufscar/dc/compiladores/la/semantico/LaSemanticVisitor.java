// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.la.semantico;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LaSemanticParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LaSemanticVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(LaSemanticParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(LaSemanticParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#decl_local_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_local_global(LaSemanticParser.Decl_local_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#declaracao_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_local(LaSemanticParser.Declaracao_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(LaSemanticParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(LaSemanticParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#dimensao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao(LaSemanticParser.DimensaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(LaSemanticParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#tipo_basico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico(LaSemanticParser.Tipo_basicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico_ident(LaSemanticParser.Tipo_basico_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#tipo_estendido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_estendido(LaSemanticParser.Tipo_estendidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#valor_constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_constante(LaSemanticParser.Valor_constanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(LaSemanticParser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#declaracao_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_global(LaSemanticParser.Declaracao_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(LaSemanticParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(LaSemanticParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(LaSemanticParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(LaSemanticParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#cmdLeia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLeia(LaSemanticParser.CmdLeiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#cmdEscreva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEscreva(LaSemanticParser.CmdEscrevaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#cmdSe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSe(LaSemanticParser.CmdSeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#cmdCaso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCaso(LaSemanticParser.CmdCasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#cmdPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdPara(LaSemanticParser.CmdParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEnquanto(LaSemanticParser.CmdEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#cmdFaca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdFaca(LaSemanticParser.CmdFacaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAtribuicao(LaSemanticParser.CmdAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#cmdChamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdChamada(LaSemanticParser.CmdChamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#cmdRetorne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRetorne(LaSemanticParser.CmdRetorneContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(LaSemanticParser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#item_selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_selecao(LaSemanticParser.Item_selecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(LaSemanticParser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#numero_intervalo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero_intervalo(LaSemanticParser.Numero_intervaloContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#op_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_unario(LaSemanticParser.Op_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_aritmetica(LaSemanticParser.Exp_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(LaSemanticParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(LaSemanticParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(LaSemanticParser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(LaSemanticParser.Op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp3(LaSemanticParser.Op3Context ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#parcela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela(LaSemanticParser.ParcelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#parcela_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_unario(LaSemanticParser.Parcela_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_nao_unario(LaSemanticParser.Parcela_nao_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#exp_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_relacional(LaSemanticParser.Exp_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#op_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_relacional(LaSemanticParser.Op_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(LaSemanticParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#termo_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_logico(LaSemanticParser.Termo_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#fator_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator_logico(LaSemanticParser.Fator_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#parcela_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_logica(LaSemanticParser.Parcela_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#op_logico1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico1(LaSemanticParser.Op_logico1Context ctx);
	/**
	 * Visit a parse tree produced by {@link LaSemanticParser#op_logico2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico2(LaSemanticParser.Op_logico2Context ctx);
}