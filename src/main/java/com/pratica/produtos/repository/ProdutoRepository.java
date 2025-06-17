package com.pratica.produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratica.produtos.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
