package com.algaworks.cap7.logging_com_log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class ConfiguracaoBasica {
	
	private static Logger logger = Logger.getLogger(ConfiguracaoBasica.class); // usado em produção

	public static void main(String[] args) {

		BasicConfigurator.configure(); // Configuração básica do Log4J, não é usado em produção. muito básico.

		logger.info("Começando a aplicação");
		// Código da aplicação
		logger.info("Terminando a aplicação");

	}

}
