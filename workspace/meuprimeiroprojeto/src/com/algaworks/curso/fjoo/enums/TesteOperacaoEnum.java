package com.algaworks.curso.fjoo.enums;

public class TesteOperacaoEnum {

  public static void main(String[] args) {
    OperacaoAritmetica o1 = OperacaoAritmetica.ADICAO;
    System.out.println("Resultado da operação: " + o1.operacao(5, 3));

    // conseguimos percorrer o enum, com um for avançado
    for (OperacaoAritmetica ao : OperacaoAritmetica.values()) { // values é um método pre-definido do enum, que retorna todos os enum no array
      System.out.println(ao + " -> " + ao.operacao(5, 3));

    }

    // Também fazer esse for com um array
    // for (String s : args) {

    // }
  }
 
}
