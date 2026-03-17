package aula04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		/* // CARRO
		  
		 Carro ca = new Carro(); //c.modelo = "gol"; //c.marca = "vw";
		 
		 ca.alugar(); ca.devolver(); ca.exibirDados();
		 
		 System.out.println("Digite a marca do carro: "); ca.marca =
		 teclado.nextLine(); System.out.println("Digite o modelo do carro: ");
		 ca.modelo = teclado.nextLine();
		  
		 ca.exibirDados();
		  
		 teclado.close();
		 */
		
		/* // CALCULADORA
		  
		 Calculadora c = new Calculadora();
		 
		 //c.a = 4.37; //c.b = 4.47;
		 double resultado; 
		 resultado = c.somar(4.5, 4);
		 System.out.println("Resultado da soma: "+resultado);
		 */
	
		/* // LOCADORA
		 
		 Locadora carro01 = new Locadora();
		 carro01.setarValores("vw","gol");
		 System.out.println("CARRO01:\nMarca: "+carro01.retornaMarca()+"\nModelo: "+carro01.retornaModelo());
		 */
		
		/* // LOCADORA VEICULOS
	
		 Locadora c1 = new Locadora(); Moto m1 = new Moto(); Moto m2 = new Moto();
		  
		 System.out.println("CARRO 01:\nDigite a marca:"); c1.marca =
		 teclado.nextLine(); System.out.println("Modelo:"); c1.modelo =
		 teclado.nextLine();
		 
		 c1.setarValores(c1.marca, c1.modelo);
		 
		 System.out.println("MOTO 01:\nDigite a marca:"); m1.marca =
		 teclado.nextLine(); System.out.println("Modelo:"); m1.modelo=
		 teclado.nextLine(); System.out.println("Cilindradas:"); m1.cilindradas =
		 teclado.nextInt(); teclado.nextLine();
		  
		 m1.atribuirValores(m1.marca, m1.modelo, m1.cilindradas);
		  
		 System.out.println("MOTO 02:\nDigite a marca:"); m2.marca =
		 teclado.nextLine(); System.out.println("Modelo:"); m2.modelo=
		 teclado.nextLine(); System.out.println("Cilindradas:"); m2.cilindradas =
		 teclado.nextInt(); teclado.nextLine();
	 	 
	     m2.atribuirValores(m2.marca, m2.modelo, m2.cilindradas);
		 
		 
		 System.out.println("\nCarro 01 ->"); c1.retornaValoresCarro();
		 System.out.println("\nMoto 01 ->"); m1.retornarValores();
		 System.out.println("\nMoto 02 ->"); m2.retornarValores();
		 */		
		
		// TESTANDO CONTRUTOR
		
		Carro c = new Carro("vw","gol");
		System.out.println("Marca do carro: "+c.marca);
		System.out.println("Modelo do carro: "+c.modelo);
		
		
		String marca, modelo;
		System.out.println("Digite a marca do carro 2:");
		marca = teclado.nextLine();
		System.out.println("Modelo do carro 2:");
		modelo = teclado.nextLine();
		Carro c2 = new Carro(marca, modelo);
		System.out.println("Marca do carro: "+c2.marca);
		System.out.println("Modelo do carro: "+c2.modelo);
		
		System.out.println("digite a marca e o modelo do carro 03:");
		Carro c3 = new Carro(teclado.nextLine(), teclado.nextLine());
		System.out.println("Marco do carro 3: "+c3.marca);
		System.out.println("MODELO DO carro 3: "+c3.modelo);
		
		Carro c4 = new Carro("ford");
		System.out.println("Marca do carro 04: "+c4.marca);
		
		
		teclado.close();
		
	}

}
