package com.integrador.projeto_comanda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.integrador.projeto_comanda.domain.Mesa;

@Repository
public interface MesaRepository extends JpaRepository<Mesa, Long>{

}
