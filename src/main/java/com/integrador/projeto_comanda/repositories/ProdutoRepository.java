package com.integrador.projeto_comanda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.integrador.projeto_comanda.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	
}
