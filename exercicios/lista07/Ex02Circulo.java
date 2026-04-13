package lista07;

public class Ex02Circulo {
	private double raio;
	
	public Ex02Circulo(double raio) {
		this.setRaio(raio);
	}
	
	public double getRaio() {
		return raio;
	}
	 public void setRaio(double raio) {
		 if (raio <= 0) {
			 System.out.println("Raio n pode ser 0 ou negativo");
		 } else {
			 this.raio = raio;
		 }
	 }
	
	 public double calculaArea(double raio) {
		 double pi = 3.14159;
		 double raioAoQuadrado = raio * raio;
		 double area = pi * raioAoQuadrado;
		 return area;
	 }
		 
	 }
	 
