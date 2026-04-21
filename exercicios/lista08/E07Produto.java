package pkg;

public class E07Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
	public E07Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public void exibirInformacoes() {
		System.out.println("Nome       : "+nome);
		System.out.println("Preco      : "+preco);
		System.out.println("Quantidade : "+quantidade);
	}

	public void calcularValorTotal() {
		double valorTotal = quantidade * preco;
		System.out.println("Valor total: "+valorTotal+"\n");
	}
	
}
