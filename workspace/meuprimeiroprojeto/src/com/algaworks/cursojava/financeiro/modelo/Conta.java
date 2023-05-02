package com.algaworks.cursojava.financeiro.modelo;

public abstract class Conta {

	private String descricao;
	private Double valor;
	private String dataVencimento;
	protected SituacaoConta situacaoConta;
	
	public abstract void exibirDetalhes();

	public Conta() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}	

	public void cancelar() {

		switch (this.situacaoConta) {

			case PAGA:
				System.err.println("Não posso cancelar uma conta que já foi paga.");
			break;

			case CANCELADA:
				System.err.println("Não posso cancelar uma conta que já foi cancelada.");
			break;

			case PENDENTE:
				this.situacaoConta = SituacaoConta.CANCELADA;
				System.out.println(
					"Cancelando conta " 	+ this.getDescricao() +
					" no valor de " 			+ this.getValor() 		+
					" com vencimento em " + this.getDataVencimento() + "...");			
			break;
		}	
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}
	// Por questões de segurança, não é possível alterar a situação da conta. Por isso, não existe o método setSituacaoConta.

}
