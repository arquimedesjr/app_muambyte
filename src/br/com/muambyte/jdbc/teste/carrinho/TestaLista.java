package br.com.muambyte.jdbc.teste.carrinho;

import java.util.List;

import br.com.muambyte.jdbc.dao.carrinho.CarrinhoDao;
import br.com.muambyte.modelo.Carrinho;

public class TestaLista {
	public static void main(String[] args) {

		CarrinhoDao dao = new CarrinhoDao();
		List<Carrinho> carrinhos = dao.getLista();

		for (Carrinho carrinho : carrinhos) {
			System.out.println("IdCarrinho: " + carrinho.getIdCarrinho());
			System.out.println("Frete: " + carrinho.getFrete());
			System.out.println("QtdPeca: " + carrinho.getQtdPeca());
			System.out.println("ValorTotal: " + carrinho.getValorTotal() + "\n");

		}

	}
}
