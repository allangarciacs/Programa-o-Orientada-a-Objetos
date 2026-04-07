public class Exercicio07B {
    public static void main(String[] args) {
        Pedido p = new Pedido(1, "Teclado", 100, 2);

        System.out.println(p.resumoPedido());
        System.out.println("Total com desconto: " + p.calcularTotal(10));
    }
}