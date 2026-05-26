package lista12;

public class E12Livro {
	private String titulo;
	private String autor;
	private int ano;
	
	public E12Livro(String titulo, String autor, int ano) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
	}
	
	public int getAno() {
		return ano;
	}

	@Override
	public String toString() {
		return "E12Livro [titulo=" + titulo + ", autor=" + autor + ", ano=" + ano + "]";
	}
}
