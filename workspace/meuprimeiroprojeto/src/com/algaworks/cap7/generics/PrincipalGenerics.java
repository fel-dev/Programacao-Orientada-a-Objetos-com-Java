package com.algaworks.cap7.generics;

import java.util.ArrayList;
import java.util.List;

public class PrincipalGenerics { // Generics = parametrização de tipos
	
	public static void main(String[] args) {
		List<Funcionario> funcionarios = new ArrayList<>();
		
		funcionarios.add(new Funcionario("João"));
		funcionarios.add(new Funcionario("Maria"));

		// funcionarios.add("Ricardo");

		for (Funcionario f : funcionarios) {
			System.out.println("Nome do funcionario: " + f.getNome());
		}

	}
	
}
