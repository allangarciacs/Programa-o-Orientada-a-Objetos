package lista05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/* Faça o tratamento de exceções em conversões de
		valores lidos pelo teclado. Por exemplo, ao ler
		uma string e converter ela para double. */
		
		System.out.println("Conversao de double para int");
		
		try {
			System.out.println("Digite um double: ");
			double a = teclado.nextDouble();
			int novo = (int) a;
			System.out.println("Double "+a+" em int: "+novo);

		} catch (InputMismatchException e) {
			System.out.println("Exceção: "+e.toString());
		}
		
		teclado.close();
	}

}
