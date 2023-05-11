package com.algaworks.OrdenandoObjetos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPelaIdade {
		// //////////////////////////////////////////////////
		// //////// Ordenando idade e aí que entra a ////////
		// ///////////	INTERFACE COMPARATOR ////////////////
		// ///////// Nova Classe IdadeComparator ////////////
		// //////////////////////////////////////////////////

		// é para comparações isoladas

		public static void main(String[] args) {
			Pessoa p1 = new Pessoa("João", 22);
			Pessoa p2 = new Pessoa("Adriana", 23);
			Pessoa p3 = new Pessoa("Bruno", 21);

			List<Pessoa> pessoas = Arrays.asList(p1, p2, p3);
			IdadeComparator idadeComparator = new IdadeComparator();

			System.out.println("\n\nCom Java 7");
			Collections.sort(pessoas, idadeComparator); // Ao invés dele usar o método compareTo() da classe Pessoa, ele vai usar o método compare() da classe IdadeComparator. Vou criar a classe IdadeComparator, olha lá.
			for (Pessoa pessoa : pessoas){
				System.out.println(pessoa);
			}

			System.out.println("\n\nCom Java 8");
			pessoas.sort(idadeComparator);
			pessoas.forEach(System.out::println);

		}
}
