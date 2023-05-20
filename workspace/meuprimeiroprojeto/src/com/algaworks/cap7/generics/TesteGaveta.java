package com.algaworks.cap7.generics;

public class TesteGaveta {

	public static void main(String[] args) {
		Gaveta<String> gaveta = new Gaveta<>();

		gaveta.colocar("Livro de Java");
		gaveta.colocar("Livro de C#");

		String coisa = gaveta.retirarPrimeiro(); // Sem cast. retirarPrimeiro() retorna um String.

		System.out.println(coisa); 

		Gaveta<Integer> gavetaNumeros = new Gaveta<>();
		gavetaNumeros.colocar(4);

		System.out.println(gavetaNumeros.retirarPrimeiro() + 2);
		// não adiciona 2 à gaveta... só ao número retirado, 
		// isso pq o método retirarPrimeiro() retorna um Integer
	}
}
