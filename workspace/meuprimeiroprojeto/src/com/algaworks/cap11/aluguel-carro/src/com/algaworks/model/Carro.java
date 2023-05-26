package com.algaworks.model;

import java.time.Year;

public class Carro {

  private String nome;
  private double valorDiaria;
  private Year anoFabricacao;

  public Carro(String nome, double valorDiaria, Year anoFabricacao) {
    this.nome = nome;
    this.valorDiaria = valorDiaria;
    this.anoFabricacao = anoFabricacao;
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getValorDiaria() {
    return valorDiaria;
  }
  public void setValorDiaria(double valorDiaria) {
    this.valorDiaria = valorDiaria;
  }

  public Year getAnoFabricacao() {
    return anoFabricacao;
  }
  public void setAnoFabricacao(Year anoFabricacao) {
    this.anoFabricacao = anoFabricacao;
  }
  
}
