package com.algaworks.cap7.MetodosClasseString;

public class ExemplosClasseString2 {

	public static void main(String[] args) {
		// Cadeia de caracteres
		String s = "ALGAWORKS";

		// Imprimir num determinada posição
		try {
			System.out.println(s.charAt(0));
			System.out.println(s.charAt(2));
			System.out.println(s.charAt(8));
			System.out.println(s.charAt(9));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
