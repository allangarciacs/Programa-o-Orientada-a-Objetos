package lista07;

import java.util.Scanner;

public class Ex06Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite os dados da pessoa");
		System.out.println("Nome: ");
		String nome = teclado.nextLine();
		System.out.println("Idade: ");
		int idade = teclado.nextInt();
		teclado.nextLine();
		System.out.println("CPF: ");
		String cpf = teclado.nextLine();
		
		Ex06Pessoa pes1 = new Ex06Pessoa(nome, idade, cpf);
		pes1.verificaMaiorDeIdade(idade);

		teclado.close();
	}

}
