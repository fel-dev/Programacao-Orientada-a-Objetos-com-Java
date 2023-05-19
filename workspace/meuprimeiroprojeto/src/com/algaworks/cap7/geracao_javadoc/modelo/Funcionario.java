package com.algaworks.cap7.geracao_javadoc.modelo;

/**
 * Representa um funcionário da empresa...
 * 
 * @author Felipe Carneiro
 * @author Algaworks
 */
public class Funcionario {

	private String nome;
	private double salario;
	
	public Funcionario() {
	}

	/**
	 * Não utulize este construtor, pois o salário é obrigatório para outros métodos.
	 * 
	 * @deprecated Use {@link #Funcionario(String nome, double salario)} ao invés disso.
	 * @param nome
	 */
	public Funcionario(String nome) {
		this.nome = nome;
	}

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * Calcula o adiantamento em dinheiro que deverá ser pago ao funcionário
	 * 
	 * <p>O valor da diária é calculado dividindo o <b>salário base por 30 dias no mês.</b></p>
	 * 
	 * Caso o destino seja uma capital, o valor do adiantamento é acrescido de 20%.
	 * 
	 * @param dias
	 * 				Quantidade de dias que o funcionário ficará viajando	
	 * 
	 * @param capital
	 * 				Indica se o destino é uma capital	
	 * 
	 * @return O valor em reais do adiantamento
	 * 
	 * @throws	IllegalArgumentException
	 *					Caso o número de {@code dias} seja menor ou igual a zero
	 *
	 * @since 1.1.0
	 * 
	 * @see Viagem
	 */
	public double adiantamentoViagem(int dias, boolean capital) {
		if (dias <= 0) {
			throw new IllegalArgumentException("O número de dias deve ser maior que zero.");
		}
		
		double valorDiaria = salario / 30;

		double valorAdiantamento = valorDiaria * dias;

		if (capital) {
			valorAdiantamento *= 1.20;
		}

		return valorAdiantamento;


	}
	
}
