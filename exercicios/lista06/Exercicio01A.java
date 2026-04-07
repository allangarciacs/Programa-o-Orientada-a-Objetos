public class Exercicio01B {
    public static void main(String[] args) {
        Produto p = new Produto("Mouse", 50, 10);

        System.out.println(p.calcularValorTotalEstoque());
        System.out.println(p.temEstoque());

        p.vender(5);
        p.adicionarEstoque(3);

        System.out.println(p.calcularValorTotalEstoque());
    }
}