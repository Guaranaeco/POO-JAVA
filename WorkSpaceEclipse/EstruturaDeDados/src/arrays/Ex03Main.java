package arrays;

public class Ex03Main {
	public static void main(String[] args) {
		Ex03Cidade cidade1 = new Ex03Cidade(1, "São Paulo", 5000, 100);
		Ex03Cidade cidade2 = new Ex03Cidade(2, "RJ", 10000, 9500);
		Ex03Cidade cidade3 = new Ex03Cidade(3, "RP", 1000, 50);
		Ex03Cidade cidade4 = new Ex03Cidade(4, "BH", 1500, 135);
		Ex03Cidade cidade5 = new Ex03Cidade(5, "CR", 3200, 35);
		
		// Armazenando as cidades em um array
		Ex03Cidade[] listaDeCidades = {cidade1, cidade2, cidade3, cidade4, cidade5};
		
		// Criando o objeto de EstatisticaTransito e mostrando as estatísticas
		EstatisticaTransito estatisticas = new EstatisticaTransito(listaDeCidades);
		estatisticas.mostrarEstatistica();
		
	}

}
