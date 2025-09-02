package org.example;
import java.util.HashMap;
import java.util.Map;

public class MusicCloud {
    Map<String, Musica> musicasDisponiveis;

    public MusicCloud() {
        this.musicasDisponiveis = new HashMap<>();

        musicasDisponiveis.put("Hino do Real Paulista", new Musica("Hino do Real Paulista", "Time"));
        musicasDisponiveis.put("Macarena", new Musica("Macarena", "Los del Río"));
        musicasDisponiveis.put("Evidências", new Musica("Evidências", "Chitãozinho & Xororó"));
    }

    public Musica pesquisarMusica(String titulo) throws Exception {
        Musica musica = musicasDisponiveis.get(titulo);
        if (musica == null) {
            throw new Exception("A música '" + titulo + "' não foi encontrada no sistema.");
        }
        return musica;
    }
}