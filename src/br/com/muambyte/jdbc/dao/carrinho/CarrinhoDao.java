package br.com.muambyte.jdbc.dao.carrinho;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.muambyte.jdbc.connection.ConnectionFactory;
import br.com.muambyte.modelo.Carrinho;

public class CarrinhoDao {

	private Connection connection;

	public CarrinhoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Carrinho carrinho) {
		String sql = "insert into carrinho " + "(frete, qtdPeca, valorTotal)" + " values (?,?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setDouble(1, carrinho.getFrete());
			stmt.setDouble(2, carrinho.getQtdPeca());
			stmt.setDouble(3, carrinho.getValorTotal());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void altera(Carrinho carrinho) {
		String sql = "update carrinho set frete=?, qtdPeca=?, valorTotal=? " + "where idCarrinho=?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setDouble(1, carrinho.getFrete());
			stmt.setDouble(2, carrinho.getQtdPeca());
			stmt.setDouble(3, carrinho.getValorTotal());
			stmt.setInt(4, carrinho.getIdCarrinho());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void remove(Carrinho carrinho) {
		String sql = "detele from carrinho where idCarrinho=?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setInt(1, carrinho.getIdCarrinho());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public List<Carrinho> getLista() {
		try {
			List<Carrinho> carrinhos = new ArrayList<Carrinho>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from carrinho");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Carrinho carrinho = new Carrinho();
				carrinho.setIdCarrinho(rs.getInt("idCarrinho"));
				carrinho.setFrete(rs.getDouble("frete"));
				carrinho.setQtdPeca(rs.getDouble("qtdPeca"));
				carrinho.setValorTotal(rs.getDouble("valorTotal"));

				carrinhos.add(carrinho);
			}
			rs.close();
			stmt.close();
			return carrinhos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
