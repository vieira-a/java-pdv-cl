package model;

public class Compra {
	private int id;
	private Produto produto;
	private Cliente cliente;
	private int quantidade;
	private double total;
	
	public Compra(int id, Produto produto, Cliente cliente, int quantidade) {
		this.id = id;
		this.produto = produto;
		this.cliente = cliente;
		this.quantidade = quantidade;
		this.total = setTotal();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getTotal() {
		return total;
	}

	public double setTotal() {
		return this.total = produto.getPreco() * quantidade;
	}
}
