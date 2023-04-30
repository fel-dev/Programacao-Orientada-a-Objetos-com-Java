package com.algaworks.curso.fjoo.modificadorstatic;

public class Contador {
    
    public static int count = 0; // static: pertence a classe e não ao objeto - será compartilhado por todos os objetos da classe

    public static final double PI = 3.14; // final: não pode ser alterado

    public static final String NOME_EMPRESA = "Algaworks";

    public static void incrementar() {
        count++;
    }

    public static void imprimirContador() {
        System.out.println("O valor do contador agora é: " + count);
    }
}

// 5.10. Modificadores static e final https://app.algaworks.com/aulas/77/modificadores-static-e-final?pagina=0

