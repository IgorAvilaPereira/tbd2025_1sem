package br.edu.ifrs.minicurso.springsolidapi.repository;

import org.springframework.stereotype.Repository;


import br.edu.ifrs.minicurso.springsolidapi.model.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}

