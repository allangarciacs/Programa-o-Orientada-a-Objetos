package lista12;

public class E10Main {

	public static void main(String[] args) {
		E10Aluno[] listaAlunos =  new E10Aluno[3];
		
		listaAlunos[0] = new E10Aluno("Allan", 6, 5);
		listaAlunos[1] = new E10Aluno("Pedro", 10, 8);
		listaAlunos[2] = new E10Aluno("Fabi", 9, 7);
		
		for (E10Aluno a : listaAlunos) {
			a.calcularMedia();
			System.out.println("----------------------");
		}
	}
}
