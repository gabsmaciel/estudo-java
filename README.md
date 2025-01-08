# Estudos em Java

Revisão dos estudos em Java com o Professor Leonardo no site da Udemy.

## Fundamentos

- **Uso de variável**: Uma variável possui um tipo, um nome e um valor inicial que pode ser alterado ao longo do tempo. Ela é comum em várias partes do código.
- **Uso de constante**: Uma constante é uma variável cujo valor não pode ser alterado, sendo definido pela palavra-chave `final`.
- **Inferência de tipo**: Permite ao compilador, com base no contexto do código, inferir o tipo da variável. Exemplo: `var nome = "Nome da Pessoa"`, onde o compilador infere que o tipo da variável é `String`.
- **Tipos primitivos**: São tipos de dados básicos usados para declarar variáveis, como: `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`. Cada tipo armazena valores diferentes na memória.
- **Notação ponto**: Usada para acessar membros de tipos não primitivos (objetos), por exemplo, ao acessar métodos ou atributos de uma classe.
- **Wrapper classes**: Classes que envolvem tipos primitivos, permitindo que sejam tratados como objetos. Exemplo: o tipo `byte` se torna `Byte`. Elas fornecem métodos para conversão de tipos primitivos para objetos e para realizar operações matemáticas e lógicas.
- **Conversão de número para string**: Utiliza o método `.toString()`.
- **Conversão de string para número**: Utiliza métodos como `Integer.parseInt()` ou `Double.parseDouble()`.
- **Operadores**:
  - **Unários**: Operam em um único operando (ex: `a++`).
  - **Binários**: Operam em dois operandos (ex: `3 + 2`).
  - **Ternários**: Usam uma condição para determinar um valor (ex: `condição ? valor1 : valor2`).
- **Operadores aritméticos**: São usados em operações matemáticas, como soma, subtração, multiplicação, divisão e módulo. O módulo (`%`) retorna o resto de uma divisão inteira.
- **Operadores lógicos**: 
  - `&&` (E): Retorna `true` se ambas as expressões forem verdadeiras.
  - `||` (OU): Retorna `true` se ao menos uma expressão for verdadeira.
  - `!` (NÃO): Nega uma expressão.
- **Operadores relacionais**: Usados para comparar valores, retornando valores booleanos.
  
## Classes e Métodos

- **Classe**: É a definição de um bloco de código que descreve o comportamento e os dados de um tipo de objeto.
  - Exemplo: `public class NomeDaClasse { // corpo da classe }`
- **Anatomia de uma classe**:
  - `class` (nome reservado) geralmente começa com letra maiúscula.
  - Pode ter modificadores (como `public`, `private`) antes do nome da classe.
- **Atributos e Comportamentos**:
  - **Atributos**: São os dados da classe, como `int`, `String`, `boolean`, etc.
  - **Comportamentos**: São os métodos da classe, que definem ações a serem realizadas.
  - Juntos, atributos e métodos formam os membros da classe.
- **Relação entre Classe e Objeto**:
  - Uma classe serve como molde para criar objetos, que são instâncias dessa classe.
  - Exemplo: Uma classe `Produto` pode ser usada para criar diferentes objetos, como um `Produto` com nome, preço e desconto.
  
- **Método e Construtor**:
  - **Método**: Define ações que um objeto pode executar. Exemplo de um método que soma dois números:
    ```java
    int somar(int a, int b) {
        return a + b;
    }
    ```
  - **Construtor**: É um método especial usado para criar objetos a partir de uma classe. Exemplo:
    ```java
    Produto p1 = new Produto();  // Construtor padrão
    ```
  
## Orientação a Objetos

- **Encapsulamento**: O encapsulamento esconde os detalhes internos de um objeto, permitindo acesso controlado através de modificadores de acesso (`private`, `public`, `protected`).
  
- **Herança**: A herança permite que uma subclasse herde atributos e métodos de uma superclasse, promovendo o reuso de código.
  
- **Polimorfismo**: Permite tratar objetos de diferentes classes de forma uniforme, através da sobrescrita ou sobrecarga de métodos.
  
