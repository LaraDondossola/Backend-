package com.example.ex2;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.RestClient;

@Service
public class ClimaServico {

    @Value("${openweather.apikey}")
    private String apiKey;

    public RespostaClima buscarClima(String cidade) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + cidade +
                "&appid=" + apiKey +
                "&units=metric&lang=pt_br";

        RestTemplate restTemplate = new RestTemplate();
        String respostaJson = restTemplate.getForObject(url, String.class);

        JSONObject json = new JSONObject(respostaJson);

        String descricao = json.getJSONArray("weather").getJSONObject(0).getString("description");
        double temperatura = json.getJSONObject("main").getDouble("temp");

        boolean chuva = descricao.contains("chuva") || descricao.contains("nublado");
        String emoji = chuva ? "☁️" : "☀️";
        String guardaChuva = chuva ? "Sim ☔" : "Não 😊";

        String frase = String.format("%s Em %s está %.1f°C com %s. Levar guarda-chuva? %s",
                emoji, cidade, temperatura, descricao, guardaChuva);

        return new RespostaClima(frase);
    }
}
