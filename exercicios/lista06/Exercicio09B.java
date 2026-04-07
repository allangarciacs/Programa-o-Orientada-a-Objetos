public class Exercicio09B {
    public static void main(String[] args) {
        Livro l = new Livro("Pedro o Livro", "Pedro", 300, false);

        System.out.println(l.detalhesLivro());
        l.emprestar();
        System.out.println("Disponível? " + l.estaDisponivel());
        l.devolver();
        System.out.println("Disponível? " + l.estaDisponivel());
    }
}