package com.poo.projetointegrador.model;

public abstract class ItemAcervo {
	// estrutura dos dados
	private static int proximoId;
	private final int id;
	private String titulo;
	private boolean disponivel = true;
	
	public ItemAcervo(String titulo) {
		this.id = proximoId++;
		this.titulo = titulo;
	}
	
	// metodo abstrato
	public abstract int prazoDias();
	
	// logica do emprestimo
	public boolean emprestar() {
		return false;
	}
	
	public boolean devolver() {
		return false;
	}
}
