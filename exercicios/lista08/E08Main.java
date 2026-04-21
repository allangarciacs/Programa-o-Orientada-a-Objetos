package pkg;

import java.util.Scanner;

public class E08Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		E08Usuario user1 = new E08Usuario("allan", "123", false);
		
		System.out.println("--- Tela de Login ---");
		System.out.println("Digite o usuario: ");
		String usuarioDig = teclado.nextLine();
		System.out.println("Digite a senha: ");
		String senhaDig = teclado.nextLine();
		
		user1.login(usuarioDig, senhaDig);
		
		System.out.println("Deseja fazer o logout?\n1 - sim\n2 - nao");
		String quer = teclado.nextLine();
		if (quer.equals("1")) { 
			user1.logout();
			user1.exibirStatus();
		} else if (quer.equals("2")) {
			user1.exibirStatus();
		} else {
			System.out.println("Resposta invalida");
		}
		
		teclado.close();
	}

}
