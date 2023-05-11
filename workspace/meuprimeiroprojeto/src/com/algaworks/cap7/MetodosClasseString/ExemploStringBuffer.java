package com.algaworks.cap7.MetodosClasseString;

public class ExemploStringBuffer {
	public static void main(String[] args) {
		// StringBuffer sb = new StringBuffer(); // É thread-safe - usar no contexto de concorrência
		StringBuilder sb = new StringBuilder(); // É mais rápido que o StringBuffer, mas não é thread-safe

	sb.append("Bem vindo ao curso de Java. ");
	sb.append("Fique a vontade para tirar suas dúvidas. ");
	sb.append("Estamos aqui para te ajudar. ");

	System.out.println(sb);

	sb.insert(26, " da Algaworks"); // Insere na posição 26 e continua o texto

	System.out.println(sb);
	}
}
