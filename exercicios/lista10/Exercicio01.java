package lista10;

/* Crie uma classe FormaGeometrica com um método calcularArea(). Em
seguida, crie uma classe Triangulo que herda da classe
FormaGeometricae sobrescreve o método calcularArea() para calcular
a área do triângulo e imprimir o resultado. */


class FormaGeometrica {
	public void calcularArea() { // metodo q pode ser sobrescrito
		System.out.println("Calculando area da forma"); 
	}
}

class Triangulo extends FormaGeometrica {
	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public void calcularArea() {
		double area = (base * altura) / 2;
		System.out.println("Area do triangulo: " + area);
	}
}

public class Exercicio01 {
	public static void main(String[] args) {
		Triangulo t = new Triangulo(5, 3);
		t.calcularArea();
		
	}
}
