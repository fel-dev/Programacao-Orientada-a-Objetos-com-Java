package com.algaworks.exemplo;

import java.util.List;

import com.algaworks.dao.FaturaDAo;
import com.algaworks.modelo.Fatura;

public class Exemplo {
    // com lambda e method reference
    public static void main(String[] args) {
        List<Fatura> faturasVencidas = new FaturaDAo().buscarFaturasVencidas();
        
        // // forma tradicional
		// for (Fatura f : faturasVencidas) {
        //     f.atualizarStatus();
        // }

        // // lambda
        // faturasVencidas.forEach(f -> f.atualizarStatus());

        //method reference
        faturasVencidas.forEach(Fatura::atualizarStatus);

    }
}
