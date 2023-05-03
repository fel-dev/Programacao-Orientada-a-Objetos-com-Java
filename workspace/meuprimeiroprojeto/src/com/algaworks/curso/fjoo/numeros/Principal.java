package com.algaworks.curso.fjoo.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor do produto: ");
		double valorProduto = entrada.nextDouble();

		BigDecimal bg = new BigDecimal(valorProduto);
		bg = bg.multiply(bg.TEN).divide(new BigDecimal(100));

		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");		
		String valorFormatado = formatador.format(bg.doubleValue());
		
		System.out.println("10% do produto: " + valorFormatado);

		entrada.close();
	}
}

/*
 * 
 *Desenvolva um programa que:
 *	1 - Recebe como parâmetro do usuário o valor de um produto do tipo double.
 *	2 - Instancia um objeto do tipo BigDecimal atribuindo o valor double a ele.
 *	3 - Calcula 10% do valor usando os métodos disponíveis na classe BigDecimal.
 *	4 - Formata o novo valor calculado para o padrão monetário (R$).
 *	5 - Exibe na tela o valor calculado e formatado.
 *
 * 6.10. Desafio: números
 * https://app.algaworks.com/aulas/103/desafio-numeros
 */
