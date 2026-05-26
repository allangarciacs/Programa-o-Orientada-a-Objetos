package lista12;

public class E11Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	public E11Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public static int quantidadeMulheres(E11Pessoa[] lista) {
		int quantidadeF = 0;
		for (E11Pessoa p : lista) {
			if (p.getSexo().equalsIgnoreCase("F")) {
				quantidadeF++;
			}
		}
		return quantidadeF;
	}
}
