package aula15;

public class C2Cachorro implements C1Animal {
	public String nome;
	public String raca;
	public int idade;
	
	@Override
	public void emitirSom() {
		System.out.println("Som\t:au au au");		
	}

	@Override
	public void exibirInfo() {
		System.out.println("---- Cachorro ----");
		System.out.println("Nome\t: "+nome);
		System.out.println("Raca\t: "+raca);
		System.out.println("Idade\t: "+idade);
	}

	@Override
	public boolean verificarVacinacao() {
		return false;
	}

}
