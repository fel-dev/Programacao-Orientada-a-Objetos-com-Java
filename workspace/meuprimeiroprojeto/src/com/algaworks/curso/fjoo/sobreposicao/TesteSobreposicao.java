package com.algaworks.curso.fjoo.sobreposicao;

import java.util.Date;

public class TesteSobreposicao {
  
  public static void main(String[] args) throws Exception {
    utilitarios.Console.LimparEDecolar("Output do programa TesteSobreposicao.java:");
    
    ProdutoPerecivel pp = new ProdutoPerecivel();
    pp.descricao = "Caixa de Leite";
    pp.dataValidade = new Date();
    pp.identificar();  

    utilitarios.Console.PularLinha();
  }
}

// 5.16. Sobreposição https://app.algaworks.com/aulas/84/sobreposicao
