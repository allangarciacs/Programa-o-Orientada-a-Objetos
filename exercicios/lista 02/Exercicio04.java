package Lista02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int i, somatorio=0;
		
		for(i = 0; i <= 100; i++) {
			somatorio += i;
		}
			System.out.println("Soma: "+somatorio);
			teclado.close();
	}

}
