package lista04;

public class F1Aluno {
	public String nome;
	public String matricula;
	public String dataNascimento;
	public int anoIngresso;
	
	public F1Aluno(String n, String m) {
		this.nome = n;
		this.matricula = m;
	}
	
	public F1Aluno(String dn) {
		this.dataNascimento = dn;
	}
	
	public F1Aluno(String n, String dn, int a) {
		this.nome = n;
		this.dataNascimento = dn;
		this.anoIngresso = a;
	}

}
