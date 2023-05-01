package com.algaworks.curso.fjoo.heranca;

public class Jogador extends Pessoa { // só estende uma classe por vez

 protected boolean aindaJoga = false; // protected funcionado quando a classe é herdada ou quando está no mesmo pacote

 public void dizerSeAindaJoga() {
  if (aindaJoga) {
   System.out.println("Ainda joga");
  } else {
   System.out.println("Não joga mais");
  }
 }

}

// https://app.algaworks.com/aulas/83/classe-javalangobject 5.15. Classe java.lang.Object

