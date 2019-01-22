package com.paulojuniore.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulojuniore.vendas.model.Produto;

public interface Produtos extends JpaRepository<Produto, Long> {

}
