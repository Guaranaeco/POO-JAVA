package classesObjetos;

public class Main {
	public static void main(String[] args) {
		Caneta c1 = new Caneta(); // Inst
		Caneta c2 = new Caneta();
		
		System.out.println("CANETA");
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampar();
		c1.status();
		System.out.println("\n");
		
		//////////////////////////// teste 2
		
		Mouse m1 = new Mouse();
		
		System.out.println("MOUSE");
		m1.marca = "Logitec"; 
		m1.cor = "Preto";
		m1.status();
		m1.desconectado();
		m1.clickEsquerdo();
		m1.scrollDown();
		System.out.println("\n");
		
		/////////////////////////// teste 3
		
		Aula aula = new Aula();
		
		System.out.println("Tem aula? qual matéria?");
		aula.inicio = 19;
		aula.fim = 22;
		aula.disciplina = "Estrutura de dados";
		aula.status();
		aula.teveAula();
	}

}
