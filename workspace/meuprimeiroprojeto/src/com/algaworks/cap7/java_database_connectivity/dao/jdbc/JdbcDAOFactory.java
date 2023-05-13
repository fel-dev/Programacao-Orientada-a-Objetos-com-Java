package com.algaworks.cap7.java_database_connectivity.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import com.algaworks.cap7.java_database_connectivity.dao.ClienteDAO;
import com.algaworks.cap7.java_database_connectivity.dao.DAOFactory;

public class JdbcDAOFactory extends DAOFactory {
	
	// criar a conexão pra passar cada conexão dos DAOs

	private Connection connection;

	public JdbcDAOFactory() {
		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver"); // carregar o driver do banco de dados
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost/cadastro_cliente", "root", ""); // Recuperar conexão com o banco de dados
			System.out.println("[DEBUG] Conectado ao banco de dados");

		} catch (Exception e) {
			throw new RuntimeException("Erro recuperando conexão com o banco", e);
		}
	}

	@Override
	public ClienteDAO getClienteDAO() {
		// quem implementa essa interface é o JdbcClienteDAO
		return new JdbcClienteDAO(this.connection);
	}

}
