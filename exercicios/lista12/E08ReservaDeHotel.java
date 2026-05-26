package lista12;

public class E08ReservaDeHotel extends E08Reserva {
	public E08ReservaDeHotel(String nome) {
		super(nome);
	}
	
	public void reservar() {
		System.out.println("Reserca de hotel adicionada no nome de "+nome);
	}
	
	@Override
	public void cancelar() {
		System.out.println("Reserva de hotel no nome de "+nome+" cancelada");
		System.out.println("'politicas de cancelamento de hotel'");
	}
}
