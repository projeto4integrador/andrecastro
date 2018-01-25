package com.integrador.projeto_comanda.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integrador.projeto_comanda.domain.Usuario;
import com.integrador.projeto_comanda.repositories.UsuarioRepository;
import com.integrador.projeto_comanda.services.exceptions.ObjectNotFoundException;


@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repo;
	
	public Usuario find(Long id) {
		Usuario obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Usuario.class.getName());
		}
		return obj;
	}
}