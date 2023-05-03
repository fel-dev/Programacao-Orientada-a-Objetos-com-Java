package com.algaworks.cap05.exercicios.interfaces_e_polimorfismo;

public class Notebook implements Seguravel{
	
	private double valorMercado;
	private int anoFabricacao;

	public Notebook(double valorMercado, int anoFabricacao){
		this.valorMercado = valorMercado;
		this.anoFabricacao = anoFabricacao;
	}

	@Override
	public double calcularValorApolice() {
		// Cálculo simbólico para um exemplo
		double valorApolice = this.valorMercado * 0.01;
		if (anoFabricacao < 2020) {
			valorApolice = valorApolice * 0.80;
		} else {
			valorApolice = valorApolice * 0.95;
		}
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Notebook ano " + this.anoFabricacao + " com valor de mercado " + this.valorMercado;
	}
}
