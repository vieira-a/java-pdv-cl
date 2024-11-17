package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
	private List<Compra> compras;
	
	public Cliente(int id, String nome, String cpf) {
		super(id, nome, cpf);
		this.compras = new ArrayList<Compra>();
	}

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(Compra compra) {
		compras.add(compra);
	}
	
	public void listarComprasRealizadas() {
		System.out.println("Relatório de compras");
		System.out.println("Cliente: " + getNome());
		
		for(Compra compra : compras) {
			System.out.println(
					"Produto: " + compra.getProduto().getDescricao() 
					+ "Quantidade: " + compra.getQuantidade() 
					+ "Valor total: " + compra.getTotal());
		}
	}
	
}
