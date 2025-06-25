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
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalAvaliacoes);
        System.out.println(meuFilme.pegarMedia());

    }
}