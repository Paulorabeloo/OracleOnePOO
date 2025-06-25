public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O Poderoso chefão";
        meuFilme.anoDeLancamento = 2000;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.avaliacao = 5;
        meuFilme.incluidoNoPlano = true;

        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.anoDeLancamento);
        System.out.println(meuFilme.avaliacao);


    }
}