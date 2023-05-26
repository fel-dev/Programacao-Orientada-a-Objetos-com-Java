package com.algaworks.exemplo;

import java.util.List;

import com.algaworks.dao.FaturaDAo;
import com.algaworks.modelo.Fatura;
import com.algaworks.util.EnviadorEmail;

public class ExemploLambda {
	
	public static void main(String[] args) {
		List<Fatura> faturasVencidas = new FaturaDAo().buscarFaturasVencidas();

		EnviadorEmail enviadorEmail = new EnviadorEmail();

		// // sem lambda
		// for (Fatura f : faturasVencidas) {
		// 	enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
		// }

		// com lambda
		faturasVencidas.forEach(f -> {
			enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
			f.setEmailEnviado(true);
		});

	}
}



