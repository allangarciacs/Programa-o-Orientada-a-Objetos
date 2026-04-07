public class Exercicio06B {
    public static void main(String[] args) {
        Carro c = new Carro("Fusca", 0, 120);

        c.acelerar(100);
        System.out.println(c.calcularTempoViagem(200));
        c.frear(50);
        System.out.println(c.velocidadeAtual);
    }
}