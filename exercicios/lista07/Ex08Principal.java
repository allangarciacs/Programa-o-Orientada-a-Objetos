package lista07;

import java.util.Scanner;

public class Ex08Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor de x:");
		int x = teclado.nextInt();
		System.out.println("Digite o valor de y:");
		int y = teclado.nextInt();
		
		Ex08Retangulo ret1 = new Ex08Retangulo(x, y);
		ret1.calculaArea(x, y);
		
		teclado.close();
	}
}
