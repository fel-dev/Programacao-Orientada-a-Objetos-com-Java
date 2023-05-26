package com.algaworks.teste;

import java.util.List;
import java.util.stream.Stream;

import com.algaworks.dao.FaturaDAO;
import com.algaworks.modelo.Fatura;

public class Teste {

	public static void main(String[] args) {
		List<Fatura> faturas = new FaturaDAO().buscarTodasFaturas();
		
		//// Antes do Java 8
		// for (Fatura f : faturas) {
		// 	if (f.getValor() > 250.0) {
		// 		System.out.println("Alerta: Fatura acima de R$250.0 -> " + f);
		// 	}
		// }
		
		// Stream<Fatura> st = faturas.stream()
		// 	.filter(f ->	f.getValor() > 250.0);
		// 	st.forEach(f -> System.out.println(f));

		// faturas.stream()
		// 	.filter(f -> f.estaEmRisco())
		// 	.forEach(f -> System.out.println(f));
		
		// faturas.stream()
		// 	.filter(Fatura::estaEmRisco)
		// 	.forEach(f -> System.out.println(f));
		
		//// Com Method Reference (Java 8)
		faturas.stream()
			.filter(Fatura::estaEmRisco)
			.forEach(System.out::println);
		
	}
	
}