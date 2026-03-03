package pkg;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int nota;
		
		do {
			System.out.println("Digite a nota dos seus alunos:");
			nota = teclado.nextInt();
	} while (nota != -1);
		
		teclado.close();
		
	}
	
}
