package lista04;

public class A1Disciplina {
	public String nome;
	public float cargaHoraria;
	public String nomeProfessor;
	
	public void atribuirValores(String n, float ch, String np) {
		nome = n;
		cargaHoraria = ch;
		nomeProfessor = np;	
	}
		
	public void mostrarValores() {
		System.out.println("Nome: "+nome);
		System.out.println("Carga horaria: "+cargaHoraria);
		System.out.println("Nome do Professor: "+nomeProfessor);
	}
	
}
