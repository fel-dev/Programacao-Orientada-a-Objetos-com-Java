package com.algaworks.cap7.exemplo_regex;

public class SplitString {

	public static void main(String[] args) {
		String texto =  "O Java é uma linguagem orientada a objetos.";

		// O método split() retorna um array de String
		String[] palavras = texto.split(" ");
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
	}
}
