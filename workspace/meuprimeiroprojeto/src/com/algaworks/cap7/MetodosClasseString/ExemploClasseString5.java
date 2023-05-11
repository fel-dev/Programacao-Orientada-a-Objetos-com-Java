package com.algaworks.cap7.MetodosClasseString;

public class ExemploClasseString5 {
	public static void main(String[] args) {
		// metodos public String substring(int beginIndex)
		// metodos public String substring(int beginIndex, int endIndex) // até o endIndex - 1 (exceto ela)

		String s = "Desenvolvimento Java";
		System.out.println(s.substring(16)); // Retorna uma nova String
		System.out.println(s);
		System.out.println();

		String s2 = "Curso online de desenvolvimento de software";
		System.out.println(s2.substring(7, 12)); // Retorna uma nova String
	}
}
