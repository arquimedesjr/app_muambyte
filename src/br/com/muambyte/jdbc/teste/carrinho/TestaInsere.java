package br.com.muambyte.jdbc.teste.carrinho;

import br.com.muambyte.jdbc.dao.carrinho.CarrinhoDao;
import br.com.muambyte.modelo.Carrinho;

public class TestaInsere {
	public static void main(String[] args) {
//		Produto produto = new Produto();
		Carrinho carrinho = new Carrinho();
		carrinho.setFrete(3.50);
		carrinho.setQtdPeca(5);
/*		carrinho.setValorTotal(produto.getPrecoUnitario()+carrinho.getFrete()*carrinho.getQtdPeca());*/
		carrinho.setValorTotal(10);
		
		CarrinhoDao dao = new CarrinhoDao();
		dao.adiciona(carrinho);
		
		System.out.println("Gravado!");
	}
	

}
