package com.integrador.projeto_comanda.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.integrador.projeto_comanda.domain.PreparoCozinha;
import com.integrador.projeto_comanda.services.PreparoCozinhaService;

@RestController
@RequestMapping(value = "/preparo")
public class PreparoCozinhaResource {
		
		@Autowired
		private PreparoCozinhaService service;
		
		@RequestMapping(value="/{id}", method=RequestMethod.GET)
		public ResponseEntity<?> find(@PathVariable Long id) {
			
			PreparoCozinha obj = service.find(id);
			return ResponseEntity.ok().body(obj);
		}
}