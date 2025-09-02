package org.example;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    String nome;
    List<Musica> musicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
        System.out.println("Você adicionou a música " + musica.titulo + " na playlist " + this.nome + ".");
    }

    public void imprimirPlaylist() {
        System.out.println("\nPlaylist: " + this.nome);
        for (Musica musica : musicas) {
            System.out.println("- " + musica.titulo + " por " + musica.artista);
        }
    }
}