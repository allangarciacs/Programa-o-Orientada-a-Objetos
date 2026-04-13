package lista07;

import java.util.Scanner;

public class Ex04Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite as especificacoes do carro:\n");
		System.out.println("Marca:");
		String marca = teclado.nextLine();
		System.out.println("Modelo:");
		String modelo = teclado.nextLine();
		System.out.println("Ano:");
		int ano = teclado.nextInt();
		
		Ex04Carro car1 = new Ex04Carro(marca, modelo, ano);
		car1.exibeDetalhes(marca, modelo, ano);
		
		teclado.close();
	}

}
