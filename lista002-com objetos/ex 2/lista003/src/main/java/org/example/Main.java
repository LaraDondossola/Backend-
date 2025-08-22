package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        exercicio02();
    }

        static void exercicio02 () {
            Random random = new Random();

            String[] nomes = {"Lara", "Lívia", "Ana", "Pedro", "Tânia", "Jairo"};
            String[] sobrenomes = {"Da Rosa", "Da Silva", "Gomes", "Oliveira", "Dondossola", "Lima"};
            String[] posicoes = {"goleiro", "zagueiro", "lateral", "atacante"};
            String[] times = {"Corinthians", "Flamengo", "Vasco", "Grêmio"};

            /*Jogador neymar = new Jogador("Neymar", "Junior", "Santos", "Atacante", (short) 33);
            Jogador wiliam = new Jogador("Wilian", "Bigode", "abc", "Atacante", (short) 33);*/

            for (int i = 0; i < 11; i++) {
                Jogador  jogador = new Jogador( nomes[random.nextInt(nomes.length)],
                        sobrenomes[random.nextInt(sobrenomes.length)],
                        times[random.nextInt(times.length)],
                        posicoes[random.nextInt(posicoes.length)],
                        (short) random.nextInt(18, 45));
                System.out.println(jogador.nome + " " + jogador.sobrenome + " é um futebolista brasileiro de " + jogador.idade + " anos que atua como " + jogador.posicao + ". Atualmente defende o " + jogador.time + ".");
            }

            /*String nome = nomes[random.nextInt(nomes.length)];
            String sobrenome = sobrenomes[random.nextInt(sobrenomes.length)];
            String posicao = posicoes[random.nextInt(posicoes.length)];
            String time = times[random.nextInt(times.length)];
            int idade = random.nextInt(18, 45);*/

            /*System.out.println(neymar.nome + " " + sobrenome + " é um futebolista brasileiro de " + idade + " anos que atua como " + posicao + ". Atualmente defende o " + time + ".");*/

        }
    }