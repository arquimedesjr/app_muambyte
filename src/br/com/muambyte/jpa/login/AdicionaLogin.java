package br.com.muambyte.jpa.login;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.muambyte.modelo.Login;

public class AdicionaLogin {

	public static void main(String[] args) {
		Login login = new Login();
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
