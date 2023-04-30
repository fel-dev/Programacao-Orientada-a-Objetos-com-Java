package cap05.com.algaworks.curso.fjoo.treinador;

import cap05.com.algaworks.curso.fjoo.animal.Cachorro;

public class TreinadorCachorro {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Bob");
		
		DonoCachorro dono = new DonoCachorro();
		dono.ensinarCachorroSentar(cachorro);
	}

}