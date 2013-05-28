package br.edu.mackenzie.caixa.servico;

/**
 * @author Ferrete
 * 
 */
public class Conta {

	private String nomeCliente;

	private Integer numeroConta;

	private Integer senha;

	private Double saldo;

	public Conta() {
	}

	public Conta(String nomeCliente, Integer numeroConta, Integer senha, Double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numeroConta = numeroConta;
		this.senha = senha;
		this.saldo = saldo;
	}

	/**
	 * @return the nomeCliente
	 */
	public String getNomeCliente() {
		return nomeCliente;
	}

	/**
	 * @param nomeCliente
	 *            the nomeCliente to set
	 */
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	/**
	 * @return the numeroConta
	 */
	public Integer getNumeroConta() {
		return numeroConta;
	}

	/**
	 * @param numeroConta
	 *            the numeroConta to set
	 */
	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	/**
	 * @return the senha
	 */
	public Integer getSenha() {
		return senha;
	}

	/**
	 * @param senha
	 *            the senha to set
	 */
	public void setSenha(Integer senha) {
		this.senha = senha;
	}

	/**
	 * @return the saldo
	 */
	public Double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo
	 *            the saldo to set
	 */
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
