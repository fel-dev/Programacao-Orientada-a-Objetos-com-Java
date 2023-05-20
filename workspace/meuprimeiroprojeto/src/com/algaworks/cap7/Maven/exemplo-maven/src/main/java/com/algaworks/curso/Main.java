package com.algaworks.curso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NomeInvalidoException {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Nome: ");
			String nome = entrada.nextLine();
			
			System.out.print("Idade: ");
			int idade = entrada.nextInt();
			
			Usuario usuario = new Usuario(nome, idade);
			System.out.println("Obrigado, " + usuario.getNome() + " por se cadastrar.");
		}
				
	}
	
}
