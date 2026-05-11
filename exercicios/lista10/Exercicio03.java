package lista10;

import java.util.Scanner;

/* Crie uma classe Pessoa com um método falar(Stringmensagem)
que imprime a mensagem passada como parâmetro. Sobrecarregue
o método falar() para aceitar uma mensagem e um número de
repetições e imprimir a mensagem várias vezes. */

class Pessoa {
	public void falar(String mensagem) {
		System.out.println(mensagem);
	}
	
	public void falar(String mensagem, int qtde) {
		for (int i = 0; i < qtde; i++) {
			System.out.println(mensagem);
		}
	}
}

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a mensagem: ");
		String mensagem = teclado.nextLine();
		System.out.println("Digite a qtde d vezes q a"
				+ "mensagem deve ser exibida");
		int qtde = teclado.nextInt();
		teclado.nextLine();
		
		Pessoa p1 = new Pessoa();
		
		System.out.println("metodo 1");
		p1.falar(mensagem);
		
		System.out.println("\nmetodo 2");
		p1.falar(mensagem, qtde);
		
		teclado.close();
	}
}
