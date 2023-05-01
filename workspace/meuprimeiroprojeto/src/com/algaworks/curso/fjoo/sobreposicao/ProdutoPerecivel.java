package com.algaworks.curso.fjoo.sobreposicao;

import java.util.Date;

public class ProdutoPerecivel extends Produto{

  protected Date dataValidade;

  public void identificar() {
    super.identificar();    // Chama do pai (superclasse) o método identificar() e depois executa o que está abaixo
    System.out.println("Minha data de validade é: " + dataValidade);
  }
  
}