- **Interface**: Define métodos e constantes que outras classes podem implementar, promovendo a flexibilidade no design do código.
  
- **Abstração**: Simplificação de objetos do mundo real para seu uso no software, destacando características e comportamentos essenciais.

## Stream API

- **Construção de Streams**: Pode ser feita de várias formas, como por métodos estáticos ou a partir de uma lista.
- **Operações Intermediárias**: Transformam os dados de maneira encadeada, sem alterar a stream original.
- **Operações Terminais**: Marcam o fim da operação com a stream, retornando um resultado final.

## Tratamento de Exceções

- **Try-Catch**: Bloco usado para capturar e tratar exceções.
- **Exceções Verificadas e Não Verificadas**: Exceções verificadas precisam ser tratadas explicitamente, enquanto exceções não verificadas não necessitam de tratamento obrigatório.
- **Bloco Finally**: Usado para garantir a execução de código de limpeza, independentemente de ocorrer ou não uma exceção.

### Banco de Dados

#### DML (Data Manipulation Language):

- **SELECT**: Recupera dados de uma ou mais tabelas.
- **INSERT**: Adiciona novos registros a uma tabela.

```sql
INSERT INTO tabela (coluna1, coluna2) VALUES (valor1, valor2);
```

- **UPDATE**: Modifica dados existentes.

```sql
UPDATE tabela SET coluna1 = valor1 WHERE condição;
```

- **DELETE**: Exclui registros.

```sql
DELETE FROM tabela WHERE condição;
```

#### DDL (Data Definition Language):

- **CREATE TABLE**: Cria uma tabela com suas colunas e tipos de dados.

```sql
CREATE TABLE tabela (coluna1 tipo_de_dado, coluna2 tipo_de_dado);
```

- **ALTER TABLE**: Modifica a estrutura de uma tabela existente.

```sql
ALTER TABLE tabela ADD coluna tipo_de_dado;
```

- **DROP TABLE**: Exclui uma tabela.

```sql
DROP TABLE tabela;
```

#### Funções de Agregação:

- **COUNT**: Conta o número de registros.
- **SUM**: Soma os valores de uma coluna numérica.
- **AVG**: Calcula a média.
- **MIN/MAX**: Retorna o menor ou maior valor.

```sql
SELECT COUNT(*), SUM(preço) FROM produtos;
```

#### JOINs:

- **INNER JOIN**: Retorna dados quando há correspondência em ambas as tabelas.
- **LEFT JOIN**: Retorna todos os dados da tabela à esquerda, e os dados correspondentes da tabela à direita.
- **RIGHT JOIN**: Retorna todos os dados da tabela à direita, e os dados correspondentes da tabela à esquerda.

Exemplo de **INNER JOIN**:

```sql
SELECT produtos.nome, categorias.nome
FROM produtos
INNER JOIN categorias ON produtos.categoria_id = categorias.id;
```

#### Normalização:

Processo para organizar dados, reduzir redundâncias e garantir a integridade. As formas normais mais comuns são 1FN, 2FN e 3FN.

#### Transações:

As transações garantem a integridade dos dados, seguindo o modelo ACID:

- **Atomicidade**: Tudo ou nada, ou a transação é concluída ou nada acontece.
- **Consistência**: A transação leva o banco de dados de um estado válido a outro.
- **Isolamento**: As operações de uma transação são isoladas de outras.
- **Durabilidade**: As mudanças feitas são permanentes após o commit.

#### Índices:

- **Índice único**: Garante que os valores sejam únicos.
- **Índice composto**: Índice baseado em várias colunas.
- **Índice de texto completo**: Para buscas rápidas em colunas de texto.

Exemplo de índice composto:

```sql
CREATE INDEX idx_produto_preço ON produtos (nome, preço);
```

#### Restrições (Constraints):

- **PRIMARY KEY**: Garante valores únicos e não nulos.
- **FOREIGN KEY**: Define relações entre tabelas.
- **UNIQUE**: Garante valores únicos, mas permite nulos.
- **NOT NULL**: Impede valores nulos.
- **CHECK**: Define restrições em valores.

