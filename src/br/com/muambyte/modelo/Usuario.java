package br.com.muambyte.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {
	@Id
	@GeneratedValue
	private int idUsuario;
	private String usuario, senha, d_e_l_e_t_e;
		
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
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
