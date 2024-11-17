package controller;

import java.util.Scanner;

import infra.DataStore;
import model.Cliente;
import model.Compra;
import view.Menu;

public class ClienteController {
	public static void cadastrarCliente(Scanner scanner) {
		try {
			System.out.println("Nome: ");
			String nome = scanner.nextLine();
			
			System.out.println("CPF: ");
			String cpf = scanner.nextLine();
			
			int idNovoCliente = DataStore.clientes.size() + 1;
			
			Cliente cliente = new Cliente(idNovoCliente, nome, cpf);
			DataStore.clientes.add(cliente);
			
			System.out.println("Cliente cadastrado com sucesso!");
		} catch (Exception e) {
			System.out.println();
			System.out.println("-".repeat(40));
	        System.out.println("Erro: " + e.getMessage());
	        System.out.println("-".repeat(40));
		}
				
		Menu.exibirMenu();		
	}
	
	public static void listarComprasRealizadas(Scanner scanner) {
	    System.out.println("CPF do cliente");
	    String cpfCliente = scanner.nextLine();
	            
	    Cliente cliente = DataStore.clientes.stream()
	            .filter(item -> item.getCpf().equals(cpfCliente))
	            .findFirst()
	            .orElse(null);

	    if (cliente == null) {
	    	System.out.println();
	    	System.out.println("-".repeat(40));
	        System.out.println("Cliente não encontrado!");
	        System.out.println("-".repeat(40));
	        return;
	    }
	    
	    System.out.println("Relatório de Compras");
	    System.out.println("Cliente: " + cliente.getNome());
	    System.out.println();

	    System.out.printf("%-20s %-15s %-10s %-10s%n", "Produto", "Quantidade", "Preço Unit.", "Total");
	    System.out.println("=".repeat(60));

	    double totalGeral = 0.0;
	    boolean encontrouCompra = false;

	    for (Compra compra : DataStore.compras) {
	        if (compra.getCliente().getCpf().equals(cpfCliente)) {
	            String descricaoProduto = compra.getProduto().getDescricao();
	            int quantidade = compra.getQuantidade();
	            double precoUnitario = compra.getProduto().getPreco();
	            double totalCompra = compra.getTotal();

	            System.out.printf("%-20s %-15d %-10.2f %-10.2f%n", 
	                              descricaoProduto, quantidade, precoUnitario, totalCompra);

	            totalGeral += totalCompra;
	            encontrouCompra = true;
	        } 
	    }

	    if (!encontrouCompra) {
	        System.out.println("Nenhuma compra encontrada para este cliente.");
	    } else {
	        System.out.println("=".repeat(60));
	        System.out.printf("%-45s %-10.2f%n", "Total Geral de Compras: ", totalGeral);
	    }
	    
		Menu.exibirMenu();	
		return;
	}
	
	
	public static void listarClientesCadastrados() {
		System.out.println("Relatório de Clientes");
	    System.out.printf("%-10s %-30s %-15s%n", "ID", "Nome", "CPF");
	    System.out.println("=".repeat(55));
		    
		for (Cliente cliente : DataStore.clientes) {
			if(DataStore.clientes.size() > 0) {
				int id = cliente.getId();
				String nome = cliente.getNome();
				String cpf = cliente.getCpf();
				
				System.out.printf("%-10s %-30s %-15s %n", id, nome, cpf);
			}
		}
	}
}











