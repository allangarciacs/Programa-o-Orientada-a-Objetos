package lista07;

public class A1ContaBancaria {
	private double saldo, limite;
	
	public A1ContaBancaria(double saldo, double limite) {
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double saque(double saque, double saldo, double limite) {
		double total = 0;
		total = saldo + limite;
		if (saque > total) {
			System.out.println("Valor mt alto");
			return total;
		} else {
			return total;
		}
			
	}
	
	}

