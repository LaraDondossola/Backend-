package org.example;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        exercicio02();
    }

    static void exercicio01() {
        Random random = new Random();

        String[] lista =  {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9"};
        String senha = "";

        for (int i = 0; i < 8; i++) {
            String carac = lista[random.nextInt(lista.length)];
            senha += carac;
        }

        System.out.println("Sua senha é: " + senha);
    }

    static void exercicio02() {
        Random random = new Random();

        String[] nomes = {"Lara", "Lívia", "Ana", "Pedro", "Tânia", "Jairo"};
        String[] sobrenomes = {"Da Rosa", "Da Silva", "Gomes", "Oliveira", "Dondossola", "Lima"};
        String[] posicoes = {"goleiro", "zagueiro", "lateral", "atacante"};
        String[] times = {"Corinthians", "Flamengo", "Vasco", "Grêmio"};

        String nome = nomes[random.nextInt(nomes.length)];
        String sobrenome = sobrenomes[random.nextInt(sobrenomes.length)];
        String posicao = posicoes[random.nextInt(posicoes.length)];
        String time = times[random.nextInt(times.length)];
        int idade = random.nextInt(18,45);

        System.out.println(nome + " " + sobrenome + " é um futebolista brasileiro de " + idade + " anos que atua como " + posicao + ". Atualmente defende o " + time + ".");

    }

    static void exercicio03() {
        Random random = new Random();
        Scanner leitor = new Scanner(System.in);

        String[] nomes = {"Bulbasau", "Charmander", "Pikachu"};
        String[] tipos = {"Fogo", "Planta", "Água", "Normal"};
        System.out.println("Digite quantos pokémons você deseja gerar: ");
        int qtde = leitor.nextInt();

        for (int i = 0; i< qtde; i++) {
            String nome = nomes[random.nextInt(nomes.length)];
            String tipo = tipos[random.nextInt(tipos.length)];
            int nivel = random.nextInt(1,100);
            System.out.println("Seu pokémon é um " + nome + " do tipo " + tipo + " e nível " + nivel + ".");
        }
    }
}