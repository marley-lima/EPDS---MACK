package br.edu.mackenzie.caixa.servico;

public class BancoB extends CentralBanco{
	
	private final String bancoID = "BANCO A";
	
	private String[] operacoes = {"SAQUE", "CONSULTA", "DEPOSITO", "TRAFERENCIA"};

	/**
	 * @return the operacoes
	 */
	public String[] getOperacoes() {
		return operacoes;
	}

	/**
	 * @return the bancoID
	 */
	public String getBancoID() {
		return bancoID;
	}
	
	

}
