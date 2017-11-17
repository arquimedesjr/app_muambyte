package br.com.muambyte.jpa.gerarTabelas;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GerarTabela {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("muambyte");

		factory.close();
	}

}
