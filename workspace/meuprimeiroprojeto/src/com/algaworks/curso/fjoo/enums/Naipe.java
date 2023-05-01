package com.algaworks.curso.fjoo.enums;

public enum Naipe {

 OURO("Vermelho"), 
 PAUS("Preto"), 
 ESPADAS("Preto"), 
 COPAS("Vermelho");

 Naipe(String cor) {
  this.cor = cor;
 }

 private String cor;

 public String getCor() {
  return cor;
 }
}
