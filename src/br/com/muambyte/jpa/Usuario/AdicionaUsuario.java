package br.com.muambyte.jpa.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.muambyte.modelo.Usuario;

public class AdicionaUsuario {

	public static void main(String[] args) {
		Usuario login = new Usuario();
		login.setUsuario("Arquimedes Junior");
		login.setSenha("123456");
		login.setD_e_l_e_t_e("0");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("muambyte");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.persist(login);
		manager.getTransaction().commit();

		System.out.println("Gravado!");
		

		manager.close();
	}
}
