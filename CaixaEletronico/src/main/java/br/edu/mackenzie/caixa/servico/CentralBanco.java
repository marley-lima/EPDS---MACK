package br.edu.mackenzie.caixa.servico;

/**
 * @author Ferrete
 *
 */
public class CentralBanco implements Banco {
	
	private static int COUNT_SENHA = 0;
	
	
	public CentralBanco() {
		// TODO Auto-generated constructor stub
	}

	public boolean validaCartao() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean validaSenha() {
		// TODO Auto-generated method stub
		return false;
	}

	public static int getCOUNT_SENHA() {
		return COUNT_SENHA;
	}

	public static void setCOUNT_SENHA(int cOUNT_SENHA) {
		COUNT_SENHA = cOUNT_SENHA;
	}
	
	

}
