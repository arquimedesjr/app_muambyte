package br.com.muambyte.jdbc.teste.carrinho;

import br.com.muambyte.jdbc.dao.carrinho.CarrinhoDao;
import br.com.muambyte.modelo.Carrinho;

public class TestaRemove {
	
	public static void main(String[] args) {
		
		Carrinho carrinho = new Carrinho();
		carrinho.setIdCarrinho(1);
		
		CarrinhoDao dao = new CarrinhoDao();
		dao.remove(carrinho);
		
		System.out.println("Remove!");
	}

}
