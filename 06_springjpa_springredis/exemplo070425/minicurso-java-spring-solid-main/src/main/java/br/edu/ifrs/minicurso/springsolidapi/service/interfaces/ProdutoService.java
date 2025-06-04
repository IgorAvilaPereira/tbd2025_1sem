package br.edu.ifrs.minicurso.springsolidapi.service.interfaces;

import br.edu.ifrs.minicurso.springsolidapi.dto.ProdutoDTO;
import br.edu.ifrs.minicurso.springsolidapi.model.Aluno;
import br.edu.ifrs.minicurso.springsolidapi.model.Produto;

public interface ProdutoService extends CrudService<Produto, ProdutoDTO> {
    Aluno save(Produto produto);
}
