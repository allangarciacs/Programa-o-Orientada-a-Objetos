package lista03;

import java.util.Scanner;

public class ExecutavelComputador {

	public static void main(String[] args) {
	
		/*Crie uma classe chama Computador que possua 4 atributos:
		marca, modelo, tipo (notebook, netbook, tablet, etc) e preço.
		  
		Essa classe Computador também deverá ser executável, entretanto
		crie uma outra classe executável que irá instanciar a classe
		Computador, criando 2 objetos. O primeiro objeto deverá ser
		criado através da solicitação dos valores ao usuário por linha
		de execução. Já, os valores do segundo objeto, deverão ser 
		definidos no código-fonte da classe que o criou. Exiba na tela
		os resultados.*/
		
		Scanner teclado = new Scanner(System.in);
		
		Computador c1 = new Computador();
		Computador c2 = new Computador();
		
		System.out.println("Marca do computador 01: ");
		c1.marca = teclado.nextLine();
		System.out.println("Modelo do computador 01");
		c1.modelo = teclado.nextLine();
		System.out.println("Tipo do computador 01 (notebook, netbook, tablet, etc.");
		c1.tipo = teclado.nextLine();
		System.out.println("Preco do computador 01: ");
		c1.preco = teclado.nextFloat();
		
		c2.marca = "Samsung";
		c2.modelo = "Snapdragon";
		c2.tipo = "Notebook";
		c2.preco = 1000f;
		
		System.out.println("\nComputador 01:");
		System.out.println("Marca: "+c1.marca);
		System.out.println("Modelo: "+c1.modelo);
		System.out.println("Tipo: "+c1.tipo);
		System.out.println("Preco: "+c1.preco);
		
		System.out.println("\nComputador 02:");
		System.out.println("Marca: "+c2.marca);
		System.out.println("Modelo: "+c2.modelo);
		System.out.println("Tipo: "+c2.tipo);
		System.out.println("Preco: "+c2.preco);
		
		teclado.close();
		
	}

}
