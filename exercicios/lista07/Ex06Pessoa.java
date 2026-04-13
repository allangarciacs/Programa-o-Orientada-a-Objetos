package lista07;

public class Ex06Pessoa {
	private String nome;
	private int idade;
	private String cpf;
	
	public Ex06Pessoa(String nome, int idade, String cpf) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setCpf(cpf);
	}

	public String nome() {
		return nome;
	}
	public int idade() {
		return idade;
	}
	public String cpf() {
		return cpf;
	}
	
	public void setNome(String nome) {
		if(nome.isBlank() || nome.isEmpty() || nome == null) {
			System.out.println("Nome invalido");
		} else {
			this.nome = nome;
		}
	}
	
	public void setIdade(int idade) {
		if (idade < 0) { 
			System.out.println("Idade invalida");
		} else {
			this.idade = idade;
		}
	}
	// .length define o tamanho esperado
	// !.matches("\\d+")) permite apenas digitos 0 - 9
	public void setCpf(String cpf) {
		if(cpf.isBlank() || cpf.isEmpty() || cpf == null 
				|| cpf.length() != 11 || !cpf.matches("\\d+")) {
			System.out.println("cpf invalido");
		} else {
			this.cpf =cpf;
		}
	}
	
	public void verificaMaiorDeIdade(int idade) {
		if (idade >= 18) {
			System.out.println("eh maior de idade");
		} else {
			System.out.println("Nao eh maior de idade");
		}
	}

}
