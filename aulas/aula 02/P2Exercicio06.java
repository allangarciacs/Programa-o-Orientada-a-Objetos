package Lista02;

import java.util.Scanner;

public class P2Exercicio06 {

	public static void main(String[] args) {
		
		/*Escreva um programa Java que use um vetor para ler
		 os nomes de 5 cidades e outro vetor para armazenar
		 as suas respectivas populações e depois imprima na
		 tela o nome da cidade mais populosa. */
		
		Scanner teclado = new Scanner(System.in);
		String[] cidade = new String[5];
		int[] habitantes = new int[5];
		
		for(int i = 0; i < cidade.length; i++) {
			System.out.println("Digite o nome da cidade"+(i+1)+" : ");
			cidade[i] = teclado.nextLine();
		}
		
		for(int i = 0; i < habitantes.length; i++) {
			System.out.println("Digite a quantidade de habitantes da cidade"+(i+1)+" : ");
			habitantes[i] = teclado.nextInt();
		}
		
		int maisHabitantes = habitantes[0];
		int marcador = 0;
		
		for(int i = 1; i < habitantes.length; i++) {
			if (maisHabitantes < habitantes[i]) {
				maisHabitantes = habitantes[i];
				marcador = i;	
			}
		}
			
		System.out.println("Cidade com mais habitantes: " +cidade[marcador]);	
		
		teclado.close();
	}

}
