package lista10;

/* Crie uma classe Casa com um método calcularPreco(inttamanho)
que retorna o preço da casa com base no tamanho em metros
quadrados. Sobrecarregue o método calcularPreco() para aceitar
um número de quartos e retornar o preço da casa com base no
tamanho e no número de quartos. */

class Casa {
	public void calcularPreco(int tamanho) {
		System.out.println("Preco: " +(tamanho * 100));
	}
	
	public void calcularPreco(int tamanho, int qtdeQuartos) {
		System.out.println("Preco c quartos: " +((tamanho * 100) + (qtdeQuartos * 10)));
	}
}

public class Exercicio04 {
	public static void main(String[] args) {
		Casa c1 = new Casa();
		
		c1.calcularPreco(10);
		
		c1.calcularPreco(10, 3);
		
	}
}
