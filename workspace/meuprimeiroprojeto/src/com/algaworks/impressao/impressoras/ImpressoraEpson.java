package com.algaworks.impressao.impressoras;

import com.algaworks.impressora.Impressora;
import com.algaworks.impressora.Imprimivel;

public class ImpressoraEpson implements Impressora {

	@Override
	public void imprimir(Imprimivel imprimivel) {
		System.out.println("**************************************");
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println("**************************************");
		System.out.println(imprimivel.getCorpoPagina());
		System.out.println();
		System.out.println("**************************************");
		System.out.println("**********  EPSON  *******************");
		System.out.println("**************************************");
	}

}
