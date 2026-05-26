package prova2;

public class Reserva {
	protected String nomeCliente;
	protected int numeroDoQuarto;
	protected double valorDaDiaria;
	protected boolean status;
	
	public Reserva(String nomeCliente, int numeroDoQuarto, double valorDaDiaria, boolean status) {
		this.nomeCliente = nomeCliente;
		this.numeroDoQuarto = numeroDoQuarto;
		this.valorDaDiaria = valorDaDiaria;
		this.status = status;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public int getNumeroDoQuarto() {
		return numeroDoQuarto;
	}
	
	public double getValorDaDiaria() {
		return valorDaDiaria;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public void setNomeCliente(String nomeCliente) {
		if (nomeCliente.isEmpty() || nomeCliente.isBlank()) {
			System.out.println("Nome nao pode ser vazio!");
		} else {
		this.nomeCliente = nomeCliente;
		}
	}

	public void setNumeroDoQuarto(int numeroDoQuarto) {
		if (numeroDoQuarto <= 0) {
			System.out.println("Numero do quarto nao pode ser negativo!");
		} else {
			this.numeroDoQuarto = numeroDoQuarto;
		}
	}
	
	public void setValorDaDiaria(double valorDaDiaria) {
		if (valorDaDiaria < 0) {
			System.out.println("Valor da diaria nao pode ser negativo!");
		} else {
		this.valorDaDiaria = valorDaDiaria;
		}
	}

	public void setStatus(boolean status) {
		if (status)
		this.status = status;
	}

	public void realizarReserva() {
		System.out.println("Reserva generica realizada!");
		status = true;
	}
	
	public void cancelarReserva() {
		System.out.println("Cancelamento generico realizado!");
		status = false;
	}

	@Override
	public String toString() {
		return "Reserva [Nome = " + nomeCliente + ", Quarto = " + numeroDoQuarto + ", Diaria = "
				+ valorDaDiaria + ", Status = " + status + "]";
	}
	
	
}
