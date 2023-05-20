package com.algaworks.cap7.generics;

import java.util.ArrayList;
import java.util.List;

public class Gaveta<E> { // Pode ser qualquer letra, mas por convenção usa-se E maiúsculo (de Element)
	
	private List<E> colecao = new ArrayList<>(); // Cria uma coleção de qualquer tipo
	private static final int CAPACIDADE_MAXIMA = 100; // Capacidade da gaveta

	public void colocar(E e) {
		if (colecao.size() == CAPACIDADE_MAXIMA) { // Gaveta está cheia?
			throw new RuntimeException("Gaveta cheia!"); 
		}

		colecao.add(e);
	}

	public E obterPrimeiro() {		
		if (estaVazia()) {
			throw new RuntimeException("Gaveta vazia!");
		} 

		return colecao.get(0); // Retorna o primeiro elemento
	}

	public E retirarPrimeiro() {
		if (estaVazia()) {
			throw new RuntimeException("Gaveta vazia!"); 
		}

		E primeiro = obterPrimeiro();
		colecao.remove(0); // Remove o primeiro

		return primeiro;
	}

	public boolean estaVazia() {
		return colecao.isEmpty();
	}
	
}
