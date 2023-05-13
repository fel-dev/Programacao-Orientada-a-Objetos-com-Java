package com.algaworks.cap7.java_database_connectivity;

import java.util.List;

import com.algaworks.cap7.java_database_connectivity.dao.ClienteDAO;
import com.algaworks.cap7.java_database_connectivity.dao.DAOFactory;
import com.algaworks.cap7.java_database_connectivity.modelo.Cliente;

public class BuscaTodosClientes {
	
	public static void main(String[] args) {
			// Recupera clienteDAO
			ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();

			// Lista todos os clientes
			List<Cliente> clientes = clienteDAO.buscarTodos();

			
			for (Cliente cliente : clientes) {
				System.out.println("\n------ Cliente encontrado -----");
			System.out.printf("Código: %d\n", cliente.getCodigo());
				System.out.printf("Nome: %s\n", cliente.getNome());
			}
	}

}
