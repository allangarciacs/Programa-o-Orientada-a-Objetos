package lista12;

import java.util.Scanner;

public class E01Netbook extends E01Computador {
	public E01Netbook(String marca) {
		super(marca, "Portatil");
	}

	public String exibeMarca() {
		return "Marca netbook: "+marca;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a marc ado netbook");
		String marca = teclado.nextLine();
		
		E01Netbook netbook1 = new E01Netbook(marca);
		
		System.out.println(netbook1.exibeMarca());
		System.out.println(netbook1.exibieModelo());
		
		teclado.close();
		
	}
}
