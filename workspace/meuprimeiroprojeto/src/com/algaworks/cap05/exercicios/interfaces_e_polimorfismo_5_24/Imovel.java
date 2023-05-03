package com.algaworks.cap05.exercicios.interfaces_e_polimorfismo_5_24;

public class Imovel implements Seguravel{

	private double valorMercado;
	private int areaConstruida;

	public Imovel(double valorMercado, int areaConstruida) {
		this.valorMercado = valorMercado;
		this.areaConstruida = areaConstruida;
	}

	@Override
	public double calcularValorApolice() {
		// {suposição de calculo de valor de apolice de um imóvel}*
		double valorApolice = this.valorMercado * 0.003;
		valorApolice = valorApolice + (areaConstruida * 0.5);
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Imovel com área construída de " + this.areaConstruida + "m² e com valor de mercado " + this.valorMercado;
	}

}

// As fórmulas para calcular os valores das apólices são meramente fictícias. Claro que, na realidade, as fórmulas são totalmente diferentes e mais complexas.
