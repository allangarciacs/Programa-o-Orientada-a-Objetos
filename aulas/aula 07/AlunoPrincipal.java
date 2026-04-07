package aula07;

import java.util.Scanner;

public class AlunoPrincipal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Aluno a1 = new Aluno("Allan", 5, 10);
		
		String nome;
		double nota1 = 0, nota2 = 0;
		nome = a1.getNome();
		nota1 = a1.getNota1();
		nota2 = a1.getNota2();
		System.out.println("Dados do aluno:");
		System.out.println("Nome: "+a1.getNome()+"\nNota 1: "
		+a1.getNota1()+"\nNota 2: "+a1.getNota2()+"\nMedia: "
				+a1.calculaMedia(nota1, nota2));
		
		// mudar os valores com set
		System.out.println("\nAtualize os dados do aluno:");
		System.out.println("Nome: ");
		nome = teclado.nextLine();
		a1.setNome(nome);
		
		System.out.println("Nota 1 (de 0 a 10): ");
		nota1 = teclado.nextDouble();
		a1.setNota1(nota1);
		
		System.out.println("Nota 2 (de 0 a 10): ");
		nota2 = teclado.nextDouble();
		a1.setNota2(nota2);
		
		System.out.println("Novos dados do aluno:");
		System.out.println("Nome: "+a1.getNome()+"\nNota 1: "
				+a1.getNota1()+"\nNota 2: "+a1.getNota2()+"\nMedia: "
						+a1.calculaMedia(nota1, nota2));
		
		teclado.close();

	}

}
