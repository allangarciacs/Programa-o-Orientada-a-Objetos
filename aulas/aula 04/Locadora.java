package aula04;

public class Locadora {
	public String marca;
	public String modelo;
	
	public void setarValores(String ma, String mo) {
		marca = ma;
		modelo = mo;
	}
	public void retornaValoresCarro() {
		System.out.println("Marca: "+marca);
		System.out.println("Modelo: "+modelo);
	}
	
}
