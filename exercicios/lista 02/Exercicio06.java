package Lista02;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int i;
		
		do {
			System.out.println("Digite um inteiro:");
			i = teclado.nextInt();
	} while (i != 0);

		teclado.close();
		
}
}
