package com.algaworks.cap7.MetodosClasseString;

public class ExemploClasseString8 {
	public static void main(String[] args) {
		String s = "Java";
		int indice = s.indexOf('a'); // saber a posição do caracter "a"

		System.out.println(indice);

		indice = s.lastIndexOf("a"); // saber a posição do caracter "a" (última ocorrência)

		System.out.println(indice);

// -----------------------------------------------------------------------------------------------

		// exemplo da utilizade disso:
		String email = "joao@gmail.com";
		System.out.println("\nInput: " + email + "\n");

		// saber o usuário do email (entre o início e o "@") - "joao"
		String usuario = email.substring(0, email.indexOf("@")); 

		// saber o dominio do email (entre o "@" e o ".") - "gmail
		String dominio = email.substring(email.indexOf("@") + 1, email.lastIndexOf(".")); 


		System.out.println("Usuário: " + usuario);
		System.out.println("Domínio: " + dominio);
	}
}
