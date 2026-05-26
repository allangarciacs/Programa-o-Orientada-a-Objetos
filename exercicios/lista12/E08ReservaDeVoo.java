package lista12;

public class E08ReservaDeVoo extends E08Reserva {
	public E08ReservaDeVoo(String nome) {
		super(nome);
	}
	
	public void reservar() {
		System.out.println("Reserva de voo adicionda no nome de "+nome);
	}
	
	public void reservar(String tipo) {
		System.out.println("Reserva "+tipo+" adicionada no nome de "+nome);
	}
	
	public void reservar(String tipo, int cadeira) {
		System.out.println("Reserva de voo adicionada na classe "+tipo+" para o"
				+ " banco numero "+cadeira+" no nome de "+nome);
	}
	
	@Override
	public void cancelar() {
		System.out.println("Reserva de voo no nome de "+nome+" cancelada");
		System.out.println("'politacas de cancelamento de voo'");
	}
}
