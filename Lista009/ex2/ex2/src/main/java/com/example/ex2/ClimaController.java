package com.example.ex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clima")
public class ClimaController {

    @Autowired
    private ClimaServico servico;

    @GetMapping("/{cidade}")
    public RespostaClima obterClima(@PathVariable String cidade) {
        return servico.buscarClima(cidade);
    }
}
