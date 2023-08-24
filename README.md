# estudos-java

**Revisão dos estudos em Java com Professor Leonardo no site da Udemy.**

### Fundamentos

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


### Classes e Métodos

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

_Método e Construtor_

Anatomia do Método -> após o algoritmo receber sequência de passos, eventualmente essa sequência irá receber parametros de entrada e eventualmente de saída também, mas também pode receber e não retornar nada, não necessariamente receber nada ou sair. 

nomeMetodo(PARAMETRO) { algoritmo
}
 - O método poderia retornar uma string, int ou pode não retornar nada que seria o VOID (ausência de retorno). 

Exemplificação de um método que soma. 

int Somar(nome do Metodo) ( int a, int b){
//uma função que recebe dois parametros de entrada e retorna UM valor.
para retornar deve ser usado RETURN. 
Implementação -> return a+b; 
}
Dentro de uma classe não pode ter dois métodos com mesmo nome e mesmo tipo.

Construtores -> geralmente nome da classe e nome do construtor possui mesmo nome. O construtor padrão é aquele que não recebe nenhum parametro. 
Exemplo: Produto p1 = new Produto();   - trata-se de um construtor padrão a segunda parte. 
Para distinguir um método de construtor é o retorno, construtor NÃO tem retorno. 
- java/classe desafioData exemplifica 3 tipos de uso do construtor.  

### Classe e Instância

Com uso da palavra new (palavra reservada), uma nova instância é criada. A instância terá espaços de memórias. 
Qual a diferença de ter um atributo de classe? Com uso de static, o atributo pertence a classe e será associado ao mesmo. 

Exemplificando: tenho uma Classe Data, essa classe possui dia, mês e ano. Se instancio, posso armazenar na memória determinado valor.
Mas se acontecer de na Classe Data, mas se eu tornar STATIC o dia por exemplo o valor atribuido pertence a classe e não a cada uma das instâncias. 
Se a Classe tiver o dia 3 e ele é static, todas as outras instâncias também terá por dia o 3 e não o valor armazenado na memória instanciada.

_Atribuição por Valor e Atribuição por Referência_

Atribuição por Valor -> Primitivos
Atribuição por Referência -> Objetos 

_*Valores Padrão*_

- na criaçao de byte, short, int, long = 0 
-float, double = 0
-boolean -> false
- chart -> \u000'
Objetos tem por padrão -> null - a variavel não aponta para nenhum endereço de memória. 

_*Arrays*_

-É estático, tamanho fixo. No momento da criação deve terminar o tamanho do Array. 
- Homogêneo, significa que o tipo não pode ser mudado.(os dados contidos nele não pode ser mudado)
- Array é um objeto (possui atributos).
- Array dentro de um Array é uma Matriz. 

_*Equals*_

-É um metodo que está disponivel em todos os metodos em Java. Todo objeto que seja do proprio Java recebe o metodo equals. 

-Retorna boolean. (true/false)

_*HashCode*_

-É mais rápido, comparando inteiros. 
-É uma função que retorna inteiro.

- Resumindo, o método equals() é usado para comparar o valor dos objetos, enquanto o método hashCode() é usado para obter um código hash que representa a identidade do objeto para fins de organização em estruturas de dados.

_*Collections*_

Collection -> É a interface raiz da hierarquia de coleções. Ela define os métodos básicos que todas as coleções devem ter, como add(), remove(), contains() e size().

- *Set*

Não ordernado (por padrão), não indexado(não tem como acessar através do indice), não aceita repetição. 

Set-> É uma interface que estende a interface Collection e representa uma coleção de elementos únicos, ou seja, não permite elementos duplicados. Exemplos de implementações de Set incluem HashSet e TreeSet.
TreeSet -> ordem que foi inserido.
SortSet -> lista de conjunto ordernados. 

- *List*

É parecido com Array, acessa através do indice. 
Indexado e aceita repetição. (de dados)

List -> É uma interface que estende a interface Collection e representa uma sequência ordenada de elementos, onde os elementos podem ser acessados por meio de índices. Alguns exemplos de implementações de List são ArrayList e LinkedList.

- *Map*

Chave/Valor.
Chave não aceita repetição. 
Valor não aceita repetição. 
Map -> É uma interface que mapeia chaves a valores. Cada chave é única e é associada a um valor correspondente. Exemplos de implementações de Map são HashMap, TreeMap e LinkedHashMap.

- *Queue* (Fila)

