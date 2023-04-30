package com.algaworks.curso.fjoo.modificadorstatic;

public class TesteContador {
    public static void main(String[] args) {
        // Modo antigo
        // Contador c = new Contador(); 
        // c.count++;

        // Modo novo
        // // Contador.count++;
        // Contador.count = 5;
        // int valorDoContador = Contador.count;
        // System.out.println("Valor: " + valorDoContador);

        // Deve ser assim:               
        Contador.count++;
        // System.out.println("Contador.count: " + Contador.count);
        
        // Ñ deve acessar assim:
        Contador c1 = new Contador();   // c1 é um objeto 
        c1.incrementar();               // incrementar() é static, então não precisa instanciar
        // System.out.println("c1 = new Contado: " + c1.count); // Deve ser acessado pelo jeito static

        Contador.imprimirContador();
    }
}
// 5.10. Modificadores static e final https://app.algaworks.com/aulas/77/modificadores-static-e-final?pagina=0

//
// Resumo da ópera:
// static: pertence a classe e não ao objeto - será compartilhado por todos os objetos da classe
// final: não pode ser alterado
// static final: constante
//