package aula15;

public abstract class A2Animal {
	public String especie;
	public int idade;
	
	public abstract void emitirSom();
	
	public void exibeInfo() {
		System.out.println("Especie : "+especie);
		System.out.println("Idade   : "+idade);
	}

}
