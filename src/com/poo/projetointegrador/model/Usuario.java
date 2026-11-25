package com.poo.projetointegrador.model;

import java.time.LocalDate;

public class Usuario {
	// estrutura dos dados
	private static int proximoId;
	
	private final int id;
	private final String matricula;
	private String nome;
	private TipoUsuario perfil;
	
	// construtor
	public Usuario(String nome, TipoUsuario perfil) {
		this.id = proximoId++;
		this.matricula = gerarMatricula();
		this.nome = nome;
		this.perfil = perfil;
	}
	
	//metodo
	private String gerarMatricula() {
		LocalDate hoje = LocalDate.now();
	    int ano = hoje.getYear();
	    int semestre = hoje.getMonthValue() <= 6 ? 1 : 2;

	    return String.format("%d%d%04d", ano, semestre, this.id);
	}

	//geters e seters
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoUsuario getPerfil() {
		return this.perfil;
	}

	public void setPerfil(TipoUsuario perfil) {
		this.perfil = perfil;
	}

	public int getId() {
		return this.id;
	}

	public String getMatricula() {
		return this.matricula;
	}
}
