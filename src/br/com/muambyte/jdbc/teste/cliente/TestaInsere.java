package br.com.muambyte.jdbc.teste.cliente;

import java.util.Calendar;

import br.com.muambyte.jdbc.dao.cliente.ClienteDao;
import br.com.muambyte.modelo.Cliente;

public class TestaInsere {
	public static void main(String[] args) {
		
		 Cliente cliente = new Cliente();
		 cliente.setNome("Caelum");
		 cliente.setEmail("contato@caelum.com.br");
		 cliente.setEndereco("R. Vergueiro 3185 cj57");
		 cliente.setTelefone("123456");
		 cliente.setSexo("Masculino");
		 cliente.setCpf("123");
		 cliente.setRg("123");
		 cliente.setDataNascimento(Calendar.getInstance());
		 cliente.setD_e_l_e_t_e("0");
		 	 
		 ClienteDao dao = new ClienteDao();
		 dao.adiciona(cliente);
		 
		 System.out.println("Gravado!");
	}
}
