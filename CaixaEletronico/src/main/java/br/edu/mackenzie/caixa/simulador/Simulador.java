package br.edu.mackenzie.caixa.simulador;

import org.apache.log4j.Logger;

import br.edu.mackenzie.caixa.sistema.CaixaEletronico;


/**
 * @author Ferrete
 *
 */
public class Simulador {
	
	private static final  Logger logger = Logger.getLogger(Simulador.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CaixaEletronico caixa = new CaixaEletronico();
		caixa.acessoTerminal();

	}

}
