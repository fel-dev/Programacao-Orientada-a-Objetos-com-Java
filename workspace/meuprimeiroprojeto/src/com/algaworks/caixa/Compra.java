package com.algaworks.caixa;

import com.algaworks.impressora.Imprimivel;
// Uma compra precisa ser Autorizável, para pode mandar para Operadora de Cartão de Crédito autorizar.
import com.algaworks.pagamento.Autorizavel;

// Uma compra implementa a interface Autorizável. Está seguindo o contrato de Autorizável.	
public class Compra implements Autorizavel, Imprimivel{ // Uma compra também é imprimível, para poder imprimir o comprovante de compra. e tem 2 métodos abstratos para implementar, se não, não vai compilar

	private Double valorTotal;
	private String produto;

	// Para seguir o contrato de Autorizável, precisa implementar todos os métodos da interface Autorizável.
	@Override // Override significa: veio sobrescrevendo de autorizavel
	public double getValorTotal() {
		return this.valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	private String nomeCliente;

	@Override
	public String getCabecalhoPagina() {
		return this.getProduto() + " - " + this.getValorTotal();
	}

	@Override
	public String getCorpoPagina() {
		return this.getNomeCliente();
	}


	
	
	
}
