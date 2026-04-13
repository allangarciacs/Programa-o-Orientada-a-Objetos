package lista07;

public class Ex04Carro {
	private String marca;
	private String modelo;
	private int ano;	
	
	public Ex04Carro(String marca, String modelo, int ano) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);
	}
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public int getAno() {
		return ano;
	}
	
	public void setMarca(String marca) {
		if(marca.isBlank() || marca.isEmpty() || marca == null) {
			System.out.println("Marca invalido");
		} else {
			this.marca = marca;
		}
	}
	
	public void setModelo(String modelo) {
		if(modelo.isBlank() || modelo.isEmpty() || modelo == null) {
			System.out.println("Modelo invalido");
		} else {
			this.modelo = modelo;
		}
	}
	
	public void setAno(int ano) {
		if (ano < 0 || ano > 2026) {
			System.out.println("Ano invalido");
		} else {
			this.ano = ano;
		}
		
	}
	
	public void exibeDetalhes(String marca, String modelo, int ano) {
		System.out.println("\nInfos do carro:");
		System.out.println("Marca: "+getMarca());
		System.out.println("Modelo: "+getModelo());
		System.out.println("Ano: "+getAno());
	}
	
	
}
