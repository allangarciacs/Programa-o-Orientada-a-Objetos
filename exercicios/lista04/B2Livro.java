package lista04;

import java.util.Scanner;

public class B2Livro {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		B1Livro l1 = new B1Livro();
		String titulo, autor, genero;
		int ano;
		
		System.out.println("Digite as informacoes do livro:\n");
		System.out.println("Titulo: ");
		titulo = teclado.nextLine();
		System.out.println("Autor: ");
		autor = teclado.nextLine();
		System.out.println("Ano de publicacao: ");
		ano = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Genero: ");
		genero = teclado.nextLine();
		System.out.println("O livro esta emprestado? (true/false)");
		boolean emprestado = teclado.nextBoolean();
		
		System.out.println("\nInformacoes do livro:\n");
		l1.atribuir(titulo, autor, ano, genero, emprestado);
		l1.mostrar();
		System.out.println("\n");
		
		if (emprestado) {
			System.out.println("Deseja devolver o livro? (true/false)");
			boolean variavel = teclado.nextBoolean();
			if (variavel) {
				l1.fazerDevolucao();
				System.out.println("Novas informacoes:\n");
				l1.mostrar();
			} else {
				System.out.println("Sem mudanca nas infos");
			}
		} else {
			System.out.println("Deseja fazer um emprestimo? (true/false)");
			boolean variavel = teclado.nextBoolean();
			if (variavel) {
				l1.fazerEmprestimo();
				System.out.println("Novas informacoes:\n");
				l1.mostrar();
			} else {
				System.out.println("Sem mudanca nas infos");
			}
		}
		
		teclado.close();

	}

}
