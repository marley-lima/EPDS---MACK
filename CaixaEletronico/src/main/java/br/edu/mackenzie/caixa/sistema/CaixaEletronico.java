package br.edu.mackenzie.caixa.sistema;

import org.apache.log4j.Logger;

import br.edu.mackenzie.caixa.servico.Banco;
import br.edu.mackenzie.caixa.sistema.perifericos.Dispenser;
import br.edu.mackenzie.caixa.sistema.perifericos.DisplaySaida;
import br.edu.mackenzie.caixa.sistema.perifericos.Impressora;
import br.edu.mackenzie.caixa.sistema.perifericos.LeitorCartao;
import br.edu.mackenzie.caixa.sistema.perifericos.LeitorTeclado;
import br.edu.mackenzie.caixa.sistema.perifericos.ReceptorEnvelope;

/**
 * @author Ferrete
 * 
 */
public class CaixaEletronico {
	
	private static final  Logger logger = Logger.getLogger(CaixaEletronico.class);
	
	private Banco banco;
	
	private Dispenser dispenser;
	
	private Impressora impressora;
	
	private LeitorTeclado teclado;
	
	private LeitorCartao leitorCartao;
	
	private ReceptorEnvelope receptorEnvelope;
	
	
	public CaixaEletronico(){
		
		logger.info("Iniciando Caixa Eletronico ...");
		
		teclado = new LeitorTeclado();
		dispenser = new Dispenser();
		impressora = new Impressora();
		leitorCartao = new LeitorCartao();
		receptorEnvelope = new ReceptorEnvelope();
		
		logger.info("Caixa Eletronico iniciado com sucesso.");
	}
	
	
	public void acessoTerminal(){
		
		try {
			DisplaySaida.display("Terminal ativo - insira o cartão : ");
			banco = leitorCartao.selecionaBanco(teclado.lerString());
			
			while (banco == null) {
				System.out.println("Cartão inválido ou danificado - tente outro cartão");
				
				banco = leitorCartao.selecionaBanco(teclado.lerString());
			}
			DisplaySaida.display("Bem vindo ao : " + banco.getBancoID() + " !");
			
			DisplaySaida.display("Selecione a opção desejada >> ");
			
			exibeOperacaoBanco(banco);
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro durante o processo tente novamente mais tarde - ou entre em contato com seu Banco");
		}
	}

	public void exibeOperacaoBanco(final Banco banco) {
		
		DisplaySaida.montaMenu(banco.getOperacoes());
	}
	
	private void verificaSenha(){
	}

	private void saque() {

	}

	private void consulta() {

	}

	private void deposito() {

	}
	
	

}
