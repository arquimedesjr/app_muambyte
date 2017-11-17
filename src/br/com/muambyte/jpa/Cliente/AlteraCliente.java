package br.com.muambyte.jpa.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.muambyte.modelo.Cliente;

public class AlteraCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setIdCliente(2);
		cliente.setNome("Junior");
		cliente.setCpf("48-33");
		cliente.setRg("984321");
		cliente.setEmail("mail");
		cliente.setEndereco("Rua jose monteiro, 323 apto 425");
		cliente.setTelefone("98765444");
		cliente.setD_e_l_e_t_e("0");
		

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("muambyte");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.merge(cliente);
		manager.getTransaction().commit();

		System.out.println("Gravado!\nNome: "+cliente.getNome()+"\nCPF: "+cliente.getCpf()+"\nRg: "+cliente.getRg()+"\nEmail: "+cliente.getEmail()
				+"\nEndereço: "+cliente.getEndereco()+"\nTelefone: "+cliente.getTelefone()+"\nDelete: "+cliente.getD_e_l_e_t_e());
		
		

		manager.close();
	}
}
