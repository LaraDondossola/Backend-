package com.example.lista006_ex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JogadorController {

    private final JogadorService jogadorService;

    @Autowired
    public JogadorController(JogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }

    @GetMapping("/jogador/{time}/{posicao}")
    public Jogador gerarJogador(@PathVariable String time, @PathVariable String posicao) {
        return jogadorService.gerarJogadorAleatorio(time, posicao);
    }
}
