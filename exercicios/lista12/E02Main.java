package lista12;

import java.util.Scanner;

public class E02Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o preco do produto: ");
		double preco = teclado.nextDouble();
		
		E02ProdutoComDesconto p1 = new E02ProdutoComDesconto(preco);
		
		p1.desconto();
		
		teclado.close();
	}
}
