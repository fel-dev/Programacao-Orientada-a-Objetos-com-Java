package com.algaworks.cap05.exercicios.interfaces_e_polimorfismo;

public class CorretoraSeguros {

	public void fazerPropostaSeguro(Seguravel objetoSeguravel) {
		System.out.println("-------------------------------");
		System.out.println("Corretora de Seguros - Proposta");
		System.out.println("-------------------------------");
		System.out.println(objetoSeguravel.obterDescricao());
		System.out.println("Valor da apólice: " + objetoSeguravel.calcularValorApolice());
		System.out.println("-------------------------------");
		System.out.println();
	}
	
}

//Veja que o método fazerPropostaSeguro() recebe como parâmetro um objeto do tipo Seguravel, ou seja, pode ser um Carro ou um Imovel, mas no futuro poderia receber também uma Aeronave ou Barco, desde que essas classes implementem a interface Seguravel.
