package classesObjetos;

public class Aula {
	int inicio;
	int fim;
	String disciplina;
	boolean aula;
	
	void status() {
		System.out.println("Inicio: " + this.inicio);
		System.out.println("Fim: " + this.fim);
		System.out.println("Disciplina: " + this.disciplina);
	}
	void teveAula() {
		this.aula = true;
		System.out.println("Aula normal hoje");
	}
	
	void semAula() {
		this.aula = false;
		System.out.println("Professor faltou hoje, sem aula.");
	}
}

