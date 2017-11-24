package br.com.muambyte.jdbc.teste.cliente;

import java.util.List;

import br.com.muambyte.jdbc.dao.cliente.ClienteDao;
import br.com.muambyte.modelo.Cliente;

public class TestaLista {
	public static void main(String[] args) {
		
		ClienteDao dao = new ClienteDao();
		List<Cliente> clientes = dao.getLista();
		
		for (Cliente cliente:clientes) {
			System.out.println("Id cliente: "+cliente.getIdCliente());
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("Email: " + cliente.getEmail());
			System.out.println("Endereço: " + cliente.getEndereco());
			System.out.println("Cpf: "+cliente.getCpf());
			System.out.println("Rg: "+cliente.getRg());
			System.out.println("Sexo: "+cliente.getSexo());
			System.out.println("Telefone: "+cliente.getTelefone());
			System.out.println("Data de Nascimento: " + 
			              cliente.getDataNascimento().getTime() + "\n");
		}
	}
}
