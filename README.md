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


