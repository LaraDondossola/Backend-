package org.example;

public abstract class Biocombustivel {
    protected float quilogramas;

    public Biocombustivel(float quilogramas) {
        this.quilogramas = quilogramas;
    }

    public Biocombustivel() {
        this.quilogramas = 1000;
    }

    public abstract float processar();
}