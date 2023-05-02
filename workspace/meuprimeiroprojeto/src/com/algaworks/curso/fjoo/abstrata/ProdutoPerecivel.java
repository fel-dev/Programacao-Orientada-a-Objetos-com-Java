package com.algaworks.curso.fjoo.abstrata;

public class ProdutoPerecivel extends Produto{
		
		String dataValidade;
	
	public void imprimirDescricao() {
		// Digitar a lógica aqui...
		System.out.println("Descrição: " + super.getDescricao() + ". Vencendo em: " + dataValidade);
	}
	
}
