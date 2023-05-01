package com.algaworks.curso.fjoo.heranca;

public class Jogador extends Pessoa{

 protected boolean aindaJoga = false; // protected funcionado quando a classe é herdada ou quando está no mesmo pacote

 public void dizerSeAindaJoga() {
  if (aindaJoga) {
   System.out.println("Ainda joga");
  } else {
   System.out.println("Não joga mais");
  }
 }

}
