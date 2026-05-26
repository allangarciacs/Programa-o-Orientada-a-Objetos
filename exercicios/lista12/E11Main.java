package lista12;

public class E11Main {

	public static void main(String[] args) {
		E11Pessoa[] listaPessoas = new E11Pessoa[4];
		
		listaPessoas[0] = new E11Pessoa("ALlan", 19, "M");
		listaPessoas[1] = new E11Pessoa("Fabi", 11, "F");
		listaPessoas[2] = new E11Pessoa("Maria", 19, "f");
		listaPessoas[3] = new E11Pessoa("Pedro", 20, "M");
		
		System.out.println("Quantidade de mulheres presentes na lista: "
			+ E11Pessoa.quantidadeMulheres(listaPessoas));
	}
}
