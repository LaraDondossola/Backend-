package org.example;

import java.util.Random;

public class Milho extends Biocombustivel {
    public Milho(float quilogramas) {
        super(quilogramas);
    }

    @Override
    public float processar() {
        Random rand = new Random();
        float n = 1 + rand.nextFloat() * (3 - 1);
        return this.quilogramas * n;
    }
}