Implementa fila.
Primeiro que entra e primeiro que sai. 
Offer retorna true ou false. 
Offer e Add -> adicionam elementos na fila, a diferença é o comportamento quando a fila está cheia. 
Peek e Element -> obtem o próximo elemento da fila (sem remover), peek retorna false e element lança uma exceção. 

- *Stack* (Pilha)

Implementa Pilha (stack)
Primeiro que entra, é o ultimo que sai. 

### Orientação a Objeto

- Reuso via composição

- Um objeto é composto por outro objeto que se relacionam entre si.

- Relação um para um: carro -> motor.

- Relação um para n: compra -> itens (vários itens).

- Relação n para n: tios -> sobrinhos.

- #### *Encapsulamento* - um objeto (classe do objeto) precisa estar escondido do mundo exterior. Não é necessário conhecer a fundo o objeto. O que precisa ou não de visibilidade.

* Modificadores de acesso: public, protected, private.

Private: ele só pode ser acessado dentro da própria classe (restrito).
Public: pode ser acessado por todos.
Protected: atributo ou método que pode ser acessado através do mesmo pacote.
- #### *Herança* - também é um reuso de código. A herança é uma relação "é-um", em que a subclasse é um tipo mais específico da superclasse. Isso significa que a subclasse herda os membros (atributos e métodos) da superclasse e também pode adicionar novos membros ou modificar os existentes. Dessa forma, a herança promove a reutilização de código, pois as classes derivadas não precisam reescrever ou reimplementar os membros herdados.

- Superclasse: é mais genérica.
- Subclasse: é mais específica.
- A herança utiliza a palavra-chave extends.

#### *Polimorfismo* -permite tratar objetos de diferentes classes de forma uniforme, desde que compartilhem uma relação de herança ou implementem uma interface em comum. Existem dois tipos principais de polimorfismo: sobrescrita e sobrecarga.

- exemplo: Carro (super classe) -> Civic e Ferrari (classes). 

Civic c = new Civic(); //pode acontecer das duas formas. Do tipo mais espeficio para tipo mais generico.
Carro c = new Civic (); 

Para chamar um construtor na herança da classe pai, usa-se o super() diferentemente do this(). 


getters e setters -> quando se cria atributos dentro de uma classe via de regra colocamos atributos como privatos e usamos getters e setters. 

#### *Interface* - uma interface em Java é uma especificação de um conjunto de métodos e constantes que outras classes podem implementar. Uso da palavra implements na classe. 

- Classe concreta -> todos os metodos estão definidos ou implementados. (todos possui corpo) geralmente por uso de chaves dentro a implementação. 

A interface por outro lado os metodos não tem corpo. 

- Classe abstrata -> pode ter metodos abstratos ou pode ser completamente concreta, todos os metodos definidos. A classe abstrata não pode ser instanciada. 
O uso da palavra abstract impede um novo instanciamento. 


- Na criação de metódo, por exemplo estacionar (Civic c) {..}
metodo especifico. Mas pode ser usado como um modelo mais generico, por exemplo no lugar de Civic, passar Carro que é mais generico. 


#### *Abstração* - simplificação, algo dentro do mundo real e colocar dentro do software que permite modelar objetos do mundo real em termos de suas características essenciais e comportamentos relevantes, sem se preocupar com os detalhes internos de implementação.

### Stream API

Dentro da streams existe várias sequências de metodos, operadores..

- Built Op (Construção) -> criar streams, pode ser criada de formas diferentes com metodos estaticos, pode ser através de uma lista. É chamada a operação de construção. 

- Intermediario Ops -> Transforma os dados passando por várias funções, uma função pequena que tenha poucas responsabilidades e vai encadeando informações. Facilmente encadeadas uma atras da outra. As intermediarias sempre retorna uma nova stream. 

- Terminal Ops (Terminais) -> Entre as operações intermediarias, a operação final é a ponta do processo. (final) 

O Built inicio do processo, intermediario são as operações que podem ser encadeadas em quantos passos precisar para implementar algoritmo. (inicio, meio e fim).


- Streams Ordernadas -> uma sequência a ser seguida. 

- Não ordernadas -> não tem necessariamente uma ordernação. 

- Streams Sequencial -> Sempre um dado por vez, processa um produto, depois processa outro produto. 

