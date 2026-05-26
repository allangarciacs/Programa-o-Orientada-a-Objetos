package lista12;

public class E05Produto {
	private double valorFinal;
	
	public E05Produto(double valorFinal) {
		this.valorFinal = valorFinal;
	}
	
	public void calcularPrecoFinal(double valor) {
		valorFinal += valor;
		System.out.println("Preco: "+valorFinal);
	}
	
	public void calcularPrecoFinal(E05Cliente cliente) {
		valorFinal = valorFinal - (valorFinal * cliente.desconto);
		System.out.println("Saldo apos o desconto de "+cliente.desconto+"%: "
				+valorFinal);
	}
}
