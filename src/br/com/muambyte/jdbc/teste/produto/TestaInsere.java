package br.com.muambyte.jdbc.teste.produto;

import br.com.muambyte.jdbc.dao.produto.ProdutoDao;
import br.com.muambyte.modelo.Produto;

public class TestaInsere {
	public static void main(String[] args) {

		Produto produto = new Produto();

		produto.setNome("Vivo");
		produto.setPrecoUnitario("2.40");
		produto.setQuantidade("10");
		produto.setD_e_l_e_t_e("0");

		ProdutoDao dao = new ProdutoDao();
		dao.adiciona(produto);

		System.out.println("Gravado!");
	}
}
