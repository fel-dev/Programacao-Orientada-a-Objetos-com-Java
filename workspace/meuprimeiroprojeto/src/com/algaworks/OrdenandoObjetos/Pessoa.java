package com.algaworks.OrdenandoObjetos;

public class Pessoa implements Comparable<Pessoa>{
	
	private String nome;
	private Integer idade;

	public Pessoa(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	// Vou sobrescrever o método toString() para que ele imprima por padrão o nome e a idade, e não o endereço de memória do objeto. Ao invés de imprimir o endereço de memória do objeto, vai imprimir o nome e a idade.

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome + " tem " + this.idade + " anos."; // "João tem 22 anos.
	}

	@Override
	public int compareTo(Pessoa pessoa) { // Como essa comparação deve ser feita
		//         João.compareTo(Adriana) = -1
		return this.nome.compareTo(pessoa.getNome());
		// se quisesse ordenar por idade, como ordem natural seria:
		// if (this.idade < pessoa.getIdade()) {
		// 	return -1;
		// } else if (this.idade > pessoa.getIdade()) {
		// 	return 1;
		// }
		// return 0;

	}

}

// 6.18. Ordenando objetos
// https://app.algaworks.com/aulas/590/ordenando-objetos
