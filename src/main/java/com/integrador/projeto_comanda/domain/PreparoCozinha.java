package com.integrador.projeto_comanda.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.integrador.projeto_comanda.domain.enums.StatusCozinha;

@Entity
@Table(name = "web_preparo_cozinha")
public class PreparoCozinha {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String observacao;
	
	@NotNull
	private String hora;
		
	@NotNull
	private Integer estado;
	
	@ManyToOne
	@JoinColumn(name = "id_pedido")
	private Pedido pedido;
	
	public PreparoCozinha() {
		
	}

	public PreparoCozinha(Pedido pedido, String observacao, String hora, StatusCozinha estado) {
		super();
		this.pedido = pedido;
		this.observacao = observacao;
		this.hora = hora;
		this.estado = estado.getCod();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public StatusCozinha getEstado() {
		return StatusCozinha.toEnum(estado);
	}

	public void setEstado(StatusCozinha estado) {
		this.estado = estado.getCod();
	}
	
	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
}