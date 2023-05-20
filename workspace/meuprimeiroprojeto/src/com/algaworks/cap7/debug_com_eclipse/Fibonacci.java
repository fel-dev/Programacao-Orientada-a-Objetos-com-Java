package com.algaworks.cap7.debug_com_eclipse;

public class Fibonacci {
	
	// F(n) = F(n-1) + F(n-2)
	// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
	// F(0) = 0, F(1) = 1
	public static long calcula(long posicao) {
		// usando a recursividade
		if (posicao <= 1) {
			return posicao;
		} 

		long valor1 = calcula(posicao - 1);
		long valor2 = calcula(posicao - 2);	
		return valor1 + valor2;
	}

}
