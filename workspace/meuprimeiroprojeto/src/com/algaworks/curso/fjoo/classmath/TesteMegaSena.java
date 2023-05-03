package com.algaworks.curso.fjoo.classmath;

import java.util.Scanner; 

public class TesteMegaSena {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos jogos você quer que eu sorteie? ");
		int quantidadeJogos = entrada.nextInt();
		
		MegaSena megaSena = new MegaSena();
		megaSena.MegaSena(quantidadeJogos);
		
		entrada.close();
	}
}
