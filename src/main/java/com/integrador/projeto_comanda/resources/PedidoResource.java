package com.integrador.projeto_comanda.resources;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.integrador.projeto_comanda.domain.Pedido;
//import com.integrador.projeto_comanda.repositories.PedidoRepository;
//import com.integrador.projeto_comanda.services.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {
	
/*	@Autowired
	private PedidoService service;
	private PedidoRepository PedidoDao;*/
	
    @PersistenceContext
    private EntityManager em;
		
	@GetMapping
	public List<Pedido> findPedidos(){
		return em.createQuery(
                "select p from Pedido p",
                Pedido.class).getResultList();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Pedido find(@PathVariable Long id) {
        TypedQuery<Pedido> query = em.createQuery(
                        "select distinct(p) from Pedido p where p.id=:id",
                        Pedido.class).setParameter("id", id);
        return query.getSingleResult();
    }	
	
}
