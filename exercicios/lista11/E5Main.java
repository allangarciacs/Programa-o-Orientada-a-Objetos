package lista11;

import java.util.ArrayList;
import java.util.List;

public class E5Main {
	public static void main(String[] args) {
		List<Conta> listaContas = new ArrayList<Conta>();
	
		listaContas.add(new Conta(100, "Allan", 1500));
		listaContas.add(new Conta(101, "Pedro", 3000));
		listaContas.add(new Conta(102, "Jose", 2500));
		
		Conta contaMaiorSaldo = maiorSaldo(listaContas);
		
		System.out.println("Dados da conta com maior saldo:");
		System.out.println("Titular:"+contaMaiorSaldo.getTitular()+"\tNumero da conta:"
		+contaMaiorSaldo.getNumero()+"\tSaldo:"+contaMaiorSaldo.getSaldo());
		
	}

	public static Conta maiorSaldo(List<Conta> lista) {
		Conta maiorSaldo = lista.get(0);
		for (Conta c : lista) {
			if (c.getSaldo() > maiorSaldo.getSaldo()) {
				maiorSaldo = c;
			}
		}
		return maiorSaldo;
	}
}
