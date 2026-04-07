package aula07;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	//Pessoa p1 = new Pessoa();
	//p1.nome = "Ricardo";
	//p1.idade = 40;
	
	Pessoa p2 = new Pessoa("Allan", 19);
	String nome;
	int idade;
	nome = p2.getNome(); // método q retorna a string com o nome
	idade = p2.getidade();
	System.out.println("Nome: "+nome);
	System.out.println("Idade: "+idade);
	
	System.out.println("Digite o novo nome: ");
	nome = teclado.nextLine();
	p2.setNome(nome); // usa o 'set' pra trocar 
	System.out.println("Novo nome: "+p2.getNome()); // 'get' pra pegar o valor da variavel
	
	System.out.println("Digite a nova idade: ");
	idade = teclado.nextInt();
	p2.setidade(idade);
	System.out.println("Nova idade: "+p2.getidade());
	
	teclado.close();
	
	}

}
