package com.algaworks.cap05.exercicios.interfaces_e_polimorfismo_5_24;

public class Principal {
	public static void main(String[] args) {
		CorretoraSeguros corretora = new CorretoraSeguros();


		try {
			utilitarios.Console.LimparEDecolar("Decolandooooo");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Carro carro = new Carro(55600, 2019);
		Imovel imovel = new Imovel(125000, 320);
		Barco barco = new Barco(500000, 2018);
		Notebook notebook = new Notebook(5900, 2022);

		corretora.fazerPropostaSeguro(carro);
		corretora.fazerPropostaSeguro(imovel);
		corretora.fazerPropostaSeguro(barco);
		corretora.fazerPropostaSeguro(notebook);


	}
}
