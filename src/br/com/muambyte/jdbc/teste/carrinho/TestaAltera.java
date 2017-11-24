package br.com.muambyte.jdbc.teste.carrinho;

import br.com.muambyte.jdbc.dao.carrinho.CarrinhoDao;
import br.com.muambyte.modelo.Carrinho;

public class TestaAltera {
	public static void main(String[] args) {
		
		Carrinho carrinho = new Carrinho();
		carrinho.setIdCarrinho(1);
		carrinho.setFrete(3.50);
		carrinho.setQtdPeca(5);
		carrinho.setValorTotal(555);
		
		CarrinhoDao dao = new CarrinhoDao();
		dao.altera(carrinho);
		
		System.out.println("Alterado!");
	}

}
