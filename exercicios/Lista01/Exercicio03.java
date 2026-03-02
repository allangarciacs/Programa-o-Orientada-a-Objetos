package Lista01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
	/*Escrever um algoritmo para ler quatro valores 
	float, calcular a sua média, e escrever na tela
	os que são superiores à média.*/
		
	Scanner teclado = new Scanner(System.in);
	
	float primeiro, segundo, terceiro, quarto, soma, media;
		
	System.out.println("Digite quatro variaveis float:");
	primeiro = teclado.nextFloat();
	segundo = teclado.nextFloat();
	terceiro = teclado.nextFloat();
	quarto = teclado.nextFloat();
	
	soma = primeiro + segundo + terceiro + quarto;
	media = soma / 4;
	
	System.out.println("Media = "+media);
	
	if(primeiro > media) {
		System.out.println("Primeiro numero eh maior que a media = "+primeiro);
	
	}
	if(segundo > media) {
		System.out.println("Segundo numero eh maior que a media= "+segundo);
	
	}
	if(terceiro > media) {
		System.out.println("Terceiro numero eh maior que a media= "+terceiro);
	
	}
	if(quarto > media) {
		System.out.println("Quarto numero eh maior que a media = "+quarto);
	
	}
	
	}

}
