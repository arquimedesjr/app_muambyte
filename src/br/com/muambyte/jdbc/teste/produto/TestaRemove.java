package br.com.muambyte.jdbc.teste.produto;

import br.com.muambyte.jdbc.dao.produto.ProdutoDao;
import br.com.muambyte.modelo.Produto;

public class TestaRemove {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto();
		
		produto.setD_e_l_e_t_e("1");
		produto.setIdProduto(1);
		
		ProdutoDao dao = new ProdutoDao();
		dao.remove(produto);
		
		System.out.println("Removido!");
	}

}
