package aula04;

public class Moto {
	public String marca;
	public String modelo;
	public int cilindradas;

	public void atribuirValores(String ma, String mo, int cil) {
		marca = ma;
		modelo = mo;
		cilindradas = cil;
	}
	public void retornarValores() {
		System.out.println("Marca: "+marca);
		System.out.println("Modelo: "+modelo);
		System.out.println("Cilindradas: "+cilindradas);
	}
	
}
