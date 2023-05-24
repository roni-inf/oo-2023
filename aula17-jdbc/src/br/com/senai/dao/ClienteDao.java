package br.com.senai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.senai.conexao.ConnectionFactory;
import br.com.senai.entity.Cliente;

public class ClienteDao {
	private Connection connection;

	public ClienteDao() {
		connection = new ConnectionFactory().getConnection();
	}

	public void inserirRegistro(Cliente cliente) {
		String sql = "insert into tb_cliente(nome,telefone,email) values (?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getTelefone());
			stmt.setString(3, cliente.getEmail());
			stmt.execute();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			System.out.println("Erro ao inserir o registro de cliente");
			e.printStackTrace();
		}
	}

	public void atualizarRegistro(Cliente cliente) {
		String sql = "update tb_cliente set nome=?, telefone=?, email=? where codigo=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getTelefone());
			stmt.setString(3, cliente.getEmail());
			stmt.setInt(4, cliente.getCodigo());
			stmt.execute();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			System.out.println("Erro ao atualizar| o registro do cliente");
			e.printStackTrace();
		}
	}

	public void remover(int codigo) {
		String sql = "delete from tb_cliente where codigo=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, codigo);
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Erro ao excluir o registro do cliente");
			e.printStackTrace();
		}
	}

	public List<Cliente> listarClientes() {
		String sql = "select * from tb_cliente";
		List<Cliente> clientes = new ArrayList<>();
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Cliente cliente = new Cliente(rs.getInt("codigo"), rs.getString("nome"), rs.getString("telefone"),
						rs.getString("email"));
				clientes.add(cliente);
			}
			stmt.close();
			rs.close();
			connection.close();

		} catch (SQLException e) {
			System.out.println("Erro !");
			e.printStackTrace();
		}
		return clientes;
	}
}
