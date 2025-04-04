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

*  https://github.com/IgorAvilaPereira/QuickStart_SpringJPAMustache

* bom exemplo de api e uso de templates mustache - https://github.com/IgorAvilaPereira/minicurso-java-spring-solid

* bom exemplo de api com swagger - https://github.com/IgorAvilaPereira/SpringJPA_PostgreSQL

## [./5_redis](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./5_redis) <br>
[introducao_nosql_redis.pdf](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./5_redis/introducao_nosql_redis.pdf) <br>
* Matéria Nova: REDIS
* Divulgação TRABALHO 1 -> Data e Peso estão no SIGAA => assim fechamos 1 bim.

Semana Quem vem:

* Redis (aula 2) + Atendimento Trabalho

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
[exemplo_redis_jedis](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./5_redis/exemplo_redis_jedis) <br>
[minicurso-java-spring-solid-main](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./5_redis/minicurso-java-spring-solid-main) <br>
## [./guia_rapido](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./guia_rapido) <br>
# Guia Rápido

* https://cheatsheets.zip/postgres
* https://cheatsheets.zip/redis
* https://cheatsheets.zip/mongodb
* https://cheatsheets.zip/neo4j
## [./javalin_mustache_exemplo](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./javalin_mustache_exemplo) <br>
Exemplo Javalin 
[teste](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./javalin_mustache_exemplo/teste) <br>
## [./setup](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./setup) <br>

# JDK
# Netbeans/VSCODE
# Maven
# PostgreSQL
# [pgAdmin](https://www.pgadmin.org/download/pgadmin-4-apt/)
* [No Linux](https://www.edivaldobrito.com.br/pgadmin4-no-ubuntu/)
# [Docker](https://github.com/IgorAvilaPereira/tbd2024_1sem/blob/main/docker.md)
```
sudo apt install docker.io
```

***

# [KeyDB](https://docs.keydb.dev/)

Alternativa open-source ao Redis

## [Download](https://docs.keydb.dev/docs/download/)

### [Install com Docker](https://hub.docker.com/r/eqalpha/keydb)

```sh
docker pull eqalpha/keydb
```

### [Install PPA-DEB](https://docs.keydb.dev/docs/ppa-deb)
  
```sh
sudo apt install build-essential nasm autotools-dev autoconf libjemalloc-dev tcl tcl-dev uuid-dev libcurl4-openssl-dev libbz2-dev libzstd-dev liblz4-dev libsnappy-dev libssl-dev
```
```sh
echo "deb https://download.keydb.dev/open-source-dist jammy main" | sudo tee /etc/apt/sources.list.d/keydb.list
 sudo wget -O /etc/apt/trusted.gpg.d/keydb.gpg https://download.keydb.dev/open-source-dist/keyring.gpg
sudo apt update
sudo apt install keydb
```
obs: troque *jammy* pelo nome correto da sua versão do seu Ubuntu.

## Status, Start e Stop

```sh
sudo service keydb-server status
sudo service keydb-server start
sudo service keydb-server stop
```

## [Command line](https://docs.keydb.dev/docs/keydbcli)

```sh
keydb-cli 
```

Todos os comandos do Redis são válidos.

## Conexão com Java - Driver [JEDIS](https://github.com/redis/jedis)

Jedis é o mesmo usado para o REDIS

***

## [Redis](https://redis.io/docs/latest/operate/oss_and_stack/install/install-redis/)

### Distribuições baseadas em Debian/Ubuntu

```bash
sudo apt-get update 
sudo apt-get install redis-server
```

### Docker

```bash
-- 1ª vez
sudo docker run --name redis -p 6379:6379 -d redis:latest
sudo docker exec -it redis redis-cli
-- obs: o sudo pode ser opcional
-- demais vezes
sudo docker start redis
sudo docker exec -it redis redis-cli
-- obs: o sudo pode ser opcional
```

***

## MongoDB

### Docker

```bash
-- 1ª vez
sudo docker run --name some-mongo -p 27017:27017 -d mongo:latest
sudo docker exec -it some-mongo mongosh
-- obs: o sudo pode ser opcional
-- demais vezes
sudo docker start some-mongo
sudo docker exec -it some-mongo mongosh
-- obs: o sudo pode ser opcional
```

 * https://hub.docker.com/_/mongo

### Distribuições baseadas em Debian/Ubuntu

 * https://www.mongodb.com/docs/manual/tutorial/install-mongodb-on-ubuntu/

***

## Neo4j

```bash
-- 1ª vez
sudo docker run \
--publish=7474:7474 --publish=7687:7687 \
--volume=$HOME/neo4j/data:/data \
--env=NEO4J_AUTH=neo4j/password \
--name neo4j neo4j

-- demais vezes
sudo docker start neo4j
sudo docker exec -it neo4j bash
```
* Acessar o _client_ em [http://localhost:7474/browser/](http://localhost:7474/browser/)

* Para as conexões (via programas/código) usar a porta 7687

**obs:** 

* o parâmetro --volume define o PATH onde as informações salvas serão armazenadas;
* o parâmetro --volume pode ser também usado para os comandos Docker dos demais BD's. Sem --volume as informações armazenadas serão perdidas após cada execução (exec);

***

## Cassandra

```bash
-- 1ª vez
sudo docker pull cassandra

sudo docker run --name cassandra -p \
127.0.0.1:9042:9042 -p 127.0.0.1:9160:9160 -d cassandra

sudo docker exec -it cassandra cqlsh

-- demais vezes
sudo docker start cassandra
sudo docker exec -it cassandra cqlsh
```
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
