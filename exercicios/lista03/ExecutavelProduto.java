package lista03;

import java.util.Scanner;

public class ExecutavelProduto {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Produto p1 = new Produto();
		
		System.out.println("Digite as informacoes do produto 01: ");
		System.out.println("Nome: ");
		p1.nome = teclado.nextLine();
		System.out.println("Preco: ");
		p1.preco = teclado.nextFloat();
		System.out.println("Quantidade em estoque:");
		p1.quantidadeEmEstoque = teclado.nextFloat();
		
		p1.valorTotalEmEstoque = 0f;
		
		p1.valorTotalEmEstoque = p1.preco * p1.quantidadeEmEstoque;
		
		System.out.println("\nInformacoes do produto 01:");
		System.out.println("Nome: "+p1.nome);
		System.out.println("Preco: "+p1.preco);
		System.out.println("Quantidade em estoque: "+p1.quantidadeEmEstoque);
		System.out.println("Valor total em estoque: "+p1.valorTotalEmEstoque);
		
		teclado.close();
		
	}

}
