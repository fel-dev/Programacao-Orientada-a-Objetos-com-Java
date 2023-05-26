package com.algaworks.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Aluguel {
  
  private Cliente cliente;
  private Carro carro;

  private LocalDateTime dataEhoraRetirada;
  private LocalDateTime dataeHoraPrevistaDevolucao;
  private LocalDate dataeHoraRealDevolucao;

  public Aluguel(Cliente cliente, Carro carro, LocalDateTime dataEhoraRetirada, LocalDateTime dataeHoraPrevistaDevolucao) {
    this.cliente = cliente;
    this.carro = carro;
    this.dataEhoraRetirada = dataEhoraRetirada;
    this.dataeHoraPrevistaDevolucao = dataeHoraPrevistaDevolucao;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public Carro getCarro() {
    return carro;
  }

  public void setCarro(Carro carro) {
    this.carro = carro;
  }

  public LocalDateTime getDataEhoraRetirada() {
    return dataEhoraRetirada;
  }

  public void setDataEhoraRetirada(LocalDateTime dataEhoraRetirada) {
    this.dataEhoraRetirada = dataEhoraRetirada;
  }

  public LocalDateTime getDataeHoraPrevistaDevolucao() {
    return dataeHoraPrevistaDevolucao;
  }

  public void setDataeHoraPrevistaDevolucao(LocalDateTime dataeHoraPrevistaDevolucao) {
    this.dataeHoraPrevistaDevolucao = dataeHoraPrevistaDevolucao;
  }

  public LocalDate getDataeHoraRealDevolucao() {
    return dataeHoraRealDevolucao;
  }

  public void setDataeHoraRealDevolucao(LocalDate dataeHoraRealDevolucao) {
    this.dataeHoraRealDevolucao = dataeHoraRealDevolucao;
  }

  

  
  
  
}
