package com.algaworks.exemplos;

import java.time.Year;
import java.util.Arrays;
import java.util.List;

import com.algaworks.model.Carro;

public class CadastroCarro {
  
  public static void main(String[] args) {
    Carro gol = new Carro("Gol", 90, Year.of(2012));
    Carro cruze = new Carro("Cruze", 150, Year.parse("2016"));
    Carro celta = new Carro("Celta", 80, Year.of(2010));

    List<Carro> carros = Arrays.asList(gol, cruze, celta);
    carros.stream()
      .filter(c -> c.getAnoFabricacao().isAfter(Year.of(2012)))
      .forEach(c -> System.out.println(c.getNome()));
  }
}

// https://docs.oracle.com/javase/8/docs/api/java/time/Year.html
