package com.algaworks.cap7.varargs;

public class TesteCorreioEletronico {
	
	public static void main(String[] args) {
		CorreioEletronico correio = new CorreioEletronico();

		String[] emails = new String[2];
		emails[0] = "joao@dascouves.com";
		emails[1] = "maria@calvario.com";

		correio.enviarEmails(emails);
	}
}
