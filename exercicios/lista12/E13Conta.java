package lista12;

public class E13Conta {
	int numero;
	String titular;
	double saldo;
	
	public E13Conta(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "E13Conta [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
}
