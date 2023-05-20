package com.algaworks.cap7.logging_com_log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.algaworks.cap7.logging_com_log4j.dao.ClienteDAO;
import com.algaworks.cap7.logging_com_log4j.model.Cliente;

public class ExemploSalvandoCliente {
	
	private static Logger logger = Logger.getLogger(ExemploSalvandoCliente.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties"); // ta na raiz do projeto

		logger.info("Começando a aplicação");

		// Código da aplicação
		Cliente cliente = new Cliente("João");
		new ClienteDAO().salvar(cliente);
		
		new ClienteDAO().salvar(null);

		logger.info("Terminando a aplicação");
		
	}

}
