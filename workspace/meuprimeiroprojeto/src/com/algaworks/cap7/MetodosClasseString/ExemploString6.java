package com.algaworks.cap7.MetodosClasseString;

public class ExemploString6 {
	public static void main(String[] args) {
		System.out.println("Tamanho / caracteres: ");

		String s = "       Algaworks      ";

		System.out.println(s.length() + s);

		// tirar os espaços em branco
		s = s.trim();
		System.out.println(s.length() + s);
	}
}
