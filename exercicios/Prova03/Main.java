import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Biblioteca biblioteca = new Biblioteca("biblioteca");
		List<Livro> lista;
		int opcao;
		
		System.out.println("SISTEMA DE GERENCIAMENTO DE BIBLIOTECA");
		
		do {
			System.out.println("====== MENU =============");
			System.out.println("1    : CADASTRAR LIVRO");
			System.out.println("2    : LISTAR LIVROS");
			System.out.println("0    : SAIR");
			System.out.println("=========================");
			System.out.print("OPCAO: ");
			opcao = teclado.nextInt();
			teclado.nextLine();
			
			switch (opcao) {
			case 1:
				boolean existe = false;
				
				System.out.print("TITULO : ");
				String titulo = teclado.nextLine();
				
				System.out.print("AUTOR  : ");
				String autor = teclado.nextLine();

				System.out.print("ANO PUB: ");
				int anoPub = teclado.nextInt();
				teclado.nextLine();
				
				System.out.print("EMPRESTADO (true/false)? ");
				boolean emprestado = teclado.nextBoolean();
				
				Livro livro = new Livro(titulo, autor, anoPub, emprestado);
				lista = biblioteca.leArquivo();
				
				// testa se o livro ja esta no sistema
				for (Livro l : lista) {
				    if (l.getTitulo().equalsIgnoreCase(titulo)) {
				        existe = true;
				        break;
				    }
				}
				
				if (existe) {
					System.out.println("\nLivro ja esta no sistema!\n");
				} else {
					lista.add(livro);
					biblioteca.gravaArquivo(lista);
					System.out.println("\nLivro CADASTRADO!\n");
				}
			
				break;
				
			case 2:
				lista = biblioteca.leArquivo();
				biblioteca.listarLivros();
				break;
				
			case 0: 
				System.out.println("FINALIZANDO o programa...");
				break;
				
			default:
				System.out.println("Opcao " + opcao + " INVALIDA!\n");
			}
		} while (opcao != 0);
		
		teclado.close();	
	}
}
