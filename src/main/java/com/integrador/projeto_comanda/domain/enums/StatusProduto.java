package com.integrador.projeto_comanda.domain.enums;

public enum StatusProduto {

	DISPONIVEL(0, "Disponivel"),
	INDISPONIVEL(1, "Indisponivel");
	
	private Integer cod;
	private String descricao;
	
	private StatusProduto(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public Integer getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static StatusProduto toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(StatusProduto x : StatusProduto.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Status do Produto inválido: " + cod);
	}
}
