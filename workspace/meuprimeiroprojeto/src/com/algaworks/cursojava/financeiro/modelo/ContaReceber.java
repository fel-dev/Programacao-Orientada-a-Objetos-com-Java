package com.algaworks.cursojava.financeiro.modelo;

public class ContaReceber extends Conta{
	
	private Cliente cliente;

	public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
		this.cliente = cliente;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}

	public ContaReceber() {
		// constructor
	}

	public void receber() {

		switch (this.getSituacaoConta()){
		
			case PAGA:
				System.err.println("Não posso receber uma conta que já foi paga.");
			break;

			case CANCELADA:
				System.err.println("Não posso receber uma conta que já foi cancelada.");
			break;

			case PENDENTE:
				this.situacaoConta = SituacaoConta.PAGA;
				System.out.println(
					"Recebendo conta " + this.getDescricao() +
					" no valor de " + this.getValor() +
					" com vencimento em " + this.getDataVencimento() + "...");	
			break;
		}
	}

	// sobreposição do método cancelar da classe Conta
	public void cancelar() {

		if (this.getValor() >= 50.000) {
			System.err.println("Não é possível cancelar uma conta com valor igual ou superior a R$ 50.000,00.");
		} else {
			super.cancelar();
		}
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public void exibirDetalhes() {
		// Esse método deve exibir todos os detalhes do objeto em um formato legal para aparecer em um relatório.
		System.out.println();
		System.out.println("+++ Conta a receber +++");		
		System.out.println("Cliente: " + this.getCliente().getNome());	
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Valor: " + this.getValor());
		System.out.println("Vencimento: " + this.getDataVencimento());
		System.out.println("Situação: " + this.getSituacaoConta());
		System.out.println("+++++++++++++++++++++++");

	}



}
