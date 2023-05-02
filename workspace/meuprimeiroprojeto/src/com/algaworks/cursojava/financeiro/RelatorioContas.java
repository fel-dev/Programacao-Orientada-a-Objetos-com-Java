package com.algaworks.cursojava.financeiro;

import com.algaworks.cursojava.financeiro.modelo.Conta;

public class RelatorioContas {
	
	public void exibirListagem(Conta[] contas) {

		// a classe RelatorioContas só deve conhecer o nome do método exibirDetalhes(), mais nada!

		for (Conta conta : contas) {
			conta.exibirDetalhes();
		}

	}
}


