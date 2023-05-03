package com.algaworks.curso.fjoo.classmath;

import java.util.Random;

public class MegaSena {
	
	public void MegaSena(int quantidadeJogos) {
		Random gerador = new Random();
		
		// Gera os jogos do bolão x vezes, onde x é a quantidade de jogos informada pelo usuário
		for (int i = 0; i < quantidadeJogos; i++) {
			int[] jogo = new int[6];
			
			// Gera 6 números aleatórios para cada jogo do bolão
			for (int j = 0; j < 6; j++) {
				jogo[j] = gerador.nextInt(60) + 1;
			}
			
			// Imprime a lista[jogo] do bolão[i] na [quantidadeJogos] de vezes que o usuário informou
			imprimeJogo(jogo);
		}
	}
	
	private void imprimeJogo(int[] jogo) {
		// Imprime os números um a um	na mesma linha
		for (int i = 0; i < jogo.length; i++) {
			System.out.print(jogo[i] + " ");
		}
		
		System.out.println();
	}
	
}
