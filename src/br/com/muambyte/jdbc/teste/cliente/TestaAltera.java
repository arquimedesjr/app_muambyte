package br.com.muambyte.jdbc.teste.cliente;

import java.util.Calendar;

import br.com.muambyte.jdbc.dao.cliente.ClienteDao;
import br.com.muambyte.modelo.Cliente;

public class TestaAltera {
	public static void main(String[] args) {
		 Cliente cliente = new Cliente();
		 cliente.setIdCliente(1);
		 cliente.setNome("Arquimedes");
		 cliente.setEmail("contato@muambyte.com.br");
		 cliente.setEndereco("R. Vergueiro 3185 cj57");
		 cliente.setTelefone("123456");
		 cliente.setSexo("Masculino");
		 cliente.setCpf("123");
		 cliente.setRg("123");
		 cliente.setDataNascimento(Calendar.getInstance());
		 
		 	 
		 ClienteDao dao = new ClienteDao();
		 dao.altera(cliente);
		 
		 System.out.println("Alterado!");
	}
}
