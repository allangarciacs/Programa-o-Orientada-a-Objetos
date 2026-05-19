package lista11;

import java.util.ArrayList;
import java.util.List;

public class E2Main {
	public static void main(String[] args) {
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		Aluno aluno1 = new Aluno("Allan", 5, 10);
		Aluno aluno2 = new Aluno("Gabriel", 0, 10);
		Aluno aluno3 = new Aluno("Pedro", 10, 5);
		
		listaAlunos.add(aluno1);
		listaAlunos.add(aluno2);
		listaAlunos.add(aluno3);
		
		exibirAlunos(listaAlunos);
		
	}

	public static void exibirAlunos(List<Aluno> lista) {
		for (Aluno a : lista) {
			double media;
			media = (a.nota1 + a.nota2) / 2;
			if (media >= 6) {
				System.out.println(a.getNome()+"\tNota1: "
			+a.getNota1()+"\tNota2: "+a.getNota2()+"\tMedia: "+media+"\tAPROVADO");
			} else {
				System.out.println(a.getNome()+"\tNota1: "
			+a.getNota1()+"\tNota2: "+a.getNota2()+"\tMedia: "+media+"\tREPROVADO");
			}
		}
	}
}
