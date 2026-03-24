package lista05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		/* Escreva um programa que tenha um valor fixo de premiação
		(ex: double premio = 5000.0). Peça ao usuário para digitar
		quantos ganhadores dividirão esse prêmio.Tratamento 1: Use
		ArithmeticException para o caso de o usuário digitar 0
		(divisão por zero). Tratamento 2: Use InputMismatchException
		para garantir que ele digitou um número inteiro. */

		int premio = 5000;
		
		try {
			System.out.println("Digite quantos ganhadores dividirão o premio de "+premio+" :");
			int ganhadores = teclado.nextInt();
			System.out.println("Valor que cada ganhador recebera: "+(premio/ganhadores));
		} catch (ArithmeticException e) {
			System.out.println("Exceção: "+e.toString()+",\nnao pode ser '0'.");
		} catch (InputMismatchException e) {
			System.out.println("Exceção: "+e.toString()+",\ndigite um inteiro!");
		}
	
		teclado.close();
	}

}
