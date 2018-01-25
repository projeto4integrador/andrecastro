package com.integrador.projeto_comanda.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integrador.projeto_comanda.domain.PreparoCozinha;
import com.integrador.projeto_comanda.repositories.PreparoCozinhaRepository;
import com.integrador.projeto_comanda.services.exceptions.ObjectNotFoundException;

@Service
public class PreparoCozinhaService {

	@Autowired
	private PreparoCozinhaRepository repo;

	public PreparoCozinha find(Long id) {
		PreparoCozinha obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + PreparoCozinha.class.getName());
		}
		return obj;
	}

}
