package lista08;

public class E09Filme {
	public String titulo;
	public String diretor;
	public int duracaoEmMinutos;
	public String genero;
	
	public E09Filme(String titulo, String diretor, int duracao, String genero) {
		this.titulo = titulo;
		this.diretor = diretor;
		this.duracaoEmMinutos = duracao;
		this.genero = genero;
	}
	
	public void exibirDetalhes() { 
		System.out.println("INFOS DO FILME");
		System.out.println("Titulo : "+titulo+"\nDiretor: "+diretor+
				"\nDuracao em minutos: "+duracaoEmMinutos+"\nGenero : "
				+genero);
	}
	
	public boolean ehLongo() {
		if (duracaoEmMinutos > 120) {
			return true;
		} else { 
				return false;
			}
		}
	
}
