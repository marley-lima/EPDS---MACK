/**
 * 
 */
package br.edu.mackenzie.caixa.sistema.perifericos;

import org.apache.log4j.Logger;

import br.edu.mackenzie.caixa.servico.Banco;
import br.edu.mackenzie.caixa.servico.BancoA;
import br.edu.mackenzie.caixa.servico.BancoB;

/**
 * @author Ferrete
 *
 */
public class LeitorCartao {

	private static final Logger logger = Logger.getLogger(LeitorCartao.class);

	public LeitorCartao() {
		logger.info("Criando Leitor de Cartao ...");
	}


	public Banco selecionaBanco(final String numCartao){
		
		if (numCartao.length() < 6) {
			return null;
		}

		if (numCartao.startsWith("A")) {

			return new BancoA();

		}else if (numCartao.endsWith("B")) {

			return new BancoB();
		}
		return null;
	}

	public boolean validaCartao(final Integer numCartao){

		return Boolean.TRUE;

	}

}
