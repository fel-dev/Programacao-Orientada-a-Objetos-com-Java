package com.algaworks.cap7.java_database_connectivity.dao;

public class DAOException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public DAOException(String msg, Throwable t) {
		super(msg, t);
	}
}
