package capitulos1ao4;
class Televisor {

	Integer canalAtual = 130;
	Integer volumeAtual = 20;

	void mudarCanal(Integer novoCanal) {
		pulaLinha();
		System.out.print("Mudando canal para " + novoCanal + "... ");		
		if (novoCanal < 1 || novoCanal > 999) {
			System.out.println("Canal inválido.");
		} else if (novoCanal.equals(canalAtual)) {
			// (canalAtual == novoCanal) {
			System.out.println("Novo canal é também o canal atual.");
		} else {
			canalAtual = novoCanal;
			System.out.println("Canal alterado para " + canalAtual);
		}
	}

	void mudarVolume(Integer novoVolume) {
		pulaLinha();
		System.out.print("Mudando volume para " + novoVolume + "... ");	
		// if (novoVolume == volumeAtual) { -- Padrão de código ruim
		if (novoVolume.equals(volumeAtual)) {
			System.out.println("Novo volume é também o volume atual.");
		} else {
			// volumeAtual = new Integer(novoVolume.byteValue()); -- Deprecated
			// volumeAtual = Integer.valueOf(novoVolume.byteValue()); -- Wrapper
			volumeAtual = novoVolume;
			System.out.println("Volume alterado para " + volumeAtual);
		}
	}

    void aumentarVolume() {
        if (volumeAtual < 100) {
            volumeAtual++;
            System.out.println("Volume aumentado para " + volumeAtual);
        } else {
            System.out.println("Volume já está no máximo.");
        }
    }

    void diminuirVolume() {
        if (volumeAtual > 0) {
            volumeAtual--;
            System.out.println("Volume diminuído para " + volumeAtual);
        } else {
            System.out.println("Volume já está no mínimo.");
        }
    }

	void ligar() {
		System.out.println("Ligando o televisor...");
		imprimirStatus();
	}

	void desligar() {
		pulaLinha();
		System.out.println("Desligando o televisor...");
	}

	void imprimirStatus() {
		linha();
		System.out.println("Status do televisor:");
		System.out.println("Canal: " + canalAtual);
		System.out.println("Volume: " + volumeAtual);
		linha();
	}

	void linha() {
		System.out.println("======================");
	}

	void pulaLinha() {
		System.out.println();
	}


	// Estamos aproveitando a classe Televisor para fazer nosso teste
	public static void main(String[] args) {
		Televisor tv = new Televisor();

		// Deveria ligar
		tv.ligar();

		// Não deveria mudar o volume e canal
		tv.mudarVolume(20);
		tv.mudarCanal(130);

		// Deveria mudar o volume e canal
		tv.mudarVolume(100);
		tv.mudarCanal(10);

		// Não deveria mudar o volume e canal
		tv.mudarVolume(100);
		tv.mudarCanal(10);

		// Deveria mudar o volume e canal
		tv.mudarVolume(80);
		tv.mudarCanal(250);

        // deveria aumentar e diminuir volume em 1
        tv.aumentarVolume();
        tv.diminuirVolume();

		// Novo teste de mudar volume
		tv.mudarVolume(90);

		// Teste do método de aumentar volume
		for (int i = 0; i <= 10; i++) {
			tv.aumentarVolume();
		}

		// Teste do método de diminuir volume
		tv.mudarVolume(10);
		for (int i = 10; i >= 0; i--) {
			tv.diminuirVolume();
		}



		// Deveria desligar
		tv.desligar();		
	}

}