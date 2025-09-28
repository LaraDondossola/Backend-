package com.example.lista006_ex2;

import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class JogadorService {

    private final String[] nomes = {"Ronaldo", "Neymar", "Pelé", "Messi", "Cristiano"};
    private final String[] sobrenomes = {"Silva", "Santos", "Oliveira", "Souza", "Lima"};
    private final Random random = new Random();

    public Jogador gerarJogadorAleatorio(String time, String posicao) {
        String nomeAleatorio = nomes[random.nextInt(nomes.length)];
        String sobrenomeAleatorio = sobrenomes[random.nextInt(sobrenomes.length)];
        int idadeAleatoria = random.nextInt(20, 35); // Idade entre 20 e 34

        return new Jogador(nomeAleatorio, sobrenomeAleatorio, idadeAleatoria, posicao, time);
    }
}