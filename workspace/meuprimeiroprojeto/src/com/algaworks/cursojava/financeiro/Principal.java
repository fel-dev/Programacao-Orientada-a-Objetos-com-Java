package com.algaworks.cursojava.financeiro;

import com.algaworks.cursojava.financeiro.modelo.ContaPagar;
import com.algaworks.cursojava.financeiro.modelo.ContaReceber;
import com.algaworks.cursojava.financeiro.modelo.Conta;
import com.algaworks.cursojava.financeiro.modelo.Fornecedor;
import com.algaworks.cursojava.financeiro.modelo.Cliente;

import static utilitarios.Console.Limpar;

public class Principal {

	public static void main(String[] args) {
		// instanciando fornecedores
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do João");
		
		// instanciando clientes
		Cliente atacadista = new Cliente();
		atacadista.setNome("Triângulo Quadrado Atacadista");
		Cliente telecom = new Cliente();
		telecom.setNome("FoneNet Telecomunicações");
		
		// instanciando contas a pagar
		ContaPagar contaPagar1 = new ContaPagar();
		contaPagar1.setDescricao("Aluguel da matriz");
		contaPagar1.setValor(1230d);
		contaPagar1.setDataVencimento("10/05/2012");
		contaPagar1.setFornecedor(imobiliaria);
		
		ContaPagar contaPagar2 = new ContaPagar(mercado, "Compras do mês", 390d, "19/05/2012");
		
		// instanciando contas a receber
		ContaReceber contaReceber1 = new ContaReceber();
		contaReceber1.setDescricao("Desenvolvimento de projeto de logística em Java");
		contaReceber1.setValor(89500d);
		contaReceber1.setDataVencimento("23/05/2012");
		contaReceber1.setCliente(atacadista);
		
		ContaReceber contaReceber2 = new ContaReceber(telecom, "Manutenção em sistema de conta online", 
			53200d, "13/05/2012");
		
		// limpa tela do console
		Limpar();

		// Parte do desafio 6.5: (exceções)
		System.out.println("=== Operações com contas ===\n"	);
		try {
			contaPagar1.pagar();
			contaPagar2.cancelar();
			contaReceber1.receber();
			contaReceber2.cancelar();
			contaReceber2.receber();
		} catch (OperacaoContaException e) {
			System.out.println("Erro na operação " + e.getMessage());	
		} finally {
			System.out.println("Obrigado por usar o Banco Bancóx!");
		}
		
		// exibe listagem de todas as contas com detalhamento
		System.out.println("\n=== Listagem de contas ===\n");
		RelatorioContas relatorio = new RelatorioContas();
		Conta[] contas = new Conta[]{contaPagar1, contaPagar2, contaReceber1, contaReceber2};
		relatorio.exibirListagem(contas);
	}

}