package aula15;

public class A3Cachorro extends A2Animal {
	public String raca;
	
	@Override
	public void exibeInfo() {
		System.out.println("Especie : "+especie);
		System.out.println("Idade   : "+idade);
		System.out.println("Raca    : "+raca);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("au au au");
	}

	public void cuidarPatio() {
		System.out.println("Cuidando do patio");
	}
}
