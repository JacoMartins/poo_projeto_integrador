package com.poo.projetointegrador.model;

import java.util.List;

public class Biblioteca {
	// estrutura dos dados
	private static int proximoId;
	
	private final int id;
	private String nome;
	private List<ItemAcervo> itens;
	private List<Emprestimo> emprestimos;
	
	// construtor
	public Biblioteca(String nome) {
		this.id = proximoId++;
		this.nome = nome;
	}
	
	// getters e setters
	public int getId() {
		return id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<ItemAcervo> getItens() {
		return itens;
	}

	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}
}
