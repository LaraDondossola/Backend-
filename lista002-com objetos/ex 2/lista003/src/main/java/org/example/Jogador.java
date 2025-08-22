package org.example;

public class Jogador {
    //atributos
    String nome = "Neymar";
    String sobrenome = "Junior";
    String time = "Santos";
    String posicao = "atacante";
    Short idade = 33;

    //construtor
    Jogador(String nome, String sobrenome, String time, String posicao, Short idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.posicao = posicao;
        this.idade = idade;
        this.time = time;
    }
}
