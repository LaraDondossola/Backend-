package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MusicCloud musicCloud = new MusicCloud();

        System.out.println("Crie sua playlist!");
        System.out.print("Digite o nome da sua playlist: ");
        String nomePlaylist = sc.nextLine();
        Playlist minhaPlaylist = new Playlist(nomePlaylist);

        String continuar = "sim";
        while (continuar.equalsIgnoreCase("sim")) {
            System.out.print("Digite o nome da música que deseja adicionar: ");
            String tituloMusica = sc.nextLine();

            try {
                Musica musicaEncontrada = musicCloud.pesquisarMusica(tituloMusica);
                minhaPlaylist.adicionarMusica(musicaEncontrada);
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }

            System.out.print("Deseja adicionar outra música? (sim/nao): ");
            continuar = sc.nextLine();
        }

        minhaPlaylist.imprimirPlaylist();
        sc.close();
    }
}