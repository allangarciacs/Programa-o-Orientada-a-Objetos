package lista12;

public class E07Main {

	public static void main(String[] args) {
		
		E07NotificacaoEmail email = new E07NotificacaoEmail();
		E07NotificacaoApp notAPP = new E07NotificacaoApp();
		
		email.enviar();
		
		// sobrecarga c 1 destinatario
		email.enviar("allan@ufn.com");
		
		// sobrecarga c mais d um destinatario
		email.enviar("jose@ufn.com", "pedro@ufn.com");
		
		notAPP.enviar();
	}
}
