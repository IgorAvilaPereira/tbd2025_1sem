/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Funcionario;
import model.Pessoa;

/**
 *
 * @author iapereira
 */
public class FuncionarioDAO {
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU");


    public List<Funcionario> listar() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Funcionario> vetFuncionario = entityManager.createQuery("SELECT f FROM Funcionario f", Funcionario.class).getResultList();
        entityManager.close();
        return vetFuncionario;
    }
    
}
