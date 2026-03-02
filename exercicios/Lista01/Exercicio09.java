package Lista01;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

	//Altere o exercício 1 e faça um menu utilizando switch case

	Scanner teclado = new Scanner(System.in);
		
		int opcao;
	
		System.out.println("--- Menu ---");
		System.out.println("1 -> Soma");
		System.out.println("2 -> Subtrai");
		System.out.println("3 -> Multiplica");
		System.out.println("3 -> Divide");
		System.out.println("Escolha uma opcao:");
		opcao = teclado.nextInt();
		
		float a, b;
		System.out.println("Digite o primeiro numero:");
		a = teclado.nextFloat();
		System.out.println("Digite o segundo numero:");
		b = teclado.nextFloat();
		System.out.println("Digite o sinal da operacao desejada");
		
		switch (opcao) { 
		
			case 1:
				System.out.println("Resultado da soma = "+(a + b));
				break;
				
			case 2: 
				System.out.println("Resultado da subtracao = "+(a - b));
				break;
				
			case 3:
				System.out.println("Resultado da multiplicacao = "+(a * b));
				break;
			
			case 4:
			System.out.println("Resultado da divisao = "+(a / b));
			break;
			
		default:
			System.out.println("Opcao nao esta no menu");
				
		}		
	}
}
