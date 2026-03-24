package lista05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		/* Pesquise quais são as Exceções existentes que já
		possuem tratamento e explique brevemente como
		cada uma funciona. Teste duas exceções.

		1 -> ArithmeticException
		Ela acontece quando tem um erro matemático, por exemplo:
		divisão por 0 (quando as variaveis sao 'int'). */
		
        try {
        	System.out.println("Divisão entre 10 e 0");
        	
            int a = 10;
            int b = 0;

            int resultado = a / b; // por ser int e 0, vai dar erro
            System.out.println("Resultado: "+resultado);
        } catch (ArithmeticException e) {
            System.out.println("Exceção: "+e.toString()+", Nao pode dividir por 0");
        }
		
        /* 2 -> InputMismatchException
       	   Acontece quando o tipo digitado no Scanner não é o esperado, por exemplo:
       	   digitar um frase ou palavra para um Scanner buscando um 'int'. */
        
        try {
            System.out.println("Digite um número 'int':");
            int numero = teclado.nextInt();

            System.out.println("'int' digitado: "+numero);
        } catch (InputMismatchException e) {
            System.out.println("Exceção:"+e.toString()+", digite um 'int'!");
        }
        
        teclado.close();
	}

}
