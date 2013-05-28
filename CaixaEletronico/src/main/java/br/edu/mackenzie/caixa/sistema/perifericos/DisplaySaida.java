package br.edu.mackenzie.caixa.sistema.perifericos;

import org.apache.log4j.Logger;

/**
 * @author Ferrete
 *
 */
public class DisplaySaida {

	private static final Logger logger = Logger.getLogger(DisplaySaida.class);

	private DisplaySaida() {
		logger.info("Criando DisplaySaida ...");
	}

	public static void display(final String texto){
		
		System.out.println(texto);
	}
	
	public static void montaMenu(final String ... items) {
		
		for (int i = 0; i < items.length; i++) {
			display(i + " - " + items[i]);
		}
	}

}
