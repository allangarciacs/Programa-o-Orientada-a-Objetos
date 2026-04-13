package lista07;

public class Ex07Carro {
	private String placa;
	private int numChassi;
	
	public Ex07Carro(String placa, int numChassi) {
		this.setPlaca(placa);
		this.setNumChassi(numChassi);
	}
	
	public String getPlaca() {
		return placa;
	}
	public int getNumChassi() {
		return numChassi;
	}
	
	public void setPlaca(String placa) {
		if(placa.isBlank() || placa.isEmpty() || placa == null) {
			System.out.println("Nome invalido");
		} else {
			this.placa = placa;
		}
	}
	public void setNumChassi(int numChassi) {
		if (numChassi < 0) { 
			System.out.println("Numero invalido");
		} else {
			this.numChassi = numChassi;
		}
	}
	
	public void acelerar() {
		System.out.println("Carro acelerando");
	}
	
	public boolean frear() {
		System.out.println("Carro freando");
		return true;
	}
	
}
