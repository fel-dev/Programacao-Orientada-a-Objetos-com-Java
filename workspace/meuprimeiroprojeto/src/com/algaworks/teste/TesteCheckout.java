package com.algaworks.teste;

import com.algaworks.caixa.Checkout;
import com.algaworks.caixa.Compra;
import com.algaworks.impressao.impressoras.ImpressoraEpson;
import com.algaworks.impressao.impressoras.impressoraHP;
import com.algaworks.impressora.Impressora;
import com.algaworks.pagamento.Cartao;
import com.algaworks.pagamento.Operadora;
import com.algaworks.pagamento.operadoras.Cielo;
import com.algaworks.pagamento.operadoras.Redecard;

public class TesteCheckout {
	
	public static void main(String[] args) {
		//Operadora operadora = new Operadora(); errado pq é uma intereface a operadora
		
		// Operadora operadora = new Cielo();
		// Impressora impressora = new ImpressoraEpson();
		
		Operadora operadora = new Redecard();
		Impressora impressora = new impressoraHP();

		Cartao cartao = new Cartao();
		cartao.setNomeTitular("João M Couves");
		cartao.setNumeroCartao("456");

		Compra compra = new Compra();
		compra.setNomeCliente("João Mendonça Couves");
		compra.setProduto("Sabonete");
		compra.setValorTotal(2.5);

		Checkout checkout = new Checkout(operadora, impressora);		//checkout é uma classe que recebe uma operadora e uma impressora
		checkout.fecharCompra(compra, cartao); 		// passando os argumentos compra e cartão para o método fecharCompra da classe Checkout


	}
}
