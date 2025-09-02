package org.example;

public class Biogerador {
    private float potenciaAtual;
    private float cargaAtual;
    private final float cargaMaxima = 5;

    public Biogerador() {
        this.potenciaAtual = 0;
        this.cargaAtual = 0;
    }

    public float getPotenciaAtual() {
        return potenciaAtual;
    }

    public void setPotenciaAtual(float potenciaAtual) {
        this.potenciaAtual = potenciaAtual;
    }

    public float getCargaAtual() {
        return cargaAtual;
    }

    public void setCargaAtual(float cargaAtual) {
        this.cargaAtual = cargaAtual;
    }

    public float getCargaMaxima() {
        return cargaMaxima;
    }

    public void carregar(Biocombustivel b) throws GeradorCheioException {
        if (this.cargaAtual >= this.cargaMaxima) {
            throw new GeradorCheioException("O gerador já está cheio! Capacidade máxima atingida.");
        }

        float potenciaGerada = b.processar() * 2.36f;

        this.potenciaAtual += potenciaGerada;

        this.cargaAtual++;
    }

    public void esvaziar() {
        this.cargaAtual = 0;
        this.potenciaAtual = 0;
    }
}
