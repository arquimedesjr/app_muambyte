package br.com.muambyte.jpa.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.muambyte.modelo.Usuario;

public class AlteraUsuario {

	public static void main(String[] args) {
		Usuario login = new Usuario();
		login.setIdUsuario(1);
		login.setUsuario("junior");
		login.setSenha("654321");
		login.setD_e_l_e_t_e("0");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("muambyte");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.merge(login);
		manager.getTransaction().commit();

		System.out.println("Alterado");

		manager.close();

	}
}
