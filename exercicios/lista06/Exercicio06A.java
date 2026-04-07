public class Carro {
    String modelo;
    int velocidadeAtual;
    int velocidadeMaxima;

    public Carro(String modelo, int vAtual, int vMax) {
        this.modelo = modelo;
        this.velocidadeAtual = vAtual;
        this.velocidadeMaxima = vMax;
    }

    public void acelerar(int valor) {
        velocidadeAtual = velocidadeAtual + valor;

        if (velocidadeAtual > velocidadeMaxima) {
            velocidadeAtual = velocidadeMaxima;
        }
    }

    public void frear(int valor) {
        velocidadeAtual = velocidadeAtual - valor;

        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }

    public boolean atingiuVelocidadeMaxima() {
        return velocidadeAtual == velocidadeMaxima;
    }

    public double calcularTempoViagem(double distancia) {
        if (velocidadeAtual == 0) {
            return 0;
        }
        return distancia / velocidadeAtual;
    }
}