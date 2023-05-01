package com.algaworks.curso.fjoo.heranca;

public class Pessoa extends Object { // toda classe herda de Object, mesmo que não seja declarado explicitamente.
																			// Object é a classe mãe de todas as classes

	// Se marcar a classe como final, não pode ser herdada. Ex: public final class
	// Pessoa extends Object
	// Se marcar a classe como string, não pode ser herdada. Ex: public String class
	// Pessoa extends Object

	protected String nome;
	protected int idade;

	public void seApresentar() {
		System.out.println("Olá, eu sou " + nome + " e tenho " + idade + " anos.");
	}

}
