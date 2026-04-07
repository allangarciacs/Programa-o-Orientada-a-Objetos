package aula07;

public class Pessoa {
	private String nome;
	private int idade;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.setidade(idade); // puxa a funcao de baixo pra ver se a idade n eh negativa
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getidade() {
		return idade;
	}
	
	public void setNome(String nome) { // funcoes para mudar o valor da variavel - usa-se o 'set'
		if(nome.isBlank() || nome.isEmpty() || nome == null) {
			System.out.println("Nome invalido");
		} else {
			this.nome = nome;
		}
		
	}

	public void setidade(int idade) {
		if (idade < 0) { 
			System.out.println("Idade invalida");
		} else {
			this.idade = idade;
		}
	}
	
	
}
