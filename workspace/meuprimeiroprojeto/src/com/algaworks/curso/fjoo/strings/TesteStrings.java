package com.algaworks.curso.fjoo.strings;

public class TesteStrings {

	public static void main(String[] args) {
		// String, StringBuilder e StringBuffer
		
		String s = "Olá"; // Criada a String "Olá"
		s = s + " Pessoal!";  // Criada a String "Olá Pessoal!"
				
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder("Olá"); // Existe a StringBuilder
		sb.append(" Pessoal!"); // Reaproveitando a StringBuilder
		
		String resultado = sb.toString();
		System.out.println("Com StringBuilder: " + resultado);
	}
	
}

/*       *** OBSERVAÇÕES: ***
 * 
 * - String é imutável, ou seja, não pode ser alterada. Toda vez que você altera uma String, na verdade está criando uma nova.
 * - StringBuilder e StringBuffer são mutáveis, ou seja, podem ser alteradas.
 * - StringBuilder é mais rápida que StringBuffer, porém não é thread-safe.
 * - StringBuffer é thread-safe, ou seja, é mais lenta que StringBuilder, porém é mais segura.
 *
********************** */