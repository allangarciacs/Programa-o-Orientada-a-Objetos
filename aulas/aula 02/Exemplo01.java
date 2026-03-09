package Lista02;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*
		 * System.out.println("Digite um inteiro:"); int n = teclado.nextInt();
		 * System.out.println("Int digitado"); System.out.println("Digite um double:");
		 * double nl = teclado.nextDouble(); System.out.println("Double digitado");
		 * teclado.nextLine(); 
		 * System.out.println("Digite uma palavra c .next:"); palavra = teclado.next();
		 * System.out.println("Palavra digitada com .next:" +palavra);
		 */
		
		/*
		 * for(int i = 0; i < 10; i++) { //o i e System.out.println("I vale: "+i); }
		 * 
		 * int i = 0; //inicializando a variavel while(i<10) { //o criterio da parada
		 * System.out.println("I vale com while: "+i); i++; //incremento }
		 */
		
		
					System.out.println("Digite uma frase:");
					String palavra = teclado.nextLine(); 
					System.out.println("frase digitada: "+palavra);
		 
		 
		/*
		 * i = 0; do { System.out.println("I vale com do while: "+i); i++; }while i<10;
		 * 
		 * teclado.close();
		 */
	}

}
