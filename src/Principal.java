import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.calculos.CalculadoraDeTempo;

public class Principal {
    public static void main(String[] args) {
        //criando objeto
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso chefão");
        meuFilme.setAnoDeLancamento(2000);
        meuFilme.setDuracaoEmMinutos(120);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibirFichaTecnica();
        meuFilme.avaliarFilme(8);
        meuFilme.avaliarFilme(5);
        meuFilme.avaliarFilme(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.pegarMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2005);
        lost.exibirFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(12);
        lost.setMinutosPorEpisodio(30);
        System.out.println("Duração para marotonar lost: " + lost.getDuracaoEmMinutos());

        Filme fFilme = new Filme();
        fFilme.setNome("Avatar");
        fFilme.setAnoDeLancamento(2002);
        fFilme.setDuracaoEmMinutos(130);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(fFilme);
        System.out.println(calculadora.getTempoTotal());
    }
}