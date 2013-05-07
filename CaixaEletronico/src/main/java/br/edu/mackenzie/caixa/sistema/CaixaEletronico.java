package br.edu.mackenzie.caixa.sistema;

import br.edu.mackenzie.caixa.servico.Banco;
import br.edu.mackenzie.caixa.sistema.perifericos.Dispenser;
import br.edu.mackenzie.caixa.sistema.perifericos.Impressora;
import br.edu.mackenzie.caixa.sistema.perifericos.LeitorCartao;
import br.edu.mackenzie.caixa.sistema.perifericos.ReceptorEnvelope;

/**
 * @author Ferrete
 * 
 */
public class CaixaEletronico {
	
	private Banco b;
	
	private Dispenser dispenser;
	
	private Impressora impressora;
	
	private LeitorCartao leitorCartao;
	
	private ReceptorEnvelope receptorEnvelope;
	
	public CaixaEletronico() {
		
	}
	
	
	public void acessoTerminal(){
		
		try {
			Banco b = leitorCartao.validaCartao(123);
			
			while (b == null) {
				System.out.println("Cartão inválido ou danificado - tente outro cartãoo");
				
				b = leitorCartao.validaCartao(123);
			}
			
			login();
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro durante o processo");
		}
	}
	
	private boolean login(){
		
		return true;
	}
	

	public void exibeOperacaoBanco() {
		
		// exibe as operações saque / consulta / deposito / transferencia

	}

	public void saque() {

	}

	public void consulta() {

	}

	public void deposito() {

	}
	
	

}
