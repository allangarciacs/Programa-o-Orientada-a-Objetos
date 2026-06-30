package avaliacao;

import java.io.Serializable;

public class Veiculo implements Serializable {
	private String placa;
	private String modelo;
	private String marca;
	private int anoFab;
	private double quilometragem;
	
	public Veiculo(String placa, String modelo, String marca, int anoFab, double quilometragem) {
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.anoFab = anoFab;
		this.quilometragem = quilometragem;
	}

	public double getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}

	public String getPlaca() {
		return placa;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public int getAnoFab() {
		return anoFab;
	}
	
}
