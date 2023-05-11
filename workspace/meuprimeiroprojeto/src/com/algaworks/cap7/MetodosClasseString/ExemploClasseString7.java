package com.algaworks.cap7.MetodosClasseString;

public class ExemploClasseString7 {
	public static void main(String[] args) {
		// ler a palavra e recuperar cada um de "Tokens"
		String s = "Cursos_online_de_desenvolvimento_de_software";
		String x = "12;40.30;12";

		// separar e pegar cada um desses tokenzinhos (array de string)
		String[] tokens = s.split("_");

		for (int i = 0; i < tokens.length; i++) {
			System.out.println("[" + i + "]" + tokens[i]);
		}
	}
}
