# tbd2025_1sem <br>
## [./1_introducao](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./1_introducao) <br>
[*.*](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./1_introducao/*.*) <br>
[aiai](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./1_introducao/aiai) <br>
## [./1_introducao_OneToMany](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./1_introducao_OneToMany) <br>
[jpa.pdf](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./1_introducao_OneToMany/jpa.pdf) <br>
* [Video - @OneToOne](https://www.youtube.com/watch?v=IXhz1G6w75Q&list=PLvT8P1q6jMWfvCUWOAOJt_mJfsvrV2jp5&index=1&ab_channel=IgorAvilaPereira)

[exemplo_jpa_javalin](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./1_introducao_OneToMany/exemplo_jpa_javalin) <br>
## [./2_aula](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./2_aula) <br>
[*.*](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./2_aula/*.*) <br>
[aiai](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./2_aula/aiai) <br>
## [./2_OneToOne](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./2_OneToOne) <br>
[jpa.pdf](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./2_OneToOne/jpa.pdf) <br>
* +@OneToMany
* @OneToOne
* Herança
[aiai](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./2_OneToOne/aiai) <br>
[exemplo_jpa_javalin](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./2_OneToOne/exemplo_jpa_javalin) <br>
## [./3_aula](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./3_aula) <br>
[*.*](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./3_aula/*.*) <br>
[aiai](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./3_aula/aiai) <br>
[projeto_pos_aula](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./3_aula/projeto_pos_aula) <br>
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

*  https://github.com/IgorAvilaPereira/QuickStart_SpringJPAMustache

* bom exemplo de api e uso de templates mustache - https://github.com/IgorAvilaPereira/minicurso-java-spring-solid

* bom exemplo de api com swagger - https://github.com/IgorAvilaPereira/SpringJPA_PostgreSQL

## [./5_redis](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./5_redis) <br>
[introducao_nosql_redis.pdf](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./5_redis/introducao_nosql_redis.pdf) <br>
* Matéria Nova: REDIS
* Divulgação TRABALHO 1 -> Data e Peso estão no SIGAA => assim fechamos 1 bim.

Na volta (2 bim):

* MongoDB
* Neo4j

***
<!--[Introdução NoSQL + REDIS](https://github.com/IgorAvilaPereira/tbd2024_2sem/raw/main/slides/introducao_nosql_redis.pdf)

[Código Aula](https://github.com/IgorAvilaPereira/tbd2024_2sem/tree/main/codigos/aula211024/renan)-->

<!--[Código Aula](https://github.com/IgorAvilaPereira/tbd2024_1sem/tree/main/codigos/redis010923)-->

<!--[Instalação](https://github.com/IgorAvilaPereira/tbd2024_2sem/wiki/Setup#redis)-->

**Instalação Ubuntu/Debian/Linux Mint**

```bash
sudo apt-get update 
sudo apt-get install redis-server
```

**Instalação Docker**

```bash
-- 1ª vez
docker run --name redis -p 6379:6379 -d redis:latest
docker exec -it redis redis-cli
-- demais vezes
sudo docker start redis
sudo docker exec -it redis redis-cli
```

**Client**

```
redis-cli
```

<!--[Material Complementar - REDIS](https://github.com/IgorAvilaPereira/tbd2024_2sem/blob/main/redis.md)-->

[Jedis](https://github.com/redis/jedis)

```xml
<dependency>
    <groupId>redis.clients</groupId>
    <artifactId>jedis</artifactId>
    <version>4.3.0</version>
</dependency>
```
```java
-- 1)
JedisPool pool = new JedisPool("localhost", 6379);
try (Jedis jedis = pool.getResource()) {
  jedis.set("clientName", "Jedis");
}
-- 2) 
JedisPooled jedis = new JedisPooled("localhost", 6379);
```

**Links:**

* https://www.tutorialspoint.com/redis/redis_quick_guide.htm#

* https://github.com/uglide/RedisDesktopManager

* https://redis.io/commands/


**GSON:**

**Gson**

```xml
<dependency>
  <groupId>com.google.code.gson</groupId>
  <artifactId>gson</artifactId>
  <version>2.10.1</version>
</dependency>
```

<!--[Código  Aula](https://github.com/IgorAvilaPereira/tbd2024_1sem/tree/main/codigos/RedisAula1)-->

* https://sites.google.com/site/aulasvictormenegusso/programacao-web-2-1-semestre-2017/trabalhando-com-json-com-a-biblioteca-gson

* https://github.com/google/gson

* https://github.com/google/gson/blob/master/UserGuide.md

<!--* [Código - Aula](https://github.com/IgorAvilaPereira/tbd2022_2sem/tree/main/codigos/com.mycompany.maven.jedis_maven-Jedis_jar_1.0-SNAPSHOT)-->

Se usar datas (***LocalDate*** ou ***LocalDateTime***) será preciso ***serializar*** e ***deserializar***:

1) Criar um objeto Gson com GsonBuilder:

```java
-- se for LocalDate
Gson gson = new GsonBuilder()
.registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter())
    .create();
-- se for LocalDateTime
Gson gson = new GsonBuilder()
.registerTypeAdapter(LocalDateTime.class, new LocalDateTimeTypeAdapter())
    .create();
```
2) Construir uma classe concreta que implemente JsonSerializer e JsonDeserializer

* No caso de ser LocalDate:

```java
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import com.google.gson.*;

public class LocalDateTypeAdapter implements JsonSerializer<LocalDate>, JsonDeserializer<LocalDate> {

  private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

  @Override
  public JsonElement serialize(final LocalDate date, final Type typeOfSrc,
      final JsonSerializationContext context) {
    return new JsonPrimitive(date.format(formatter));
  }

  @Override
  public LocalDate deserialize(final JsonElement json, final Type typeOfT,
      final JsonDeserializationContext context) throws JsonParseException {
    return LocalDate.parse(json.getAsString(), formatter);
  }
}
```

* No caso de ser LocalDateTime:

```java
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import com.google.gson.*;

public class LocalDateTimeTypeAdapter implements JsonSerializer<LocalDateTime>, JsonDeserializer<LocalDateTime> {

  private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss");

  @Override
  public JsonElement serialize(LocalDateTime localDateTime, Type srcType,
      JsonSerializationContext context) {
    return new JsonPrimitive(formatter.format(localDateTime));
  }

  @Override
  public LocalDateTime deserialize(JsonElement json, Type typeOfT,
      JsonDeserializationContext context) throws JsonParseException {
    return LocalDateTime.parse(json.getAsString(), formatter);
  }
}
```
* **Fonte:** https://howtodoinjava.com/gson/gson-typeadapter-for-inaccessibleobjectexception/
<!--
**Libraries Úteis:**

* https://mvnrepository.com/artifact/com.rometools/rome

```java
<dependency>
    <groupId>com.rometools</groupId>
    <artifactId>rome</artifactId>
    <version>2.1.0</version>
</dependency>
```
-->

* https://howtodoinjava.com/gson/gson-parse-json-array/
```java
Type listType = new TypeToken<ArrayList<ArrayItem>>(){}.getType(); 
ArrayList<ArrayItem> list = gson.fromJson(jsonSource, listType);  
```

**Vídeo Complementar:**

* [Quando NÃO usar SQL?](https://www.youtube.com/watch?v=o8HEfReQ6co)

<!--
[Código](https://github.com/IgorAvilaPereira/tbd2023_2sem/tree/main/codigos/150923/080923)
[Código da aula](https://github.com/IgorAvilaPereira/tbd2024_1sem/tree/main/codigos/1508/redis1)

* https://howtodoinjava.com/gson/gson-parse-json-array/
```java
Type listType = new TypeToken<ArrayList<ArrayItem>>(){}.getType(); 
ArrayList<ArrayItem> list = gson.fromJson(jsonSource, listType);  
```
***

## 08/07 - Recapitulação/Revisão: Aula 1 - Redis

Recapitulação/Revisão: Aula 1 - Redis

Definir - Nova data atividade avaliada  1 -> dia 29/07 tudo: trabalho1 (jpa), trabalho2 (redis) + atividade avaliada presencial

[Código da aula de hoje](https://github.com/IgorAvilaPereira/tbd2024_1sem/tree/main/codigos/080724/redis1)

***

## 15/04 - Redis aula 1

[Última aula antes da suspensão do calendário](https://ifrs.edu.br/riogrande/calendario-academico-estara-suspenso-a-partir-de-16-de-abril/)
-->

**Alternativas open-source:**

* https://youtu.be/RTLkwH-PNcE?si=UKyqqZkjhPdeTphp

* https://docs.keydb.dev/

* [Código Exemplo - Keydb - igual ao Redis](https://github.com/IgorAvilaPereira/tbd2024_2sem/tree/main/codigos/keydb)



[redis.md](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./5_redis/redis.md) <br>
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
* CRUD para as classes do sistema: Cliente, Pedido, Item e Produto. 
    * Obs: para facilitar o desenvolvimento, Produtos tem estoque "infinito"
* Mostrar os pedidos anteriores
* Persistir o pedido (depois de que o cliente pega para fechar o pedido)

### No Redis:
* Criar um Pedido (Carrinho)
* Adicionar Item no Pedido (Carrinho)
* Editar Quantidades de cada Item do Carrinho
* Mostrar o valor parcial e o valor total do Pedido
* Destruir as informacões do Pedido (Carrinho) depois que o pedido seja, efetivamente, salvo no PostgreSQL

<!--![trabalho1](trabalho1.png)

## Valor: 5
-->
[trabalho1.png](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./trabalhos/trabalho1.png) <br>
