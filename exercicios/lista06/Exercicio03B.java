public class Exercicio03B {
    public static void main(String[] args) {
        Aluno a = new Aluno("Ana", 8, 7, 9);

        System.out.println(a.calcularMedia());
        System.out.println(a.aprovado());
        System.out.println(a.maiorNota());
        System.out.println(a.menorNota());
    }
}