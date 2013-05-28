package br.edu.mackenzie.caixa.servico;

/**
 * @author Ferrete
 * 
 */
public interface Banco {
	
	String getBancoID();
	
	String[] getOperacoes();
	
	boolean validaCartao();

	boolean validaSenha();

	

}
