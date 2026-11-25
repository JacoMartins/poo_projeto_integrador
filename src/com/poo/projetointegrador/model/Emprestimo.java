package com.poo.projetointegrador.model;

import java.time.LocalDate;

public class Emprestimo {
	// estrutura dos dado
	private static int proximoId;
	
	private final int id;
	private final Usuario usuario;
	private final ItemAcervo item;
	private LocalDate dataEmprestimo;
	private LocalDate prazoDevolucao;
	private LocalDate dataDevolucao;
	
	//construtor
	public Emprestimo(Usuario usuario, ItemAcervo item, LocalDate dataEmprestimo, LocalDate prazoDevolucao, LocalDate dataDevolucao) {
		this.id = proximoId++;
		this.usuario = usuario;
		this.item = item;
		this.dataEmprestimo = dataEmprestimo;
		this.prazoDevolucao = prazoDevolucao;
		this.dataDevolucao = dataDevolucao;
	}

	//getters e setters
	
	public Usuario getUsuario() {
		return usuario;
	}

	public ItemAcervo getItem() {
		return item;
	}


	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public LocalDate getPrazoDevolucao() {
		return prazoDevolucao;
	}

	public void setPrazoDevolucao(LocalDate prazoDevolucao) {
		this.prazoDevolucao = prazoDevolucao;
	}

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public int getId() {
		return id;
	}	
}
