package com.paulojuniore.vendas.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulojuniore.vendas.model.Cliente;
import com.paulojuniore.vendas.model.Venda;
import com.paulojuniore.vendas.repository.Clientes;
import com.paulojuniore.vendas.repository.Vendas;
import com.paulojuniore.vendas.service.VendaService;

@RestController
@RequestMapping("/vendas")
public class VendasResource {
	
	@Autowired
	private Vendas vendas;
	
	@Autowired
	private VendaService vendaService;
	
	@GetMapping
	public List<Venda> listar() {
		return vendas.findAll();
	}
	
	@PostMapping
	public Venda adicionar(@RequestBody @Valid Venda venda) {
		return vendaService.adicionar(venda); 
	}

}