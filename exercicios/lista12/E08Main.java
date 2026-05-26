package lista12;

public class E08Main {

	public static void main(String[] args) {
		
		E08Reserva[] reservas = new E08Reserva[3];
		
		reservas[0] = new E08ReservaDeHotel("Allan");
		reservas[1] = new E08ReservaDeVoo("Fabi");
		reservas[2] = new E08ReservaDeVoo("Diego");
	
		reservas[0].reservar();
		reservas[1].reservar();
		reservas[2].reservar();
		
		E08ReservaDeVoo voo1 = (E08ReservaDeVoo) reservas[1];
		voo1.reservar("Economica");
		
		E08ReservaDeVoo voo2 = (E08ReservaDeVoo) reservas[2];
		voo2.reservar("Executiva", 22);
		
		voo1.reservar("Executiva", 10);
		
		System.out.println();
		
		for (E08Reserva reserva : reservas) {
			reserva.cancelar();
			System.out.println("-------------------------");
		}
	}
}
