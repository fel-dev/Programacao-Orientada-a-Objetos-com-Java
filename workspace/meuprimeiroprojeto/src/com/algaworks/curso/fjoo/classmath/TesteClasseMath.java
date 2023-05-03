package com.algaworks.curso.fjoo.classmath;

// o import statis é pra não precisar ficar escrevendo Math toda hora
// chama o método direto		como se fosse uma função da propria classe	


import static java.lang.Math.PI;
import static java.lang.Math.max;

import static utilitarios.Console.Limpar;
import static utilitarios.Console.PularLinha;

public class TesteClasseMath {
	
	public static void main(String[] args) {

		// Limpar o console
		Limpar();

		// Comprimento de um circunferência = 2 * PI * raio
		double raio = 4;
		double comprimento = 2 * PI * raio;
		System.out.println("Comprimento: " + comprimento);

		//Máximo e mínimo
		PularLinha();
		double[] precosProdutoA = { 30.00, 25.00};
		double maiorPreco = max(precosProdutoA[0], precosProdutoA[1]);
		System.out.println("O maior preço é: " + maiorPreco);

		// Da pra fazer com if também, mas é mais trabalhoso, se liga...
		// if (precosProdutoA[0] > precosProdutoA[1]) {
		// 	System.out.println("O maior preço é: " + precosProdutoA[0]);
		// } else {
		// 	System.out.println("O maior preço é: " + precosProdutoA[1]);
		// }

		


		//Potência
			System.out.println("2 elevado a 3 é: " + Math.pow(2, 3));
		//Raiz quadrada
			System.out.println("A raiz quadrada de 9 é: " + Math.sqrt(9));
		//Raiz cúbica
			System.out.println("A raiz cúbica de 27 é: " + Math.cbrt(27));
		
			//Arredondamento ceil, floor e round
			PularLinha();	
			double n = 5.5;
			System.out.println("Arredondamento ceil (pra cima): " + Math.ceil(n));
			System.out.println("Arredondamento floor (pra baixo): " + Math.floor(n));
			System.out.println("Arredondamento round (padrão): " + Math.round(n));
		
			// Trigonometria
			PularLinha();
			System.out.println("Seno de 30 é: " + Math.sin(Math.toRadians(40)));
			System.out.println("Cosseno de 1 é: " + Math.cos(Math.toRadians(1)));
			System.out.println("Tangente de 45 é: " + Math.tan(Math.toRadians(45)));
		
			// Número aleatório
			PularLinha();
			System.out.println("\nNúmero entre 1 e 0: " + Math.random());
			System.out.println("\nNúmero entre 1 e 100: " + Math.random() * 100);
			System.out.println("\narredondando o número entre 1 e 100: " + Math.round(Math.random() * 100));
			// testes
			System.out.println("\nTeste de número aleatório com casting:");
			System.out.println((int) (Math.random() * 10));	

			// pra arrendar o número aleatório pode fazer o cast ou usar um dos métodos de arrendodamento
		
		
		
		
		
		
			// Pular uma linha
		PularLinha();
	}
}
