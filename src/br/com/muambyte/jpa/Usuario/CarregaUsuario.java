package br.com.muambyte.jpa.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.muambyte.modelo.Usuario;

public class CarregaUsuario {
	public static void main(String[] args) {
		
	
	EntityManagerFactory factory = Persistence.
	        createEntityManagerFactory("muambyte");
	    EntityManager manager = factory.createEntityManager();

	    Usuario encontrada = manager.find(Usuario.class,1);
	    System.out.println(encontrada.getUsuario());    

	    manager.close();

}
}