package lista07;

import java.util.Scanner;

public class Ex01Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double saque = 0;
		Ex01ContaBancaria cb1 = new Ex01ContaBancaria(100, 200);
		
		System.out.println("Dados da conta bancaria");
		System.out.println("Saldo: "+cb1.getSaldo());
		System.out.println("Limite: "+cb1.getLimite());
		
		System.out.println("\nInforme o valor do saque: ");
		saque = teclado.nextDouble();
		cb1.saque(saque);
		
		System.out.println("\nDados da conta bancaria");
		System.out.println("Saldo: "+cb1.getSaldo());
		System.out.println("Limite: "+cb1.getLimite());
		
		teclado.close();
		
	}

}