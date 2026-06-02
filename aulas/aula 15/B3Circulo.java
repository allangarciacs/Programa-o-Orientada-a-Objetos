package aula15;

public class B3Circulo extends B1Forma {
	public double raio;
	
	public B3Circulo(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(raio, 2);
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * raio;
	}
}
