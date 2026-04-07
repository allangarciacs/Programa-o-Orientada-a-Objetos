public class Exercicio04B {
    public static void main(String[] args) {
        Retangulo r = new Retangulo(4, 4);

        System.out.println(r.calcularArea());
        System.out.println(r.calcularPerimetro());
        System.out.println(r.calcularDiagonal());
        System.out.println(r.ehQuadrado());
    }
}