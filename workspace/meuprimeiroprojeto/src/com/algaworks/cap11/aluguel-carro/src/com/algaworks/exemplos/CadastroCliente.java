package com.algaworks.exemplos;

import java.lang.System;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
// import java.util.Calendar;
// import java.util.Date;

import com.algaworks.model.Cliente;

public class CadastroCliente {
  
  public static void main(String[] args) {
    // // Antigamente Java.Util.Date
    // Calendar c = Calendar.getInstance();
    // c.set(Calendar.YEAR, 2014);
    // c.set(Calendar.MONTH, Calendar.JANUARY);
    // Date dateNascimento = c.getTime();

    // Agora Java.Time.LocalDate
    Cliente cliente = new Cliente("João Silva", LocalDate.of(2014, Month.JANUARY, 1));

    int idade = Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();

    if (idade >= 18) {
      System.out.printf("Cliente %s (%d anos), cadastrado com sucesso.", cliente.getNome(), idade);
    } else {
      System.err.printf("Cliente com %d anos, não pode ser cadastrado", idade);
    }
    
  }
}
