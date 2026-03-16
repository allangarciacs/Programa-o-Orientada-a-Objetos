package lista03;

import java.util.Scanner;

public class ExecutavelCarro {

	public static void main(String[] args) {
		
		/* Crie uma classe chamada Carro que possua 3 atributos:
		 marca, modelo e anoFabricacao. Além disso, crie uma classe
		 executável para criar 2 objetos do tipo Carro e exibir na
		 tela os valores dos atributos criados.
		 
		 Esses valores devem ser solicitados ao usuário, por linha
		 de execução.*/
		
		
		Scanner teclado = new Scanner(System.in);
		
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		
		System.out.println("Marca do carro 01: ");
		c1.marca = teclado.nextLine();
		System.out.println("Marca do carro 02: ");
		c2.marca = teclado.nextLine();
		
		System.out.println("Modelo do carro 01: ");
		c1.modelo = teclado.nextLine();
		System.out.println("Modelo do carro 02: ");
		c2.modelo = teclado.nextLine();
		
		System.out.println("Ano de fabricacao do carro 01: ");
		c1.anoFabricacao = teclado.nextInt();
		System.out.println("Ano de fabricacao do carro 02: ");
		c2.anoFabricacao = teclado.nextInt();
		
		teclado.nextLine();
		
		System.out.println("\nCarro 01:");
		System.out.println("Marca: "+c1.marca);
		System.out.println("Modelo: "+c1.modelo);
		System.out.println("Ano de fabricacao: "+c1.anoFabricacao +"\n");
		
		System.out.println("Carro 02:");
		System.out.println("Marca: "+c1.marca);
		System.out.println("Modelo: "+c1.modelo);
		System.out.println("Ano de fabricacao: "+c1.anoFabricacao);
		
		teclado.close();
	}

}
