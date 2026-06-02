package aula15;

public class B0Main {

	public static void main(String[] args) {
		B3Circulo c = new B3Circulo(2);
		System.out.println("Area do circulo\t\t: "+c.area());
		System.out.println("Perimetro do circulo\t: "+c.perimetro());

		B2Retangulo r = new B2Retangulo(10, 8);
		System.out.println("\nArea do retangulo\t: "+r.area());
		System.out.println("Perimetro do retangulo\t: "+r.perimetro());
		
	}
}
