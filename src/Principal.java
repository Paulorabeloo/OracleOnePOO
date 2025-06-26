import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        //criando objeto
        Filme meuFilme = new Filme();
        meuFilme.nome = "O Poderoso chefão";
        meuFilme.anoDeLancamento = 2000;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibirFichaTecnica();
        meuFilme.avaliarFilme(8);
        meuFilme.avaliarFilme(5);
        meuFilme.avaliarFilme(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.pegarMedia());

    }
}