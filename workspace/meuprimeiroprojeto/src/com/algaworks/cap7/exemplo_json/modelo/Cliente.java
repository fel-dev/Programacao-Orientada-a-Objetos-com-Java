package com.algaworks.cap7.exemplo_json.modelo;

import java.util.List;

public class Cliente {
	
	private String nome;
	private int idade;
	private Endereco endereco;
	private List<Telefone> telefone;

	public Cliente() {
	}

	public Cliente(String nome, int idade, Endereco endereco, List<Telefone> telefone) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}
	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}

}
