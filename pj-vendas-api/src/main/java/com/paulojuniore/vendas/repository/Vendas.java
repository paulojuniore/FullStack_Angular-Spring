package com.paulojuniore.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulojuniore.vendas.model.Venda;

public interface Vendas extends JpaRepository<Venda, Long> {

}
