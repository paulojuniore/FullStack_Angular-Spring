package com.paulojuniore.vendas.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulojuniore.vendas.model.Venda;
import com.paulojuniore.vendas.repository.Produtos;
import com.paulojuniore.vendas.repository.Vendas;

@Service
public class VendaService {
	
	@Autowired
	private Vendas vendas;
	
	@Autowired
	private Produtos produtos;
	
	public Venda adicionar(Venda venda) {
		venda.setCadastro(LocalDateTime.now());
		venda.getItens().forEach(i -> {
			i.setVenda(venda);
			i.setProduto(produtos.findById(i.getProduto().getId()).get());
		});
		
		BigDecimal totalItens = venda.getItens().stream()
				.map(i -> i.getProduto().getValor().multiply(new BigDecimal(i.getQuantidade())))
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		
		venda.setTotal(totalItens.add(venda.getFrete()));
		
		return vendas.save(venda);
	}

}
