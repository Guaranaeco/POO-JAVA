package arrays;

public class Ex03Cidade {
	private int codigo;
	private String nome;
	private int numVP;
	private int numAT;
	
	// Construtor
	public Ex03Cidade(int codigo, String nome, int numVP, int numAT) {
		this.codigo = codigo;
		this.nome = nome;
		this.numVP = numVP;
		this.numAT = numAT;
				
	}
	
	// Getters para acessar os atributos
	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumVP() {
		return numVP;	
	}
	
	public int getNumAT() {
		return numAT;
	}
	

}
