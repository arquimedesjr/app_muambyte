package br.com.muambyte.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Login {
	@Id
	@GeneratedValue
	private int id_login;
	private String usuario, senha, d_e_l_e_t_e;
		
	public int getId_login() {
		return id_login;
	}
	public void setId_login(int id_login) {
		this.id_login = id_login;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getD_e_l_e_t_e() {
		return d_e_l_e_t_e;
	}
	public void setD_e_l_e_t_e(String d_e_l_e_t_e) {
		this.d_e_l_e_t_e = d_e_l_e_t_e;
	}
	
}
