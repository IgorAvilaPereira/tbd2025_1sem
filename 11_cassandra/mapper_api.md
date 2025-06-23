# Mapper API

**Mapper API** permite trabalhar com entidades Java de forma parecida com JPA (Hibernate), usando anotações e interfaces para acessar o banco de dados.

---

## ✅ Requisitos:

1. **Driver Java 4.x da DataStax**
2. Java 11+
3. Maven

---

## 📦 1. Dependências no `pom.xml`

```xml
<dependencies>
  <!-- Driver principal -->
  <dependency>
    <groupId>com.datastax.oss</groupId>
    <artifactId>java-driver-core</artifactId>
    <version>4.17.0</version>
  </dependency>

  <!-- Mapper API -->
  <dependency>
    <groupId>com.datastax.oss</groupId>
    <artifactId>java-driver-mapper-runtime</artifactId>
    <version>4.17.0</version>
  </dependency>

  <!-- Annotation processor para gerar o código do mapper -->
  <dependency>
    <groupId>com.datastax.oss</groupId>
    <artifactId>java-driver-mapper-processor</artifactId>
    <version>4.17.0</version>
    <scope>provided</scope>
  </dependency>
</dependencies>
```

---

## 📁 Estrutura do Projeto

```
/src
 └── /main
     └── /java
         └── modelo
             └── Usuario.java
         └── dao
             ├── UsuarioDao.java
             └── AppMapper.java
         └── Main.java
```

---

## 📘 2. Entidade: `Usuario.java`

```java
package modelo;

import com.datastax.oss.driver.api.mapper.annotations.*;

import java.time.Instant;
import java.util.UUID;

@Entity
@CqlName("usuarios")
public class Usuario {
    @PartitionKey
    private UUID id;
    private String nome;
    private String email;
    private Instant dataCadastro;

    // Getters e setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Instant getDataCadastro() { return dataCadastro; }
    public void setDataCadastro(Instant dataCadastro) { this.dataCadastro = dataCadastro; }
}
```

---

## 🗃️ 3. DAO Interface: `UsuarioDao.java`

```java
package dao;

import com.datastax.oss.driver.api.mapper.annotations.*;
import modelo.Usuario;

import java.util.UUID;

@Dao
public interface UsuarioDao {

    @Insert
    void salvar(Usuario usuario);

    @Select
    Usuario buscarPorId(UUID id);
}
```

---

## 🗺️ 4. Mapper Interface: `AppMapper.java`

```java
package dao;

import com.datastax.oss.driver.api.mapper.annotations.*;
import com.datastax.oss.driver.api.core.CqlSession;

@Mapper
public interface AppMapper {
    @DaoFactory
    UsuarioDao usuarioDao();

    static AppMapper init(CqlSession session) {
        return new AppMapperBuilder(session).build();
    }
}
```

> ⚠️ O `AppMapperBuilder` é gerado automaticamente durante a compilação pelo annotation processor.

---

## 🚀 5. Código Principal: `Main.java`

```java
import com.datastax.oss.driver.api.core.CqlSession;
import dao.AppMapper;
import dao.UsuarioDao;
import modelo.Usuario;

import java.net.InetSocketAddress;
import java.time.Instant;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        try (CqlSession session = CqlSession.builder()
                .addContactPoint(new InetSocketAddress("127.0.0.1", 9042))
                .withLocalDatacenter("datacenter1")
                .withKeyspace("mensageria")
                .build()) {

            AppMapper mapper = AppMapper.init(session);
            UsuarioDao dao = mapper.usuarioDao();

            UUID id = UUID.randomUUID();

            Usuario u = new Usuario();
            u.setId(id);
            u.setNome("Amanda");
            u.setEmail("amanda@email.com");
            u.setDataCadastro(Instant.now());

            dao.salvar(u);
            System.out.println("Usuário salvo!");

            Usuario carregado = dao.buscarPorId(id);
            System.out.println("Buscado: " + carregado.getNome());
        }
    }
}
```

---

## ✅ Passos Finais

* Certifique-se de ter a tabela `usuarios` criada em Cassandra.
* Compile com `mvn clean compile` (isso gera as classes do Mapper).
* Rode o `Main`.

---

## 💡 Vantagens da Mapper API

* Código mais limpo e seguro
* Reduz erros de CQL hardcoded
* Permite reutilização de DAOs e Mappers
* Facilita testes

---

Se quiser, posso te mandar esse projeto como um `.zip`, ou te mostrar como fazer isso com **Spring Boot** + Mapper API. Deseja continuar com isso?

