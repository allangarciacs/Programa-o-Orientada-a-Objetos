package lista12;

public class E01Computador {
	protected String marca;
	protected String modelo;
	
	public E01Computador(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String exibieModelo() {
		return "Modelo: " +modelo;
	}
}
