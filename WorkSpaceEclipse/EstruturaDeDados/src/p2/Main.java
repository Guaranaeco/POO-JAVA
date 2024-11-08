package p2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		FilaDeCompras listaDeCompras = new FilaDeCompras();
		
		while(true) {
			System.out.println("\nEscolha uma opção:");
			System.out.println("1 - Adicionar Item");
			System.out.println("2 - Remover item");
			System.out.println("3 - Exibir lista de compras");
			System.out.println("4 - Sair");
			System.out.println("Opção: ");
			int escolha = entrada.nextInt();
			entrada.nextLine();
			
			
			switch(escolha) {
			case 1:
				System.out.print("Nome do item: ");
				String nome = entrada.nextLine();
				System.out.print("Quantidade:  ");
				int quantidade = entrada.nextInt();
				System.out.print("Preço(un):  ");
				double valor = entrada.nextDouble();
				listaDeCompras.inserirElemento(nome, quantidade, valor);
				break;
				
			case 2:
				listaDeCompras.removerElemento();
				break;
				
			case 3:
				listaDeCompras.exibirFila();
				break;
			
			case 4:
				System.out.println("Sistema finalizado!");
				entrada.close();
				return;
				
				default:
					System.out.println("Opção inválida! Tente novamente.");
			}
		
		}
		
		
	}
}
