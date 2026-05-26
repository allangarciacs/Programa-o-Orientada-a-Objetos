package lista12;

class E02Produto {
	protected double preco;
	
	public E02Produto(double preco) {
		this.preco = preco;
	}
	
	public void desconto() {
		System.out.println("Preco original: "+preco);
	}
}
