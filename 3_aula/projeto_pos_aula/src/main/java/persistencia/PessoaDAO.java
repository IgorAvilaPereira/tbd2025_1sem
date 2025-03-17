/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Dependente;
import model.Pessoa;
import model.PessoaFisica;
import model.PessoaJuridica;

/**
 *
 * @author iapereira
 */
public class PessoaDAO {

    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU");

    public List<Pessoa> listar() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        List<Pessoa> vetPessoa = entityManager.createNativeQuery("SELECT * FROM pessoa", Pessoa.class).getResultList();
        List<Pessoa> vetPessoa2 = entityManager.createQuery("SELECT p FROM Pessoa p", Pessoa.class).getResultList();
//        System.out.println("==============");
//        System.out.println(vetPessoa.get(0).getNome());
//        System.out.println("==============");
        entityManager.close();
        return vetPessoa2;
    }

    public boolean excluir(int id) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            Pessoa p = entityManager.find(Pessoa.class, id);
            entityManager.remove(p);
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean adicionarPF(PessoaFisica pf) {
        return this.inserir(pf);
    }

    public boolean adicionarPJ(PessoaJuridica pj) {
        return this.inserir(pj);
    }

    private boolean inserir(Object object) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(object);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e) {
            System.out.println("xabum!");
        }
        return false;

    }

    public Pessoa obter(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Pessoa p = entityManager.find(Pessoa.class, id);
        entityManager.close();
        System.out.println("pessoa" + p.getNome());
        System.out.println("pessoa" + p.getId());

        return p;
    }

    public boolean alterar(Object pessoa) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.merge(pessoa);
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public PessoaFisica obterFisica(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        PessoaFisica p = entityManager.find(PessoaFisica.class, id);
        entityManager.close();
        System.out.println("pessoa" + p.getNome());
        System.out.println("pessoa" + p.getId());

        return p;
    }

    public PessoaJuridica obterJuridica(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        PessoaJuridica p = entityManager.find(PessoaJuridica.class, id);
        entityManager.close();
        System.out.println("pessoa" + p.getNome());
        System.out.println("pessoa" + p.getId());
        return p;
    }

}
