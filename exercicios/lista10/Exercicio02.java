package lista10;

/* Crie uma classe ContaBancaria com um método calcularSaldo().
Em seguida, crie uma classe ContaCorrenteque herda da classe
ContaBancariae sobrescreve o método calcularSaldo() para
calcular o saldo da conta corrente e imprimir o resultado. */

class ContaBancaria {
	public void calcularSaldo() {
		System.out.println("Calcular saldo");
	}
}

class ContaCorrente extends ContaBancaria {

	@Override
	public void calcularSaldo() {
		System.out.println("Saldo: 10");
	}
}

public class Exercicio02 {
	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente();
		
		cc1.calcularSaldo();

	}
}
