package lista07;

public class Ex08Retangulo {
	private int x;
	private int y;
	
	public Ex08Retangulo(int x, int y) {
		this.inserirLados(x, y);
	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public void inserirLados(int x, int y) {
		if (x <= 0 || y <= 0) {
			System.out.println("Nao pode ser 0 ou negativo");
		} else {
			this.x = x;
			this.y = y;
		}
	}
	
	public void calculaArea(int x, int y) {
		int area = x * y;
		System.out.println("Area: "+area);
	}
}
