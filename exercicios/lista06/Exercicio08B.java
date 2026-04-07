public class Exercicio08B {
    public static void main(String[] args) {
        Filme f = new Filme("Jose o Filme", 100, 10);

        System.out.println(f.descricaoFilme());
        System.out.println("Duração em horas: " + f.converterDuracaoHoras());
        System.out.println("Pode assistir? " + f.podeAssistir(10));
    }
}