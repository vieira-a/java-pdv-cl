package view;

import java.util.Scanner;

import controller.ClienteController;
import controller.ProdutoController;
import controller.VendaController;

public class Menu {
	public static void exibirMenu() {
		Scanner scanner = new Scanner(System.in);
		int opcaoMenu;
		
		do {
			System.out.println();
		    System.out.println("*".repeat(40));
			System.out.println("Sistema de Loja");
		    System.out.println("-".repeat(40));
			System.out.println("Menu de opções");
			System.out.println("-".repeat(40));
			System.out.println("Por favor, digite uma das opções abaixo");
		    System.out.println();
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Cadastrar Cliente");
            System.out.println("3. Realizar Venda");
            System.out.println("4. Relatório de Compras por Cliente");
            System.out.println("5. Relatório de Produtos Cadastrados");
            System.out.println("6. Relatório de Clientes Cadastrados");
            System.out.println("9. Sair");
            System.out.println();
		    System.out.println("*".repeat(40));
            System.out.println();
            
            opcaoMenu = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcaoMenu) {
            	case 1: ProdutoController.cadastrarProduto(scanner);
            	break;
            	case 2: ClienteController.cadastrarCliente(scanner);
            	break;
            	case 3: VendaController.realizarVenda(scanner);
            	break;
            	case 4: ClienteController.listarComprasRealizadas(scanner);
            	break;
            	case 5: ProdutoController.listarProdutosCadastrados();
            	break;
            	case 6: ClienteController.listarClientesCadastrados();
            	break;
            	case 9: System.out.println("Saindo...");
            	break;
            	default: System.out.println("Opção inválida");
            }
		} while (opcaoMenu != 9);
	}
}
