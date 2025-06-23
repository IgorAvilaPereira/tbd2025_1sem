# tbd2025_1sem <br>
## [./01_introducao_OneToMany](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./01_introducao_OneToMany) <br>
[jpa.pdf](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./01_introducao_OneToMany/jpa.pdf) <br>
* [Video - @OneToOne](https://www.youtube.com/watch?v=IXhz1G6w75Q&list=PLvT8P1q6jMWfvCUWOAOJt_mJfsvrV2jp5&index=1&ab_channel=IgorAvilaPereira)

[Baixar todo o material da aula](https://download-directory.github.io/?url=http://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./01_introducao_OneToMany)
[exemplo_jpa_javalin](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./01_introducao_OneToMany/exemplo_jpa_javalin) <br>
## [./02_OneToOne](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./02_OneToOne) <br>
[jpa.pdf](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./02_OneToOne/jpa.pdf) <br>
* +@OneToMany
* @OneToOne
* Herança
[Baixar todo o material da aula](https://download-directory.github.io/?url=http://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./02_OneToOne)
[exemplo_jpa_javalin](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./02_OneToOne/exemplo_jpa_javalin) <br>
## [./03_ManyToMany](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./03_ManyToMany) <br>
@ManyToMany

**Alternativas Easy-Criteria:**

* https://github.com/s4gh/easy-criteria

* https://javanexus.com/blog/overcoming-hurdles-easycriteria-jpa

* https://github.com/uaihebert/uaicriteria

<br>

[Baixar todo o material da aula](https://download-directory.github.io/?url=http://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./03_ManyToMany)
[aiai](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./03_ManyToMany/aiai) <br>
[projeto_pos_aula](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./03_ManyToMany/projeto_pos_aula) <br>
## [./04_springjpa](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./04_springjpa) <br>
[Documentação](https://docs.spring.io/spring-data/jpa/reference/jpa.html)

**Exemplos:**

*  https://github.com/IgorAvilaPereira/QuickStart_SpringJPAMustache

* bom exemplo de api e uso de templates mustache - https://github.com/IgorAvilaPereira/minicurso-java-spring-solid

* bom exemplo de api com swagger - https://github.com/IgorAvilaPereira/SpringJPA_PostgreSQL

[Baixar todo o material da aula](https://download-directory.github.io/?url=http://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./04_springjpa)
## [./05_redis](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./05_redis) <br>
[introducao_nosql_redis.pdf](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./05_redis/introducao_nosql_redis.pdf) <br>
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



[Baixar todo o material da aula](https://download-directory.github.io/?url=http://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./05_redis)
[redis.md](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./05_redis/redis.md) <br>
[exemplo_redis_jedis](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./05_redis/exemplo_redis_jedis) <br>
[minicurso-java-spring-solid-main](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./05_redis/minicurso-java-spring-solid-main) <br>
## [./06_springjpa_springredis](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./06_springjpa_springredis) <br>

* https://github.com/giuliana-bezerra/tutorial-springboot-cache

* https://www.youtube.com/watch?v=YcI9b-lgi7w

&nbsp;
[Baixar todo o material da aula](https://download-directory.github.io/?url=http://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./06_springjpa_springredis)
[exemplo070425](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./06_springjpa_springredis/exemplo070425) <br>
## [./07_mongodb](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./07_mongodb) <br>
[mongodb.pdf](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./07_mongodb/mongodb.pdf) <br>
https://cheatsheets.zip/mongodb

```sh
-- 1ª vez
sudo docker run --name some-mongo -p 27017:27017 -d mongo:latest
sudo docker exec -it some-mongo mongosh
-- obs: o sudo pode ser opcional
-- demais vezes
sudo docker start some-mongo
sudo docker exec -it some-mongo mongosh
-- obs: o sudo pode ser opcional
``` 

<!--
[Slides](https://github.com/IgorAvilaPereira/tbd2024_2sem/raw/main/slides/mongodb.pdf)

[Código](https://github.com/IgorAvilaPereira/tbd2024_2sem/tree/main/codigos/mongodb1)

[Código](https://github.com/IgorAvilaPereira/tbd2024_2sem/tree/main/codigos/mongodb)


[Instalação/Rodando](https://github.com/IgorAvilaPereira/tbd2024_2sem/wiki/Setup#mongodb)
-->

<!--
[Trabalho 3 - MongoDB](https://github.com/IgorAvilaPereira/tbd2024_2sem/wiki/Trabalhos#trabalho-3---mongodb)

[Exemplo - Aula Mongo Pojo](https://github.com/IgorAvilaPereira/tbd2024_2sem/tree/main/codigos/TBD_MongoAula2)

[Exemplo - Aula - POJO](https://github.com/IgorAvilaPereira/tbd2024_2sem/tree/main/codigos/mongo-aula2)
-->

**Material Complementar:**

* https://www.mongodb.com/docs/manual/reference/operator/query/

* https://www.mongodb.com/docs/manual/reference/operator/query-comparison/

* :exclamation: https://www.mongodb.com/docs/manual/core/aggregation-pipeline/

* :exclamation: https://www.mongodb.com/docs/manual/aggregation/


* **Mongo Java Driver com Pojo:** 
  
   * https://www.mongodb.com/developer/languages/java/java-mapping-pojos/
   * https://mongodb.github.io/mongo-java-driver/3.7/driver/getting-started/quick-start-pojo/
   * https://mongodb.github.io/mongo-java-driver/3.7/bson/pojos/
   * https://mongodb.github.io/mongo-java-driver/3.7/driver/tutorials/

**Outros:**

* https://www.mongodb.com/docs/manual/tutorial/insert-documents/

* https://www.mongodb.com/docs/manual/tutorial/query-documents/

* https://www.mongodb.com/docs/manual/tutorial/query-arrays/

* https://www.mongodb.com/docs/manual/reference/operator/query/#std-label-query-selectors

* https://www.mongodb.com/docs/manual/core/aggregation-pipeline/#std-label-aggregation-pipeline-examples

* https://studio3t.com/knowledge-base/articles/mongodb-aggregation-framework/

* https://www.mongodb.com/docs/manual/applications/data-models/

<!--* [Código - Aula](https://github.com/IgorAvilaPereira/tbd2024_2sem/tree/main/codigos/TBD_MongoAula1)-->

* **Principais Comandos**

```
-- Criando/Selecionar um BD
use minhaBase
-- retornar collection users
1) db.users
2) db.getCollection("users")
-- inserir
db.users.insert({"name": "codigo"}) -- legacy
db.users.insertOne({"name": "codigo"}) -- current
-- listar todos
db.users.find()
-- Update
db.users.update({"name": "Igor"},{"name": "novo"}) -- legacy
db.users.updateOne({"name": "Igor"},{$set:{"name":"Igor Pereira"}}) -- current
-- Delete
db.users.remove({"name": "codigo"}) -- legacy
db.users.deleteOne({"name": "codigo"}) -- current
```
**Links:**

* https://www.mongodb.com/docs/manual/crud/

* https://www.mongodb.com/docs/manual/tutorial/insert-documents/

* https://www.mongodb.com/docs/manual/tutorial/query-documents/#query-documents

### MongoDB Java Driver

* [MongoDB Java Driver - Quick Start](https://www.mongodb.com/docs/drivers/java/sync/current/quick-start/)
 
  * **Connect to MongoDB:** https://www.mongodb.com/docs/drivers/java/sync/current/fundamentals/connection/connect/#std-label-connect-to-mongodb

  * **URI de Conexão**
```java
String uri = "mongodb://localhost:27017";
```
* [MongoDB Java Driver - Reference](https://www.mongodb.com/docs/drivers/java/sync/current/quick-reference/)

* **MongoDB Java Driver - Examples**
  * https://github.com/Banco-II-2020-1/crud-mongo
  * https://github.com/mongodb-developer/java-quick-start/tree/master/src/main/java/com/mongodb/quickstart

<!--
* [Exemplo - Aula](https://github.com/IgorAvilaPereira/tbd2024_2sem/tree/main/codigos/aula-mongodb)

* [Exemplo - Aula - POJO](https://github.com/IgorAvilaPereira/tbd2024_2sem/tree/main/codigos/mongo-aula2)
-->

* **Instalação via Maven**
```maven
    <dependencies>
        <dependency>
            <groupId>org.mongodb</groupId>
            <artifactId>mongodb-driver-sync</artifactId>
            <version>4.9.1</version>
        </dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>2.0.7</version>
        </dependency>
    </dependencies>
```

**References:**

* **insertOne:** https://www.mongodb.com/docs/drivers/java/sync/current/usage-examples/insertOne/

* **updateOne:** https://www.mongodb.com/docs/drivers/java/sync/current/usage-examples/updateOne/

* **deleteOne:** https://www.mongodb.com/docs/drivers/java/sync/current/usage-examples/deleteOne/

* **findOne:** https://www.mongodb.com/docs/drivers/java/sync/current/usage-examples/findOne/

* **findMany:** https://www.mongodb.com/docs/drivers/java/sync/current/usage-examples/find/

* **count:** https://www.mongodb.com/docs/drivers/java/sync/current/usage-examples/count/

* :exclamation: https://mongodb.github.io/mongo-java-driver/3.7/driver/getting-started/quick-start-pojo/

* :exclamation: **java-mapping-pojos:** https://www.mongodb.com/developer/languages/java/java-mapping-pojos/

**Extras:**

* [Tutorial](https://www.mongodb.com/docs/manual/tutorial/)

* https://www.mongodb.com/docs/guides/crud/read_queries/

* :exclamation: https://www.mongodb.com/docs/drivers/java/sync/current/fundamentals/crud/read-operations/

* :exclamation: https://www.mongodb.com/docs/manual/reference/operator/

* :exclamation: https://www.mongodb.com/docs/manual/reference/sql-comparison/

* [robo 3t](https://studio3t.com/download-studio3t-free/)

```
-- updateOne
try {
   db.users.updateOne(
      { "nome" : "max" },
      { $set: { "nome" : "maximiliano" } }
   );
} catch (e) {
   print(e);
}

-- removeOne
try {
   db.users.deleteOne( { "_id" : ObjectId("634dea8922941a787369e69a")} );
} catch (e) {
   print(e);
}

-- find 
db.users.find({"nome": "igor"})
db.users.find({nome:{$in:["igor", "erick"]}})
```



[Baixar todo o material da aula](https://download-directory.github.io/?url=http://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./07_mongodb)
[mongobd](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./07_mongodb/mongobd) <br>
[mongodb_pojo](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./07_mongodb/mongodb_pojo) <br>
## [./08_mongodb_aggregation](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./08_mongodb_aggregation) <br>
[exemplos.json](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./08_mongodb_aggregation/exemplos.json) <br>
[mongodb_aggregation.pdf](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./08_mongodb_aggregation/mongodb_aggregation.pdf) <br>
**aggregation**

* https://www.mongodb.com/docs/manual/core/aggregation-pipeline/#std-label-aggregation-pipeline

* https://www.mongodb.com/docs/manual/reference/operator/aggregation/group/#mongodb-pipeline-pipe.-group

**Data Model Examples and Patterns**

* https://www.mongodb.com/docs/manual/applications/data-models/

**mongo compass:**

* https://www.mongodb.com/docs/compass/current/install/



[Baixar todo o material da aula](https://download-directory.github.io/?url=http://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./08_mongodb_aggregation)
## [./09_neo4j_aula1](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./09_neo4j_aula1) <br>
[neo4j_cypher.pdf](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./09_neo4j_aula1/neo4j_cypher.pdf) <br>
[neo4j.pdf](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./09_neo4j_aula1/neo4j.pdf) <br>
Neo4j (aula 1)

<!--
* [Neo4j (Aula 1)](https://github.com/IgorAvilaPereira/tbd2024_2sem/raw/main/slides/neo4j.pdf)

* [Neo4j (Aula 2)](https://github.com/IgorAvilaPereira/tbd2024_2sem/raw/main/slides/neo4j_cypher.pdf)

* [Código](https://github.com/IgorAvilaPereira/tbd2024_2sem/tree/main/codigos/neo4aula1)
-->

* **Instalação**
```
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
Obs: Acessar por http://localhost:7474/

**login:** _neo4j_ e **senha:** _password_

```
-- criar um nó
CREATE(p:Pessoa{cpf: "111.111.111-11", nome: "joao", idade:20})
return p

-- retornar todas pessoas
MATCH(p:Pessoa) RETURN p

-- select
match(p:Pessoa) where p.cpf = "111.111.111-11"
return p

match(p:Pessoa) where p.cpf = "111.111.111-11" or ....
return p

match(p:Pessoa) where p.cpf = "111.111.111-11" and ....
return p

-- amigos dos meus amigos (eu sendo "Pedro"). Retorno: "João"
MATCH (:Pessoa{nome: "Pedro"})<-[:AMIGO]-()<-[:AMIGO]-(p) return p

-- criar uma aresta entre nodos

-- exemplo 1
MATCH (p1:Pessoa), (p2:Pessoa)
where p1.nome = "João" and p2.nome = "Maria" 
CREATE (p1)-[:AMIGO]->(p2)

-- exemplo 2
MATCH (p1:Pessoa), (p2:Pessoa)
where ID(p1) = 10 and ID(p2) = 11
CREATE (p1)-[:AMIGO]->(p2)

-- exemplo3 (criando os nodos e a aresta ao mesmo tempo)
CREATE (a:a {a: 'a'})-[r:a]->(b:a {a: 'a'})

-- aresta com atributo
MATCH (p1:Pessoa), (p2:Pessoa) 
WHERE p1.nome = "João" AND p2.nome = "Maria" 
CREATE (p1)-[:AMIGO1{desde:"19/11/2020"}]->(p2)

-- update
MATCH (p:Pessoa) where p.nome = "Pedro"
set p.nome = "Pedro silva"

-- delete o nodo
MATCH (p:Pessoa) where p.nome = "Pedro silva"
Delete p

-- deletar relacionamentos AMIGO de joão
MATCH (:Pessoa{nome: 'joao'})-[a:AMIGO]-()
DELETE a

-- delete o nodo e seus relacionamentos
MATCH (p:Pessoa) where p.nome = "Pedro silva"
detach Delete p

-- delete tudo
MATCH (n)
DETACH DELETE n
```

**Driver JAVA-NEO4J:**
```xml
<dependencies>
<dependency>
<groupId>org.neo4j.driver</groupId>
<artifactId>neo4j-java-driver</artifactId>
<version>4.4.0</version>
</dependency>
</dependencies>
```

```java
package view;
import model.Pessoa;
import org.neo4j.driver.*;
import java.time.LocalDate;
import java.util.stream.Collectors;
import static org.neo4j.driver.Values.parameters;

public class App {
    public static void main(String[] args) {

        Driver driver = GraphDatabase.driver("bolt://localhost:7687",
                AuthTokens.basic("neo4j", "neo4j*"));

        Pessoa pessoa = new Pessoa("222.222.222-02", "Maria",
                LocalDate.of(1993,10,25));

        try(Session session = driver.session()){

            // Adicionando uma pessoa
            Result result = session.run("CREATE (p:Pessoa{cpf:$cpf, nome:$nome, nascimento:$nascimento})",
                    parameters("cpf", pessoa.getCpf(), "nome", pessoa.getNome(),
                            "nascimento", pessoa.getNascimento()));
            System.out.println(result.consume().counters().nodesCreated());

            // Criar um relacionamento
            Result result = session.run("MATCH (p1:Pessoa{cpf:$cpf}),(p2:Pessoa{cpf:$cpf2})" +
                    "CREATE (p1)-[:AMIGO]->(p2)",
                    parameters("cpf", "111.111.111-01", "cpf2", "222.222.222-02"));
            System.out.println(result.consume().counters().relationshipsCreated());

            // Recuperando todas as pessoas
            Result result = session.run("MATCH (p:Pessoa) RETURN p.cpf, p.nome, p.nascimento");
            System.out.println(result.stream().map(record ->
                    new Pessoa(record.get(0).asString(),
                    record.get(1).asString(),
                    record.get(2).asLocalDate()))
                    .collect(Collectors.toList()));

          // Buscando os CPFs de todos os amigos de uma pessoa
          Result result = session.run("MATCH (p:Pessoa{cpf:$cpf})-[:AMIGO]->(p2) RETURN p2",
                    parameters("cpf", "111.111.111-01"));
            result.list().forEach(r -> System.out.println(r.get(0).asNode().values()));
        } finally {
            driver.close();
        }
    }
}
```

**Links Complementares:**

* https://neo4j.com/docs/cypher-manual/current/introduction/
* https://neo4j.com/docs/cypher-manual/current/clauses/create/
* https://github.com/santanche/lab2learn/blob/master/network/cypher/s01exercises/s01b-cypher-basics.md
* https://neo4j.com/developer/java/
* https://neo4j.com/docs/java-manual/current/get-started/

**Vídeos:**

* https://youtube.com/playlist?list=PLdvBzqdsNjSePpPN_9ro4TBAFr3xRGyuA&si=Jne-M3GEQUE3pIUW

&nbsp;
[Baixar todo o material da aula](https://download-directory.github.io/?url=http://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./09_neo4j_aula1)
[scripts_cypher.txt](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./09_neo4j_aula1/scripts_cypher.txt) <br>
[neo4j2](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./09_neo4j_aula1/neo4j2) <br>
## [./09_neo4j_aula2](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./09_neo4j_aula2) <br>
[amizades.csv](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./09_neo4j_aula2/amizades.csv) <br>
[disciplinas.csv](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./09_neo4j_aula2/disciplinas.csv) <br>
[neo4j_cypher.pdf](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./09_neo4j_aula2/neo4j_cypher.pdf) <br>
[neo4j_loadcsv.pdf](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./09_neo4j_aula2/neo4j_loadcsv.pdf) <br>
[neo4j.pdf](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./09_neo4j_aula2/neo4j.pdf) <br>
[perfis.csv](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./09_neo4j_aula2/perfis.csv) <br>
[prerequisitos.csv](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./09_neo4j_aula2/prerequisitos.csv) <br>
<!--
Neo4j (aula 2)

[Código](https://github.com/IgorAvilaPereira/tbd2024_2sem/blob/main/codigos/neo4jaula2.zip)

* [Neo4j (Aula 3)](https://github.com/IgorAvilaPereira/tbd2024_2sem/raw/main/slides/neo4j_loadcsv.pdf)
* [Neo4j (Aula 2)](https://github.com/IgorAvilaPereira/tbd2024_2sem/raw/main/slides/neo4j_cypher.pdf)
* [Neo4j (Aula 1)](https://github.com/IgorAvilaPereira/tbd2024_2sem/raw/main/slides/neo4j.pdf)
-->
**Links Complementares:**

* https://neo4j.com/docs/cypher-manual/current/clauses/load-csv/#query-load-csv-introduction
* https://github.com/santanche/lab2learn/blob/master/network/cypher/s01exercises/s01b-cypher-basics.md
* https://github.com/santanche/lab2learn/blob/master/network/cypher/s01exercises/s02b-cypher-faers.md

* https://neo4j.com/developer/java/
* https://neo4j.com/docs/java-manual/current/get-started/
* https://neo4j.com/docs/cypher-manual/current/introduction/
* https://neo4j.com/docs/cypher-manual/current/clauses/create/

**CSV - Disciplinas e Pré-requisitos:**

<!--
* [disciplinas.csv](https://github.com/IgorAvilaPereira/tbd2024_2sem/blob/main/disciplinas.csv)

* [pré-requisitos.csv](https://github.com/IgorAvilaPereira/tbd2024_2sem/blob/main/prerequisitos.csv)

* [script de importação](https://github.com/IgorAvilaPereira/tbd2024_2sem/blob/main/scripts_importacao_disciplinas_e_prerequisitos.txt)
-->

**CSV - Amigos e Amizades:**

<!--* [perfis.csv](https://github.com/IgorAvilaPereira/tbd2024_2sem/blob/main/perfis.csv)

* [amizades.csv](https://github.com/IgorAvilaPereira/tbd2024_2sem/blob/main/amizades.csv)

* [script de importação](https://github.com/IgorAvilaPereira/tbd2024_2sem/blob/main/scripts_importacao_amigos_e_amizades.txt)
  * obs: usando o MERGE
-->

&nbsp;[Baixar todo o material da aula](https://download-directory.github.io/?url=http://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./09_neo4j_aula2)
[scripts_importacao_amigos_e_amizades.txt](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./09_neo4j_aula2/scripts_importacao_amigos_e_amizades.txt) <br>
[scripts_importacao_disciplinas_e_prerequisitos.txt](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./09_neo4j_aula2/scripts_importacao_disciplinas_e_prerequisitos.txt) <br>
[neo4j2](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./09_neo4j_aula2/neo4j2) <br>
## [./10_cassandra](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./10_cassandra) <br>
[cassandra.pdf](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./10_cassandra/cassandra.pdf) <br>
[novo_cronograma.md](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./10_cassandra/novo_cronograma.md) <br>

**Propor novo cronograma**


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

```xml
<dependencies>
        <dependency>
            <groupId>com.datastax.cassandra</groupId>
            <artifactId>cassandra-driver-core</artifactId>
            <version>3.11.0</version>
        </dependency>
        <dependency>
            <groupId>com.datastax.cassandra</groupId>
            <artifactId>cassandra-driver-mapping</artifactId>
            <version>3.11.0</version>
        </dependency>
    </dependencies>
```



[Baixar todo o material da aula](https://download-directory.github.io/?url=http://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/10_cassandra)

&nbsp;
[demo](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./10_cassandra/demo) <br>
[imagens](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./10_cassandra/imagens) <br>
## [./11_cassandra](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./11_cassandra) <br>
[cassandra_com_java.md](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./11_cassandra/cassandra_com_java.md) <br>
[cassandra.md](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./11_cassandra/cassandra.md) <br>
[gabarito_mini_projeto_sistema_de_mensagens.md](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./11_cassandra/gabarito_mini_projeto_sistema_de_mensagens.md) <br>
[mini_projeto_sistema_de_mensagens.md](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./11_cassandra/mini_projeto_sistema_de_mensagens.md) <br>

* Maryene 100% mas ainda não testei com afinco!

* Can +ou-

[Código - Exemplo](https://github.com/IgorAvilaPereira/crud-java-cassandra)

[Baixar todo o material da aula](https://download-directory.github.io/?url=http://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/11_cassandra)
&nbsp;
[demo](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./11_cassandra/demo) <br>
## [./1_introducao](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./1_introducao) <br>
[*.*](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./1_introducao/*.*) <br>
[aiai](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./1_introducao/aiai) <br>
## [./2_aula](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./2_aula) <br>
[*.*](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./2_aula/*.*) <br>
[aiai](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./2_aula/aiai) <br>
## [./3_aula](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./3_aula) <br>
[*.*](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./3_aula/*.*) <br>
[aiai](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./3_aula/aiai) <br>
[projeto_pos_aula](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./3_aula/projeto_pos_aula) <br>
## [./5_redis](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./5_redis) <br>
[*.*](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./5_redis/*.*) <br>
[exemplo_redis_jedis](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./5_redis/exemplo_redis_jedis) <br>
[minicurso-java-spring-solid-main](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./5_redis/minicurso-java-spring-solid-main) <br>
## [./6_springjpa_springredis](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./6_springjpa_springredis) <br>
[*.*](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./6_springjpa_springredis/*.*) <br>
[exemplo070425](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./6_springjpa_springredis/exemplo070425) <br>
## [./7_mongodb](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./7_mongodb) <br>
[*.*](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./7_mongodb/*.*) <br>
[mongobd](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./7_mongodb/mongobd) <br>
[mongodb_pojo](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./7_mongodb/mongodb_pojo) <br>
## [./9_neo4j_aula1](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./9_neo4j_aula1) <br>
[*.*](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./9_neo4j_aula1/*.*) <br>
[neo4j2](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./9_neo4j_aula1/neo4j2) <br>
## [./9_neo4j_aula2](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./9_neo4j_aula2) <br>
[*.*](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./9_neo4j_aula2/*.*) <br>
[neo4j2](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./9_neo4j_aula2/neo4j2) <br>
## [./guia_rapido](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./guia_rapido) <br>
# Guia Rápido

* https://cheatsheets.zip/postgres
* https://cheatsheets.zip/redis
* https://cheatsheets.zip/mongodb
* https://cheatsheets.zip/neo4j
[Baixar todo o material da aula](https://download-directory.github.io/?url=http://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./guia_rapido)
## [./javalin_mustache_exemplo](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./javalin_mustache_exemplo) <br>
Exemplo Javalin 
[Baixar todo o material da aula](https://download-directory.github.io/?url=http://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./javalin_mustache_exemplo)
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
[Baixar todo o material da aula](https://download-directory.github.io/?url=http://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./setup)
## [./trabalhos](https://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./trabalhos) <br>
### 💼 **Trabalho 2: Sistema de Recomendação Social com Java, MongoDB e Neo4j**

### 🎯 **Objetivo do Projeto**

Construir um sistema web baseado em **Java** que integra dois bancos de dados NoSQL complementares:

* **MongoDB** para armazenar **conteúdo rico de usuários** (posts, perfis, mensagens).
* **Neo4j** para **modelar relacionamentos sociais e comportamentos** (amizades, curtidas, interações, sugestões).

O sistema deverá:

* Armazenar perfis e conteúdos de usuários.
* Registrar interações sociais como "seguir", "curtir" e "comentar".
* Gerar recomendações de novos amigos e conteúdos.
* Exibir estatísticas de engajamento e conexões.

---

### 🧱 **Tecnologias Desejáveis**

| Tecnologia          | Finalidade                                    |
| ------------------- | --------------------------------------------- |
| Java 17+            | Backend principal                             |
| Spring Boot         | Framework de aplicação                        |
| MongoDB             | Armazenamento de dados de conteúdo            |
| Neo4j               | Armazenamento de relações e análise de grafos |
| Spring Data MongoDB | Integração com MongoDB                        |
| Neo4j Java Driver   | Integração com o banco de grafos Neo4j        |
| Swagger/OpenAPI     | Documentação e teste das APIs                 |

---

### 🧩 **Módulos do Projeto**

#### 1. **Usuários**

* Armazenados em MongoDB (dados de perfil: nome, bio, interesses).
* Representados também como nós no Neo4j para interações sociais.

#### 2. **Posts**

* Criados e armazenados em MongoDB.
* Indexados para busca por hashtag, conteúdo e autor.

#### 3. **Relacionamentos Sociais (Neo4j)**

* `(:Usuario)-[:SEGUE]->(:Usuario)`
* `(:Usuario)-[:CURTIU]->(:Post)`
* `(:Usuario)-[:COMENTOU]->(:Post)`
* `(:Usuario)-[:VISITOU_PERFIL]->(:Usuario)`

---

### 🔁 **Fluxo da Aplicação**

1. **Registro de usuário**

   * Grava dados no MongoDB.
   * Cria nó `Usuario` em Neo4j com mesmo ID.

2. **Criação de post**

   * Grava documento no MongoDB.
   * Cria nó `Post` em Neo4j e relacionamento com o autor.

3. **Interações**

   * Quando um usuário curte/comenta/segue:

     * É registrado como relação em Neo4j.
     * (Opcional) adiciona referência em MongoDB no histórico.

4. **Recomendações**

   * Neo4j analisa conexões e sugere:

     * Amigos em comum.
     * Posts populares entre contatos de 2º grau.

---
<!--
### 🔍 **Exemplo de Consulta em Neo4j (Cypher)**

```cypher
MATCH (u:Usuario {id: 'user123'})-[:SEGUE]->(amigo)-[:CURTIU]->(post:Post)
WHERE NOT (u)-[:CURTIU]->(post)
RETURN post.id, count(*) AS popularidade
ORDER BY popularidade DESC
LIMIT 5;
```

> Retorna os posts mais populares entre amigos que o usuário ainda não curtiu.

---
-->

### 📄 **Sugestão de Documento - MongoDB**

```json
{
  "_id": "post123",
  "usuario_id": "user123",
  "conteudo": "Visitando o Parque Ibirapuera!",
  "hashtags": ["#parque", "#natureza"],
  "data_criacao": "2025-05-25T10:00:00Z",
  "comentarios": [
    { "usuario_id": "user456", "texto": "Que legal!" }
  ]
}
```

---


### 🧪 **Casos de Uso a Implementar**

| Caso de Uso                | MongoDB | Neo4j |
| -------------------------- | ------- | ----- |
| Criar perfil de usuário    | ✅       | ✅     |
| Criar post                 | ✅       | ✅     |
| Seguir outro usuário       | ❌       | ✅     |
| Curtir um post             | ❌       | ✅     |
| Recomendar amigos          | ❌       | ✅     |
| Recomendar posts populares | ❌       | ✅     |
| Buscar posts por hashtag   | ✅       | ❌     |

---


### 🎓 **Entregáveis do Trabalho**

* Aplicação Java funcional
* Banco MongoDB com dados de usuários e posts
* Banco Neo4j com grafo social
* Documentação de API (Swagger ou Postman)
* Scripts de carga inicial (seed)
* Relatório técnico (opcional para fins acadêmicos)

***

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

### Trabalho 1 - JPA + Redis

Desenvolvimento de Aplicação E-commerce. <!-- com JPA, PostgreSQL e Redis-->

**Exigências:**

* Criar uma aplicação de e-commerce em Java, utilizando JPA para mapeamento objeto-relacional com PostgreSQL e Redis para gerenciamento do carrinho de compras.

* Desenvolver uma API ou Desenvolver o sistema por terminal, por interface gráfica (desktop) ou web;

**No PostgreSQL:**

* CRUD para as classes do sistema: Cliente, Pedido, Item e Produto. 
    * Obs: para facilitar o desenvolvimento, Produtos tem estoque "infinito"
* Mostrar os pedidos anteriores
* Persistir o pedido (depois de que o cliente pega para fechar o pedido)

**No Redis:**

* Criar um Pedido (Carrinho)
* Adicionar Item no Pedido (Carrinho)
* Editar Quantidades de cada Item do Carrinho
* Mostrar o valor parcial e o valor total do Pedido
* Destruir as informacões do Pedido (Carrinho) depois que o pedido seja, efetivamente, salvo no PostgreSQL

<!--![trabalho1](trabalho1.png)

## Valor: 5



### Trabalho 3 - MONGODB

O objetivo é desenvolver uma agenda de contatos com MongoDB e Java:

Nesta agenda, cada contato tem um nome, telefones (possível mais de 1) e um endereço. Cada endereço cadastrado possui cidade, rua, bairro, número e complemento.

* (1.0) Desenvolva as operações CRUD para os contatos da agenda (incluindo seus endereços e telefones)

* (1.0) Liste os contatos que moram em uma mesma cidade (Ex: Rio Grande)

* (1.0) Liste os contatos que tem tem mais de um telefone cadastrado
Dicas:

https://stackoverflow.com/questions/29577713/string-field-value-length-in-mongodb

**Valor: 3**-->
[Baixar todo o material da aula](https://download-directory.github.io/?url=http://github.com/IgorAvilaPereira/tbd2025_1sem/tree/main/./trabalhos)
[trabalho1.png](https://github.com/IgorAvilaPereira/tbd2025_1sem/blob/main/./trabalhos/trabalho1.png) <br>
