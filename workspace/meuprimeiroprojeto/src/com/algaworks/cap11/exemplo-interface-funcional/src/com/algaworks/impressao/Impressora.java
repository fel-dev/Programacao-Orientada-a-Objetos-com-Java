package com.algaworks.impressao;

import com.algaworks.compra.Compra;

@FunctionalInterface
public interface Impressora {
    // Se só tem 1 método é interface funcional.
    public void imprimir(Compra c);
}
