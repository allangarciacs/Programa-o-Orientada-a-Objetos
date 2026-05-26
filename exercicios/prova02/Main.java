package prova2;

public class Main {

	public static void main(String[] args) {
		Reserva[] listaReservas = new Reserva[4];

		listaReservas[0] = new ReservaOnline("Allan", 1, 100, false);
		listaReservas[1] = new ReservaPresencial("Diego", 2, 200, false);
		listaReservas[2] = new ReservaOnline("Maria", 3, 300, false);
		listaReservas[3] = new ReservaPresencial(null, 0, 0, false);
		
		listaReservas[3].setNomeCliente("Pedro");
		listaReservas[3].setNumeroDoQuarto(4);
		listaReservas[3].setValorDaDiaria(400);
		
		// statua atual
		System.out.println("STATUS ATUAL");
		for (Reserva r : listaReservas) {
			System.out.println(r); 
		}
		
		// realizar reservas
		System.out.println("REALIZAR RESERVAS");
		for (Reserva r : listaReservas) {
			r.realizarReserva();
		}
		
		// statua atual
		System.out.println("STATUS ATUAL");
		for (Reserva r : listaReservas) {
			System.out.println(r); 
		}
		
		// cancelar reservas
		System.out.println("CANCELAR RESERVAS");
		for (Reserva r : listaReservas) {
			r.cancelarReserva();
		}
		
		//Reserva[] listaReservas = new ReservaOnline[];
		//ReservaOnline[] listaReservas = new ReservaOnline[];
		//ReservaOnline[] listaReservas = new Reserva[]
	}

}
