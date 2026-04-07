public class Aluno {
    String nome;
    double nota1, nota2, nota3;

    public Aluno(String nome, double n1, double n2, double n3) {
        this.nome = nome;
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public boolean aprovado() {
        return calcularMedia() >= 7;
    }

    public double maiorNota() {
        double maior = nota1;

        if (nota2 > maior) {
            maior = nota2;
        }
        if (nota3 > maior) {
            maior = nota3;
        }

        return maior;
    }

    public double menorNota() {
        double menor = nota1;

        if (nota2 < menor) {
            menor = nota2;
        }
        if (nota3 < menor) {
            menor = nota3;
        }

        return menor;
    }
}