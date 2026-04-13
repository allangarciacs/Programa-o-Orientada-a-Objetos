package lista07;

import java.util.Scanner;

public class Ex03Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Calcular area de um retangulo, digite o valor da\n");
		System.out.println("Base: ");
		double base = teclado.nextDouble();
		System.out.println("Altura: ");
		double altura = teclado.nextDouble();
		
		Ex03Retangulo ret1 = new Ex03Retangulo(base, altura);
		System.out.println("Area do retangulo = "+ret1.calculaArea(base, altura));
		
		teclado.close();

	}

}
