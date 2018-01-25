package com.integrador.projeto_comanda.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integrador.projeto_comanda.domain.Adicional;
import com.integrador.projeto_comanda.repositories.AdicionalRepository;
import com.integrador.projeto_comanda.services.exceptions.ObjectNotFoundException;

@Service
public class AdicionalService {

	@Autowired
	private AdicionalRepository adicionalrepository;
	
	public Adicional find(Long id) {
		Adicional adicional = adicionalrepository.findOne(id);
		if (adicional == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Adicional.class.getName());
		}
		return adicional;
	}
	
}
