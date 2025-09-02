package org.example;

import java.util.ArrayList;

public class BasePorto {
    String nome;
    ArrayList<Barco> barcosAtracados;

    public BasePorto(String nome) {
        this.nome = nome;
        this.barcosAtracados = new ArrayList<>();
    }

    public void atracarBarco(Barco barco) {
        barcosAtracados.add(barco);
        System.out.println(barco.nome + " atracado no " + this.nome);
    }

    public void desatracarBarco(Barco barco) {
        barcosAtracados.remove(barco);
        System.out.println(barco.nome + " desatracado do " + this.nome);
    }
}

class PortoPequeno extends BasePorto {
    public PortoPequeno(String nome) {
        super(nome);
    }

    @Override
    public void atracarBarco(Barco barco) {
        if (barco.tamanho <= 10) {
            super.atracarBarco(barco);
        } else {
            System.out.println(barco.nome + " não pode atracar no " + this.nome + " porque é muito grande.");
        }
    }
}

class PortoGrande extends BasePorto {
    public PortoGrande(String nome) {
        super(nome);
    }

    @Override
    public void atracarBarco(Barco barco) {
        if (barco.tamanho >= 10) {
            super.atracarBarco(barco);
        } else {
            System.out.println(barco.nome + " não pode atracar no " + this.nome + " porque é muito pequeno.");
        }
    }
}