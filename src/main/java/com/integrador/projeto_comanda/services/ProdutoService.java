package com.integrador.projeto_comanda.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integrador.projeto_comanda.domain.Produto;
import com.integrador.projeto_comanda.repositories.ProdutoRepository;
import com.integrador.projeto_comanda.services.exceptions.ObjectNotFoundException;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtorepository;
	
	public Produto find(Long id) {
		Produto produto = produtorepository.findOne(id);
		if (produto == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Produto.class.getName());
		}
		return produto;
	}	
	
}
