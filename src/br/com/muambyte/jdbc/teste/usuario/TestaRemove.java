package br.com.muambyte.jdbc.teste.usuario;

import br.com.muambyte.jdbc.dao.usuario.UsuarioDao;
import br.com.muambyte.modelo.Usuario;

public class TestaRemove {
	
	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		usuario.setD_e_l_e_t_e("1");
		usuario.setIdUsuario(1);
		
		UsuarioDao dao = new UsuarioDao();
		dao.remove(usuario);
		
		System.out.println("Removido!");
	}

}
