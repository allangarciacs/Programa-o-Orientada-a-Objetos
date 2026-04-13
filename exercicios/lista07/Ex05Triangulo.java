package lista07;

public class Ex05Triangulo {
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	public Ex05Triangulo(double ladoA, double ladoB, double ladoC) {
		this.setLadoA(ladoA);
		this.setLadoB(ladoB);
		this.setLadoC(ladoC);
	}
	
	public double getLadoA() {
		return ladoA;
	}
	public double getLadoB() {
		return ladoB;
	}
	public double getLadoC() {
		return ladoC;
	}
	
	public void setLadoA(double ladoA) {
		if (ladoA <= 0) {
			System.out.println("Lado 'A' invalido, n pode ser 0 ou negativo");
		} else {
			this.ladoA = ladoA;
		}
	}
	
	public void setLadoB(double ladoB) {
		if (ladoB <= 0) {
			System.out.println("Lado 'B' invalido, n pode ser 0 ou negativo");
		} else {
			this.ladoB = ladoB;
		}
	}
	
	public void setLadoC(double ladoC) {
		if (ladoC <= 0) {
			System.out.println("Lado 'C' invalido, n pode ser 0 ou negativo");
		} else {
			this.ladoC = ladoC;
		}
	}
	
	public void verificaEquilatero(double ladoA, double ladoB, double ladoC) {
		if (ladoA == ladoB && ladoA == ladoC) {
			System.out.println("Eh equilatero");
		} else { 
			System.out.println("Nao eh equilatero");
		}
	}
	
}
