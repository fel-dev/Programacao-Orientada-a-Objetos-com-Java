package com.algaworks.cap7.java_database_connectivity.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.algaworks.cap7.java_database_connectivity.dao.ClienteDAO;
import com.algaworks.cap7.java_database_connectivity.dao.DAOException;
import com.algaworks.cap7.java_database_connectivity.modelo.Cliente;

public class JdbcClienteDAO implements ClienteDAO {

	private Connection connection;

	// Constructor
	public JdbcClienteDAO(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void salvar(Cliente cliente) {
		try {
			System.out.println("[DEBUG] Salvando o cliente");
			String sql = String.format("insert into cliente (nome) values ('%s')", cliente.getNome());


			System.out.println("[DEBUG] salvando SQL: " + sql);

			PreparedStatement ps = this.connection.prepareStatement(sql);
			ps.executeUpdate(); // fazer commit no banco de dados

		} catch (SQLException e) {
			throw new DAOException("Erro salvando cliente", e);
		} finally {
			try {
				this.connection.close();
			} catch (SQLException e) {} // ñ precisa ser tratada, pq  ja foi lá em cima
		}
	}

	@Override
	public Cliente buscarPeloCodigo(Long codigo) {
		Cliente cliente = null;

		try {
			String sql = String.format("select * from cliente where codigo = %d", codigo);
			PreparedStatement ps = this.connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery(); // é uma espécie de lista de clientes, tabela etc
			while (rs.next()) {
				cliente = new Cliente();
				cliente.setCodigo(rs.getLong("codigo"));
				cliente.setNome(rs.getString("nome"));
			}


		} catch (SQLException e) {
			throw new DAOException("Erro buscando cliente pelo código", e);
		} finally {
			try {
				this.connection.close();
			} catch (SQLException e) {} // ñ precisa ser tratada, pq  ja foi lá em cima
		}
		
		return cliente;
	}

	@Override
	public List<Cliente> buscarTodos() {
		List<Cliente> clientes = new ArrayList<>();
		try {
			String sql = "select * from cliente";
			PreparedStatement ps = this.connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) { // Vai criando varios objetos clientes e adicionando na lista
				Cliente cliente = new Cliente();
				cliente.setCodigo(rs.getLong("codigo"));
				cliente.setNome(rs.getString("nome"));

				clientes.add(cliente);
			}

		} catch (SQLException e) {
			throw new DAOException("Erro buscando cliente pelo código", e);
		} finally {
			try {
				this.connection.close();
			} catch (SQLException e) {}
		}

		return clientes; // retornar a lista de clientes no final
	}

}
