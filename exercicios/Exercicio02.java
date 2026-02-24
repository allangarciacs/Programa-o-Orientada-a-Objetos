package pkg;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
	
		/*Um motorista de taxi deseja calcular o 
		rendimento de seu carro na praça. 
		Sabendose que o preço do combustível 
		é de R$4,90, escreva um algoritmo para 
		ler a marcação
		do odômetro (marcador de quilometragem) 
		no início do dia, a marcação no final do dia, 
		o
		número de litros de combustível gasto e o valor 
		total (R$) recebido dos passageiros.
		Calcule e escreva a média do consumo em Km/l e o 
		lucro líquido do dia.
		*/
		
		Scanner teclado = new Scanner(System.in);
		
		float inicial, fim, gasto, recebido;
		
		System.out.println("Digite a marcação inicial:");
		inicial = teclado.nextFloat();
		System.out.println("Digite a marcação final:");
		fim = teclado.nextFloat();
		System.out.println("Digite o combustivel gasto em L:");
		gasto = teclado.nextFloat();
		System.out.println("Digite o valor recebido:");
		recebido = teclado.nextFloat();
		
		float usada, media;
		
		usada = fim - inicial;
		media = usada / gasto;
	
		float gastoGasolina, lucro, preco = 4.9f;
		
		gastoGasolina = usada * preco;
		lucro = recebido - gastoGasolina;
		
		System.out.println("Media de Km por L de gasolina:"+media);
		System.out.println("Lucro: "+lucro);
	
	}

}
