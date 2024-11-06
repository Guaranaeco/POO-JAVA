package classesObjetos;

public class Mouse {
	String marca;
	String cor;
	boolean funcionando;
	
	
	void status() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Cor: " + this.cor);
	}
	
	void conectado() {
		System.out.println("O mouse está conectado");
		this.funcionando = true;
	}
	
	void desconectado() {
		System.out.println("O mouse está desconectado");
		this.funcionando = false;
	}
	
	void scrollUp() {
		System.out.println("Subiu a tela");
	}
	
	void scrollDown() {
		System.out.println("Desceu a tela");
	}
	
	void clickEsquerdo() {
		if (funcionando == true) {
			System.out.println("Você clicou na tela");
		} else {
			System.out.println("Não aconteceu nada. verifique o cabo do mouse.");
		}
	}
}
