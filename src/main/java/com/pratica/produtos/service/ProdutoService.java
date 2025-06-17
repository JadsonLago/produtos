package com.pratica.produtos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratica.produtos.model.Produto;
import com.pratica.produtos.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    //Listar => Todos e por id
    public List<Produto> listarTodos(){

        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarPorId(Long id){

        return produtoRepository.findById(id);
    }

    //Salvar => Criar e editar
    public Produto salvar(Produto produto){

        return produtoRepository.save(produto);
    }

    //Deletar
      public void deletar(Long id) {
        produtoRepository.deleteById(id);
    }    
}
