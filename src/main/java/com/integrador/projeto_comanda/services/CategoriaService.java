package com.integrador.projeto_comanda.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integrador.projeto_comanda.domain.Categoria;
import com.integrador.projeto_comanda.repositories.CategoriaRepository;
import com.integrador.projeto_comanda.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriarepository;
	
	public Categoria find(Long id) {
		Categoria categoria = categoriarepository.findOne(id);
		if (categoria == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName());
		}
		return categoria;
	}	
	
}
