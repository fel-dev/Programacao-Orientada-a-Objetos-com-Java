package com.algaworks.cap7.logging_com_log4j.model;

public class Cliente {

	private String nome;

	public Cliente(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + "]";
	}
	
}
