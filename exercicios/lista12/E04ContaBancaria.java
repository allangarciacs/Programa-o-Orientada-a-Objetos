package lista12;

public class E04ContaBancaria {
	private double saldo;
	
	public E04ContaBancaria(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
		System.out.println("Saldo apos o deposito de "
				+valor+" $: "+saldo);
	}
	
	public void depositar(E04Cheque cheque) {
		saldo += cheque.valor;
		
		System.out.println("Saldo apos o deposito do cheque de "
				+cheque.valor+" $: "+saldo);
	}
	
}
