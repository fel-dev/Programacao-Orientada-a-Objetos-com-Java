package com.algaworks.cap7.exemplo_regex;

public class SplitString3 {

	public static void main(String[] args) {
		String texto =  "O42Java11é3uma9linguagem9orientada1a3338objetos.";

		// pra substituir mais de um dígito, use \\d+
		String[] palavras = texto.split("\\d+");
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
	}
}
