package lista12;

public class E13Main {
	
		public static E13Conta maiorSaldo(E13Conta[] lista) {
		E13Conta maior = lista[0];
		
		for (E13Conta c : lista) {
			if (c.saldo > maior.saldo) {
				maior = c;
			}
		}
		return maior;         
	}
	
	public static void main(String[] args) {
		E13Conta[] listaContas = new E13Conta[4];
		
		listaContas[0] = new E13Conta(100, "Allan", 1000);
		listaContas[1] = new E13Conta(101, "Fabi", 6000);
		listaContas[2] = new E13Conta(102, "Diego", 4000);
		listaContas[3] = new E13Conta(103, "Gabriel", 2000);
		
		E13Conta maior = maiorSaldo(listaContas);
		
		System.out.println("Conta c o maior saldo:");
		System.out.println(maior);
		
	}
}