Exemplo de criação de tabela com restrições:

```sql
CREATE TABLE clientes (
    id INT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE
);
```
# Conceitos Web

## TCP/IP (Transmission Control Protocol / Internet Protocol)

O **TCP/IP** é um protocolo orientado a conexão e confiável. Ele é baseado em camadas (*layers*), que dividem a responsabilidade da comunicação em diferentes estágios.

### As camadas do TCP/IP incluem:
- **Camada Física / Rede:** Responsável pela transmissão de dados através de meios físicos (cabos, Wi-Fi).
- **Internet:** Gerencia o roteamento dos pacotes de dados entre os dispositivos.
- **Transporte:** Assegura que os dados cheguem corretamente ao destino (ex: TCP).
- **Aplicação:** Interface com o usuário e os serviços (ex: HTTP, FTP).

A comunicação ocorre da seguinte maneira: a aplicação depende da camada de transporte, que depende da camada da internet, que, por sua vez, depende da camada física/rede. Cada camada tem uma responsabilidade específica.

**Exemplo:**  
Ao fazer uma requisição HTTP, o pacote passa por todas as camadas antes de chegar ao servidor e ser processado. A resposta segue o mesmo caminho de volta.

---

## Host e SubRede

- **Host:** Refere-se ao dispositivo conectado à rede (computador, servidor, etc.).
- **SubRede:** Uma divisão de uma rede maior, permitindo a organização e o gerenciamento eficiente dos dispositivos conectados.

**Exemplo:**  
Se uma rede tem o IP `192.168.1.0/24`, a sub-rede pode ser algo como `192.168.1.0/25`, que divide o espaço de endereços IP em duas sub-redes menores.

---

## Conceito de Porta

As portas são usadas para identificar aplicações específicas em um dispositivo. Quando um servidor recebe uma requisição, ele usa o número da porta para saber qual serviço deve processar a requisição.

**Exemplo:**  
Ao acessar `http://www.exemplo.com:8080`, o número `8080` indica a porta usada para a comunicação com o servidor.

---

## Protocolo HTTP (HyperText Transfer Protocol)

O **HTTP** é um protocolo de comunicação utilizado na troca de dados entre cliente e servidor, especialmente para acessar páginas web. Ele é baseado em hipertexto, ou seja, os documentos contêm links para outros documentos ou recursos.

### Principais características:
- **Stateless:** Cada requisição é tratada como nova, sem lembrar do estado anterior.

**Exemplo:**  
Quando um usuário acessa uma URL (ex: `http://www.exemplo.com`), o navegador envia uma requisição HTTP para o servidor. O servidor responde com um documento HTML, que é renderizado pelo navegador.

---

## Cliente-Servidor

No modelo **cliente-servidor**, o cliente envia uma requisição ao servidor, e este responde com um recurso ou dado solicitado.

**Fluxo da Requisição HTTP:**
1. O usuário digita a URL no navegador.
2. O navegador gera uma requisição HTTP para o servidor.
3. O servidor processa a requisição e envia a resposta.
4. O navegador exibe a página recebida do servidor.

---

## Métodos HTTP

O protocolo HTTP possui diferentes métodos para especificar a operação a ser realizada na requisição:

- **GET:** Solicita a recuperação de dados do servidor (ex: acessar uma página web).
- **POST:** Envia dados ao servidor (ex: enviar um formulário).
- **PUT:** Atualiza ou cria um recurso no servidor (ex: atualizar dados de um usuário).
- **DELETE:** Remove um recurso do servidor (ex: excluir um comentário).
- **TRACE:** Recupera o caminho seguido pela requisição até o servidor.
- **OPTIONS:** Solicita os métodos permitidos pelo servidor para um recurso.
- **CONNECT:** Estabelece um túnel de comunicação (ex: para SSL).
- **HEAD:** Semelhante ao GET, mas sem o corpo da resposta (apenas os cabeçalhos).

---

## Grupos de Status HTTP

Os status HTTP são códigos retornados pelo servidor para informar o estado da requisição. Eles são agrupados em várias categorias:

