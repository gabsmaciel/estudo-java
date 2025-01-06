package com.example.exercicios_sb.models.repositories;

import com.example.exercicios_sb.models.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository <Produto,Integer> {


}
