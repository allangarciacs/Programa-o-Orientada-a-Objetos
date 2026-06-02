package aula15;

public class C0Main {

	public static void main(String[] args) {
		C2Cachorro c = new C2Cachorro();
		c.nome = "popo";
		c.raca = "doberman";
		c.idade = 20;
		
		c.exibirInfo();
		c.emitirSom();
		System.out.println("Vacinado:"+c.verificarVacinacao());
		System.out.println("\n");
		
		C3Gato g = new C3Gato();
		g.exibirInfo();
		g.emitirSom();
		System.out.println("Vacinado:"+g.verificarVacinacao());
		
	}
}