### Informações (1xx):
- **100 Continue:** O servidor recebeu o cabeçalho da requisição, e o cliente pode continuar enviando o corpo.

### Sucesso (2xx):
- **200 OK:** A requisição foi processada com sucesso.

### Redirecionamento (3xx):
- **301 Moved Permanently:** O recurso foi movido permanentemente para outro endereço.

### Erro no Cliente (4xx):
- **404 Not Found:** O recurso solicitado não foi encontrado.

### Erro no Servidor (5xx):
- **500 Internal Server Error:** O servidor encontrou um erro ao tentar processar a requisição.

---

## Servidores Web

Os servidores web são responsáveis por entregar páginas e recursos web para os clientes. Eles processam requisições HTTP/HTTPS, gerenciam conteúdos estáticos e dinâmicos, e interagem com bancos de dados e aplicações.

---

## Web e DNS

O **DNS (Domain Name System)** é como a "agenda telefônica" da internet, traduzindo nomes de domínio legíveis por humanos (ex: `www.exemplo.com`) para endereços IP (ex: `192.168.1.1`).

**Exemplo:**  
Usuário digita `www.meusite.com`. O DNS converte para o IP do servidor associado e conecta o cliente ao site.

---

## Virtual Hosting

O **Virtual Hosting** permite que um único servidor físico hospede vários sites, otimizando recursos.

### Tipos:
- **Baseado em Nome:** Diferentes sites usam o mesmo IP, diferenciados pelo domínio.
- **Baseado em IP:** Cada site possui um endereço IP único.

**Exemplo:**  
Um servidor pode hospedar `site1.com` e `site2.com`, respondendo adequadamente dependendo da URL requisitada.

---

## Web Stack

A **Web Stack** é o conjunto de tecnologias necessárias para que um site ou aplicação funcione:

1. **Sistema Operacional:** Gerencia os recursos físicos (ex: Linux, Windows Server).
2. **Web Service:** Gerencia requisições HTTP/HTTPS (ex: Apache, Nginx).
3. **Banco de Dados:** Armazena informações (ex: MySQL, MongoDB).
4. **Linguagem de Programação:** Desenvolve a lógica da aplicação (ex: PHP, Python, Node.js).

**Exemplo de Stack:**  
**LAMP Stack:** Linux + Apache + MySQL + PHP.

---

## Client Side vs Server Side

- **Client Side:** Processamento ocorre no navegador do cliente (ex: JavaScript manipulando o DOM).
- **Server Side:** Processamento ocorre no servidor antes de enviar a resposta (ex: PHP gerando HTML dinâmico).

---

## HTTP Seguro (HTTPS)

O **HTTPS** é a versão segura do HTTP, utilizando TLS/SSL para criptografar a comunicação entre cliente e servidor. Isso garante:
- **Confidencialidade:** Dados criptografados.
- **Integridade:** Proteção contra alterações durante a transmissão.
- **Autenticação:** Confirma que o servidor é legítimo.

**Exemplo:**  
Ao acessar um site bancário, o cadeado na barra de endereço indica o uso de HTTPS.

# Spring Boot - Primeiros Exercícios

## Uso do Spring Boot com Start.spring.io

