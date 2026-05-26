package lista12;

import java.util.Scanner;

public class E01Notebook extends E01Computador {
	public E01Notebook(String marca) {
		super(marca, "Portatil");
	}

	public String exibirMarca() {
		return "Marca Notebook: "+marca;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a marca do notebook: ");
		String marca = teclado.nextLine();
		
		E01Notebook notebook1 = new E01Notebook(marca);
		System.out.println(notebook1.exibirMarca());
		System.out.println(notebook1.exibieModelo());
		
		teclado.close();
		
	}
}
