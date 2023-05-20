# estudo-java

**Revisão dos estudos em Java**

_Fundamentos_

- uso de variavel -> tem por tipo, um nome ou valor inicial que pode ser alterado ao longo do tempo, ou seja, é comum que seja usado em várias partes do código. 
- uso de constante -> é uma variavel cujo valor não pode ser alterado, para isso é definido a palavra "final".

- inferência de tipo -> permite que o compilador com base do contexto do código infira um tipo de variavel. 
exemplificando: o uso de uma var com determinado nome. var nome = "Nome da Pessoa", o compilador infere que esse tipo de variavel é uma String. 

- tipos primitivos -> são primitivos porque não são objetos, métodos ou atributos, são usados para declarar variaveis. 
são eles: byte, short, int, long, float, double, char, boolean. 
lembrando que cada um armazena determinado valor na memória. 

- notações ponto -> quando se tem tipos que não são primitivos, que não são nenhum dos citados acima poderá ter a notação ponto, trata-se do uso de um ponto após uma referência que tem outras funcionalidades.  

- wrapper -> os wrappers são classes que envolvem os tipos primitivos com a permissão que seja tratados como objetos. (empacotamento no sentido literal). exemplificando: o byte se torna Byte, sendo que o segundo envolve o tipo primitivo do primeiro. 
obs: eles fornecem metodos para converter valores entre tipos primitivos e objetos, bem como realização de operações lógicas e matemáticas. 

conversão de número para string -> uso do .to.String

conversão de string para número -> uso de Integer.pasrInt ou Double.parseDouble.

operadores -> unários, binários e ternário. 
exemplificando: 
unários tem um único operando, com uso por exemplo. (a++) (um operando)
binários tem operador soma, mas com uso de dois números. (3+2) (2 operandos)
ternário caso especial, determinado valor com uma operação (?) e outro valor (:) outro valor. (3 operandos)

operadores aritméticos -> aqueles usados em operações matematicas. (soma, subtração, multiplicação, divisão e módulo. 
uso do módulo: utiliza-se para obter resto de uma divisão inteira. 

operadores lógicos (TABELA VERDADE) -> && (E) - condição. 
|| (OU) - basta uma expressão verdadeira. 
! (NÃO) - nega uma expressão, dados como verdadeiro (true) ou falso (false). 

operadores relacionais -> usados para comparar valores de expressões lógicas. 

operadores relacionais -> booleanos, dados como verdadeiro (true) ou falso (false). 

operadores ternários -> são operadores condicionais que permitem fazer condições em uma única linha de código.
geralmente é usado a (?) para separar expressão verdadeiro ou falso. 
pode ser usado (:) para separar o valor atribuido quando de uma expressão verdadeira ou falsa. 


_Classes e Métodos_
- revisão sobre classe -> até a fase de controle foi apenas criado o main, mas agora terá divisões. 
uma classe DEFINE um bloco de código. 
temos public class (nome da Classe) {
bloco de código
}

- Anatomia de uma classe -> class (nome reservado) por pratica começa com letra maiúscula, geralmente antes da CLASS vem o modificador. 

modificadores - class Nome ... {
//corpo 
atributos e comportamentos(termos de ação). 
}

- atributos -> dados, exemplo: do tipo int, boolean, Date, String (primitivos ou não).
- comportamentos -> métodos, exemplo: são os comportamentos, uso de estruturas de controle ou não.  
atributos e comportamentos são MEMBROS da classe que são dados que tem estruturas de dados de como uma forma será comportada e os métodos que é nossos algoritmos. 

- A ideia da classe é justamente a junção de ambos. (atributos e métodos)

Uma classe define um tipo personalizado ou uma estrutura de dados. A classe representa uma abstração (uma simplificação), uma modelação do mundo real para desenvolvimento de um software. 
A partir de uma classe (estrutura de dados) criamos objetos que representa os dados.  
Objeto == Instância (são sinônimos). 

_Relação entre Classe e Objeto_

Classe (Molde) - > pode criar outras que são denominados de instâncias, ou seja, o molde da classe pode ser aplicado para outras instâncias (objetos), os valores podem mudar mas a estrutura em si continua a mesma. Exemplo: uma calça, temos o molde e podemos criar varios tipos de calças seja de seda, algodão etc. 

Em contexto de Programação, temos um Produto (classe) que possui 3 atributos (nome, preço, desconto - tipos) mas temos OBJETOS (instâncias) desse produto que o eventualmente terá nome, preço e desconto. 

O construtor é um metodo especial, responsável a partir de uma classe cria um objeto. 

- Membros de uma classe -> atributos, métodos e construtores. 
- Acessar os membros -> notação ponto (.) objeto.membro - a partir de um objeto consegue acessar os membros dele, eventualmente de uma classe também. 
