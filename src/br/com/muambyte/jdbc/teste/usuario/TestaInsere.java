package br.com.muambyte.jdbc.teste.usuario;

import br.com.muambyte.jdbc.dao.usuario.UsuarioDao;
import br.com.muambyte.modelo.Usuario;

public class TestaInsere {
	
	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		usuario.setUsuario("arquimedeslqjunior");
		usuario.setSenha("123456");
		usuario.setD_e_l_e_t_e("0");
		
		UsuarioDao dao = new UsuarioDao();
		dao.adiciona(usuario);
		
		System.out.println("Gravado!");
	}

}
