package br.com.muambyte.jpa.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.muambyte.modelo.Produto;

public class CarregaProduto {
	public static void main(String[] args) {
		
	
	EntityManagerFactory factory = Persistence.
	        createEntityManagerFactory("muambyte");
	    EntityManager manager = factory.createEntityManager();

	    Produto encontrada = manager.find(Produto.class,1);
	    System.out.println(encontrada.getIdProduto());    

	    manager.close();

}
}