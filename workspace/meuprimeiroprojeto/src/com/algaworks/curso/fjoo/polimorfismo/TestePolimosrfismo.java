package com.algaworks.curso.fjoo.polimorfismo;

public class TestePolimosrfismo {
	public static void main(String[] args) {
		utilitarios.Console.Limpar();
		Conta conta = new Conta();
		conta.setSaldo(4000);
		imprimirSaldo(conta); // ou TestePolimosrfismo.imprimirSaldo(conta); quando tempo o método como static ñ precisa do objeto para chamar o método
		System.out.println();
		// ----------------------------------------
		ContaCorrente contaCorrente = new ContaCorrente(); // Conta Corrente é uma Conta? Entao pode ser atribuido a uma variavel do tipo Conta, mas o contrário não é verdadeiro. O Objeto ContaCorrente é uma Conta, mas o Objeto Conta não é uma ContaCorrente	
		contaCorrente.setSaldo(3500);
		// contaCorrente.getLimite(); // Não pode chamar o método getLimite pq o tipo da variavel é Conta e não ContaCorrente, a menos que troque o tipo da variavel para ContaCorrente
		imprimirSaldo(contaCorrente); // Espera um parametro do tipo Conta, mas como ContaCorrente é uma Conta
		System.out.println();
		// ---------------------------------------- 
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setSaldo(2000);
		imprimirSaldo(contaPoupanca);
		System.out.println();

	}


// Esse objeto pode ser uma Conta, ContaCorrente ou ContaPoupanca pode assumir qualquer um desses tipos relacionados a herança
	public static void imprimirSaldo(Conta conta) {
		System.out.println("Saldo da conta: " + conta.getSaldo());

		if (conta instanceof ContaCorrente) { // instanceof verifica se o objeto é do tipo ContaCorrente (esse if dá ctz disto)
			ContaCorrente cc = (ContaCorrente) conta; // Downcasting, convertendo o tipo da variavel conta para ContaCorrente
			System.out.println("O limite da conta corrente é: R$" + cc.getLimite());
		}

		if (conta instanceof ContaPoupanca) {
			ContaPoupanca cp = (ContaPoupanca) conta;
			System.out.println("O rendimento da conta poupança é: R$" + cp.getRendimentos());
		}

	}
}
