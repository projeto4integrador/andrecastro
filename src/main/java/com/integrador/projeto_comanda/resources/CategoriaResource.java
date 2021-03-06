package com.integrador.projeto_comanda.resources;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.integrador.projeto_comanda.domain.Categoria;
import com.integrador.projeto_comanda.eventos.RecursoCriadoEvent;
import com.integrador.projeto_comanda.repositories.CategoriaRepository;
import com.integrador.projeto_comanda.services.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaResource {
	
	@Autowired
	private CategoriaRepository categoriaDAO;
	@Autowired
	private CategoriaService service;
	@Autowired
	private ApplicationEventPublisher publisher;	
	
	@PostMapping
	public ResponseEntity<Categoria> criar(@Valid @RequestBody Categoria categoria, HttpServletResponse response) {
		Categoria categoriaSalva = categoriaDAO.save(categoria);
		publisher.publishEvent(new RecursoCriadoEvent(this, response,  categoriaSalva.getId()));
		return ResponseEntity.status(HttpStatus.CREATED).body(categoriaSalva);
	}
	
	@GetMapping
	public List<Categoria> listar() {
		return categoriaDAO.findAll();
	}	
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> buscarPeloCodigo(@PathVariable Long id){
		
		Categoria categoria = service.find(id);
		
		if(categoria != null){
			return ResponseEntity.ok().body(categoria);
		}else {
			return ResponseEntity.notFound().build(); // retorna 404
		}
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long id){
		categoriaDAO.delete(id);
	}
	
}
