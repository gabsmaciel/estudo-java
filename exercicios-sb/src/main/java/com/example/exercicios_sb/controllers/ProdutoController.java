package com.example.exercicios_sb.controllers;

import com.example.exercicios_sb.models.entities.Produto;
import com.example.exercicios_sb.models.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public @ResponseBody  Produto novoProduto(@RequestParam String nome) {
        Produto produto = new Produto(nome);
        produtoRepository.save(produto);
        return produto;
    }
}
