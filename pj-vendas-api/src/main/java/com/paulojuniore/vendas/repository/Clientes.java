package com.paulojuniore.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulojuniore.vendas.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long> {

}
