package lista05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Faça o tratamento de exceções em umacalculadora.
		
		Double a = 0d, b = 0d;
		int opcao = 0;
		
		try { 
			System.out.println("Digite o valor 1: ");
			a = teclado.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Exceção "+e.toString());
			teclado.nextLine();
		}
		
		try { 
			System.out.println("Digite o valor 2: ");
			b = teclado.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Exceção "+e.toString());
			teclado.nextLine();
		}
		
		System.out.println("CALCULADORA");
		System.out.println(" 1 - Soma");
		System.out.println(" 2 - Subtração");
		System.out.println(" 3 - Divisão");
		System.out.println(" 4 - Multiplicação");
		System.out.println("-----------------------");
		
		try { 
			System.out.println("Digite o numero da operação desejada: ");
			opcao = teclado.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Erro na opcao. Exceção: "+e.toString());
			teclado.nextLine();
		}
		
		switch (opcao) {
		case 1: {
			System.out.println("Soma de "+a+" e "+b+" = "+(a+b));
			break;
		}
		case 2: {
			System.out.println("Subtração de "+a+" e "+b+" = "+(a-b));
			break;
		}
		case 3: {
			System.out.println("Divisão de "+a+" e "+b+" = "+(a/b));
			break;
		} 
		case 4: {
			System.out.println("Multiplicação de "+a+" e "+b+" = "+(a*b));
			break;
		}
		default:
			System.out.println("Opcao invalida");
		}
		
		teclado.close();
	}

}
