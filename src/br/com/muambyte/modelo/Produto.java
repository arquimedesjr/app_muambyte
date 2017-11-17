package br.com.muambyte.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produto {
	@Id
	@GeneratedValue
	private int idProduto;
	private String nome,quantidade,d_e_l_e_t_e;
	private double precoUnitario;
	
	public String getD_e_l_e_t_e() {
		return d_e_l_e_t_e;
	}
	public void setD_e_l_e_t_e(String d_e_l_e_t_e) {
		this.d_e_l_e_t_e = d_e_l_e_t_e;
	}
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
