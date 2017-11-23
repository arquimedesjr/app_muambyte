package br.com.muambyte.jpa.Carrinho;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.muambyte.modelo.Carrinho;
import br.com.muambyte.modelo.Produto;

public class AdicionaCarrinho {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("muambyte");
		EntityManager manager = factory.createEntityManager();
		
		Carrinho carrinho = new Carrinho();
		Produto encontrada = manager.find(Produto.class,1);
		
		carrinho.setFrete(2.50);
		carrinho.setQtdPeca(9); 
				
/*		carrinho.setValorTotal(carrinho.getFrete()+carrinho.getQtdPeca()*encontrada.getPrecoUnitario());
*/
		manager.getTransaction().begin();
		manager.persist(carrinho);
		manager.getTransaction().commit();

		System.out.println("Gravado!\nId carrinho: "+carrinho.getIdCarrinho()+"\nFrete: "+carrinho.getFrete()+
				"\nQuantidades de Peças: "+carrinho.getQtdPeca()+"\nProduto Unitario: "+encontrada.getPrecoUnitario()+"\nValor Total: "+carrinho.getValorTotal());
		

		manager.close();
	}
}
