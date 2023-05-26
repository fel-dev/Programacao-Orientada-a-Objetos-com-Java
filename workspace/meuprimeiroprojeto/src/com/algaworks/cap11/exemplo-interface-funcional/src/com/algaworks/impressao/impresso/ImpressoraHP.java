package com.algaworks.impressao.impresso;

import com.algaworks.compra.Compra;
import com.algaworks.impressao.Impressora;

public class ImpressoraHP implements Impressora{

    @Override
    public void imprimir(Compra c) {
        System.out.println("Enviando o comando para  a imprssora HP -> " + c);    
    }
    
}
