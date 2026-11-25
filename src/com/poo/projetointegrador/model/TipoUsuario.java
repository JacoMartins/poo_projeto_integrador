package com.poo.projetointegrador.model;

public enum TipoUsuario {
	ALUNO(3),
	PROFESSOR(10);
	
	private final int LIMITEITENS;
	
	TipoUsuario(int itens) {
		this.LIMITEITENS = itens;
	}
	
	public int getLimite() {
		return this.LIMITEITENS;
	}
}