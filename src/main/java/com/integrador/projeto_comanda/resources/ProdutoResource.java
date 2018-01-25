package com.integrador.projeto_comanda.resources;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.integrador.projeto_comanda.domain.Produto;
import com.integrador.projeto_comanda.repositories.ProdutoRepository;
import com.integrador.projeto_comanda.services.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoResource {
	
	@Autowired
	private ProdutoRepository produtoDAO;
	@Autowired
	private ProdutoService produtoservice;
	
	@PostMapping
	public Produto criar(@Valid @RequestBody Produto produto, HttpServletResponse response) {
		Produto produtoSalva = produtoDAO.save(produto);
		return produtoSalva;
		
	}	
	
	
	@GetMapping
	public List<Produto> listar() {
		List<Produto> produtos = produtoDAO.findAll();
		return produtos;
	}	
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> buscarPeloCodigo(@PathVariable Long id){
		
		Produto produto = produtoservice.find(id);
		
		if(produto != null){
			return ResponseEntity.ok().body(produto);
		}else {
			return ResponseEntity.notFound().build(); // retorna 404
		}
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long id){
		produtoDAO.delete(id);
	}
	
}
