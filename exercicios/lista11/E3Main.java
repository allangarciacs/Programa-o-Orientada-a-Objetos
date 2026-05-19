package lista11;

import java.util.ArrayList;
import java.util.List;

	public class E3Main {
		public static void main(String[] args) {
			List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
			
			Pessoa pessoa1 = new Pessoa("Allan", 19, "M");
			Pessoa pessoa2 = new Pessoa("Fabi", 22, "F");
			Pessoa pessoa3 = new Pessoa("Luisa", 30, "F");
			
			listaPessoas.add(pessoa1);
			listaPessoas.add(pessoa2);
			listaPessoas.add(pessoa3);
			
			quantasMulheres(listaPessoas);
		}

		public static void quantasMulheres(List<Pessoa> lista) {
			int qtdeMulheres = 0;
			for (Pessoa p : lista) {
				if (p.getSexo().equalsIgnoreCase("F")) {
					qtdeMulheres++;
				} else {
					qtdeMulheres = qtdeMulheres + 0;
				}
			}
			System.out.println("Total de mulheres: "+qtdeMulheres);
		}
	}

