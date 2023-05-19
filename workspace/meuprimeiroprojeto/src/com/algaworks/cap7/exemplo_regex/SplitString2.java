package com.algaworks.cap7.exemplo_regex;

public class SplitString2 {

	public static void main(String[] args) {
		String texto =  "O4Java1é3uma9linguagem9orientada1a8objetos.";

		// pra substituir dígitos, use \\d
		String[] palavras = texto.split("\\d");
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
	}
}
