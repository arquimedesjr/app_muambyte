package br.com.muambyte.dao.cliente;

import java.util.List;

import br.com.muambyte.modelo.Cliente;

public interface ClienteDao {
	Cliente buscaPorId(int id);
	List<Cliente> lista();
	void adiciona(Cliente c);
	void altera(Cliente c);
	void remove(Cliente c);
	
}
