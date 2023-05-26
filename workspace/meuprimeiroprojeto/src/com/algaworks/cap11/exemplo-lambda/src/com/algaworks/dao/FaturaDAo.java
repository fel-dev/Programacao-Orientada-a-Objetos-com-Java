package com.algaworks.dao;

import java.util.ArrayList;
import java.util.List;

import com.algaworks.modelo.Fatura;

public class FaturaDAo {

	public List<Fatura> buscarFaturasVencidas() {
		// pra cada vencida enviar email
		List<Fatura> faturas = new ArrayList<>();
		// Só 1 exemplo, deveria add num BD
		faturas.add(new Fatura("joao@joao.com", 350.0));
		faturas.add(new Fatura("maria@maria.com", 150.0));
		faturas.add(new Fatura("jose@jose.com", 290.0));

		return faturas;
	}
	
}
