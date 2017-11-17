package br.com.muambyte.jpa.Carrinho;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.muambyte.modelo.Carrinho;

public class CarregaCarrinho {
	public static void main(String[] args) {
		
	
	EntityManagerFactory factory = Persistence.
	        createEntityManagerFactory("muambyte");
	    EntityManager manager = factory.createEntityManager();

	    Carrinho encontrada = manager.find(Carrinho.class,1);
	    System.out.println(encontrada.getIdCarrinho());    

	    manager.close();

}
}