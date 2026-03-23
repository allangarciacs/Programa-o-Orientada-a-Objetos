package lista04;

public class B1Livro {
	public String titulo;
	public String autor;
	public int anoPublicacao;
	public String genero;
	public boolean emprestado;
	
	public void atribuir(String t, String a, int ano, String g, boolean e) {
		emprestado = e;
		titulo = t;
		autor = a;
		anoPublicacao = ano;
		genero = g;
	}
	
	public void mostrar() {
		System.out.println("Titulo: "+titulo);
		System.out.println("Autor: "+autor);
		System.out.println("Ano de publicacao: "+anoPublicacao);
		System.out.println("Genero: "+genero);
		if (emprestado) {
			System.out.println("O livro esta emprestado");
		} else { System.out.println("O livro nao ta emprestado");
		}
		
	}
	
	public void fazerEmprestimo() {
		emprestado = true;
		
	}
	
	public void fazerDevolucao() {
		emprestado = false;
		
	}

}
