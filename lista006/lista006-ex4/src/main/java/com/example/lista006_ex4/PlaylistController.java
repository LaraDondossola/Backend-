package com.example.lista006_ex4;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/playlists")
public class PlaylistController {

    private static final List<Playlist> playlists = new ArrayList<>();
    private static long nextId = 1;

    @PostMapping
    public long criarPlaylist(@RequestBody Playlist playlist) {
        playlist.setId(nextId++);
        playlists.add(playlist);
        return playlist.getId();
    }

    @PostMapping("/{id}/musicas")
    public String adicionarMusica(@PathVariable long id, @RequestBody Musica musica) {
        for (Playlist playlist : playlists) {
            if (playlist.getId() == id) {
                playlist.getMusicas().add(musica);
                return "Música adicionada com sucesso à playlist " + playlist.getNome();
            }
        }
        return "Playlist não encontrada.";
    }

    @GetMapping
    public List<Playlist> listarPlaylists() {
        return playlists;
    }

    @GetMapping("/{id}/musicas")
    public List<Musica> listarMusicasDaPlaylist(@PathVariable long id) {
        for (Playlist playlist : playlists) {
            if (playlist.getId() == id) {
                return playlist.getMusicas();
            }
        }
        return new ArrayList<>();
    }
}
