package arrays;

public class Ex01 {

	public static void main(String[] args) {
		int[] numeros = {9,8,1,45,89,43,55,10,12,44,68,66,70,71,73,88,90,33,76,77,98,101,123,143,155,167,190};
		int somaPar = 0;
		int somaImpar = 0;
		
		// Exibindo o array
		System.out.println("Exibindo o Array:");
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		// Ordem inversa
		System.out.println("\n\nOrdem inversa do Array:");
		for(int i = numeros.length - 1; i >= 0; i--) {
			System.out.print(numeros[i] + " ");
		}
		
		// Numeros pares
		System.out.println("\n\nNúmeros pares:");
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				somaPar += numeros[i];
				System.out.print(numeros[i] + " ");
			}
		}
		
		// Numeros ímpares
		System.out.println("\n\nNúmeros ímpares:");
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 1) {
				somaImpar += numeros[i];
				System.out.print(numeros[i] + " ");
			}
		}
		
		// Subtração de par menos impar
		System.out.println("A seguir a soma dos números pares e ímpares! ");
		System.out.println("Par: " + somaPar);
		System.out.println("Impar: " + somaImpar);
		System.out.println(somaPar + " - " + somaImpar + " = " + (somaPar - somaImpar));
		
	
	}
	
}
