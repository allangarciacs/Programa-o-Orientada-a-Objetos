package lista08;

import java.util.Scanner;

public class E09Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite as infos do filme\n");
		System.out.println("Titulo: ");
		String titulo = teclado.nextLine();
		System.out.println("Diretor: ");
		String diretor = teclado.nextLine();
		System.out.println("Duracao em minutos: ");
		int duracaoEmMinutos = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Genero: ");
		String genero = teclado.nextLine();
		
		E09Filme filme1 = new E09Filme(titulo, diretor, duracaoEmMinutos, genero);
		
		filme1.exibirDetalhes();
		System.out.println("Filme eh longo? "+filme1.ehLongo());
		
		teclado.close();
		
	}

}
