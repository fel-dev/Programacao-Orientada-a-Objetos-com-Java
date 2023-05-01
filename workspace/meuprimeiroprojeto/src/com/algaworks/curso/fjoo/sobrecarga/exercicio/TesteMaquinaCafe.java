package com.algaworks.curso.fjoo.sobrecarga.exercicio;

public class TesteMaquinaCafe {
	public static void main(String[] args) {
		utilitarios.Console.Limpar();
		MaquinaCafe maquina = new MaquinaCafe();
		maquina.acucarDisponivel = 30;

		maquina.fazerCafe(10);
		maquina.fazerCafe(15);
		maquina.fazerCafe(); // padrão é 10G, mas não tem açucar suficiente
	}
}
