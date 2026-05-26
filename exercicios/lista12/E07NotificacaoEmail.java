package lista12;

public class E07NotificacaoEmail extends E07Notificacao {

	@Override 
	public void enviar() {
		System.out.println("Email enviado");
	}
	
	
	public void enviar(String destinatario) { // sobrecarga
		System.out.println("Email enviado para: "+destinatario);
	}
	
	public void enviar(String dest1, String dest2) {
		System.out.println("Email enviado para: "+dest1+" e "+dest2);
	}	
}
