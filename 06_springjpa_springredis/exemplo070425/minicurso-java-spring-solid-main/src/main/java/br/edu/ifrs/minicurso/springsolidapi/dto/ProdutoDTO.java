package br.edu.ifrs.minicurso.springsolidapi.dto;

import java.math.BigDecimal;

public record ProdutoDTO(String nome, String descricao, BigDecimal preco) {
}
