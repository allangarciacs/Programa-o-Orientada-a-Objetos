package Lista02;

import java.util.Scanner;

public class P2Exercicio07 {

	public static void main(String[] args) {
		
		/*Escreva um programa Java que use uma matriz para
		armazenar as notas de 3 alunos em 4 disciplinas e
		depois imprima na tela a nota mais alta e a nota mais
		baixa em cada disciplina.*/

		Scanner teclado = new Scanner(System.in);
		double[][] matriz = new double [3][4];
		
		for(int i =0; i<3; i++) { 
			System.out.println("Aluno numero "+(i+1)+": ");
		
			for(int j=0; j<4; j++) {
				System.out.println("Nota do aluno "+(i+1)+" na disciplina "+(j+1)+": ");
				matriz[i][j] = teclado.nextDouble();
			}
		}
		
		for(int j=0; j<4; j++) {
			double maiorNota = matriz[0][j];
			double menorNota = matriz[0][j];
			
			for(int i =1; i<3; i++) {
				if(matriz[i][j]>maiorNota) {
					maiorNota = matriz[i][j];
				}
				if(matriz[i][j]<menorNota) {
					menorNota = matriz[i][j];
				}
			}
			
			System.out.println("Discipila "+(j+1)+": ");
			System.out.println("Maior nota: " + maiorNota);
			System.out.println("Menor nota: " + menorNota);
		}
		
		teclado.close();

	}

}
