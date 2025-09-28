package com.example.lista006_ex3;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {

    private static final List<Estudante> estudantes = new ArrayList<>();

    @PostMapping
    public Estudante adicionarEstudante(@RequestBody Estudante estudante) {
        estudantes.add(estudante);
        return estudante;
    }

    @GetMapping
    public List<Estudante> listarTodos() {
        return estudantes;
    }

    @GetMapping("/{codigo}")
    public Estudante buscarPorCodigo(@PathVariable long codigo) {
        Optional<Estudante> estudanteEncontrado = estudantes.stream()
                .filter(e -> e.getCodigo() == codigo)
                .findFirst();

        return estudanteEncontrado.orElse(null); // Retorna o estudante ou null se não encontrar
    }
}
