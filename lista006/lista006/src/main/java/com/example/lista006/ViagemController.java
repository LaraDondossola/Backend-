package com.example.lista006;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViagemController {

    @GetMapping("/recomendar")
    public String recomendarDestino(@RequestParam String clima, @RequestParam String estilo) {
        if ("calor".equals(clima) && "natureza".equals(estilo)) {
            return "Rio de Janeiro";
        } else if ("frio".equals(clima) && "aventura".equals(estilo)) {
            return "Roma";
        } else if ("calor".equals(clima) && "cultura".equals(estilo)) {
            return "Bahia";
        } else if ("frio".equals(clima) && "comida".equals(estilo)) {
            return "Gramado";
        } else {
            return "Nenhuma recomendação encontrada.";
        }
    }

}
