public class Filme {
    //atributos da classe filme (características).
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalAvaliacoes;
    int duracaoEmMinutos;

    //metodos da classe filme (comportamentos).
    void exibirFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    //metodo com parametro
    void avaliarFilme(double avaliacao) {
        this.somaDasAvaliacoes += avaliacao;
        totalAvaliacoes++;
    }

    //metodo retornando um valor
    double pegarMedia() {
        return (somaDasAvaliacoes / totalAvaliacoes);
    }
}
