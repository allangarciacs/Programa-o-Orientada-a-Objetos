package lista07;

import java.util.Scanner;

public class Ex05Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor dos lados do triangulo");
		System.out.println("Lado A: ");
		double ladoA = teclado.nextDouble();
		System.out.println("Lado B: ");
		double ladoB = teclado.nextDouble();
		System.out.println("Lado C: ");
		double ladoC = teclado.nextDouble();
		
		Ex05Triangulo tri1 = new Ex05Triangulo(ladoA, ladoB, ladoC);
		tri1.verificaEquilatero(ladoA, ladoB, ladoC);
		
		teclado.close();
	}

}
