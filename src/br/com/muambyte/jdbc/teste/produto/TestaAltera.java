package br.com.muambyte.jdbc.teste.produto;

import br.com.muambyte.jdbc.dao.produto.ProdutoDao;
import br.com.muambyte.modelo.Produto;

public class TestaAltera {
	public static void main(String[] args) {
		
		Produto produto = new Produto();
		
		produto.setIdProduto(1);
		produto.setNome("Tim");
		produto.setPrecoUnitario("1,10");
		produto.setQuantidade("10");
		
		ProdutoDao dao = new ProdutoDao();
		dao.remove(produto);
		
		System.out.println("Removido!");
	}

}
