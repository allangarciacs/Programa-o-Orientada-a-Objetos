package lista07;

import java.util.Scanner;

public class A1Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double saldo = 0, limite = 0, saque = 0;
		A1ContaBancaria cb1 = new A1ContaBancaria(100, 500);
		saldo = cb1.getSaldo();
		limite = cb1.getLimite();
		System.out.println("Dados da conta bancaria: ");
		System.out.println("Saldo: "+cb1.getSaldo());
		System.out.println("Limite: "+cb1.getLimite());
		
		System.err.println("\nInforme o valor do saque: ");
		saque = teclado.nextDouble();
		cb1.saque(saque, saldo, limite);
		
	}

}
