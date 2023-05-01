package com.algaworks.curso.fjoo.heranca;

public class TesteHeranca {
 public static void main(String[] args) {
  Jogador j = new Jogador();
  j.nome = "Ronaldo";
  j.idade = 33;

  j.seApresentar();
  j.dizerSeAindaJoga();

  // Não funciona pois a classe Pessoa não é uma classe filha de Jogador
  // Pessoa p = new Pessoa();
  // p.dizerSeAindaJoga();
 }
}
