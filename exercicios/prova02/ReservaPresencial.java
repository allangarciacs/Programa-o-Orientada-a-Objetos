package prova2;

public class ReservaPresencial extends Reserva {
	public ReservaPresencial(String nomeCliente, int numeroDoQuarto, double valorDaDiaria, boolean status) {
		super(nomeCliente, numeroDoQuarto, valorDaDiaria, status);
	}
	
	public void realizarReserva(String nome, int numeroDoQuarto, double valorDaDiaria) {
		System.out.println("Reserva presencial realizada no nome de "+nome+", no quarto numero "+numeroDoQuarto+
						" pela diaria de "+valorDaDiaria);
	}
	
	@Override
	public void cancelarReserva() {
		System.out.println("O cancelamento presencial pode ser realizado na recepcao. Reserva presencial cancelada!");
	}

}
