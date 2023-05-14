package com.algaworks.cap7.varargs;

public class CorreioEletronico {
	
	// public void enviarEmails(String[] emails) { 
		public void enviarEmails(String... emails) { //varags - o tamanho do array é variável.
			
		// Percorrer todos os email recebidos
		for (String email : emails) {
			// envia e-mail
			System.out.println("E-mail enviado para: " + email);
		}
	}

}

// 7.5. Varargs
// https://www.youtube.com/watch?v=Z3Zmz9XZJXk&list=PLuYctAHjg89ZkhgOQo0zcTtmHY5nuRYud&index=6
// https://app.algaworks.com/aulas/467/varargs?pagina=0
