// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.la.semantico;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LaSemanticParser}.
 */
public interface LaSemanticListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LaSemanticParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LaSemanticParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(LaSemanticParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(LaSemanticParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(LaSemanticParser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(LaSemanticParser.Decl_local_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(LaSemanticParser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(LaSemanticParser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(LaSemanticParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(LaSemanticParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(LaSemanticParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(LaSemanticParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(LaSemanticParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(LaSemanticParser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(LaSemanticParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(LaSemanticParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(LaSemanticParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(LaSemanticParser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(LaSemanticParser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(LaSemanticParser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(LaSemanticParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(LaSemanticParser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(LaSemanticParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(LaSemanticParser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(LaSemanticParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(LaSemanticParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(LaSemanticParser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(LaSemanticParser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(LaSemanticParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(LaSemanticParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(LaSemanticParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(LaSemanticParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(LaSemanticParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(LaSemanticParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(LaSemanticParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(LaSemanticParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(LaSemanticParser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(LaSemanticParser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(LaSemanticParser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(LaSemanticParser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(LaSemanticParser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(LaSemanticParser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(LaSemanticParser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(LaSemanticParser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(LaSemanticParser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(LaSemanticParser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(LaSemanticParser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(LaSemanticParser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(LaSemanticParser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(LaSemanticParser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(LaSemanticParser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(LaSemanticParser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(LaSemanticParser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(LaSemanticParser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(LaSemanticParser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(LaSemanticParser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(LaSemanticParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(LaSemanticParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(LaSemanticParser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(LaSemanticParser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(LaSemanticParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(LaSemanticParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(LaSemanticParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(LaSemanticParser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(LaSemanticParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(LaSemanticParser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(LaSemanticParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(LaSemanticParser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(LaSemanticParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(LaSemanticParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(LaSemanticParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(LaSemanticParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(LaSemanticParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(LaSemanticParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(LaSemanticParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(LaSemanticParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(LaSemanticParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(LaSemanticParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(LaSemanticParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(LaSemanticParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(LaSemanticParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(LaSemanticParser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(LaSemanticParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(LaSemanticParser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(LaSemanticParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(LaSemanticParser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(LaSemanticParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(LaSemanticParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(LaSemanticParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(LaSemanticParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(LaSemanticParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(LaSemanticParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(LaSemanticParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(LaSemanticParser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(LaSemanticParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(LaSemanticParser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#op_logico1}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico1(LaSemanticParser.Op_logico1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#op_logico1}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico1(LaSemanticParser.Op_logico1Context ctx);
	/**
	 * Enter a parse tree produced by {@link LaSemanticParser#op_logico2}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico2(LaSemanticParser.Op_logico2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LaSemanticParser#op_logico2}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico2(LaSemanticParser.Op_logico2Context ctx);
}