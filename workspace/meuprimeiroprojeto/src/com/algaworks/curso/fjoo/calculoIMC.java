package com.algaworks.curso.fjoo;

import java.util.Scanner;
/**
 * Classe para calcular o IMC
 * 
 * O IMC é a relação entre peso e altura e o cálculo é feito de acordo com a fórmula: IMC = peso/ (altura x altura),
 * devendo o peso estar em kg e a altura em metro, e o resultado é dado em kg/m2. Depois de obter o resultado,
 * é verificado em que faixa o resultado se encontra, podendo indicar: 
 * 
 * Magreza, quando o resultado é menor que 18,5 kg/m2;
 * 
 * Normal, quando o resultado está entre 18,5 e 24,9 kg/m2;
 * 
 * Sobrepeso, quando o resultado está entre 24,9 e 30 kg/m2;
 * 
 * Obesidade, quando o resultado é maior que 30 kg/m2.
 * 
 * @version 1.0
 *  
 * @since 1.0
 * 
 * @see <a href="http://www.calculoimc.com.br/">Calculo IMC</a>
 * 
 * @see <a href="https://www.tuasaude.com/imc/">Calculo IMC</a>
 * 
 * @see <a href="https://www.minhavida.com.br/alimentacao/tudo-sobre/32172-imc">Calculo IMC</a>
 * 
 * @see <a href="https://www.mundoboaforma.com.br/como-calcular-o-imc-passo-a-passo/">Calculo IMC</a>
 * 
 * @author Felipe Carneiro
 * @see <a href="https://www.linkedin.com/in/felipe-carneiro-dev/">Linkedin</a>
 * 
 * 
 */
public class calculoIMC {

	/**
	 * Método principal para executar o programa
	 * 
	 * @param args Recebe os argumentos passados por linha de comando
	 * @throws Exception Exceção lançada caso ocorra algum de digitação
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite seu peso: ");
		double peso = entrada.nextDouble();

		System.out.print("\nDigite sua altura: ");
		double altura = entrada.nextDouble();

		double imc = (double) calculoIMC(peso, altura);

		System.out.print("\nA faixa do resultado se encontra: ");

		verificaIMC(imc);

		System.out.println("\nSeu IMC é: " + String.format("%.2f", imc) + "\n");

	}

	private static Object calculoIMC(double peso, double altura) {
		return peso / (altura * altura);
	}

	private static void verificaIMC(double imc) {
		if (imc < 18.5) {
			System.out.println("Magreza");
		} else if (imc < 24.9) {
			System.out.println("Normal");
		} else if (imc < 30) {
			System.out.println("Sobrepeso");
		} else {
			System.out.println("Obesidade");
		}
	}

	
	
}
