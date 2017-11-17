package br.com.muambyte.jpa.login;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.muambyte.modelo.Login;

public class AlteraLogin {

	public static void main(String[] args) {
		Login login = new Login();
		login.setId_login(1);
		login.setUsuario("junior");
		login.setSenha("654321");
		login.setD_e_l_e_t_e("0");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("muambyte");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.merge(login);
		manager.getTransaction().commit();

		System.out.println("ID login: " + login.getId_login() + "\nUsuario: " + login.getUsuario() + "\nSenha: "
				+ login.getSenha() + "\nDelete: " + login.getD_e_l_e_t_e());

		manager.close();

	}
}
