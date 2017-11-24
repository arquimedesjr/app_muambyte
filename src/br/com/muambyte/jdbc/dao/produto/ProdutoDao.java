package br.com.muambyte.jdbc.dao.produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.muambyte.jdbc.connection.ConnectionFactory;
import br.com.muambyte.modelo.Produto;

public class ProdutoDao {

	private Connection connection;

	public ProdutoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Produto produto) {
		String sql = "insert into produto (nome, precoUnitario, quantidade, d_e_l_e_t_e)"
				+ " values (?,?,?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getPrecoUnitario());
			stmt.setString(3, produto.getQuantidade());
			stmt.setString(4, produto.getD_e_l_e_t_e());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void altera(Produto produto) {
		String sql = "update produto set nome=?, precoUnitario=?, quantidade=? where idProduto=?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getPrecoUnitario());
			stmt.setString(3, produto.getQuantidade());
			stmt.setInt(4, produto.getIdProduto());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Produto produto) {
		String sql = "update produto set d_e_l_e_t_e=? where idProduto=?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, produto.getD_e_l_e_t_e());
			stmt.setInt(2, produto.getIdProduto());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public List<Produto> getLista() {
		try {
			List<Produto> produtos = new ArrayList<Produto>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from produto where d_e_l_e_t_e=0");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Produto produto = new Produto();
				System.out.println("idProduto: "+produto.getIdProduto());
				System.out.println("Nome: "+produto.getNome());
				System.out.println("Preço Unitario: "+produto.getPrecoUnitario());
				System.out.println("Quantidade: "+produto.getQuantidade());

				produtos.add(produto);
			}
			rs.close();
			stmt.close();
			return produtos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
