package br.com.muambyte.dao.cliente;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.muambyte.modelo.Cliente;

@Repository
public class JpaClienteDao implements ClienteDao {
	@PersistenceContext
	EntityManager manager;

	public void adiciona(Cliente cliente) {
		manager.persist(cliente);

	}

	public void altera(Cliente cliente) {
		manager.merge(cliente);
	}

	public List<Cliente> lista() {
		return manager.createQuery("select c from cliente c").getResultList();
	}

	public Cliente buscaPorId(int idCliente) {
		return manager.find(Cliente.class, idCliente);
	}

	public void remove(Cliente cliente) {
		Cliente clienteARemover = buscaPorId(cliente.getIdCliente());
		manager.remove(clienteARemover);
	}

	

}
