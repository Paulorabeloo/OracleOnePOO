package br.com.alura.screenmatch.modelos;

public class Filme {
    //atributos da classe filme (características).
    public String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    int duracaoEmMinutos;

    //metodo acessor
    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    //metodos da classe filme (comportamentos).
    public void exibirFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    //metodo com parametro
    public void avaliarFilme(double avaliacao) {
        this.somaDasAvaliacoes += avaliacao;
        totalAvaliacoes++;
    }

    //metodo retornando um valor
    public double pegarMedia() {
        return (somaDasAvaliacoes / totalAvaliacoes);
    }
}
