package br.com.muambyte.jpa.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.muambyte.modelo.Produto;

public class RemoveLogin {
	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.setIdProduto(1);
		produto.setD_e_l_e_t_e("1");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("muambyte");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.merge(produto);
		manager.getTransaction().commit();

		System.out.println("Removido!");

		manager.close();
	}
}