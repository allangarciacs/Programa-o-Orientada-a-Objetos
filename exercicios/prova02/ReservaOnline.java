package prova2;

public class ReservaOnline extends Reserva {
	public ReservaOnline(String nomeCliente, int numeroDoQuarto, double valorDaDiaria, boolean status) {
		super(nomeCliente, numeroDoQuarto, valorDaDiaria, status);
	}

	public void realizarReserva(String nome) {
		System.out.println("Reserva online realizada no nome de "+nome);
		status = true;
	}
	
	public void realizarReserva(String nome, int cupomDesconto) {
		System.out.println("Reserva online realizada no nome de "+nome+" com cupom de desconto no valor de "+cupomDesconto);
		status = true;
	}
	
	@Override
	public void cancelarReserva() {
		System.out.println("O cancelamento so pode ocorrer ate 24 hrs antes da hospedagem!. Reserva online cancelada.");
		status = false;
	}

}
