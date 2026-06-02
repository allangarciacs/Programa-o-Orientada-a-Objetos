package aula15;

public class B2Retangulo extends B1Forma {
	public double largura;
	public double altura;
	
	public B2Retangulo(double largura, double altura) {
		super();
		this.altura = altura;
		this.largura = largura;
	}

	@Override
	public double area() {
		return altura * largura;		
	}

	@Override
	public double perimetro() {
		return 2 * (largura * altura);
	}
}
