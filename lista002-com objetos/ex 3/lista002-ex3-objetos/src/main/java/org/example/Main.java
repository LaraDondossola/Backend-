package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] nomes = {"Pikachu", "Bulbasaur", "Charmander", "Squirtle", "Jigglypuff", "Snorlax", "Gengar"};
        String[] tipos = {"Normal", "Fogo", "Água", "Grama", "Elétrico", "Voador"};

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Quantos Pokémon você deseja gerar? ");
        int quantidade = scanner.nextInt();
        System.out.println();

        for (int i = 0; i < quantidade; i++) {
            String nome = nomes[random.nextInt(nomes.length)];
            String tipo = tipos[random.nextInt(tipos.length)];
            int nivel = random.nextInt(100) + 1;

            Pokemon p = new Pokemon(nome, tipo, nivel);

            System.out.println(p.nome + " é um Pokémon do tipo " + p.tipo + " de nível " + p.nivel + ".");
        }

        scanner.close();
    }
}