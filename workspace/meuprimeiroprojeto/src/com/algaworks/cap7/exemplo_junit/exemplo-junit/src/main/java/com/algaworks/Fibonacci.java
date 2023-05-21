package com.algaworks;
// pesquisar TDD test driven development

public class Fibonacci {
    
    // F(n) = F(n-1) + F(n-2)
    // 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
    // F(0) = 0
    // F(1) = 1
    // F(2) = 1
    // F(3) = 2
    public long calcular(long posicao) {
         if (posicao < 2) {
             return posicao;
         }
        return calcular(posicao - 1) + calcular(posicao - 2);
    }
}
