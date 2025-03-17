/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author iapereira
 */
import java.util.HashMap;
import java.util.Map;
import persistencia.PessoaDAO;

public class Controller {

    private final PessoaDAO pessoaDAO;

    public Controller() {
        this.pessoaDAO = new PessoaDAO();
    }

    public Map<String, ? extends Object> result() {
        Map<String, Object> t = new HashMap<>();
        t.put("oi", "ola");
        return t;
    }

    public Map<String, ? extends Object> listarPessoas() {
        Map<String, Object> t = new HashMap<>();
//        System.out.println("==============");
//        System.out.println(this.pessoaDAO.listar().get(0).getNome());
//        System.out.println("================");
        t.put("vetPessoa", this.pessoaDAO.listar());
        return t;

    }

    public Map<String, ? extends Object> excluir(int id) {
        System.out.println("id:"+id);
        boolean resultado = this.pessoaDAO.excluir(id);
        Map<String, Object> t = new HashMap<>();
        if (resultado) {
            t.put("mensagem", "excluido com sucesso!");
        }
        else {
            t.put("mensagem", "deu xabum");
        }
        return t;

    }
}
