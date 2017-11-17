package br.com.muambyte.jpa.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.muambyte.modelo.Cliente;

public class CarregaCliente {
	public static void main(String[] args) {
		
	
	EntityManagerFactory factory = Persistence.
	        createEntityManagerFactory("muambyte");
	    EntityManager manager = factory.createEntityManager();

	    Cliente encontrada = manager.find(Cliente.class,1);
	    System.out.println(encontrada.getIdCliente());    

	    manager.close();

}
}