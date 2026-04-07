package pkg;

public class Exercicio01B {

    public static void main(String[] args){

        Exercicio01A item = new Exercicio01A("abacaxi",10.0,5);

        System.out.println("Nome: "+item.descricao);

        if(!item.temItens()){
            System.out.println("Sem estoque");
        }else{
            System.out.println("Qtd atual: "+item.qtd);
        }

        System.out.println("Total R$: "+item.totalEstoque());

        item.adicionar(5);
        System.out.println("Depois de adicionar: "+item.qtd);

        boolean ok = item.venderItem(2);

        if(ok){
            System.out.println("Venda ok");
        } else System.out.println("Falha na venda");

        System.out.println("Final: "+item.qtd);
        System.out.println("Total final: "+item.totalEstoque());
    }
}