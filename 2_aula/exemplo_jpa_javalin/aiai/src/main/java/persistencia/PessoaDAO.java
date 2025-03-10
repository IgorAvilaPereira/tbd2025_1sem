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

/**
 *
 * @author iapereira
 */
public class PessoaDAO {
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU");
    
    public List<Pessoa> listar(){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        List<Pessoa> vetPessoa = entityManager.createNativeQuery("SELECT * FROM pessoa", Pessoa.class).getResultList();
        List<Pessoa> vetPessoa2 = entityManager.createQuery("SELECT p FROM Pessoa p", Pessoa.class).getResultList();
//        System.out.println("==============");
//        System.out.println(vetPessoa.get(0).getNome());
//        System.out.println("==============");
        entityManager.close();
        return vetPessoa2;
    }

}
