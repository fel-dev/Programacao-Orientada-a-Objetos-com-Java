package com.algaworks.curso.fjoo.abstrata;
// ñ pode mais criar objetos dessa classe, pois é abstract
public abstract class Produto {

	String descricao;

	public String getDescricao() { // métodos implementados
		return descricao;
	}

	// ela serve pra utilizar na herança
	public abstract void imprimirDescricao(); // metodos não implementados, apenas declarados

}
