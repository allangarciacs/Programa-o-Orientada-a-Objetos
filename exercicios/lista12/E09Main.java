package lista12;

public class E09Main {

	public static void main(String[] args) {
		E09Produto[] listaProdutos = new E09Produto[4];
		
		listaProdutos[0] = new E09Produto("Copo", 5, 10);
		listaProdutos[1] = new E09Produto("Mesa", 1, 50);
		listaProdutos[2] = new E09Produto("Faca", 20, 10);
		listaProdutos[3] = new E09Produto("Garfo", 25, 10);
	
		for (E09Produto p : listaProdutos) {
			p.imprimirDados();
			System.out.println("---------------------");
		}
	}
}
