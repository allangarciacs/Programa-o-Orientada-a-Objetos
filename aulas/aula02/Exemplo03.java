package pkg; //ler e mostrar vetor

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		int[] vetor = new int[5];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o elemento "+i+" : ");
			vetor[i] = teclado.nextInt();
		}
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Elemento "+i+" = "+vetor[i]);
		}

	}

}
