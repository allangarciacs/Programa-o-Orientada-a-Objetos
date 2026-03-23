package lista04;

public class E1Pessoa {
	public String nome;
	public int idade;
	
	public void completo(String n, int i) {
		this.nome = n;
		this.idade = i;
		System.out.println("Nome: "+nome);		
		System.out.println("Idade: "+idade);
	}
	
	public void somenteIdade(int i) {
		idade = i;
		System.out.println("Idade: "+idade);
	}

}
