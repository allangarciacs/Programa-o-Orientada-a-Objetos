package lista12;

public class E05Main {

	public static void main(String[] args) {
		
		E05Produto produto1 = new E05Produto(0); //produto c preco 0 ate ser
											   // adicionado por paramtro
		
		produto1.calcularPrecoFinal(100); // valor inicial 100
		
		E05Cliente cliente1 = new E05Cliente(0.3);
		
		produto1.calcularPrecoFinal(cliente1);
		
	}
}
