public class Exercicio10B {
    public static void main(String[] args) {
        Time t = new Time("Grêmio", 2, 1);

        t.marcarGol();
        t.sofrerGol();

        System.out.println("Saldo: " + t.saldoGols());
        System.out.println("Resultado: " + t.resultadoPartida());
    }
}