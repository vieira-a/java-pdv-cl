package model;

public class Produto {
	private int id;
	private String descricao;
	private double preco;
	private String categoria;
	private int saldo;
	
	public Produto(int id, String descricao, double preco, String categoria, int saldo) {
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
		this.categoria = categoria;
		this.saldo = saldo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getSaldo() {
		return saldo;
	}
	
	public void retirarSaldo(int quantidade) {
		this.saldo = saldo - quantidade;
	}
	
	public void incluirSaldo(int quantidade) {
		this.saldo = saldo + quantidade;
	}
}
