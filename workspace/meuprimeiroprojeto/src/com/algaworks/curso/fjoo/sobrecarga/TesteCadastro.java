package com.algaworks.curso.fjoo.sobrecarga;

public class TesteCadastro {

	public static void main(String[] args) {
		
		utilitarios.Console.Limpar();

		CadastroPessoa cadastro = new CadastroPessoa();
		
		Pessoa pessoa = new Pessoa("José", 32);
		cadastro.cadastrar(pessoa);
		
		// -------------------------------------
		
		cadastro.cadastrar("Maria", 25);
	}
	
}