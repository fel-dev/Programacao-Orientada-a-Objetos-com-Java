package com.algaworks.curso.fjoo.sobreposicao;

public class Produto {
  
  protected String descricao;

  public void identificar() {
    System.out.println("Minha descrição é: " + descricao);
  }
}
