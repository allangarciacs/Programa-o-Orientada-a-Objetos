package aula15;

import java.util.Scanner;

public class A0Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		/* Cachorro c = new Cachorro();
		c.emitirSom();
		
		Tigre t = new Tigre();
		t.emitirSom(); 				 */
		
		A2Animal a;
		System.out.println("Opcao 1 cachorro");
		System.out.println("Opcao 2 tigre");
		System.out.print("Opcao: ");
		int opcao = teclado.nextInt();
		teclado.nextLine();
		
		/* quando a classe tem metodos diferentes da principal
		(anjmal), usa-se a maneira 1 de definir */
		
		if(opcao == 1) {
			A3Cachorro c = new A3Cachorro(); // maneira 1 
			
			c.especie = "cuscos";
			c.idade = 10;
			c.raca = "dobberman";
			
			c.exibeInfo();
			c.emitirSom();
			c.cuidarPatio();
			
		} else if (opcao == 2) {
			a = new A1Tigre();			 // meneira 2		
			a.especie = "tigrao";
			a.idade = 8;
			a.exibeInfo();
			a.emitirSom();
		}
		
		teclado.close();
		
	}

}
