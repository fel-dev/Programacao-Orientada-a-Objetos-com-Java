package com.algaworks.exemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;

import com.algaworks.model.Aluguel;
import com.algaworks.model.Carro;
import com.algaworks.model.Cliente;

public class NovoAluguel {
  
  public static void main(String[] args) {
    // Simulação, se fosse um sistema web ja teria validado se ele tem cadastro no banco de dados...
    Cliente cliente = new Cliente("João Silva", LocalDate.of(2014, Month.JANUARY, 1));
    Carro carro = new Carro("Gol", 90.0, Year.of(2012));

    LocalDateTime dataEhoraRetirada = LocalDateTime.of(LocalDate.now()
      , LocalTime.of(LocalTime.now().getHour(), 0));
    LocalDateTime dataeHoraPrevistaDevolucao = 
      LocalDateTime.now().plusDays(3).plusHours(2);
    Aluguel aluguel = new Aluguel(cliente, carro, dataEhoraRetirada, dataeHoraPrevistaDevolucao);


    // TODO: Imprimir o recibo
    System.out.println(">>>> RECIBO DE ALUGUEL <<<<");
    System.out.println("Cliente: " + aluguel.getCliente().getNome());
    System.out.println("Carro: " + aluguel.getCarro().getNome());

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    System.out.println("Data e hora de retirada: " + aluguel.getDataEhoraRetirada().format(formatter));
    System.out.println("Data e hora prevista de devolução: " + aluguel.getDataeHoraPrevistaDevolucao().format(formatter));

  }

}
