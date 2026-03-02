package Lista01;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		/*Ajuste o exercício 5 de maneira que mostre
	 	os valores informados em ordem crescente.*/
		
		Scanner teclado = new Scanner(System.in);
		
		float primeiro, segundo, terceiro;
		
		System.out.println("Digite o primeiro numero:");
		primeiro = teclado.nextFloat();
		System.out.println("Digite o segundo numero:");
		segundo = teclado.nextFloat();
		System.out.println("Digite o terceiro numero:");
		terceiro = teclado.nextFloat();
		
		if (primeiro > segundo) {
		    float temp = primeiro;
		    primeiro = segundo;
		    segundo = temp;
		}

		if (primeiro > terceiro) {
		    float temp = primeiro;
		    primeiro = terceiro;
		    terceiro = temp;
		}
		
		if (segundo > terceiro) {
		    float temp = segundo;
		    segundo = terceiro;
		    terceiro = temp;
		}

		System.out.println("Ordem crescente: " + primeiro + " " + segundo + " " + terceiro);
	
	}

}
