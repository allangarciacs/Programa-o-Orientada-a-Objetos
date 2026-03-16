package lista03;

public class ExecutavelLivro {

	public static void main(String[] args) {
		
		/*Crie uma classe Livro com os atributos título,
		autor e ano de publicação. Imprima as informações
		do livro na tela.*/

		Livro l1 = new Livro();
		
		l1.titulo = "TITULO";
		l1.autor = "AUTOR";
		l1.anoPublicacao = 2026;
		
		System.out.println("Livro 01:");
		System.out.println("Titulo: "+l1.titulo);
		System.out.println("Autor: "+l1.autor);
		System.out.println("Ano de publicacao: "+l1.anoPublicacao);
		
	}

}
