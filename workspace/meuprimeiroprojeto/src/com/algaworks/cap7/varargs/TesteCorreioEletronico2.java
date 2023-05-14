package com.algaworks.cap7.varargs;

public class TesteCorreioEletronico2 {
	
	public static void main(String[] args) {
		CorreioEletronico correio = new CorreioEletronico();

		correio.enviarEmails(new String[] {"joao@dascouves.com", "maria@calvario.com"});
	}
}
