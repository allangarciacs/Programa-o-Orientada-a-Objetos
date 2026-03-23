package lista04;

public class F2Aluno {

	public static void main(String[] args) {
		
		F1Aluno a1 = new F1Aluno("Allan", "12345667");
		F1Aluno a2 = new F1Aluno("21/06/2006");
		F1Aluno a3 = new F1Aluno("Jose","01/01/2001",2020);
		
		System.out.println("Dados do aluno 01 feitos no contrutor 1:");
		System.out.println("Nome: "+a1.nome+" - Matricula: "+a1.matricula);
		System.out.println("---------------------------------------------");
		
		System.out.println("Dados do aluno 02 feitos no contrutor 2:");
		System.out.println("Data de nascimento: "+a2.dataNascimento);
		System.out.println("---------------------------------------------");
		
		System.out.println("Dados do aluno 03 feitos no contrutor 3:");
		System.out.println("Nome: "+a3.nome+" - Data de nascimento: "
					+a3.dataNascimento+" - Ano de ingresso: "+a3.anoIngresso);
		System.out.println("---------------------------------------------");
		
		
	}

}
