package lista12;

public class E09Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	public E09Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public void imprimirDados() {
		System.out.println("Nome:\t"+nome);
		System.out.println("Preco:\t"+preco);
		System.out.println("Qtde:\t"+quantidade);
	}
}
