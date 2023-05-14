package com.algaworks.cap7.varargs;

public class TesteCorreioEletronico3 {
	public static void main(String[] args) {
		CorreioEletronico correio = new CorreioEletronico();

	// correio.enviarEmails(new String[] {"joao@dascouves", "maria@calvario"});

	correio.enviarEmails("joao@dascouves", "maria@calvario", "jose@silva.com", "pedro@pedro.com");
	}
}
