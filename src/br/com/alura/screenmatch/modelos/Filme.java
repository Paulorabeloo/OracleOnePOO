package br.com.alura.screenmatch.modelos;

public class Filme {
    //atributos da classe filme (características).
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    //metodo acessor
    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    //getters e setters (getter acessa o valor e setter modifica o valor)
    public void setNome(String nome) {
        // usado para fazer referência aos atributos da classe, especialmente em métodos que têm parâmetros com o mesmo nome do atributo da classe em que estamos trabalhando.
        this.nome = nome;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
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
