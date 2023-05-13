package com.algaworks.cap7.java_database_connectivity.dao;

import com.algaworks.cap7.java_database_connectivity.dao.jdbc.JdbcDAOFactory;

// abstract factory
public abstract class DAOFactory {

	public static DAOFactory getDAOFactory() {
		return new JdbcDAOFactory();
	}


	// Recuperar um cliente DAO
	public abstract ClienteDAO getClienteDAO();
	
} 
	

