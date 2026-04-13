package lista07;

import java.util.Scanner;

public class Ex02Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio do circulo: ");
		double raio = teclado.nextDouble();
		
		Ex02Circulo cir1 = new Ex02Circulo(raio);
		cir1.calculaArea(raio);
		
		System.out.println("Area do circulo: "+cir1.calculaArea(raio)+
				" unidades de area");
		
		teclado.close();
		
	}

}
