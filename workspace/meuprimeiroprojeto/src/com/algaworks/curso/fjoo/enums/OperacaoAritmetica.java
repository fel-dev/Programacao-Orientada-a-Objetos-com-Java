package com.algaworks.curso.fjoo.enums;

public enum OperacaoAritmetica {
 
 ADICAO {
  public int operacao(int x, int y) { // Podemos ter métodos em cada enum
   return x + y;
  }
 },
 SUBTRACAO {
  public int operacao(int x, int y) {
   return x - y;
  }
 },
  MULTIPLICACAO {
    public int operacao(int x, int y) {
    return x * y;
    }
  },
  DIVISAO {
    public int operacao(int x, int y) {
    return x / y;
    }
  };

 public abstract int operacao(int x, int y); // Primeiro, criar a assinatura do método, colocnado a palavra "abstrato" e termina com ";"

}
