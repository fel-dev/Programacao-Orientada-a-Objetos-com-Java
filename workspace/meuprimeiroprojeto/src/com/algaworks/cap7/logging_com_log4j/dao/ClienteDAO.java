package com.algaworks.cap7.logging_com_log4j.dao;

import org.apache.log4j.Logger;

import com.algaworks.cap7.logging_com_log4j.model.Cliente;

public class ClienteDAO {

	private static Logger logger = Logger.getLogger(ClienteDAO.class);

	public void salvar(Cliente cliente) {
		if (cliente == null) {
			// Regra para dizer ao usuario informar o nome
			logger.warn("Impossível salvar um cliente nulo.");
			return;
		}

		if (logger.isDebugEnabled()) {
			logger.debug("Salvando o cliente: " + cliente);
		}

		// Salvar o cliente no banco de dados		
		
		logger.debug("Cliente salvo com sucesso.");
	}
	
}
