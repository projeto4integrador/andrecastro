package com.integrador.projeto_comanda.domain.enums;

public enum StatusMesa {

	DISPONIVEL(0, "Disponível"),
	OCUPADO(1, "Ocupado");
	
	private int cod;
	private String descricao;
	
	private StatusMesa(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static StatusMesa toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(StatusMesa x : StatusMesa.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Status de mesa inválido: " + cod);
	}
}
