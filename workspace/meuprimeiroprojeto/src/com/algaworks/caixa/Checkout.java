package com.algaworks.caixa;

import com.algaworks.impressora.Impressora;
import com.algaworks.pagamento.Cartao;
import com.algaworks.pagamento.Operadora;

public class Checkout {
	
	private Operadora Operadora;
	private Impressora Impressora;

	public Checkout(Operadora operadora, Impressora impressora) {
		Operadora = operadora;
		Impressora = impressora;
	}

	public void fecharCompra(Compra compra, Cartao cartao) {
		boolean autorizado = this.Operadora.autorizar(compra, cartao);
		
		if (autorizado) {
			this.Impressora.imprimir(compra);
		} else {
			System.out.println("Pagamento foi negado pela operadora.");
		}
	}
	
}
