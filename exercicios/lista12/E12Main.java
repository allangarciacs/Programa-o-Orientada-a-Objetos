package lista12;

import java.util.Arrays;
import java.util.Comparator;

public class E12Main {

	public static void main(String[] args) {
		E12Livro[] listaLivros = new E12Livro[3];
		
		listaLivros[0] = new E12Livro("Java", "Allan", 2026);
		listaLivros[1] = new E12Livro("Assembly", "Pedro", 1999);
		listaLivros[2] = new E12Livro("C++", "Fabi", 2000);
		

		Arrays.sort(listaLivros, Comparator.comparingInt(E12Livro::getAno));
		
		for (E12Livro livro : listaLivros) {
			System.out.println(livro);
		}
		
	}

}
