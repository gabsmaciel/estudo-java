package com.example.exercicios_sb.models.repositories;

import com.example.exercicios_sb.models.entities.Produto;
import jakarta.validation.Valid;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {

    Iterable<Produto> findByNomeContaining(String parteNome);

    void save(@Valid Produto produto);

    Optional<Produto> findById(int id);

    Iterable<Produto> findAll();

    void deleteById(int id);
}
