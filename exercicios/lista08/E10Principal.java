package lista08;

import java.util.Scanner;

public class E10Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		E10Tarefa[] tarefas = new E10Tarefa[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Descricao da tarefa "+(i+1));
			String descricao = teclado.nextLine();
			tarefas[i] = new E10Tarefa(descricao,false); 
		}
		
		System.out.println("Qual tarefa quer concluir? (1, 2 ou 3");
		int opcao = teclado.nextInt();
		
		tarefas[opcao - 1].concluirTarefa();
		
		for (int i = 0; i < 3; i++) {
			tarefas[i].exibirTarefa();
		}
		
		teclado.close();

	}

}
