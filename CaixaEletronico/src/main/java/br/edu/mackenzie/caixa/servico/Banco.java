package br.edu.mackenzie.caixa.servico;

/**
 * @author Ferrete
 * 
 */
public interface Banco {
	
	static int COUNT_SENHA = 0;
	
	boolean validaCartao();
	
	boolean validaSenha();
	
	

}
