package lista12;

public class E08Reserva {
	protected String nome;
	
	public E08Reserva(String nome) {
		this.nome = nome;
	}
	
	public void reservar() {
		System.out.println("Reserva adicionada no nome de "+nome);
	}
	
	public void cancelar() {
		System.out.println("Reserva cancelada");
	}
}
