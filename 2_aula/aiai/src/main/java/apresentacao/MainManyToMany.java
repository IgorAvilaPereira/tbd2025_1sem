/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Funcionario;
import model.Trabalho;

/**
 *
 * @author iapereira
 */
public class MainManyToMany {
    
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU");

    
    public static void main(String[] args) {
        
                EntityManager entityManager = entityManagerFactory.createEntityManager();
//        
        entityManager.getTransaction().begin();        
        Funcionario josue = new Funcionario();
        josue.setNome("Meu nome n eh josue!");       
        entityManager.persist(josue);
        entityManager.getTransaction().commit();
        
        
        entityManager.getTransaction().begin();        
        Trabalho tcc = new Trabalho();
        tcc.setNome("trabalho de conclusao do josue");
        entityManager.persist(tcc);
        entityManager.getTransaction().commit();
        
        
        entityManager.getTransaction().begin();  
        tcc.getFuncionarios().add(josue);
        josue.getTrabalhos().add(tcc);
        entityManager.merge(tcc);
        entityManager.merge(josue);
                
        entityManager.getTransaction().commit();


        
        
        
        
        
    }
    
}
