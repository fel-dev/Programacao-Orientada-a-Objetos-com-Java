package com.algaworks.cap05.exercicios.interfaces_e_polimorfismo;

public class Barco implements Seguravel{

	private double valorMercado;
	private int anoFabricacao;


	public Barco(double valorMercado, int anoFabricacao){
		this.valorMercado = valorMercado;
		this.anoFabricacao = anoFabricacao;
	}

	@Override
	public double calcularValorApolice() {
		// {suposição de calculo de valor de apolice de um barco}*
		double valorApolice = this.valorMercado * 0.02;
		if (anoFabricacao < 2020) {
			valorApolice = valorApolice * 0.80;
		} else {
			valorApolice = valorApolice * 0.95;
		}
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Barco ano " + this.anoFabricacao + " com valor de mercado " + this.valorMercado;
	}
	
}