No desenvolvimento com **Spring Boot**, utilizamos o site [start.spring.io](https://start.spring.io) para configurar rapidamente o nosso projeto. No meu exercício, optei por usar duas ferramentas principais:

- **Spring Web**: Responsável por criar aplicações web e fornecer recursos para construir APIs REST.
- **Spring Boot DevTools**: Facilita o desenvolvimento, oferecendo recursos como reinicialização automática e debuggers.

## Maven e Gerenciamento de Dependências

O **Maven** é o sistema de gerenciamento de dependências utilizado no projeto. Ele permite que o Spring Boot gerencie automaticamente as bibliotecas necessárias para o projeto.

### Pom.xml
O arquivo `pom.xml` contém informações essenciais sobre o projeto, como o nome, versão e dependências.

- **Dependências**: Dentro do `pom.xml`, estão definidas as bibliotecas necessárias para o funcionamento do projeto, geralmente arquivos `.jar`.
- **Plugins**: Plugins que ajudam a realizar tarefas específicas, como compilar e testar o código.

### Gerenciador de Dependências
O Maven verifica, na nuvem, se existem repositórios que contêm as dependências necessárias para o projeto.

### Ciclo de Vida do Maven
O Maven segue um ciclo de vida para o processo de *build* da aplicação, que inclui as fases:

1. **Compilação**: Preparação do código.
2. **Teste**: Execução de testes automatizados.
3. **Instalação**: Preparação para a implantação.

## Primeiro Exercício com WebService

O primeiro exercício consiste em criar um **WebService** básico em Spring Boot utilizando o `@RestController`.

### Exemplo de Código

```java
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

    @GetMapping(path = {"/ola", "/saudacao"})
    public String ola() {
        return "Olá Spring Boot";
    }
}
```

No código acima, criamos um serviço simples que retorna uma saudação ao acessar as rotas `/ola` e `/saudacao` com o método **GET**.

### Testando com Método GET e POST

Para testar os métodos **GET** e **POST**, podemos fazer um comentário no código para usar o **@PostMapping** e verificar se a requisição POST funciona corretamente.

```java
/* 
@PostMapping(path = "/saudacao")
public String saudacao() {
    return "Olá Spring Boot (usando POST)";
}
*/
```

## Web Service Retornando Objetos

Criei um novo pacote chamado **models**, onde coloquei a classe `Cliente`. Os parâmetros de um cliente foram passados e, ao acessar o serviço, consegui visualizar os dados em formato **JSON** através de uma extensão do Google Chrome.

### O que é JSON?
**JSON** (JavaScript Object Notation) é um formato leve de troca de dados, utilizado para representar objetos estruturados em texto legível. É amplamente utilizado em APIs Web, como no caso de nossa resposta.

## Revisão dos Métodos HTTP

A comunicação entre o navegador (browser) e o Spring Boot ocorre via requisição e resposta. Abaixo, uma explicação dos principais métodos HTTP utilizados:

- **GET**: Obter dados do servidor.
- **POST**: Enviar dados ao servidor.
- **PUT**: Atualizar dados no servidor (alteração total).
- **PATCH**: Atualizar parcialmente os dados no servidor.
- **DELETE**: Excluir dados do servidor.
- **OPTIONS**: Verificar os métodos HTTP suportados por um recurso.
- **TRACE**: Testar a requisição entre o cliente e o servidor.
- **HEAD**: Similar ao **GET**, mas apenas os cabeçalhos da resposta, sem o corpo.
  Ah, entendi! Você quer garantir que o texto esteja organizado e no formato ideal para ser incluído no GitHub. Para isso, ajustarei a formatação de acordo com o padrão geralmente utilizado no GitHub, com linguagem clara, consistente e adequada para documentação de projetos. Aqui está a versão revisada e formatada:

---

# Desafio de Web Service: Calculadora

Este projeto foi desenvolvido como solução para um desafio de Web Service utilizando **Spring Boot** e segue o padrão arquitetural **MVC** (Model-View-Controller). A implementação ficou diferente da apresentada pelo professor, mas os resultados foram os mesmos. Minha solução foi organizada de forma modular, separando as responsabilidades em camadas distintas.

## Estrutura do Projeto

### Model
Criei uma classe chamada `Calculadora` na pasta `models`. Essa classe contém os atributos e métodos responsáveis pelas operações matemáticas, como soma e subtração.

### Controller
Na pasta `controllers`, desenvolvi a classe `CalculadoraController`, que expõe os endpoints para realizar as operações matemáticas. A comunicação entre o Controller e o Model é feita de forma simples, instanciando a classe `Calculadora` dentro de cada método do Controller.

### Código da Classe Controller
Abaixo está o código da classe `CalculadoraController`:

```java
package com.example.exercicios_sb.controllers;

import com.example.exercicios_sb.models.Calculadora;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("/somar/{a}/{b}")
    public double somar(@PathVariable double a, @PathVariable double b) {
        Calculadora calculadora = new Calculadora();
        return calculadora.somar(a, b);
    }

    @GetMapping("/subtrair")
    public double subtrair(@RequestParam double a, @RequestParam double b) {
        Calculadora calculadora = new Calculadora();
        return calculadora.subtrair(a, b);
    }
}
```

### Observação
Na solução apresentada pelo professor, toda a lógica foi implementada diretamente dentro da classe `CalculadoraController`. Minha abordagem separa a lógica de negócio na classe `Calculadora`, localizada na camada de **Model**, promovendo uma melhor organização e aderência ao padrão MVC.

---

## Sobre o Padrão MVC

O padrão **MVC** organiza a aplicação em três camadas principais:

1. **Model:** É o coração da aplicação, responsável pelas regras de negócio, entidades e camada de acesso aos dados.
2. **View:** Responsável por renderizar as respostas ao usuário. Em aplicações web, trabalha com tecnologias como HTML, CSS, JavaScript e motores de template.
3. **Controller:** Faz o intermédio entre as camadas View e Model, gerenciando as requisições do cliente e encaminhando os dados para a camada correta.

No contexto deste projeto, o fluxo funciona da seguinte forma: uma requisição do navegador chega ao servidor de aplicação (Tomcat, no caso do Spring Boot), que a encaminha para o **Front Controller** (representado pelo `DispatcherServlet`). 
O `DispatcherServlet` detecta o Controller correto para tratar a requisição, com base nas anotações configuradas, e direciona a execução para o método correspondente.
Segue o texto revisado, organizado para o GitHub e com as anotações mais utilizadas pelo Spring no final:

---

# Injeção de Dependência

A injeção de dependência é um conceito que permite a um terceiro agente (como o framework Spring) criar instâncias de classes e injetá-las automaticamente dentro de outras classes que dependem delas. Isso facilita a gestão de dependências, promove a reutilização de código e aumenta a testabilidade da aplicação.

No Spring, a anotação `@Autowired` é usada para realizar a injeção de dependências. Por meio dela, o framework identifica e injeta automaticamente as dependências necessárias.

---

## Desafio Proposto

### Objetivo:
Adicionar dois novos atributos à classe `Produto`:
1. **Preço** (`preco`) — do tipo `double`.
2. **Desconto** (`desconto`) — do tipo `double`, com valores entre `0.05` (5%) e `0.0025` (0.25%).

Além disso, implementar a funcionalidade de calcular o preço do produto após aplicar o desconto.

### Passos Realizados:

1. **Novos Atributos:**
   Foram adicionados os atributos `preco` e `desconto` à classe `Produto`:
   ```java
   private double preco;
   private double desconto;
   ```

2. **Método para Aplicar Desconto:**
   Criado o método `aplicarDesconto`, que calcula o valor final do produto com base em uma porcentagem de desconto:
   ```java
   public double aplicarDesconto(double porcentagemDesconto) {
       double desconto = (preco * porcentagemDesconto) / 100;
       return preco - desconto;
   }
   ```

3. **Getters e Setters:**
   Foram implementados os métodos de acesso e modificação (getters e setters) para os novos atributos. Isso permite manipular os valores de forma segura.

4. **Inserção de Produtos via Postman:**
   Utilizando o método `POST` na API, foi possível adicionar produtos com os atributos `nome`, `preco` e `desconto` diretamente pelo Postman.

### Simplificação do ProdutoController:
O código do `ProdutoController` foi ajustado para manter a simplicidade e a organização, utilizando boas práticas de injeção de dependência e controle de requisições.

---

## Anotações do Spring Mais Utilizadas

### Anotações de Controladores:
- **`@RestController`**: Indica que a classe é um controlador que retorna respostas no formato JSON ou XML.
- **`@RequestMapping`**: Define o mapeamento da URL base para os endpoints da classe.
- **`@GetMapping` / `@PostMapping` / `@PutMapping` / `@DeleteMapping`**: Especificam os métodos HTTP para os endpoints.

### Anotações para Injeção de Dependência:
- **`@Autowired`**: Realiza a injeção automática de dependências.
- **`@Qualifier`**: Utilizada quando há mais de um bean do mesmo tipo, para especificar qual deve ser injetado.
- **`@Component`**, **`@Service`**, **`@Repository`**: Marcam classes como beans gerenciados pelo Spring.

### Anotações JPA (Mapeamento ORM):
- **`@Entity`**: Indica que a classe é uma entidade JPA.
- **`@Id`**: Define o atributo como a chave primária.
- **`@GeneratedValue`**: Configura a estratégia de geração automática do valor da chave primária.
- **`@Column`**: Personaliza o mapeamento de uma coluna no banco de dados.
- **`@Table`**: Define informações adicionais sobre a tabela no banco de dados.

### Validações:
- **`@NotNull`**: Valida que o campo não seja nulo.
- **`@Min` / `@Max`**: Define valores mínimos e máximos permitidos.
- **`@Size`**: Restringe o tamanho de strings ou coleções.
- **`@Pattern`**: Valida o formato de strings com expressões regulares.

### Anotações Auxiliares:
- **`@ResponseBody`**: Indica que o valor retornado por um método deve ser serializado diretamente no corpo da resposta HTTP.
- **`@RequestBody`**: Mapeia o corpo de uma requisição para um objeto Java.
- **`@PathVariable`**: Extrai valores de variáveis da URL.
- **`@RequestParam`**: Captura parâmetros passados na URL.

---

# Consultando e Alterando Produtos na API

## Consultando Todos os Produtos

O método abaixo permite visualizar todos os produtos cadastrados na base de dados:

```java
public Iterable<Produto> obterProdutos() {
    return produtoRepository.findAll();
}
```

Utilizando o Postman, foi feito um `GET` na URL correspondente, retornando todos os produtos registrados no formato de um array de objetos em JSON.

---

## Consultando um Produto pelo ID

Para buscar um produto específico pelo seu identificador único (ID), foi implementado o seguinte método:

```java
@GetMapping(path = "/{id}")
public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
    return produtoRepository.findById(id);
}
```

No Postman, ao realizar um `GET` com o ID na URL, é possível visualizar o produto correspondente no formato JSON.

---

## Alterando um Produto

O código abaixo permite alterar um produto existente:

```java
@PutMapping
public Produto alterarProduto(@Valid Produto produto) {
    produtoRepository.save(produto);
    return produto;
}
```

### Observações:
- Foi utilizada a anotação `@PutMapping` para mapear a requisição do tipo `PUT`, que é destinada a atualizar um objeto completo.
- A anotação `@Valid` foi aplicada para validar os dados enviados antes de salvar no repositório.
- No Postman, foi possível enviar uma requisição `PUT` para atualizar os dados do produto, como nome e valores, corrigindo ou redefinindo as informações.

### Diferença entre `PUT` e `PATCH`:
- **`PUT`**: Atualiza o objeto inteiro.
- **`PATCH`**: Permite alterar apenas propriedades específicas do objeto.

---

## Utilizando POST/PUT para Alterações

Uma alternativa para realizar alterações é permitir que um mesmo endpoint aceite tanto requisições `POST` quanto `PUT`. Isso foi configurado com a anotação:

```java
@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
```

No Postman, é possível utilizar essa abordagem para criar ou alterar registros, dependendo do método utilizado na requisição.

---

## Buscando Produtos pelo Nome

Para buscar produtos contendo um trecho específico no nome, foi criada a seguinte interface no repositório:

```java
Iterable<Produto> findByNomeContaining(String parteNome);
```

E o método correspondente no controlador:

```java
@GetMapping(path = "/nome/{parteNome}")
public Iterable<Produto> obterProdutoPorNome(@PathVariable String parteNome) {
    return produtoRepository.findByNomeContaining(parteNome);
}
```

### Funcionalidade:
- Com esse método, ao realizar um `GET` com uma parte do nome como parâmetro na URL, a API retorna todos os produtos cujo nome contenha o trecho informado.
- No Postman, é possível testar essa funcionalidade passando uma string parcial no lugar de `{parteNome}`.

---