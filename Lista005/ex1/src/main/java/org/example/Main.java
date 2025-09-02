package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        List<Personagem> inimigos = new ArrayList<>();
        inimigos.add(new Personagem("José", 100, 10));
        inimigos.add(new Personagem("joão", 50, 5));
        inimigos.add(new Personagem("Homem de Ferro", 75, 15));

        Personagem jogador = new Personagem("Lara", 50, 20);


        while (jogador.getVida() > 0) {
            // Escolher um inimigo vivo aleatório
            Personagem alvo = null;
            while (alvo == null) {
                Personagem p = inimigos.get(random.nextInt(inimigos.size()));
                if (p.getVida() > 0) {
                    alvo = p;
                }
            }

            System.out.println("\n" + jogador.getNome() + " ataca " + alvo.getNome());
            jogador.atacar(alvo);

            // Inimigos atacam jogador
            for (Personagem inimigo : inimigos) {
                if (inimigo.getVida() > 0) {
                    System.out.println("\n" + inimigo.getNome() + " ataca " + jogador.getNome());
                    inimigo.atacar(jogador);
                    if (jogador.getVida() == 0) {
                        System.out.println("\n" + jogador.getNome() + " foi derrotada!");
                        break;
                    }
                }
            }

            if (jogador.getVida() == 0) {
                break;
            }
        }
    }
}