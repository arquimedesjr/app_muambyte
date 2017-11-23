package br.com.muambyte.jpa.login;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.muambyte.modelo.Login;

public class RemoveLogin {
	public static void main(String[] args) {
		Login login = new Login();
		login.setIdLogin(1);
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