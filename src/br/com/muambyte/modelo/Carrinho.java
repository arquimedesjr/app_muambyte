package br.com.muambyte.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Carrinho {
	@Id
	@GeneratedValue
	private int idCarrinho;
	private double frete, qtdPeca, valorTotal;
	
	public int getIdCarrinho() {
		return idCarrinho;
	}
	public void setIdCarrinho(int idCarrinho) {
		this.idCarrinho = idCarrinho;
	}
	public double getFrete() {
		return frete;
	}
	public void setFrete(double frete) {
		this.frete = frete;
	}
	public double getQtdPeca() {
		return qtdPeca;
	}
	public void setQtdPeca(double qtdPeca) {
		this.qtdPeca = qtdPeca;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
}
