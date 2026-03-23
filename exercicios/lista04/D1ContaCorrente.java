package lista04;

public class D1ContaCorrente {
	public float saldo;

	
	public void definirSaldoInicial(float s) {
		saldo = s;
	}
	
	public void depositar(float valor) {
		saldo = saldo + valor;
		System.out.println("Deposito de "+valor+" reais efetuado");
	}
	
	public boolean sacar(float valor) {
		if (valor <= saldo) {
				saldo = saldo - valor;
				System.out.println("Saque de "+valor+" reais efetuado");
				return true;
			} else {
				System.out.println("Valor insuficiente na conta");
				return false;
		}
		
	}
	
	public void mostrarSaldo() {
		System.out.println("Saldo: "+saldo);
	}
	
}
