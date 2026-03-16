package lista03;

public class ExecutavelPessoa {

	public static void main(String[] args) {
		
		/*Crie uma classe Pessoa com os atributos nome,
		idade e gênero. Imprima as informações da pessoa na tela.*/
		
		Pessoa p1 = new Pessoa();
		
		p1.nome = "Allan";
		p1.idade = 19;
		p1.genero = "Masculino";
		
		System.out.println("Pessoa 01:");
		System.out.println("Nome: "+p1.nome);
		System.out.println("Idade: "+p1.idade);
		System.out.println("Genero: "+p1.genero);
		
	}

}
