package br.com.muambyte.jdbc.teste.usuario;

import br.com.muambyte.jdbc.dao.usuario.UsuarioDao;
import br.com.muambyte.modelo.Usuario;

public class TesteAltera {
	
	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		usuario.setIdUsuario(1);
		usuario.setUsuario("junior");
		usuario.setSenha("321456");
		usuario.setD_e_l_e_t_e("0");
		
		UsuarioDao dao = new UsuarioDao();
		dao.altera(usuario);
		
		System.out.println("Alterado!");		
	}

}
