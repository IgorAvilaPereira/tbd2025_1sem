package apresentacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Dependente;
import model.Pessoa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author iapereira
 */
public class Aiai {
    
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU");
    

    public static void main(String[] args) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        entityManager.getTransaction().begin();
        Pessoa igor = new Pessoa();
        igor.setNome("aiai");
        entityManager.persist(igor);   
        Dependente igorJR = new Dependente();
        igorJR.setNome("IgorJR");
        igorJR.setPessoa(igor);
        igor.getDependentes().add(igorJR);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
