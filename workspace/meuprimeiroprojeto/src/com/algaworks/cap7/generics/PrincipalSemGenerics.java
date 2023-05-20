package com.algaworks.cap7.generics;

import java.util.ArrayList;
import java.util.List;

public class PrincipalSemGenerics {
	
	public static void main(String[] args) {
		// Até o Java 4 era assim, sem Generics (PS: warning pq recomenda usar Generics):
		List funcionarios = new ArrayList();	
		
		funcionarios.add(new Funcionario("João"));
		funcionarios.add(new Funcionario("Maria"));

		funcionarios.add("Ricardo"); // não dá erro de compilação, mas dá erro de execução

		for (int i = 0; i < funcionarios.size(); i++) {
			Funcionario f = (Funcionario) funcionarios.get(i); // cast pq o get retorna Object

			System.out.println("Nome do funcionario: " + f.getNome());
		}		
	}
}
