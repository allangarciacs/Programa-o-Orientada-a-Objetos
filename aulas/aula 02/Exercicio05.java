package pkg;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int inteiro, fatorial = 1;
	
		System.out.println("Digite um inteiro: ");
		inteiro = teclado.nextInt();
		
		for(int i = 1; i <= inteiro;i++) {
			fatorial *= i;
		}
		if (inteiro < 0) {
			System.out.println("não existe fatorial negativo");
		} else 
			System.out.println("Fatorial: "+fatorial);
		
		teclado.close();
	}
}
