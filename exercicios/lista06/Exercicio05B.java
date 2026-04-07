public class Exercicio05B {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("João", 2000, 5);

        System.out.println(f.calcularPagamentoTotal());
        f.adicionarHorasExtras(3);
        System.out.println(f.calcularPagamentoTotal());
        System.out.println(f.salarioAnual());
    }
}