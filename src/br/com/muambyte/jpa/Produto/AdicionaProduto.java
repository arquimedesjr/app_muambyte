package br.com.muambyte.jpa.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.muambyte.modelo.Produto;

public class AdicionaProduto {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.setNome("Sansung 123");
		produto.setPrecoUnitario("10.0");
		produto.setQuantidade("50");
		produto.setD_e_l_e_t_e("0");
			

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("muambyte");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.persist(produto);
		manager.getTransaction().commit();

		System.out.println("Gravado!\nNome: "+produto.getNome()+"\nPreço Unitario: "+produto.getPrecoUnitario()
				+"\nQuantidade: "+produto.getQuantidade()+"\nDelete: "+produto.getD_e_l_e_t_e());
		

		manager.close();
	}
}
