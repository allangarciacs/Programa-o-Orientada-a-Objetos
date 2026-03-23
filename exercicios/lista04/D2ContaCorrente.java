package lista04;

import java.util.Scanner;

public class D2ContaCorrente {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		D1ContaCorrente cc1 = new D1ContaCorrente(); // nova conta
		
		cc1.definirSaldoInicial(1000); // passando o valor do saldo por parametro
		
		cc1.mostrarSaldo();
		System.out.println("--------------------------------");
		
		cc1.sacar(500);
		
		cc1.depositar(50);
		System.out.println("--------------------------------");
		cc1.mostrarSaldo();
		System.out.println("--------------------------------");
		
		System.out.println("Tentativa de saque de 600 reais");
		cc1.sacar(600);
		System.out.println("--------------------------------");
		cc1.mostrarSaldo();
		
		teclado.close();
	}

}
