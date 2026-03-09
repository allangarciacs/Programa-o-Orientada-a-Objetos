package Lista02;

import java.util.Scanner;

public class P2Exercicio05 {

	public static void main(String[] args) {

		/* Escreva um programa Java que use um vetor 
		*  para ler 10 números inteiros lidos do usuário 
		*  e depois imprima o maior e o menor valor*/
		
		Scanner teclado = new Scanner(System.in);
		int[] vetor = new int[10];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Vetor de 10 numeros. Digite o elemento "+(i+1)+" : ");
			vetor[i] = teclado.nextInt();
		}
		
		int maiorValor = vetor[0];
		int menorValor = vetor[0];
			
		for(int i = 1; i < vetor.length; i++) {
			if (vetor[i] > maiorValor) {
				maiorValor = vetor[i];
			}
			if (vetor[i] < menorValor) {
				menorValor = vetor[i];
			}
		}
		
		System.out.println("Maior valor = "+maiorValor);
		System.out.println("Menor valor = "+menorValor);
	
		teclado.close();
		
	}

}
