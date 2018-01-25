package com.integrador.projeto_comanda.domain.enums;

public enum StatusPedido {

	PENDENTE(0, "Pendente"),
	FECHADO(1, "Fechado");
	
	private int cod;
	private String descricao;
	
	private StatusPedido(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static StatusPedido toEnum(Integer codigo) {
		if(codigo == null) {
			return null;
		}
		
		for(StatusPedido x : StatusPedido.values()) {
			if(codigo.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + codigo);
	}
}
