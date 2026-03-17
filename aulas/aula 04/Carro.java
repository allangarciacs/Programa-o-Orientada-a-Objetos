package aula04;

public class Carro {
	public String marca;
	public String modelo;
	
	public Carro(String marcaCarro, String modeloCarro) {
		System.out.println("Estou no construtor");
		marca = marcaCarro;
		modelo = modeloCarro;
	}
	
	public Carro(String marca) {
		System.out.println("marca do carro 04");
		this.marca = marca;
		
	}
	
	public void atribuirValores(String ma, String mo) {
		marca = ma;
		modelo = mo;
	}
	
	
	
	
}
