package com.integrador.projeto_comanda.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "web_adicional")
public class Adicional  implements Serializable {
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@NotNull
	@Column(name = "descricao")
	private String descricao;
	
	@NotNull
	@Column(name = "valor")
	private double valor;

	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "web_adicional_produto", 
           joinColumns = @JoinColumn(name = "id_adicional", referencedColumnName = "id"), 
    inverseJoinColumns = @JoinColumn(name = "id_produto", referencedColumnName = "id"))
	private List<Produto> produto;

	public Adicional(Long id,String descricao,double valor) {
		super();
		this.id = id;		
		this.descricao  = descricao;
		this.valor = valor;
	}
	
	public Adicional() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
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
		Adicional other = (Adicional) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
