package com.algaworks.curso.fjoo.polimorfismo;

public class ContaCorrente extends Conta{ // "extends" pode ler como "é uma"
	
	private double limite = 1000;

	public double getLimite() { 
		return limite;
	}

}
