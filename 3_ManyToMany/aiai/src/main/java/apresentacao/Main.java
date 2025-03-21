package apresentacao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import model.Dependente;
import model.Endereco;
import model.Pessoa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author iapereira
 */
public class Main {
    
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU");
    

    public static void main(String[] args) {
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        
//        entityManager.getTransaction().begin();
//        Pessoa igor = new Pessoa();
//        igor.setNome("Igor");
//        entityManager.persist(igor);   
//        Dependente igorJR = new Dependente();
//        igorJR.setNome("IgorJR");
//        igorJR.setPessoa(igor);
//        igor.getDependentes().add(igorJR);
//        entityManager.getTransaction().commit();
////        entityManager.close();
//        
//        entityManager.getTransaction().begin();
//        Pessoa p = entityManager.find(Pessoa.class, 1);
//        System.out.println(p.getNome());
//        Endereco end = new Endereco();
//        end.setBairro("centro");
//        end.setRua("parque marinha");
//        end.setNro("666");
//        entityManager.persist(end);
//        p.setEndereco(end);
//        entityManager.merge(p);
//        entityManager.getTransaction().commit();
////        entityManager.close();
//        
//        
////https://www.baeldung.com/jpa-query-parameters
//        TypedQuery<Pessoa> query = entityManager.createQuery("SELECT p FROM Pessoa p where p.endereco.rua = ?1", Pessoa.class);
//        query.setParameter(1, "alfredo huch");
//        List<Pessoa> vet = query.getResultList();
//        
//        System.out.println("======");
//        for (int i = 0; i < vet.size(); i++) {
//            Pessoa r = vet.get(i);
//            System.out.println(r.getNome());
//        }
    }
}
