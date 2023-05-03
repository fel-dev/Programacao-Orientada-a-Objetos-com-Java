package com.algaworks.curso.fjoo.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class TesteNumeros {
	public static void main(String[] args) {

		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		double valorProduto = 13.5;

		System.out.println("Valor do produto: " + valorProduto);
		System.out.println("Valor do produto: " + formatador.format(valorProduto));

		String entrada = "R$ 50,34";
		
		try {
			double numero = formatador.parse(entrada).doubleValue();
			System.out.println("Valor do produto: " + numero);
		} catch (Exception e) {
			System.out.println("Entrada inválida");
		}

		BigDecimal bg = new BigDecimal(3423432420034234234d);
		bg = bg.divide(BigDecimal.TEN);
		System.out.println(bg);
	}
}
