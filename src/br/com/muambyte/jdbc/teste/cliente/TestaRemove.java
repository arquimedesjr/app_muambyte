package br.com.muambyte.jdbc.teste.cliente;

import br.com.muambyte.jdbc.dao.cliente.ClienteDao;
import br.com.muambyte.modelo.Cliente;

public class TestaRemove {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.setD_e_l_e_t_e("1");
		cliente.setIdCliente(1);
		
		ClienteDao dao = new ClienteDao();
		dao.remove(cliente);
		
		System.out.println("Removido!");
	}

}
