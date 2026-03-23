package lista04;

import java.util.Scanner;

public class A2Disciplina {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		A1Disciplina d1 = new A1Disciplina();
		
		d1.atribuirValores("Historia", 40, "Fabio");
		System.out.println("Informacoes da disciplina:\n");
		d1.mostrarValores();
		
		System.out.println("\nDigite os novos dados da disciplina:");
		String novoNome, novoNomeProfessor;
		float novaCargaHoraria;
		
		System.out.println("Nome da disciplina: ");
		novoNome = teclado.nextLine();
		System.out.println("Carga horaria: ");
		novaCargaHoraria = teclado.nextFloat();
		teclado.nextLine();
		System.out.println("Nome do professor: ");
		novoNomeProfessor = teclado.nextLine();
		
		d1.atribuirValores(novoNome, novaCargaHoraria, novoNomeProfessor);
		System.out.println("\nNovas informacoes da disciplina:\n");
		d1.mostrarValores();
		
		teclado.close();
	}

}
