package com.algaworks.cap05.exercicios.interfaces_e_polimorfismo_5_24;

public class Carro implements Seguravel{

	private double valorMercado;
	private int anoFabricacao;

	public Carro(double valorMercado, int anoFabricacao) {
		this.valorMercado = valorMercado;
		this.anoFabricacao = anoFabricacao;
	}

	@Override
	public double calcularValorApolice() {
		// {suposição de calculo de valor de apolice de um carro}*
		double valorApolice = this.valorMercado * 0.04;
		if (anoFabricacao < 2000) {
			valorApolice = valorApolice * 0.90;
		}
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Carro ano " + this.anoFabricacao + " com valor de mercado " + this.valorMercado;
	}
	
}

// As fórmulas para calcular os valores das apólices são meramente fictícias. Claro que, na realidade, as fórmulas são totalmente diferentes e mais complexas.
