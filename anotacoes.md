## Anotações da disciplina de Programação Orientada a Objetos
<pre>
1) Explique os seguintes conceitos de POO em Java:
a) Classe                                       
  É uma estrutura composta de conjuntos de objetos com características parecidas. -> conjunto de objetos 
b) Objeto
  É um instância de uma classe.                                                   -> instância de uma classe                           
c) Atributo
  Variáveis na linguagem estruturada.                                             -> caractetísticas do objeto
d) Método
  Funções na linguagem estruturada.                                               -> funcionalidades do objeto
e) Encapsulamento
  Empacotamento dos atributos e métodos numa classe.

2) Qual a diferença entre método e construtor em uma classe? Dê um exemplo.
  
O método é uma função da classe que executa alguma ação, ele pode receber parâmetros e retornar algum valor,
já o contrutor é um método especial usado para inicializar um objeto, ele é chamado automaticamente ao criar
o objeto com 'new', tem o mesmo nome da classe e não tem retorno. 
                                                                    Método     -> faz algo
                                                                    Construtor -> cria/inicializa o objeto
Exemplo:
```java
class Carro {
    String marca;
    String modelo;

    // Construtor
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método
    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}

public class Main {
    public static void main(String[] args) {
        // Chamando o construtor
        Carro c1 = new Carro("VW", "Gol");

        // Chamando o método
        c1.exibirDados();
    }
}
```
3) O que são modificadores de acesso em Java? Cite e explique brevemente os principais.
  
São palavras-chave que determinam o nível de acesso ao membros de uma classe (atributos e métodos). Exemplos:
public: deixa qualquer classe acessar o membro;
private: permite que somente a própria classe possa acessar o membro;
protected: permite que as classes e subclasses do mesmo pacote possam acessar o membro;
default: é a classe padrão (se nenhuma for identificada essa sera usada), ela permite que as classes do mesmo
pacote possam acessar o membro.

4) Qual a diferença entre os tipos de dados String, int e boolean? Dê um exemplo de uso de cada um.
  
String  -> serve para guardar texto. 
int     -> guarda números inteiros (sem casas decimais)
boolean ->
  
Exemplos:
```java
public class Exemplo {
    public static void main(String[] args) {
        // String → texto
        String nome = "Allan";

        // int → número inteiro
        int idade = 19;

        // boolean → verdadeiro ou falso
        boolean maiorDeIdade = true;

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(maiorDeIdade);
    }
}
```
5) Explique o que é e para que serve o método toString() em uma classe.
  
É um método da classe Object. Ele é usado para converter um objeto em texto (String).  

6) Descreva o que acontece quando se tenta acessar um atributo privado diretamente fora da classe. Como
é possível acessá-lo de forma correta?

O java não permite o acesso, e ocorre um erro de compilação. Isso acontece por causa do encapsulamento,
que proteje os dados da classe. Para acessa-los de forma correta, é necessário métodos públicos. 
</pre>



