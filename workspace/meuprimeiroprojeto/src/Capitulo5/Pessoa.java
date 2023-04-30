package Capitulo5;

public class Pessoa {
    // int e cia são sempre inicializados com 0. Booleanos são inicializados com false. Strings são inicializadas com null.
    String nome; 
    int idade; 

    Pessoa (String nome) {
        this.nome = nome;
        // Inicialização bem complicada de fazer daqui pra baixo... (suposição)
    }

    Pessoa (String nome, int idade) {
        this(nome); // Chama o construtor de cima. Isso é chamado de delegação de construtores. É uma forma de reaproveitar código. OBS: o this deve ser a primeira instrução do construtor.
        this.idade = idade;
    }

}
