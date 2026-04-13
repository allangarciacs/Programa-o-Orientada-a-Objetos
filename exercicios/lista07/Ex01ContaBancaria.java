package lista07;

public class Ex01ContaBancaria {
	private double saldo, limite;
	
	public Ex01ContaBancaria(double saldo, double limite) {
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
	
	public void saque(double saque) {
		if (saque <= 0) {
			System.out.println("O valor do saque nao pode ser 0 ou negativo");
			return;
	}
		double novoSaldo = saldo - saque;
		if (novoSaldo < 0) {
			novoSaldo = limite + novoSaldo;
			if (novoSaldo < 0) {
				System.out.println("Valor muito alto");
			} else {
				setSaldo(0);
				setLimite(novoSaldo);
				System.out.println("Saque efetuado");
			}
		} else if (novoSaldo > 0 || novoSaldo == 0) {
			setSaldo(novoSaldo);
			System.out.println("Saque efetuado");
			}
		}
	
	}
