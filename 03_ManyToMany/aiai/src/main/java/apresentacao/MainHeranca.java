package apresentacao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import model.Dependente;
import model.Endereco;
import model.Pessoa;
import model.PessoaFisica;
import model.PessoaJuridica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author iapereira
 */
public class MainHeranca {
    
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU");
    

    public static void main(String[] args) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        entityManager.getTransaction().begin();
        PessoaFisica igor = new PessoaFisica();
        igor.setNome("Igor");
        entityManager.persist(igor);   
            
        PessoaJuridica empresa = new PessoaJuridica();
        empresa.setCnpj("2324324234");
        empresa.setNome("igor corp.");
        entityManager.persist(empresa);
        
        
        entityManager.getTransaction().commit();
        entityManager.close();
    
    }
}
