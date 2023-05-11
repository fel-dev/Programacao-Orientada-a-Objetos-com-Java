package com.algaworks.OrdenandoObjetos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPeloNome {

	public static void main(String[] args) {
		// ////////////////////////////////////////////////
		// ///////// Uma forma de fazer a lista ///////////
		// List<Pessoas> pessoas = Arrays.asList(
		// new Pessoas("João", 22),
		// new Pessoas("Adriana", 23),
		// new Pessoas("Bruno", 21)
		// );

		// ////////////////////////////////////////////////
		// ///////// Outra forma de fazer a lista /////////
		// dar um new array list
		// List<Pessoa> pessoas = new ArrayList<>()
		// pessoas.add(p1);
		// pessoas.add(p2);
		// pessoas.add(p3);

		// //////////////////////////////////////////////////
		// // Mas tem uma forma mais simples de fazer isso //
		Pessoa p1 = new Pessoa("João", 22);
		Pessoa p2 = new Pessoa("Adriana", 23);
		Pessoa p3 = new Pessoa("Bruno", 21);

		List<Pessoa> pessoas = Arrays.asList(p1, p2, p3);

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa); // vai imprimir o endereço de memória do objeto, não o nome. Mas vou
																	// sobrescrever o método toString() na classe Pessoa, olga lá. Agora vai
																	// imprimir o nome e a idade!
			// System.out.println(pessoa.getNome()); // vai imprimir o nome
		}

		// ///////////////////////////////////////////////////
		// // Ordenando pelo nome // e depois pela idade ////
		// //////////////////////////////////////////////////

		// //////////////// Ordenando pelo nome /////////////
		System.out.println("\n\nOrdenando pelo nome: (ensinamos a classe pessoa como se compara com o objeto do tipo pessoa)");
		// Usando as duas interfaces Comparator e Comparable /
		// //////////////////////////////////////////////////

		// Ordenando a lista de pessoas pelo nome - forma tradicional e depois com o
		// Java 8
		Collections.sort(pessoas); // forma tradicional -- O Método sort() espera um objeto que implementa a
																// interface Comparable. Em outras palavras: vai dar erro porque a classe Pessoa
																// não implementa a interface Comparable. Vou implementar a interface Comparable
																// na classe Pessoa, olha lá.
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}


		// //////////////////////////////////////////////////
		// //////// Ordenando idade e aí que entra a ////////
		// ///////////	INTERFACE COMPARATOR ////////////////
		// //////////////////////////////////////////////////
		// é explicado na classe OrdenandoPelaIdade.java e 
		// na classe IdadeComparator.java
		// //////////////////////////////////////////////////
		System.out.println("\n\nOrdenando pela idade: (ensinamos a idadeComparator como se compara com o objeto do tipo pessoa.idade)");

		IdadeComparator idadeComparator = new IdadeComparator();

		Collections.sort(pessoas, idadeComparator); // Ao invés dele usar o método compareTo() da classe Pessoa, ele vai usar o método compare() da classe IdadeComparator. Vou criar a classe IdadeComparator, olha lá.
		
		for (Pessoa pessoa : pessoas){
			System.out.println(pessoa);
		}

	}
}
