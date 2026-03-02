package Lista01;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[] args) {
		
	/*Escreva um algoritmo que leia dois valores pelo
	teclado e informe se os mesmos são múltiplos um
	do outro ou não.*/
		
	Scanner teclado = new Scanner(System.in);
	
	float valorA, valorB;
	
	System.out.println("Digite o valor A:");
	valorA = teclado.nextFloat();
	System.out.println("Digite o valor B:");
	valorB = teclado.nextFloat();
		
	if (valorA % valorB == 0) {
		System.out.println("Sao multiplos");
	} else System.err.println("Nao sao multiplos");
	
	}
}
