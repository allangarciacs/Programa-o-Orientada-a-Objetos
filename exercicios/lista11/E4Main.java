package lista11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class E4Main {
	public static void main(String[] args) {
		List<Livro> listaLivros = new ArrayList<Livro>();
		
		Livro livro1 = new Livro("Dom Quixote", "Miguel", 1605);
		Livro livro2 = new Livro("Crime", "Jane", 1000);
		Livro livro3 = new Livro("Cronicas", "Jose", 1500);
		
		listaLivros.add(livro1);
		listaLivros.add(livro2);
		listaLivros.add(livro3);
		
		Collections.sort(listaLivros, Comparator.comparingInt(Livro::getAno));
		
		for (Livro l : listaLivros) {
			System.out.println(l);
		}
	}
}
