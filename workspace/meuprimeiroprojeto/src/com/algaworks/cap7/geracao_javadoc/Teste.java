package com.algaworks.cap7.geracao_javadoc;

import com.algaworks.cap7.geracao_javadoc.modelo.Funcionario;

public class Teste {
	
	public static void main(String[] args) {
		// exemplo de warning
		Funcionario funcionario = new Funcionario("João Silva");
		// atualizando
		funcionario = new Funcionario("João da Silva", 3000);

		double adiantamento = funcionario.adiantamentoViagem(5, false);
		
		System.out.println("Adiantamento: " + adiantamento); // 500 reais de adiantamento (true = 600)
	}
}
