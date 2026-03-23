package lista04;

public class C1Pessoa {
	public String nome;
	public String email;
	public String dataNascimento;
	public String endereco;
	public boolean admin;
	
	public void atribuirDados(String n, String e, String data, String end, boolean adm) {
		nome = n;
		email = e;
		dataNascimento = data;
		endereco = end;
		admin = adm;
}
	
	public void retornaEmail() {
		System.out.println("Email do "+nome+": "+email);
	}
	
	public void promoverAdmin() {
		if (admin) {
			admin = false;
		} else { 
			admin = true;
		}
	}
	
	public void mostrarDados() {
		System.out.println("Nome: "+nome);
		System.out.println("Email: "+email);
		System.out.println("Data de nascimento: "+dataNascimento);
		System.out.println("Endereco: "+endereco);
		if (admin) {
			System.out.println("Eh admin");
		} else {
			System.out.println("Nao eh admin");
		}
		}

}
