package Lista01;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		/*Escreva um algoritmo que leia 3 valores pelo
		teclado e então informe qual o maior deles.*/
		
		Scanner teclado = new Scanner(System.in);
		
		float primeiro, segundo, terceiro;
		
		System.out.println("Digite o primeiro numero:");
		primeiro = teclado.nextFloat();
		System.out.println("Digite o segundo numero:");
		segundo = teclado.nextFloat();
		System.out.println("Digite o terceiro numero:");
		terceiro = teclado.nextFloat();
		
		if(primeiro > segundo && primeiro > terceiro) {
			System.out.println("O primeiro numero eh o maior entre eles. Primeiro n: "+primeiro);
		}
		else if(segundo > primeiro && segundo > terceiro) {
			System.out.println("O segundo numero eh o maior entre eles. Segundo n: "+segundo);
		}
		else if(terceiro > segundo && terceiro > primeiro) {
			System.out.println("O terceiro numero eh o maior entre eles. Primeiro n: "+terceiro);
		}
		else if(primeiro > segundo && primeiro == terceiro) {
			System.out.println("O primeiro e o terceiro sao os maiores numeros");
		}
		else if(primeiro == segundo && primeiro > terceiro) {
			System.out.println("O primeiro e o segundo sao os maiores numeros"); 
		}
		else if(terceiro == segundo && terceiro > primeiro) {
			System.out.println("O segundo e o terceiro numero sao os maiores");
		}		
		else System.out.println("Os numeros sao iguais");
		
	}

}
