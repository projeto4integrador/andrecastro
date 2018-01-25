package com.integrador.projeto_comanda.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.integrador.projeto_comanda.domain.enums.StatusProduto;

@Entity
@Table(name = "web_produto")
public class Produto implements Serializable {
		private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String descricao;
	
	@NotNull
	@Column(name="valor")
    private double valor;
	
    private Integer situacao;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "produto")
	private List<Adicional> adicional;
	
	@JsonIgnore
	@OneToMany(mappedBy="produto")
	private List<Produto> produto;
	
	public Produto(){
		
	}
	
	public Produto(Long id,String descricao, double valor, StatusProduto situacao, Categoria categoria) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
		this.situacao = situacao.getCod();
		this.categoria = categoria;
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

	public StatusProduto getSituacao() {
		return StatusProduto.toEnum(situacao);
	}

	public void setSituacao(StatusProduto situacao) {
		this.situacao = situacao.getCod();
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public List<Adicional> getAdicional() {
		return adicional;
	}

	public void setAdicional(List<Adicional> adicional) {
		this.adicional = adicional;
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
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
