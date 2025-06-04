package br.edu.ifrs.minicurso.springsolidapi.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties.Jedis;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifrs.minicurso.springsolidapi.dto.AlunoDTO;
import br.edu.ifrs.minicurso.springsolidapi.model.Aluno;
import br.edu.ifrs.minicurso.springsolidapi.model.Produto;
import br.edu.ifrs.minicurso.springsolidapi.repository.ProdutoRepository;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPooled;

/**
 *
 * @author iapereira
 */
@Controller
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    protected ProdutoRepository produtoRepository;

    // @GetMapping("/all")
    // public ResponseEntity<List<Produto>> all() {
    // // Map<String, Object> template = new HashMap();
    // // template.put("hello", "oi");
    // // return new ModelAndView("all.html", template);
    // return ResponseEntity.ok().body(this.produtoRepository.findAll());
    // }

    // @GetMapping("/")
    // public ModelAndView index() {
    // Map<String, Object> template = new HashMap();
    // template.put("hello", "oi");
    // return new ModelAndView("index", template);
    // }

    // @Cacheable("produtos")
    @GetMapping("/")
    public ModelAndView index() {

        JedisPooled jedis = new JedisPooled("localhost", 6379);
        jedis.set("clientName", "Jedis");
        // }
        Map<String, Object> template = new HashMap();
        template.put("vetProduto", this.produtoRepository.findAll());
        return new ModelAndView("all", template);
    }

    @GetMapping("/tela_adicionar")
    public ModelAndView tela_adicionar() {
        Map<String, Object> template = new HashMap();
        return new ModelAndView("tela_adicionar", template);
    }

    @GetMapping("/deletar/{id}")
    public ModelAndView delete(@PathVariable int id) {
        this.produtoRepository.deleteById(id);
        return this.index();

    }

    // @PostMapping("/adicionar")
    @PostMapping(value = "/adicionar")
    public ModelAndView adicionar(Produto produto) {
        this.produtoRepository.save(produto);
        return this.index();
    }
}