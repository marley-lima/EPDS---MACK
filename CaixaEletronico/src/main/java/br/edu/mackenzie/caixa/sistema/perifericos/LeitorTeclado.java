package br.edu.mackenzie.caixa.sistema.perifericos;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * @author Ferrete
 *
 */
public class LeitorTeclado {

	private static final Scanner scanner = new Scanner(System.in);

	private static final Logger logger = Logger.getLogger(LeitorTeclado.class);

	public LeitorTeclado() {
		logger.info("Criando Leitor de Teclado ...");
	}


	public Integer lerInteger(){

		try {
			return scanner.nextInt();

		} catch (Exception e) {
			logger.error("Erro ao processor entrada - valor inválido", new Throwable(e));
		}
		return null;
	}

	public String lerString(){

		try {
			return scanner.next();

		} catch (Exception e) {
			logger.error("Erro ao processor entrada - valor inválido", new Throwable(e));
		}
		return null;
	}


}
