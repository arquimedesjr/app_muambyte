package br.com.muambyte.jdbc.dao.cliente;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.muambyte.jdbc.connection.ConnectionFactory;
import br.com.muambyte.modelo.Cliente;

public class ClienteDao {

	private Connection connection;

	public ClienteDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Cliente cliente) {
		String sql = "insert into cliente " + "(nome,cpf,rg,email,telefone,sexo,endereco,dataNascimento,d_e_l_e_t_e)"
				+ " values (?,?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getRg());
			stmt.setString(4, cliente.getEmail());
			stmt.setString(5, cliente.getTelefone());
			stmt.setString(6, cliente.getSexo());
			stmt.setString(7, cliente.getEndereco());
			stmt.setDate(8, new Date(cliente.getDataNascimento().getTimeInMillis()));
			stmt.setString(9, cliente.getD_e_l_e_t_e());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void altera(Cliente cliente) {
		String sql = "update cliente set nome=?, cpf=?, rg=?, email=?, telefone=?, sexo=?,"
				+ "dataNascimento=?, endereco=? where idCliente=?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getRg());
			stmt.setString(4, cliente.getEmail());
			stmt.setString(5, cliente.getTelefone());
			stmt.setString(6, cliente.getSexo());
			stmt.setDate(7, new Date(cliente.getDataNascimento().getTimeInMillis()));
			stmt.setString(8, cliente.getEndereco());
			stmt.setInt(9, cliente.getIdCliente());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void remove(Cliente cliente) {
		String sql = "update cliente set d_e_l_e_t_e=? where idCliente=?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, cliente.getD_e_l_e_t_e());
			stmt.setInt(2, cliente.getIdCliente());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public List<Cliente> getLista() {
		try {
			List<Cliente> clientes = new ArrayList<Cliente>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from cliente where d_e_l_e_t_e=0");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setIdCliente(rs.getInt("idCliente"));
				cliente.setNome(rs.getString("nome"));
				cliente.setEmail(rs.getString("email"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setRg(rs.getString("rg"));
				cliente.setTelefone(rs.getString("telefone"));
				cliente.setSexo(rs.getString("sexo"));
				cliente.setEndereco(rs.getString("endereco"));

				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				cliente.setDataNascimento(data);

				clientes.add(cliente);
			}
			rs.close();
			stmt.close();
			return clientes;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
