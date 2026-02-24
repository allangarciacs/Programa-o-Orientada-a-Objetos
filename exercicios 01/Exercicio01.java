package pkg;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		float a, b;
		System.out.println("Digite o primeiro numero:");
		a = teclado.nextFloat();
		System.out.println("Digite o segundo numero:");
		b = teclado.nextFloat();
		
		float soma, sub, mult, div;
		
		soma = a + b;
		sub = a - b;
		mult = a * b;
		div = a / b;
		
		System.out.println("Soma: "+soma);
		System.out.println("Subtração: "+sub);
		System.out.println("Multiplicação: "+mult);
		System.out.println("DIvisão: "+div);
		
	}
	

}
