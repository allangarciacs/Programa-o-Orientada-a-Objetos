package pkg;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
			
		while(true) { //laço infinito
			System.out.println("Digite uma frase:");
			String palavra = teclado.nextLine(); 
			if(palavra.equalsIgnoreCase("são paulo")) {
				break;
			}
		}
		System.out.println("Encerrando...");
		
		teclado.close();
	}

}
