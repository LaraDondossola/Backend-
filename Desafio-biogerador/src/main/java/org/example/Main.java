package org.example;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Biocombustivel> combustiveis = new ArrayList<>();
        combustiveis.add(new CanaAcucar(2000));
        combustiveis.add(new Beterraba(3000));
        combustiveis.add(new Milho(1500));
        combustiveis.add(new Beterraba(3500));
        combustiveis.add(new Beterraba(2000));

        Biogerador gerador = new Biogerador();

        for (Biocombustivel b : combustiveis) {
            try {
                gerador.carregar(b);
            } catch (GeradorCheioException e) {
                System.out.println("Erro: " + e.getMessage());
                break;
            }
        }

        System.out.printf("Potência gerada no gerador 01: %.2f%n", gerador.getPotenciaAtual());
        System.out.printf("Carga atual do gerador 01: %.0f%n", gerador.getCargaAtual());
    }

}