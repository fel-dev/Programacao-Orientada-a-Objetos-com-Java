package com.algaworks.cap7.java_database_connectivity;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import com.algaworks.cap7.java_database_connectivity.dao.ClienteDAO;
import com.algaworks.cap7.java_database_connectivity.dao.DAOFactory;
import com.algaworks.cap7.java_database_connectivity.modelo.Cliente;

public class BuscaPeloCodigo {
	
	public static void main(String[] args) throws Exception{
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

		ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();

		String codigoStr = JOptionPane.showInputDialog(null, "Código do cliente", 
				"Busca de cliente",
				JOptionPane.QUESTION_MESSAGE);

		Long codigo = null;
		try {
			codigo = Long.parseLong(codigoStr);
		} catch (NumberFormatException e) {
			System.out.println("Código inválido. " + e.getMessage());
			return;
		}
		
		Cliente cliente = clienteDAO.buscarPeloCodigo(codigo);	
		
		if (cliente != null) {
			System.out.println("------ Cliente encontrado -----");
			System.out.printf("Código: %d\n", cliente.getCodigo());
			System.out.printf("Nome: %s\n", cliente.getNome());
		} else {
			System.out.println("Nenhum cliente encontrado.");
		}
	}

}
