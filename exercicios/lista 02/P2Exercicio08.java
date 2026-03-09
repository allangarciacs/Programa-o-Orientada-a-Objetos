package Lista02;

import java.util.Scanner;

public class P2Exercicio08 {

	public static void main(String[] args) {
		
		/*Escreva um programa Java que use um vetor para armazenar
		 10 números inteiros lidos do usuário e depois imprima na
		 tela quantos números são pares e quantos são ímpares.*/
		
		Scanner teclado = new Scanner(System.in);
		int[] vetor = new int[10];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Vetor de 10 numeros. Digite o elemento "+(i+1)+" : ");
			vetor[i] = teclado.nextInt();
		}
		
		int quantidadePares = 0, quantidadeImpares = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				quantidadePares++;
			} else {
				quantidadeImpares++;	
			}
		}
			
		System.out.println("Quantidade de numeros pares: "+quantidadePares);
		System.out.println("Quantidade de numeros impares: "+quantidadeImpares);
	
		teclado.close();
		
	}

}
