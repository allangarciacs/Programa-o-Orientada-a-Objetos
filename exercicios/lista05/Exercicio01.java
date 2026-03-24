package lista05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		/* Escreva um programa que solicita ao usuário para
		digitar um número inteiro e exiba a raiz quadrada
		desse número. Certifique-se de que o programa trate
		adequadamente as exceções se o usuário digitar um
		valor inválido, por exemplo, ler um char ou string. */

		int numero = 0;
	
		try { 
			System.out.println("Digite um inteiro: ");
			numero = teclado.nextInt();
			double raizQuadrada = Math.sqrt(numero);
			System.out.println("Raiz quadrada de "+numero+" = "+raizQuadrada);
		} catch (InputMismatchException e) {
			System.out.println("Exceção: "+e.toString());
		}
	
		teclado.close();
	}

}
