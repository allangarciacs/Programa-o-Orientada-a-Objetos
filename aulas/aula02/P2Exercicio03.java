package pkg;

import java.util.Scanner;

public class P2Exercicio03 {

	public static void main(String[] args) {
		
		/*
		 * Escreva um programa Java que use um
		 * vetor para ler as notas de 5 alunos e
		 * depois calcule e imprima a média das notas.
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		int[] vetor = new int[5];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite a nota do aluno "+(i+1)+" : ");
			vetor[i] = teclado.nextInt();
		}
		
		int soma = 0;
		double media = 0;
			
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		
		media = soma / 5;
		System.out.println("Media: "+media);
	
		teclado.close();
	}

}
