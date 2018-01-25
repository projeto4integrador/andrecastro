package com.integrador.projeto_comanda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.integrador.projeto_comanda.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{
		
	Pedido findOne(Long id);
}
