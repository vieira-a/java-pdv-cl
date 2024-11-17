package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import infra.DataStore;
import model.Cliente;
import model.Compra;
import model.Produto;
import view.Menu;

public class VendaController {
	private static List<Compra> compras = new ArrayList<Compra>();
	
	public static void realizarVenda(Scanner scanner) {
	    System.out.println("CPF do Cliente: ");
	    String cpfCliente = scanner.nextLine();
	    
	    Cliente cliente = DataStore.clientes.stream()
	            .filter(item -> item.getCpf().equals(cpfCliente))
	            .findFirst()
	            .orElse(null);

	    if (cliente == null) {
	        System.out.println("Cliente não encontrado!");
	        return;
	    }

	    List<Compra> comprasCliente = new ArrayList<>();

	    while (true) {
	        System.out.println("ID do Produto (ou 0 para finalizar): ");
	        int idProduto = scanner.nextInt();
	        scanner.nextLine();

	        if (idProduto == 0) break;

	        Produto produto = DataStore.produtos.stream()
	                .filter(item -> item.getId() == idProduto)
	                .findFirst()
	                .orElse(null);

	        if (produto == null) {
	            System.out.println("Produto não encontrado!");
	            continue;
	        }

	        System.out.println("Quantidade: ");
	        int quantidade = scanner.nextInt();
	        scanner.nextLine();

	        if (produto.getSaldo() < quantidade) {
	            System.out.println("Estoque insuficiente!");
	            continue;
	        }

	        produto.retirarSaldo(quantidade);
	        
	        Compra compra = new Compra(compras.size() + 1, produto, cliente, quantidade);
	        
	        comprasCliente.add(compra);
	        
	        DataStore.compras.add(compra);
	        
	        cliente.setCompras(compra);
	    }

	    System.out.println("Venda realizada com sucesso!");	   
	    
	    Menu.exibirMenu();
	}
}
