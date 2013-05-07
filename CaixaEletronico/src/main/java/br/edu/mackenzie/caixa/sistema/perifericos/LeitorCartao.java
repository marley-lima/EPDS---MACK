/**
 * 
 */
package br.edu.mackenzie.caixa.sistema.perifericos;

import br.edu.mackenzie.caixa.servico.Banco;
import br.edu.mackenzie.caixa.servico.BancoA;
import br.edu.mackenzie.caixa.servico.BancoB;

/**
 * @author Ferrete
 *
 */
public class LeitorCartao {
	
	
	public Banco validaCartao(Integer numCartao){
		
		System.out.println("Insira o cartão");
		
		return numCartao == 1 ? new BancoA() : new BancoB();
	}

}
