package com.integrador.projeto_comanda.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="web_item_pedido")
public class ItemPedido implements Serializable {
	private static final long serialVersionUID=1L;

	@JsonIgnore
	@EmbeddedId
	private ItemPedidoProduto id = new ItemPedidoProduto();
	
	@NotNull
	private Integer quantidade;

	@Column(name="valor_total")
	private Double valortotal;
	
	private String observacao;
	
	public ItemPedido() {
		
	}

	public ItemPedido(Pedido pedido, Produto produto, Integer quantidade, String observacao) {
		super();
		id.setPedido(pedido);
		id.setProduto(produto);
		this.quantidade = quantidade;
		this.valortotal = this.quantidade * produto.getValor();
		this.observacao = observacao;
	}

	@JsonIgnore
	public Pedido getPedido() {
		return id.getPedido();
	}
	
	public Produto getProduto() {
		return id.getProduto();
	}
	
	public ItemPedidoProduto getId() {
		return id;
	}
	
	public void setId(ItemPedidoProduto id) {
		this.id = id;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValortotal() {
		return valortotal;
	}

	public void setValortotal(Double valortotal) {
		this.valortotal = valortotal;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
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
		ItemPedido other = (ItemPedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
