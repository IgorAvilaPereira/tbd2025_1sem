package br.edu.ifrs.minicurso.springsolidapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.ifrs.minicurso.springsolidapi.dto.ProdutoDTO;
import br.edu.ifrs.minicurso.springsolidapi.model.Aluno;
import br.edu.ifrs.minicurso.springsolidapi.model.Produto;
import br.edu.ifrs.minicurso.springsolidapi.repository.ProdutoRepository;
import br.edu.ifrs.minicurso.springsolidapi.service.interfaces.ProdutoService;

public class ProdutoServiceImpl implements ProdutoService {
    
        @Autowired
        private ProdutoRepository produtoRepository;

        @Override
        public List<Produto> getAll() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getAll'");
        }

        @Override
        public Produto getById(int id) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getById'");
        }

        @Override
        public Produto save(ProdutoDTO dto) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'save'");
        }

        @Override
        public Produto update(int id, ProdutoDTO dto) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'update'");
        }

        @Override
        public boolean delete(int id) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'delete'");
        }

        @Override
        public Aluno save(Produto produto) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'save'");
        }

}