- Stream Paralela -> são criadas varias linhas de execução para ir processando os dados de forma paralela, indepedente de como será implementado.
### Tratamento de Exceções em Java:
O tratamento de exceções em Java é uma técnica usada para lidar com situações inesperadas ou erros que podem ocorrer durante a execução de um programa. Isso ajuda a tornar o código mais robusto e a fornecer informações úteis sobre o erro para que ele possa ser corrigido ou tratado adequadamente. O tratamento de exceções envolve os seguintes conceitos:

Try-Catch Blocks: Um bloco try é usado para envolver o código que pode gerar uma exceção. Dentro do bloco try, você pode usar um ou mais blocos catch que capturam e tratam as exceções específicas que podem ocorrer.

Exceções Verificadas (Checked Exceptions): São exceções que o compilador verifica se são tratadas ou declaradas no método. Para tratá-las, use blocos catch correspondentes ou declarações throws no cabeçalho do método.

Exceções Não Verificadas (Unchecked Exceptions): Também conhecidas como exceções de tempo de execução, não precisam ser tratadas ou declaradas explicitamente. Elas ocorrem durante a execução e geralmente indicam erros no código.

Bloco Finally: Pode ser usado após um bloco try-catch para conter código que sempre será executado, independentemente de ocorrer ou não uma exceção. É usado para liberar recursos ou realizar ações de limpeza.

Declaração Throws: Pode ser usada para propagar a exceção para o chamador do método, em vez de tratá-la no próprio método.

Cadeia de Exceções (Exception Chaining): Permite encapsular uma exceção original dentro de outra exceção. Isso pode ser útil para fornecer informações mais detalhadas sobre a causa do erro.

Personalização de Exceções: Você também pode criar suas próprias classes de exceção personalizadas estendendo a classe Exception ou RuntimeException, de acordo com a natureza da exceção.

Método getMessage(): Todas as exceções possuem um método getMessage() que retorna uma descrição do erro, que pode ser útil para registro ou depuração.

### BANCO DE DADOS 

Comandos SQL:

*DML - Data Manipulation Language:*
#### SELECT: Recupera dados de uma ou mais tabelas no banco de dados, permitindo que os usuários especifiquem as colunas, filtros e ordenações desejados.

#### INSERT: Insere novos registros em uma tabela, adicionando dados às colunas especificadas.

#### UPDATE: Modifica registros existentes em uma tabela, permitindo a atualização dos valores das colunas.

#### DELETE: Remove registros de uma tabela com base em critérios específicos, eliminando os dados.

*DDL - Data Definition Language:*

#### CREATE: Cria um novo objeto de banco de dados, como uma tabela, índice, visão ou procedimento armazenado.

#### ALTER: Modifica a estrutura de um objeto existente no banco de dados, como adicionar ou remover colunas de uma tabela.

#### DROP: Exclui um objeto do banco de dados, como uma tabela, índice ou visão.

*DCL - Data Control Language:*

#### GRANT: Concede permissões específicas a usuários ou funções, permitindo que eles acessem e executem operações em objetos de banco de dados.

#### DENY: Nega explicitamente permissões a usuários ou funções, restringindo o acesso a objetos de banco de dados.

#### REVOKE: Remove as permissões anteriormente concedidas a usuários ou funções.

*TCL - Transaction Control Language:*
#### COMMIT: Confirma uma transação, tornando as alterações permanentes no banco de dados.

#### ROLLBACK: Desfaz uma transação, revertendo todas as alterações realizadas na transação.

#### SAVEPOINT: Cria um ponto de salvamento dentro de uma transação, permitindo a restauração para esse ponto específico em caso de necessidade.

#### RELEASE: Libera um ponto de salvamento criado com o comando SAVEPOINT, permitindo que as alterações após esse ponto sejam confirmadas.



#### Tipos de JOINS

*Inner Join* -> pega os dados de uma chave primaria (primary key) e de uma chave estrangeira(foregein key).

A consulta do tipo inner é apenas relacionado entre duas tabelas. Aquilo que está fora das duas tabeolas é Outer (tudo aquilo que está fora).

*Left Join* -> é aquilo que é comum mas ao lado esquerdo da relação. Por exemplo da tabela A e B. Pega-se tudo da tabela A, que seria o lado esquerdo + inner (aquilo que está no meio). 

*Right Join* -> é aquilo que é o comum mas ao lado direito da relação, é oposto de left.

*Full Join* -> é possível simular fazendo o resultado de Left e Right Join com Inner. (não suportado por outros bancos mas suportado por outros bancos)
