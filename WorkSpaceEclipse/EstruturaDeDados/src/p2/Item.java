package p2;


class Item {
	String nome;
	int quantidade;
	double valor;
	Item prox;
	
	public Item(String nome, int quantidade, double valor) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
		this.prox = null;
	}
	
	public double getTotal() {
		return quantidade * valor;
	}
	
	public String toString() {
		return nome + " - Quantidade " + quantidade + " - Valor unitário: R$ " + valor + " - Total: R$ " + getTotal();
	}
	
}

