package com.algaworks.curso.fjoo.treinador;

import com.algaworks.curso.fjoo.animal.Cachorro;

public class TreinadorCachorro {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Bob");
		
		DonoCachorro dono = new DonoCachorro();
		dono.ensinarCachorroSentar(cachorro);
	}

}

// primeiroa coisa a verificar: se está ou não no mesmo pacote

// 5.9. Modificador de acesso default https://app.algaworks.com/aulas/71/modificador-de-acesso-default?pagina=0