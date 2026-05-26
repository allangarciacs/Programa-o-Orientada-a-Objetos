package lista12;

public class E02ProdutoComDesconto extends E02Produto {
	
	public E02ProdutoComDesconto(double preco) {
		super(preco);
	}
	
	@Override
	public void desconto() {
		double totalDesconto = 0.2;
		double precoFinal = preco - (preco * totalDesconto);

		System.out.println("Preco com 20 % de desconto: "+precoFinal);
	}
}