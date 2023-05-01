package com.algaworks.curso.fjoo.enums;

public enum Naipe {

 OURO("Vermelho"), 
 PAUS("Preto"), 
 ESPADAS("Preto"), 
 COPAS("Vermelho");

 Naipe(String cor) {        // Podemos ter Construtor no enum
  this.cor = cor;
 }

 private String cor;        // atributos

 public String getCor() {   // métodos
  return cor;
 }
}
