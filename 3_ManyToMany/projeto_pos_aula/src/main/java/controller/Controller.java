/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author iapereira
 */
import persistencia.FuncionarioDAO;
import io.javalin.http.Context;
import java.util.HashMap;
import java.util.Map;
import model.Pessoa;
import model.PessoaFisica;
import model.PessoaJuridica;
import persistencia.PessoaDAO;

public class Controller {

    private PessoaDAO pessoaDAO;
    private FuncionarioDAO funcionarioDAO;

    public Controller() {
        this.pessoaDAO = new PessoaDAO();
        this.funcionarioDAO = new FuncionarioDAO();
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
        t.put("vetFuncionario", this.funcionarioDAO.listar());
        return t;

    }

    public Map<String, ? extends Object> excluir(int id) {
        System.out.println("id:" + id);
        boolean resultado = this.pessoaDAO.excluir(id);
        Map<String, Object> t = new HashMap<>();
        if (resultado) {
            t.put("mensagem", "excluido com sucesso!");
        } else {
            t.put("mensagem", "deu xabum");
        }
        return t;

    }

    public Map<String, ? extends Object> adicionar(Context ctx) {
        boolean resultado = false;

        if (ctx.formParam("tipo").equals("pf")) {
            PessoaFisica pf = new PessoaFisica();
            pf.setNome(ctx.formParam("nome"));
            pf.setCpf(ctx.formParam("cpf_cnpj"));
            resultado = this.pessoaDAO.adicionarPF(pf);

        } else {
            PessoaJuridica pj = new PessoaJuridica();
            pj.setNome(ctx.formParam("nome"));
            pj.setCnpj(ctx.formParam("cpf_cnpj"));
            resultado = this.pessoaDAO.adicionarPJ(pj);

        }

        Map<String, Object> t = new HashMap<>();
        if (resultado) {
            t.put("mensagem", "adicionado com sucesso!");
        } else {
            t.put("mensagem", "deu xabum");
        }
        return t;
    }

    public Map<String, ? extends Object> tela_alterar(int id) {
        Map<String, Object> t = new HashMap<>();
        t.put("pessoa", this.pessoaDAO.obter(id));
        return t;

    }

    public Map<String, ? extends Object> alterar(Context ctx) {
        boolean resultado = false;
        if (ctx.formParam("tipo").equals("pf")) {
            PessoaFisica p =  this.pessoaDAO.obterFisica(Integer.parseInt(ctx.formParam("id")));
            p.setNome(ctx.formParam("nome")); 
            p.setCpf(ctx.formParam("cpf_cnpj"));
            resultado = this.pessoaDAO.alterar(p);

        } else {
            PessoaJuridica p =  this.pessoaDAO.obterJuridica(Integer.parseInt(ctx.formParam("id")));
            p.setNome(ctx.formParam("nome")); 
            p.setCnpj(ctx.formParam("cpf_cnpj"));
            resultado = this.pessoaDAO.alterar(p);

        }
//        p.setCnpj
        Map<String, Object> t = new HashMap<>();
        if (resultado) {
            t.put("mensagem", "alterado com sucesso!");
        } else {
            t.put("mensagem", "deu xabum");
        }
        return t;
    }
}
