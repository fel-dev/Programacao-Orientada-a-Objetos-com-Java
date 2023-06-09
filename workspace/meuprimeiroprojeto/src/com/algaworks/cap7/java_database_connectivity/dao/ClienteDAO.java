package com.algaworks.cap7.java_database_connectivity.dao;

import java.util.List;

import com.algaworks.cap7.java_database_connectivity.modelo.Cliente;

public interface ClienteDAO {
	
	public void salvar(Cliente cliente);

	public Cliente buscarPeloCodigo(Long codigo);

	public List<Cliente> buscarTodos();

}
