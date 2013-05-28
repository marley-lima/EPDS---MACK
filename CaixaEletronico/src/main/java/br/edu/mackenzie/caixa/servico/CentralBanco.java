package br.edu.mackenzie.caixa.servico;

/**
 * @author Ferrete
 *
 */
public abstract class CentralBanco implements Banco {
	
	private String bancoID;
	
	
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

	/**
	 * @return the bancoID
	 */
	public String getBancoID() {
		return bancoID;
	}


	
	
	
	
	
	

}
