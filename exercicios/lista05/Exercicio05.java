package lista05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		/* Escreva um programa que leia uma temperatura em String
		do teclado (ex: "25.5") e a converta para double para
		realizar um cálculo (ex: converter para Fahrenheit).
		Use Double.parseDouble() para a conversão. Trate a exceção
		NumberFormatException, que ocorre se o usuário digitar
		algo como "25,5" (com vírgula) ou "vinte graus", impedindo
		a conversão. */
		
		String temperatura;
		
		try {
			System.out.println("Digite a temperatura em celsius: ");
			temperatura = teclado.nextLine();
			double emDouble = Double.parseDouble(temperatura);
			double fah = 0d;
			System.out.println(""+temperatura+" celcius em fahrenheit = "+(fah = (emDouble * 1.8) + 32));
		} catch (NumberFormatException e) {
			System.out.println("Exceção: "+e.toString()+"\ndigite somente em numero (ex 3.3)");
		}
		

	}

}
