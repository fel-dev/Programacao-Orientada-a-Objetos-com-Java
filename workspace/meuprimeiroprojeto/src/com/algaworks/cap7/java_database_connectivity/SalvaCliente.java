package com.algaworks.cap7.java_database_connectivity;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import com.algaworks.cap7.java_database_connectivity.dao.ClienteDAO;
import com.algaworks.cap7.java_database_connectivity.dao.DAOFactory;
import com.algaworks.cap7.java_database_connectivity.modelo.Cliente;

public class SalvaCliente {
	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

		Cliente cliente = new Cliente();

		String nome = JOptionPane.showInputDialog(null, "Nome do cliente", 
				"Cadastro de cliente",
				JOptionPane.QUESTION_MESSAGE);	

		if (nome == null 
		|| nome.trim().length() == 0 
		|| nome.trim().equalsIgnoreCase("null") 
		|| nome.trim().equalsIgnoreCase("cancelar") 
		|| nome.trim().equalsIgnoreCase("cancelado") 
		|| nome.trim().equalsIgnoreCase("cancelado pelo usuário")) {
			System.out.println("Cancelado pelo usuário");
			return;
		}

		cliente.setNome(nome);

		ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
		clienteDAO.salvar(cliente);
		System.out.println("Cliente salvo com sucesso.");
	}

}
