package br.com.muambyte.jpa.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.muambyte.modelo.Usuario;

public class RemoveUsuario {
	public static void main(String[] args) {
		Usuario login = new Usuario();
		login.setIdUsuario(1);
		login.setD_e_l_e_t_e("1");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("muambyte");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.merge(login);
		manager.getTransaction().commit();

		System.out.println("Removido!");

		manager.close();
	}
}