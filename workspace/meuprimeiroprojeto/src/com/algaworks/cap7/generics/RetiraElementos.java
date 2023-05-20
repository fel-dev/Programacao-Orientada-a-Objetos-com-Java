package com.algaworks.cap7.generics;

import java.util.List;

public class RetiraElementos {
	// declarando e ja usando o tipo generico T
	public static <T> T recuperaPrimeiro(List<T> lista) { 
		return lista.get(0);
	}
}
