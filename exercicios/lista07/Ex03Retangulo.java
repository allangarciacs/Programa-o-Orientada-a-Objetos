package lista07;

public class Ex03Retangulo {
	private double base;
	private double altura;
	
	public Ex03Retangulo(double base, double altura) {
		this.setBase(base);
		this.setAltura(altura);
	}
	
	public double getBase() {
		return base;
	}
	public double getAltura() {
		return altura;
	}
	
	public void setBase(double base) {
		if (base <= 0) {
			System.out.println("Base n pode ser 0 ou negativa");
		} else {
			this.base = base;
		}
	}
	
	public void setAltura(double altura) {
		if (altura <= 0) {
			System.out.println("Altura n pode ser 0 ou negativa");
		} else {
			this.altura = altura;
		}
	}
	
	public double calculaArea(double base, double altura) {
		double area = base * altura;
		return area;
	}

}
