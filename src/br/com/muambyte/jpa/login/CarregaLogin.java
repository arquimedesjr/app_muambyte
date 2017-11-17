package br.com.muambyte.jpa.login;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.muambyte.modelo.Login;

public class CarregaLogin {
	public static void main(String[] args) {
		
	
	EntityManagerFactory factory = Persistence.
	        createEntityManagerFactory("muambyte");
	    EntityManager manager = factory.createEntityManager();

	    Login encontrada = manager.find(Login.class,1);
	    System.out.println(encontrada.getUsuario());    

	    manager.close();

}
}