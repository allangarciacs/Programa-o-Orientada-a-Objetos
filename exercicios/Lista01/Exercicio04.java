package Lista01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		/*Escreva um algoritmo que leia um ponto (x,y)
		pelo teclado e informe em qual quadrante o
		ponto se encontra no plano cartesiano ou se o 
		ponto está sobre um dos eixos.*/
		
		Scanner teclado = new Scanner(System.in);
		
		float pontoX, pontoY;
		
		System.out.println("Digite o valor de x:");
		pontoX = teclado.nextFloat();
		System.out.println("Digite o valor de y:");
		pontoY = teclado.nextFloat();
		
		if(pontoX > 0 && pontoY > 0) {
			System.out.println("O ponto se encontra no primeiro quadrante");
		} 
		else if(pontoX < 0 && pontoY > 0) {
			System.out.println("O ponto se encontra no segundo quadrante");
		}
		else if(pontoX < 0 && pontoY < 0) {
			System.out.println("O ponto se encontra no terceiro quadrante");
		} 
		else if(pontoX > 0 && pontoY < 0) {
			System.out.println("O ponto se encontra no quarto quadrante");
		} 
		else if(pontoX == 0 && pontoY == 0) {
			System.out.println("O ponto se encontra na origem");
		}
		else if(pontoX == 0) {
			System.out.println("O ponto se encontra no eixo Y");
		}
		else System.out.println("O ponto se encontra no eixo X");
			
	}

}
