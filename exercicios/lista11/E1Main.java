package lista11;

import java.util.ArrayList;
import java.util.List;

public class E1Main {
	public static void main(String[] args) {
		List<Produto> listaProdutos = new ArrayList<Produto>();
		
		Produto produto1 = new Produto("Copo", 10, 5);
		Produto produto2 = new Produto("Mesa", 300, 15);
		Produto produto3 = new Produto("Cadeira", 150, 20);
		Produto produto4 = new Produto("Lapis", 1, 100);
		Produto produto5 = new Produto("Caneta", 5, 50);
		
		listaProdutos.add(produto1);
		listaProdutos.add(produto2);
		listaProdutos.add(produto3);
		listaProdutos.add(produto4);
		listaProdutos.add(produto5);
		
		exibirProdutos(listaProdutos);
		
	}
	
	public static void exibirProdutos(List<Produto> lista) {
		for (Produto p : lista) {
			System.out.println("Nome: "+p.getNome()+"\tPreco: "
			+p.getPreco()+"\tQuantidade: "+p.getQuantidade());
		}
	}
}
