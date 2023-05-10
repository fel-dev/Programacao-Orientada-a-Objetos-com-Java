package com.algaworks.curso.fjoo;

import java.util.Scanner;

public class calculoIMC {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite seu peso: ");
		double peso = entrada.nextDouble();

		System.out.print("\nDigite sua altura: ");
		double altura = entrada.nextDouble();

		double imc = peso / (altura * altura);

		System.out.println("\nSeu IMC é: " + String.format("%.2f", imc) + "\n");

	}
	
	
}
