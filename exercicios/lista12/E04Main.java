package lista12;

public class E04Main {

	public static void main(String[] args) {
		
		E04ContaBancaria cb1 = new E04ContaBancaria(1000);
		
		cb1.depositar(100);
		
		E04Cheque cheque1 = new E04Cheque(500);
		
		cb1.depositar(cheque1);
		
	}
}
