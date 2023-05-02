package com.algaworks.curso.fjoo.abstrata;

public class TesteClasseAbstrata {

	public static void main(String[] args) {
		//Produto p = new Produto(); ñ pode mais criar objetos dessa classe, pois é abstract
		Produto p = new ProdutoPerecivel(); // polimorfismo
		p.descricao = "Caixa de Leite";

		ProdutoPerecivel pp = (ProdutoPerecivel) p; // Relembrando casting de objetos
		pp.dataValidade = "10/03/2012";

		p.imprimirDescricao();

	}
}

// 5.21. Classes abstratas
// https://app.algaworks.com/aulas/89/classes-abstratas
