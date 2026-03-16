package lista03;

import java.util.Scanner;

public class ExecutavelAluno {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Aluno a1 = new Aluno();
		
		System.out.println("Digite as informacoes do aluno 01:");
		System.out.println("Nome: ");
		a1.nome = teclado.nextLine();
		System.out.println("Matricula: ");
		a1.matricula = teclado.nextInt();
		System.out.println("Nota 1: ");
		a1.nota1 = teclado.nextFloat();
		System.out.println("Nota 2: ");
		a1.nota2 = teclado.nextFloat();
		System.out.println("Nota 3: ");
		a1.nota3 = teclado.nextFloat();
		
		a1.media = 0f;
		
		a1.media = (a1.nota1 + a1.nota2 + a1.nota3) / 3;
		
		System.out.println("\nInfos do aluno 01:");
		System.out.println("Nome: "+a1.nome);
		System.out.println("Matricula: "+a1.matricula);
		System.out.println("Media: "+a1.media);
		
		if (a1.media >= 6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
		teclado.close();

	}

}
