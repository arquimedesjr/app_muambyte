package br.com.muambyte.jpa.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.muambyte.modelo.Cliente;


/*
 * Como realizar somente atualização de um campo somente. 	
 * 
 */



public class RemoveCliente {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setIdCliente(1);
		cliente.setD_e_l_e_t_e("1");
		
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("muambyte");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.refresh(cliente);
		manager.getTransaction().commit();

		System.out.println("Removido!");

		manager.close();
	}
}