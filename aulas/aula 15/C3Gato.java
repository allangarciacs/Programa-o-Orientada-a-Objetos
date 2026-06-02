package aula15;

public class C3Gato implements C1Animal {

	@Override
	public void emitirSom() {
		System.out.println("Som\t:Miau");		
	}

	@Override
	public void exibirInfo() {
		System.out.println("------ Gato ------");
	}

	@Override
	public boolean verificarVacinacao() {
		return true;
	}
}
