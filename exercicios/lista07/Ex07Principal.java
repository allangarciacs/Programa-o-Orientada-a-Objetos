package lista07;

import java.util.Scanner;

public class Ex07Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Ex07Carro car1 = new Ex07Carro("BRA2E19", 123);
		System.out.println("infos do carro\nPlaca:"+car1.getPlaca()
		+"\nChassi: "+car1.getNumChassi()+"\n");
		car1.acelerar();
		car1.frear();
		
		teclado.close();
	}

}
