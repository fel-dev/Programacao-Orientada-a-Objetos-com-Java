package com.algaworks.model;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Aluguel {
  
  private Cliente cliente;
  private Carro carro;

  private LocalDateTime dataEhoraRetirada;
  private LocalDateTime dataeHoraPrevistaDevolucao;
  private LocalDateTime dataEHoraRealDaDevolucao;

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

  public LocalDateTime setDataEHoraRealDaDevolucao() {
    return dataEHoraRealDaDevolucao;
  }

  public void setDataEHoraRealDaDevolucao(
        LocalDateTime dataEHoraRealDaDevolucao) {
    this.dataEHoraRealDaDevolucao = dataEHoraRealDaDevolucao;
  }     

  public void imprimeFatura() {
        Duration duracao = Duration.between(dataeHoraPrevistaDevolucao, dataEHoraRealDaDevolucao);
        System.out.println(">>>> Fatura <<<<"); ;
        if (!duracao.isNegative()) {
                double multa = duracao.toHours() * carro.getValorDiaria() * 0.1;
                System.out.printf("Valor da multa: R$ %.2f. Pois o carro ficou %d dias atrasado.\n", multa, duracao.toHours());
        } else {
                System.out.println("Obrigado pela caixinha! Volte sempre!!!");
        }
  }

  

  
  
  
}
