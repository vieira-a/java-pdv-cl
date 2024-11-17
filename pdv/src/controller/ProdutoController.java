package controller;

import java.util.Scanner;

import infra.DataStore;
import model.Produto;
import view.Menu;

public class ProdutoController {
	public static void cadastrarProduto(Scanner scanner) {
		System.out.println("ID do Produto: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Descrição do Produto: ");
		String descricao = scanner.nextLine();
		
		System.out.println("Preço: ");
		double preco = scanner.nextDouble();
		scanner.nextLine();

		System.out.println("Categoria: ");
		String categoria = scanner.nextLine();
		
		System.out.println("Saldo: ");
		int saldo = scanner.nextInt();

		DataStore.produtos.add(new Produto(id, descricao, preco, categoria, saldo));
		System.out.println("Produto cadastrado com sucesso!");

		Menu.exibirMenu();
	}
	
	public static void listarProdutosCadastrados() {
	    if (DataStore.produtos.isEmpty()) {
	    	System.out.println();
	    	System.out.println("-".repeat(40));
	        System.out.println("Não há produtos cadastrados!");
	        System.out.println("-".repeat(40));
	        return;
	    }
	    
	    System.out.println("Relatório de Produtos");
	    System.out.printf("%-10s %-50s %-10s %-10s%n", "ID", "Descrição", "Preço", "Saldo");
	    System.out.println("=".repeat(80));
	    
	    for (Produto produto : DataStore.produtos) {
	        int id = produto.getId();
	        String descricao = produto.getDescricao();
	        double preco = produto.getPreco();
	        int saldo = produto.getSaldo();
	        
	        System.out.printf("%-10d %-50s %-10.2f %-10d%n",
	        		id, descricao, preco, saldo); 
	    }
	}


}
