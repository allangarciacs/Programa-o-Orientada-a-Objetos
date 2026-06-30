## Trabalho avaliativo de arquivos
* Utilizando Java, manipulação de arquivos e orientação a objetos, desenvolva um sistema de cadastro de veículos.

## Parte 1
### O sistema deverá exibir um menu em laço infinito com as seguintes opções:
<pre>
1 - Cadastrar veículo
2 - Alterar quilometragem do veículo
3 - Excluir veículo pelo número da placa
4 - Sair do sistema
</pre>

### Requisitos:
<pre>
* A manipulação deve ser feita através de objetos da classe Veiculo e de uma lista de veículos.
* Antes de gravar os dados no arquivo, o veículo deve ser instanciado como objeto, adicionado à lista e a lista deve ser atualizada no arquivo.
* O armazenamento dos dados deve ser feito em um arquivo texto. Será considerado um diferencial se o aluno utilizar serialização.
</pre>

### Classe Veiculo deve conter:
<pre>
* placa (String)
* modelo (String)
* marca (String)
* ano de fabricação (int)
* quilometragem (double)
  
.. Todos os atributos devem ter métodos get.
.. Apenas a quilometragem poderá ter um método set.
</pre>

### Apresentação:
* Não é permitido o uso de ferramentas como ChatGPT, GitHub Copilot ou semelhantes. O desenvolvimento deve ser feito com o material apresentado e trabalhado em aula.

## Parte 2 - Socket
<pre>
* Utilizando a base desenvolvida de cadastro de veículos, agora implemente uma aplicação cliente x servidor
* No cliente é onde ficará a lista e o arquivo de veículos cadastrado.
* A aplicação cliente não terá acesso a lista e deverá ler os dados de um veículo para ser cadastrado.
* A aplicação cliente deverá instanciar um objeto de veículo e enviar um objeto para o servidor para ser cadastrado
* No servidor, deverá ser cadastrado e deverá retornar para o cliente se o cadastro foi efetuado com sucesso ou não
</pre> 
