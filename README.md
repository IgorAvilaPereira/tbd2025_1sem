# tbd2025_1sem <br>
## [./1_introducao_OneToMany](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./1_introducao_OneToMany) <br>
[jpa.pdf](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./1_introducao_OneToMany/jpa.pdf) <br>
* [Video - @OneToOne](https://www.youtube.com/watch?v=IXhz1G6w75Q&list=PLvT8P1q6jMWfvCUWOAOJt_mJfsvrV2jp5&index=1&ab_channel=IgorAvilaPereira)

[exemplo_jpa_javalin](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./1_introducao_OneToMany/exemplo_jpa_javalin) <br>
## [./2_OneToOne](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./2_OneToOne) <br>
[jpa.pdf](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./2_OneToOne/jpa.pdf) <br>
* +@OneToMany
* @OneToOne
* Herança
[aiai](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./2_OneToOne/aiai) <br>
[exemplo_jpa_javalin](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./2_OneToOne/exemplo_jpa_javalin) <br>
## [./3_ManyToMany](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./3_ManyToMany) <br>
@ManyToMany

**Alternativas Easy-Criteria:**

* https://github.com/s4gh/easy-criteria

* https://javanexus.com/blog/overcoming-hurdles-easycriteria-jpa

* https://github.com/uaihebert/uaicriteria

<br>

[aiai](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./3_ManyToMany/aiai) <br>
[projeto_pos_aula](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./3_ManyToMany/projeto_pos_aula) <br>
## [./4_springjpa](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./4_springjpa) <br>
[Documentação](https://docs.spring.io/spring-data/jpa/reference/jpa.html)

**Exemplos:**

* https://github.com/IgorAvilaPereira/QuickStart_SpringJPAMustache

* https://github.com/IgorAvilaPereira/minicurso-java-spring-solid

* https://github.com/IgorAvilaPereira/SpringJPA_PostgreSQL

## [./5_redis](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./5_redis) <br>
&nbsp;
## [./guia_rapido](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./guia_rapido) <br>
[guia_rapido.md](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./guia_rapido/guia_rapido.md) <br>
## [./javalin_mustache_exemplo](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./javalin_mustache_exemplo) <br>
Exemplo Javalin 
[teste](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./javalin_mustache_exemplo/teste) <br>
## [./setup](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./setup) <br>
[setup.md](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./setup/setup.md) <br>
## [./trabalhos](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./trabalhos) <br>
<!--
# Trabalho 2 - Neo4j + MongoDB

#### Descrição do Problema
Desenvolver um sistema básico de gerenciamento de eventos que utilize Java para a lógica de negócios, Neo4j para modelagem de conexões sociais e MongoDB para armazenamento de dados de eventos. 

#### Requisitos do Sistema

1. **Cadastro de Usuários**:
   - Cada usuário deve ter: `cpf`, `nome`, `email`, `senha` e `data_nascimento`.
   - Implementar operações CRUD para gerenciar os usuários.

2. **Modelagem de Conexões Sociais**:
   - Utilizar Neo4j para modelar as conexões sociais entre os usuários (amizades).
   - Implementar funcionalidades para adicionar e remover amizades.

-->

# Trabalho 1 - JPA + Redis

Desenvolvimento de Aplicação E-commerce. <!-- com JPA, PostgreSQL e Redis-->

## Exigências:

* Criar uma aplicação de e-commerce em Java, utilizando JPA para mapeamento objeto-relacional com PostgreSQL e Redis para gerenciamento do carrinho de compras.

* Desenvolver uma API ou Desenvolver o sistema por terminal, por interface gráfica (desktop) ou web;

### No PostgreSQL:
* CRUD para as classes do sistema: Cliente, Pedido e Item. Obs: os produtos podem estar fixamente cadastrados. Obs: para facilitar o desenvolvimento, Produtos tem estoque "infinito"
* Mostrar os pedidos anteriores
* Persistir o pedido (depois de que o cliente pega para fechar o pedido)

### No Redis:
* Criar um Pedido (Carrinho)
* Adicionar Item no Pedido (Carrinho)
* Editar Quantidades de cada Item do Carrinho
* Mostrar o valor parcial e o valor total do Pedido
* Destruir as informacões do Pedido (Carrinho) depois que o pedido seja, efetivamente, salvo no PostgreSQL

![trabalho1](trabalho1.png)

## Valor: 5[trabalho1.png](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./trabalhos/trabalho1.png) <br>
