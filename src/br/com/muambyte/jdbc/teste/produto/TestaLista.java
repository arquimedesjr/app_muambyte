package br.com.muambyte.jdbc.teste.produto;

import java.util.List;

import br.com.muambyte.jdbc.dao.produto.ProdutoDao;
import br.com.muambyte.modelo.Produto;

public class TestaLista {
	public static void main(String[] args) {

		ProdutoDao dao = new ProdutoDao();
		List<Produto> produtos = dao.getLista();

		for (Produto produto : produtos) {
			System.out.println("IdProduto: " + produto.getIdProduto());
			System.out.println("Nome: " + produto.getNome());
			System.out.println("Preço Unitario: " + produto.getPrecoUnitario());
			System.out.println("Quantidade: " + produto.getQuantidade()+"\n");
		}
	}
}
