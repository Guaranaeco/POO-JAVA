package p2;

public class FilaDeCompras {
	private Item inicio;
	private Item fim;
	
	public FilaDeCompras() {
		this.inicio = null;
		this.fim = null;
	}
	
	
	// Adicionar ao final da fila
	public void inserirElemento(String nome, int quantidade, double valor) {
		Item novo = new Item(nome, quantidade, valor);
		if (inicio == null) { // Se a fila estiver vazia
			inicio = novo;
			fim = novo;
		} else {
			fim.prox = novo;
			fim = novo;
		}
		System.out.printf("Item '%s' inserido na fila. \n", nome);
	}
	
	
	// Remover o primeiro da fila
	public void removerElemento() {
		if (inicio == null) { 
			System.out.println("A lista de compras está vazia!");
		} else {
			System.out.printf("Item removido: %s\n", inicio);
			inicio = inicio.prox; // Move o início para o próximo item
			if (inicio == null) {
				fim = null; // Se a fila ficar vazia, redefine para null também.
			}
		}
	}
	
	// Exibir todos os itens na fila e o valor total
	public void exibirFila() {
		if (inicio == null) {
			System.out.println("A lista de compras está vazia!");
		} else {
			System.out.println("Itens na lista de compras: ");
			Item atual = inicio;
			double total = 0;
			while (atual != null) {
				System.out.println(atual);
				total += atual.getTotal();
				atual = atual.prox;
			}
			System.out.printf("Valor total da compra: R$ %.2f\n", total);
		}
	}
		
}
