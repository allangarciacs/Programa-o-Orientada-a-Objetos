package Lista02;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double n, soma = 0, media = 0;
		int i = 0;
		
		while(true) {
			System.out.println("Digite um valor: ");
			n = teclado.nextDouble();
			soma += n; //somatorio = somatorio + n
			if(n<=0) {
				break;
			}
			i++;
		}
		media = soma / i;
		System.out.println("Media: "+media);

		teclado.close();
		
	}

}
