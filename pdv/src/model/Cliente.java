package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
	private List<Compra> compras;
	
	public Cliente(int id, String nome, String cpf) {
		super(id, nome, cpf);
		this.setCpf(cpf);
		this.compras = new ArrayList<Compra>();
	}

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(Compra compra) {
		compras.add(compra);
	}
	
	
	@Override
	public void setCpf(String cpf) {
		if(cpf.length() < 11) {
			throw new IllegalArgumentException("CPF inválido");
		}		
		super.setCpf(cpf);
	}	
}
