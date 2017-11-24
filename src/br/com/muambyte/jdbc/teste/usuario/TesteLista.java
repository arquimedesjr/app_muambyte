package br.com.muambyte.jdbc.teste.usuario;

import java.util.List;

import br.com.muambyte.jdbc.dao.usuario.UsuarioDao;
import br.com.muambyte.modelo.Usuario;

public class TesteLista {
	public static void main(String[] args) {

		UsuarioDao dao = new UsuarioDao();
		List<Usuario> usuarios = dao.getLista();

		for (Usuario usuario : usuarios) {
			System.out.println("IdUsuario: " + usuario.getIdUsuario());
			System.out.println("Usuario: " + usuario.getUsuario());
			System.out.println("Senha: " + usuario.getSenha() + "\n");
		}

	}
}