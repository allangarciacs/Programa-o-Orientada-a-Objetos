package pkg;

public class E08Usuario {
	private String nomeUsuario;
	private String senha;
	private boolean logado = false;
	
	public E08Usuario(String nomeUsuario, String senha, boolean logado) {
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
		this.logado = logado;
	}
	
	public void login(String usuario, String senhaDig) {
		if (usuario.equals(nomeUsuario) && senhaDig.equals(senha)) {
			System.out.println("Login sucedido");
			logado = true;
		} else if (usuario.equals(nomeUsuario) && !senhaDig.equals(senha)) {
			System.out.println("Senha incorreta");
		} else if (!usuario.equals(nomeUsuario) && senhaDig.equals(senha)) {
			System.out.println("Usuario nao encontrado");
		} else {
			System.out.println("Conta nao encontrada");
		}
	}
	
	public void logout() {
		logado = false;
	}
	
	public void exibirStatus() {
		if (logado == true) { 
			System.out.println("Voce esta logado");
		} else {
			System.out.println("Voce nao esta logado");
		}
	}
	
}
