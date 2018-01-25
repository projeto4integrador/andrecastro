package com.integrador.projeto_comanda.domain;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.integrador.projeto_comanda.domain.enums.StatusPedido;

@Entity
@Table(name = "web_pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private Double valor;
	
	@NotNull
	private Integer estado;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_usuario")		
	private Usuario usuario;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_mesa")
	private Mesa mesa;
	
	@OneToMany(mappedBy = "id.pedido")
	private List<ItemPedido> itens = new LinkedList<>();
	
	public Pedido() {
		
	}

	public Pedido(Long id, Double valor, StatusPedido estado,Usuario usuario,Mesa mesa, ItemPedido item) {
		super();
		this.id = id;
		this.valor = valor;
		this.estado = estado.getCod();
		this.usuario = usuario;
		this.mesa = mesa;
		this.itens.add(item);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public StatusPedido getEstado() {
		return StatusPedido.toEnum(estado);
	}

	public void setEstado(StatusPedido estado) {
		this.estado = estado.getCod();
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
