package lista12;

public class E10Aluno {
	private String nome;
	private double nota1, nota2;
	
	public E10Aluno(String nome, double nota1, double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public void calcularMedia() {
		double soma = nota1 + nota2;
		double media = soma / 2;
		
		if (media >= 6) {
			System.out.println("Aluno "+nome+" esta APROVADO");
		} else {
			System.out.println("Aluno "+nome+" esta REPROVADO");
		}
	}
}
