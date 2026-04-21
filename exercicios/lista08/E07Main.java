package pkg;

import java.util.Scanner;

public class E07Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		E07Produto p1 = new E07Produto("Copo", 10.5, 10);
		
		System.out.println("Dgite os dados do produto 2\nNome: ");
		String nome = teclado.nextLine();
		System.out.println("Preco: ");
		double preco = teclado.nextDouble();
		System.out.println("Quantidade em estoque: ");
		int quantidade = teclado.nextInt();
		
		E07Produto p2 = new E07Produto(nome, preco, quantidade);
		
		System.out.println("Infos do produto 01:");
		p1.exibirInformacoes();
		p1.calcularValorTotal();
		
		System.out.println("Infos do produto 02:");
		p2.exibirInformacoes();
		p2.calcularValorTotal();
		
		teclado.close();
	}
}
