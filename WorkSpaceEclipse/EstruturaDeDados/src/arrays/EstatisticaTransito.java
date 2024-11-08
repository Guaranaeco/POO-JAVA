package arrays;

public class EstatisticaTransito {
    private Ex03Cidade[] cidades;

    // Construtor
    public EstatisticaTransito(Ex03Cidade[] cidades) {
        this.cidades = cidades;
    }

    public Ex03Cidade cidadeComMaisAcidentes() {
        Ex03Cidade cidadeMaior = cidades[0];
        for (Ex03Cidade cidade : cidades) {
            if (cidade.getNumAT() > cidadeMaior.getNumAT()) {
                cidadeMaior = cidade;
            }
        }
        return cidadeMaior;
    }

    public Ex03Cidade cidadeComMenosAcidentes() {
        Ex03Cidade cidadeMenor = cidades[0];
        for (Ex03Cidade cidade : cidades) {
            if (cidade.getNumAT() < cidadeMenor.getNumAT()) {
                cidadeMenor = cidade;
            }
        }
        return cidadeMenor;
    }

    public int mediaVeiculos() {
        int soma = 0;
        int cont = 0;
        for (Ex03Cidade cidade : cidades) {
            soma += cidade.getNumVP();
            cont++;
        }
        return cont > 0 ? soma / cont : 0; // Retorna 0 se cont == 0
    }

    public void mediaAcidente() {
        int cont = 0;
        int soma = 0;
        for (Ex03Cidade cidade : cidades) {
            if (cidade.getNumVP() < 2000) {
                cont++;
                soma += cidade.getNumAT();
            }
        }
        int media = cont > 0 ? soma / cont : 0; // Retorna 0 se cont == 0
        System.out.println("Média de acidentes em cidades com menos de 2000 veículos: " + media);
    }

    public void mostrarEstatistica() {
        System.out.println("Acidentes de trânsito:");

        Ex03Cidade cidadeMaisAcidentes = cidadeComMaisAcidentes();
        Ex03Cidade cidadeMenosAcidentes = cidadeComMenosAcidentes();

        System.out.println("Cidade com mais acidentes: " + cidadeMaisAcidentes.getNome());
        System.out.println("Cidade com menos acidentes: " + cidadeMenosAcidentes.getNome());
        System.out.println("Media de veiculos: " + mediaVeiculos());
        mediaAcidente();
        
    }
}
