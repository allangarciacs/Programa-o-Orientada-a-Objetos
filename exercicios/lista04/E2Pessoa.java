package lista04;

import java.util.Scanner;

public class E2Pessoa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		E1Pessoa p1 = new E1Pessoa();
		
		System.out.println("Construtor 1 = idade e nome");
		System.out.println("Construtor 2 = idade");
		System.out.println("-------------------------------");
		System.out.println("Digite qual quer usar (1 ou 2)");
		String variavel = teclado.nextLine();
		
		if (variavel.equals("1")) {
			p1.completo("Allan", 19);			
		} else if (variavel.equals("2")){
			p1.somenteIdade(19);
		} else {
			System.out.println("Opcao invalida, digite '1' ou '2'");
		}

		teclado.close();
		
	}

}
