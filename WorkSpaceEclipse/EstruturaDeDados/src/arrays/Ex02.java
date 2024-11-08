package arrays;

public class Ex02 {
	
	public static void main(String[] Args) {
		double[] num = {7, 6.2, 0, 7.4, 10, 8.2, 9.2, 5};
		
		exibirVetor(num);
		System.out.println();
		
		System.out.println(somaVetor(num));
		System.out.println(mediaVetor(num));
		dobroVetor(num);
		indiceMaior(num);
		
		
		
		
	}
	
	// Exibindo elementos do Vetor
	public static void exibirVetor(double[] num) {
		for(double n : num) {
			System.out.print("[" + n + "] ");
			
		}
	}
	
	// Somando elementos do Vetor
	public static double somaVetor(double[] num) {
		double soma = 0;
		for(double n : num) {
			soma += n;
		}
		return soma;
	}
	
	// Média dos vetores
	public static double mediaVetor(double[] num) {
		double soma = 0;
		for(double n : num) {
			soma += n;
		}
		return soma / num.length;
	}
	
	// Dobro de cada elemento
	public static void dobroVetor(double[] num) {
		for(double n : num) {
			System.out.print("[" + n * 2 + "] ");
			
		}
		
	}
	
	// Indice e maior valor
	public static void indiceMaior(double[] num) {
		double maior = num[0];
		int indice = 0;
		for(int i = 0; i < num.length; i++) {
			if(num[i] > maior) {
				maior = num[i];
				indice = i;
				
			}
		}
		System.out.println("\nMaior elemento: " + maior + "\nÍndice: " + indice);
	}
	
	
	
	
}
