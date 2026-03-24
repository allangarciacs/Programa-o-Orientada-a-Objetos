package lista05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		/* Crie um array de Strings com 5 nomes de pessoas
		(ex: "Ana", "Carlos", etc.). Peça ao usuário para
		digitar um número de 0 a 4 para ver quem está naquela
		posição. Trate a exceção caso o usuário digite um
		índice que não existe (ex: 10 ou -1), usando
		ArrayIndexOutOfBoundsException. Trate também se ele digitar uma letra. */
		
		String[] nomes = {"Allan", "Pedro","Gabriel","Fabiana","Diego"};
		
		try { 
			System.out.println("Digite um numero de 1 a 4: ");
			int i = teclado.nextInt();
			System.out.println("Nome nessa posicao: "+nomes[i]);
		} catch (InputMismatchException e) {
			System.out.println("Exceção: "+e.toString()+", vc tem digitar um numero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exceção: "+e.toString()+",\nvc tem digitar um numero de 1 a 4");
		}
		
		teclado.close();
	}

}
